package com.github.dusanzahoransky.optionstracker.model.exchangerates

data class RatesResponse(
    val rates: Rates,
    val base: String
)