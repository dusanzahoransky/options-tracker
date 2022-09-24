package com.github.dusanzahoransky.optionstracker.client

import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.http.HttpRequest
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse

class ClientLoggingInterceptor(val mapper: ObjectMapper)
    : ClientHttpRequestInterceptor {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun intercept(request: HttpRequest, body: ByteArray, execution: ClientHttpRequestExecution): ClientHttpResponse {
        logger.debug("Calling: ${request.method} ${request.uri} ${mapper.writeValueAsString(body)}")
        val response = execution.execute(request, body)
        var remainingQuota = response.headers.getOrEmpty("X-RateLimit-requests-Remaining")
        if (remainingQuota.isEmpty()) {
            remainingQuota = response.headers.getOrEmpty("X-RateLimit-Original-Raw-Formatting-Remaining")
        }
        logger.debug("Response [remaining quota: $remainingQuota]: ${response.statusCode}")
        return response
    }
}