package com.github.dusanzahoransky.optionstracker.client

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.github.dusanzahoransky.optionstracker.model.Ticker
import com.github.dusanzahoransky.optionstracker.model.enums.Interval
import com.github.dusanzahoransky.optionstracker.model.enums.Range
import com.github.dusanzahoransky.optionstracker.model.yahoo.analysis.AnalysisResponse
import com.github.dusanzahoransky.optionstracker.model.yahoo.chart.ChartResponse
import com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics.EtfStatisticsResponse
import com.github.dusanzahoransky.optionstracker.model.yahoo.financials.FinancialsResponse
import com.github.dusanzahoransky.optionstracker.model.yahoo.holders.HoldersResponse
import com.github.dusanzahoransky.optionstracker.model.yahoo.statistics.StatisticsResponse
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class YahooFinanceClient @Autowired constructor(
    @Qualifier("yahooFinanceRestTemplate") val restTemplate: RestTemplate
) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    companion object {
        var lastCallTime: Long = 0
        const val CALL_THRESHOLD_TIMEOUT = 200L
    }

    fun getStatistics(ticker: Ticker, mockData: Boolean): StatisticsResponse {
        if (mockData) {
            val statisticsMock = ClassPathResource("StatisticsMockGOOGL.json")
            return jacksonObjectMapper().readValue(statisticsMock.inputStream, jacksonTypeRef<StatisticsResponse>())
        }

        waitTimeout()
        val response = restTemplate.getForObject(
            "https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-statistics?symbol={ticker}",
            StatisticsResponse::class.java,
            mapOf("ticker" to ticker.toYahooFormat())
        ) ?: throw RuntimeException("Failed to load $ticker")

        logger.debug("Statistics from Yahoo API: ${jacksonObjectMapper().writeValueAsString(response)}")
        lastCallTime = System.currentTimeMillis()
        return response

    }

    /**
     * Timeout to avoid hitting rate limit 5 calls a second
     */
    private fun waitTimeout() {
        if (System.currentTimeMillis() - lastCallTime < CALL_THRESHOLD_TIMEOUT) {
            Thread.sleep(CALL_THRESHOLD_TIMEOUT)
        }
    }

    fun getChart(ticker: Ticker, interval: Interval, range: Range, mockData: Boolean): ChartResponse {
        if (mockData) {
            val data =
                if (ticker.symbol.contains("VUSA")) ClassPathResource("ChartMockVUSA.json")
                else ClassPathResource("ChartMockGOOGL.json")
            return jacksonObjectMapper().readValue(data.inputStream, jacksonTypeRef<ChartResponse>())
        }

        waitTimeout()
        val response = restTemplate.getForObject(
            "https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-chart?symbol={ticker}&interval={interval}&range={range}",
            ChartResponse::class.java,
            mapOf(
                "ticker" to ticker.toYahooFormat(),
                "interval" to "1d",
                "range" to range.value
            )
        ) ?: throw RuntimeException("Failed to load $ticker")

        logger.debug("Chart from Yahoo API: ${jacksonObjectMapper().writeValueAsString(response)}")
        lastCallTime = System.currentTimeMillis()
        return response
    }

    fun getEtfStatistics(ticker: Ticker, mockData: Boolean): EtfStatisticsResponse {
        if (mockData) {
            val statisticsMock =
                if (ticker.symbol.contains("VUSA")) ClassPathResource("StatisticsVUSA.L.json")
                else ClassPathResource("StatisticsVTS.json")
            return jacksonObjectMapper().readValue(statisticsMock.inputStream, jacksonTypeRef<EtfStatisticsResponse>())
        }

        waitTimeout()
        val response = restTemplate.getForObject(
            "https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-statistics?symbol={ticker}",
            EtfStatisticsResponse::class.java,
            mapOf("ticker" to ticker.toYahooFormat())
        ) ?: throw RuntimeException("Failed to load $ticker")

        logger.debug("Statistics from Yahoo API: ${jacksonObjectMapper().writeValueAsString(response)}")
        lastCallTime = System.currentTimeMillis()
        return response
    }


    fun getFinancials(ticker: Ticker, mockData: Boolean): FinancialsResponse {
        if (mockData) {
            val balanceSheetMock = ClassPathResource("FinancialsMockGOOGL.json")
            return jacksonObjectMapper().readValue(balanceSheetMock.inputStream, jacksonTypeRef<FinancialsResponse>())
        }

        waitTimeout()
        val response = restTemplate.getForObject(
            "https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-financials?symbol={ticker}",
            FinancialsResponse::class.java,
            mapOf("ticker" to ticker.toYahooFormat())
        ) ?: throw RuntimeException("Failed to load $ticker")
        logger.debug("Financials from Yahoo API: ${jacksonObjectMapper().writeValueAsString(response)}")
        lastCallTime = System.currentTimeMillis()
        return response

    }

    fun getAnalysis(ticker: Ticker, mockData: Boolean): AnalysisResponse {
        if (mockData) {
            val balanceSheetMock = ClassPathResource("AnalysisMockGOOGL.json")
            return jacksonObjectMapper().readValue(balanceSheetMock.inputStream, jacksonTypeRef<AnalysisResponse>())
        }
        waitTimeout()
        val response = restTemplate.getForObject(
            "https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-analysis?symbol={ticker}",
            AnalysisResponse::class.java,
            mapOf("ticker" to ticker.toYahooFormat())
        ) ?: throw RuntimeException("Failed to load $ticker")
        logger.debug("Analysis from Yahoo API: ${jacksonObjectMapper().writeValueAsString(response)}")
        lastCallTime = System.currentTimeMillis()
        return response
    }

    fun getHolders(ticker: Ticker, mockData: Boolean): HoldersResponse {
        if (mockData) {
            val balanceSheetMock = ClassPathResource("HoldersMockGOOGL.json")
            return jacksonObjectMapper().readValue(balanceSheetMock.inputStream, jacksonTypeRef<HoldersResponse>())
        }
        waitTimeout()
        val response = restTemplate.getForObject(
            "https://apidojo-yahoo-finance-v1.p.rapidapi.com/stock/v2/get-holders?symbol={ticker}",
            HoldersResponse::class.java,
            mapOf("ticker" to ticker.toYahooFormat())
        ) ?: throw RuntimeException("Failed to load $ticker")
        logger.debug("Holders from Yahoo API: ${jacksonObjectMapper().writeValueAsString(response)}")
        lastCallTime = System.currentTimeMillis()
        return response
    }
}