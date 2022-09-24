package com.github.dusanzahoransky.optionstracker.repository

import com.github.dusanzahoransky.optionstracker.model.enums.Currency
import com.github.dusanzahoransky.optionstracker.model.mongo.ExchangeRate
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface StocksRepo : MongoRepository<ExchangeRate, Currency> {
    fun findByTarget(target: Currency): ExchangeRate?
}
