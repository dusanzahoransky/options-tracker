package com.github.dusanzahoransky.optionstracker.service

import com.github.dusanzahoransky.optionstracker.client.ExchangeRateClient
import com.github.dusanzahoransky.optionstracker.model.enums.Currency
import com.github.dusanzahoransky.optionstracker.model.mongo.ExchangeRate
import com.github.dusanzahoransky.optionstracker.repository.ExchangeRateRepo
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ExchangeRateService @Autowired constructor(
    val exchangeRateRepo: ExchangeRateRepo,
    val exchangeRateClient: ExchangeRateClient
) {
    val log = LoggerFactory.getLogger(this::class.java)!!

    fun getRate(fromCurrency: Currency?, toCurrency: Currency?): Double {

        if(fromCurrency == null || toCurrency == null || fromCurrency == toCurrency){
            return 1.0
        }

        val from = if (fromCurrency == Currency.GBp) Currency.GBP else fromCurrency
        val to = if (toCurrency == Currency.GBp) Currency.GBP else toCurrency


        //repo has only USD base currency, if the from is USD we just get the latest value, but if not we have to do from -> USD -> to conversion
        val rate = if (from == Currency.USD) {
            loadByTarget(to)
        } else {
            val fromToUsd = 1 / loadByTarget(from)
            val usdToTo = loadByTarget(to)
            log.debug("Conversion from $from -> USD = $fromToUsd, from USD to $to = $usdToTo, the rate is ${fromToUsd * usdToTo}")
            fromToUsd * usdToTo
        }

        if (fromCurrency == Currency.GBp) {
            return rate / 100.0
        }
        if (toCurrency == Currency.GBp) {
            return rate * 100.0
        }
        return rate
    }

    private fun loadByTarget(to: Currency): Double {
        val exchangeRate = exchangeRateRepo.findByTarget(to)

        if (exchangeRate != null && exchangeRate.lastUpdated.isAfter(LocalDateTime.now().minusDays(1))) {
            return exchangeRate.rate
        }

        //load and cache the latest rates from open exchange rate
        exchangeRateClient.getLatest()
            .map{ ExchangeRate(target = Currency.valueOf(it.key), rate = it.value) }
            .forEach{exchangeRateRepo.save(it)}

        return exchangeRateRepo.findByTarget(to)?.rate
            ?: throw IllegalArgumentException("Missing currency conversion to $to")
    }
}