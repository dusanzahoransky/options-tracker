# Stock Analyst

BE for https://github.com/dusanzahoransky/stock-analyst-ui

Backend services for ETF and stock data retrieved from multiple financial APIs. The data are enhanced with multiple calculated financial stats and stored in MongoDB to avoid fetching them again from external APIs.

## Prerequisites

* [Yahoo Finance API](https://rapidapi.com/apidojo/api/yahoo-finance1) key
* Mongo DB 

## Setup

### Mongo DB 

Running with default config -  unrestricted access at localhost:27017

Otherwise, modify `application.properties`

```
spring.data.mongodb.database=Stocks
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

Start SpringBoot app `com.github.dusanzahoransky.OptionsTracker.OptionsTrackerApplication`