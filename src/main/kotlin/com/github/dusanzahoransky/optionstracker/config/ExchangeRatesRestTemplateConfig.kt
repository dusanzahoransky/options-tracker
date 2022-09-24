package com.github.dusanzahoransky.optionstracker.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.dusanzahoransky.optionstracker.client.ClientLoggingInterceptor
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import java.time.Duration


@Configuration
class ExchangeRatesRestTemplateConfig(val mapper: ObjectMapper) {

    @Bean
    fun exchangeRatesRestTemplate(builder: RestTemplateBuilder): RestTemplate {
        return builder
            .setReadTimeout(Duration.ofSeconds(30))
            .setConnectTimeout(Duration.ofSeconds(30))
            .additionalInterceptors(ClientLoggingInterceptor(mapper)).build()
    }
}