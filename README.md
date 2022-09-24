# Options Tracker

BE for https://github.com/dusanzahoransky/options-tracker-ui

Backend services for Options Tracking App. After specifying a portfolio of stocks, it will track which of them are not covered by call options. Also, provides a tool for analysing covered CALL or PUT options buys. Calculates things such as price change needed for an option to be in the money, potential annualised percentage return from the options premium. It tracks all options traded for a specific stock position in a portfolio and total gains. 

## Prerequisites

* [Yahoo Finance API](https://rapidapi.com/apidojo/api/yahoo-finance1) key
* Mongo DB 

## Setup

### Mongo DB 

Running with default config -  unrestricted access at localhost:27017

Otherwise, modify `application.properties`

```
spring.data.mongodb.database=Options
spring.data.mongodb.host=127.0.0.1
spring.data.mongodb.port=27017
```

### Finance APIs

Set Yahoo host and API key as process env variables or specify them in `application.properties`

```
yahoo.client.xRapidapiKey=${yahoo-x-rapidapi-key}
yahoo.client.xRapidapiHost=${yahoo-x-rapidapi-host}
openexchangerates.client.appid=${openexchangerates-appid}
```

## Run

Start SpringBoot app `com.github.dusanzahoransky.optionstracker.OptionsTrackerApplication`