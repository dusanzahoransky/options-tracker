package com.github.dusanzahoransky.optionstracker.controller


import com.github.dusanzahoransky.optionstracker.model.mongo.Option
import com.github.dusanzahoransky.optionstracker.model.mongo.Stock
import com.github.dusanzahoransky.optionstracker.service.PortfolioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("portfolio")
class PortfolioController @Autowired constructor(
        val portfolioService: PortfolioService
) {

    @GetMapping("stocks")
    @ResponseBody
    fun getStocks(): List<Stock> {
        return portfolioService.getStocks()
    }

    @GetMapping("options")
    @ResponseBody
    fun getOptions(): List<Option> {
        return portfolioService.getOptions()
    }
}