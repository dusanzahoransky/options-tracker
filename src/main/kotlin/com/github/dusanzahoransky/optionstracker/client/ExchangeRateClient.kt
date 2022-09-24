package com.github.dusanzahoransky.optionstracker.client

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.dusanzahoransky.optionstracker.model.exchangerates.Rates
import com.github.dusanzahoransky.optionstracker.model.exchangerates.RatesResponse
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class ExchangeRateClient constructor(
    @Qualifier("exchangeRatesRestTemplate") val restTemplate: RestTemplate,
    @Value("\${openexchangerates.client.appid}") val openExchangeRatesAppId: String
) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    fun getLatest(): Map<String, Double> {
        return restTemplate.getForObject(
            "https://openexchangerates.org/api/latest.json?app_id={openExchangeRatesAppId}",
            RatesResponse::class.java, mapOf("openExchangeRatesAppId" to openExchangeRatesAppId)
        )?.also { logger.debug("Response: ${jacksonObjectMapper().writeValueAsString(it)}") }?.rates?.values
            ?: throw IllegalArgumentException("Failed to fetch latest exchange rates")
    }

}