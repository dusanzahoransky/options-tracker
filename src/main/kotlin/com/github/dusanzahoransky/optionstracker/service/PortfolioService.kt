package com.github.dusanzahoransky.optionstracker.service

import com.github.dusanzahoransky.optionstracker.model.mongo.Option
import com.github.dusanzahoransky.optionstracker.model.mongo.Stock
import com.github.dusanzahoransky.optionstracker.repository.OptionsRepo
import com.github.dusanzahoransky.optionstracker.repository.StocksRepo
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PortfolioService @Autowired constructor(
    val stocksRepo: StocksRepo,
    val optionsRepo: OptionsRepo,
) {

    val log = LoggerFactory.getLogger(this::class.java)!!
    
    fun getStocks(): List<Stock> {
        TODO("Not yet implemented")
    }

    fun getOptions(): List<Option> {
        TODO("Not yet implemented")
    }

}