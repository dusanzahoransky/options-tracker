package com.github.dusanzahoransky.optionstracker.model.mongo

import com.github.dusanzahoransky.optionstracker.model.enums.Currency
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

/**
 * Cache data from exchange rates API
 */
@Document
data class Option(
        val lastUpdated: LocalDateTime = LocalDateTime.now(),
        val base: Currency = Currency.USD,
        @Id val target: Currency,
        val rate: Double
)