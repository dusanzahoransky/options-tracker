package com.github.dusanzahoransky.optionstracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = [
        "com.github.dusanzahoransky.optionstracker"
    ]
)
class OptionsTrackerApplication

fun main(args: Array<String>) {
    runApplication<OptionsTrackerApplication>(*args)
}

