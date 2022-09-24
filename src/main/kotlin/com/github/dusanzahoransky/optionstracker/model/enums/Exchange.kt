package com.github.dusanzahoransky.optionstracker.model.enums

enum class Exchange(
    val fullName: String,
    val yahooFormat: String) {

    ASX("ASX", "AX"),
    NASDAQ("NASDAQ", "US"),
    NYSE("NYSE", "US"),
    FTSE("London Stock Exchange", "L"),
    DAX("Deutsche Börse Xetra", "DE"),
    ENX("Euronext Netherlands", "AS"),
    SIX("SIX Swiss", "SW"),
    PA("Euronext Paris", "PA"),
    MCE("Bolsa de Madrid", "MC"),
    PNK("Pink Sheets", "OTC"),
    MCX("Moscow Exchange", "ME"),
    TSE("Toronto Stock Exchange", "TO"),
    T("R", "T"),
    HKG("HongKong exchange", "HK"),
    JSE("Johannesburg Stock Exchange", "JO")
}