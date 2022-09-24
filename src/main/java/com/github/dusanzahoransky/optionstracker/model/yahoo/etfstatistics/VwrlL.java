
package com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sourceInterval",
    "quoteSourceName",
    "regularMarketOpen",
    "exchange",
    "regularMarketTime",
    "fiftyTwoWeekRange",
    "regularMarketDayHigh",
    "shortName",
    "longName",
    "exchangeTimezoneName",
    "regularMarketChange",
    "regularMarketPreviousClose",
    "fiftyTwoWeekHighChange",
    "exchangeTimezoneShortName",
    "fiftyTwoWeekLowChange",
    "exchangeDataDelayedBy",
    "regularMarketDayLow",
    "priceHint",
    "currency",
    "regularMarketPrice",
    "regularMarketVolume",
    "isLoading",
    "triggerable",
    "gmtOffSetMilliseconds",
    "firstTradeDateMilliseconds",
    "region",
    "marketState",
    "quoteType",
    "invalid",
    "symbol",
    "language",
    "fiftyTwoWeekLowChangePercent",
    "regularMarketDayRange",
    "messageBoardId",
    "fiftyTwoWeekHigh",
    "fiftyTwoWeekHighChangePercent",
    "uuid",
    "market",
    "fiftyTwoWeekLow",
    "regularMarketChangePercent",
    "fullExchangeName",
    "tradeable"
})
public class VwrlL {

    @JsonProperty("sourceInterval")
    private Long sourceInterval;
    @JsonProperty("quoteSourceName")
    private String quoteSourceName;
    @JsonProperty("regularMarketOpen")
    private RegularMarketOpen__6 regularMarketOpen;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("regularMarketTime")
    private RegularMarketTime__4 regularMarketTime;
    @JsonProperty("fiftyTwoWeekRange")
    private FiftyTwoWeekRange__4 fiftyTwoWeekRange;
    @JsonProperty("regularMarketDayHigh")
    private RegularMarketDayHigh__6 regularMarketDayHigh;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("exchangeTimezoneName")
    private String exchangeTimezoneName;
    @JsonProperty("regularMarketChange")
    private RegularMarketChange__5 regularMarketChange;
    @JsonProperty("regularMarketPreviousClose")
    private RegularMarketPreviousClose__6 regularMarketPreviousClose;
    @JsonProperty("fiftyTwoWeekHighChange")
    private FiftyTwoWeekHighChange__4 fiftyTwoWeekHighChange;
    @JsonProperty("exchangeTimezoneShortName")
    private String exchangeTimezoneShortName;
    @JsonProperty("fiftyTwoWeekLowChange")
    private FiftyTwoWeekLowChange__4 fiftyTwoWeekLowChange;
    @JsonProperty("exchangeDataDelayedBy")
    private Long exchangeDataDelayedBy;
    @JsonProperty("regularMarketDayLow")
    private RegularMarketDayLow__6 regularMarketDayLow;
    @JsonProperty("priceHint")
    private Long priceHint;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("regularMarketPrice")
    private RegularMarketPrice__5 regularMarketPrice;
    @JsonProperty("regularMarketVolume")
    private RegularMarketVolume__6 regularMarketVolume;
    @JsonProperty("isLoading")
    private Boolean isLoading;
    @JsonProperty("triggerable")
    private Boolean triggerable;
    @JsonProperty("gmtOffSetMilliseconds")
    private Long gmtOffSetMilliseconds;
    @JsonProperty("firstTradeDateMilliseconds")
    private Long firstTradeDateMilliseconds;
    @JsonProperty("region")
    private String region;
    @JsonProperty("marketState")
    private String marketState;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("invalid")
    private Boolean invalid;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("language")
    private String language;
    @JsonProperty("fiftyTwoWeekLowChangePercent")
    private FiftyTwoWeekLowChangePercent__4 fiftyTwoWeekLowChangePercent;
    @JsonProperty("regularMarketDayRange")
    private RegularMarketDayRange__4 regularMarketDayRange;
    @JsonProperty("messageBoardId")
    private String messageBoardId;
    @JsonProperty("fiftyTwoWeekHigh")
    private FiftyTwoWeekHigh__5 fiftyTwoWeekHigh;
    @JsonProperty("fiftyTwoWeekHighChangePercent")
    private FiftyTwoWeekHighChangePercent__4 fiftyTwoWeekHighChangePercent;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("market")
    private String market;
    @JsonProperty("fiftyTwoWeekLow")
    private FiftyTwoWeekLow__5 fiftyTwoWeekLow;
    @JsonProperty("regularMarketChangePercent")
    private RegularMarketChangePercent__5 regularMarketChangePercent;
    @JsonProperty("fullExchangeName")
    private String fullExchangeName;
    @JsonProperty("tradeable")
    private Boolean tradeable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sourceInterval")
    public Long getSourceInterval() {
        return sourceInterval;
    }

    @JsonProperty("sourceInterval")
    public void setSourceInterval(Long sourceInterval) {
        this.sourceInterval = sourceInterval;
    }

    @JsonProperty("quoteSourceName")
    public String getQuoteSourceName() {
        return quoteSourceName;
    }

    @JsonProperty("quoteSourceName")
    public void setQuoteSourceName(String quoteSourceName) {
        this.quoteSourceName = quoteSourceName;
    }

    @JsonProperty("regularMarketOpen")
    public RegularMarketOpen__6 getRegularMarketOpen() {
        return regularMarketOpen;
    }

    @JsonProperty("regularMarketOpen")
    public void setRegularMarketOpen(RegularMarketOpen__6 regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("regularMarketTime")
    public RegularMarketTime__4 getRegularMarketTime() {
        return regularMarketTime;
    }

    @JsonProperty("regularMarketTime")
    public void setRegularMarketTime(RegularMarketTime__4 regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    @JsonProperty("fiftyTwoWeekRange")
    public FiftyTwoWeekRange__4 getFiftyTwoWeekRange() {
        return fiftyTwoWeekRange;
    }

    @JsonProperty("fiftyTwoWeekRange")
    public void setFiftyTwoWeekRange(FiftyTwoWeekRange__4 fiftyTwoWeekRange) {
        this.fiftyTwoWeekRange = fiftyTwoWeekRange;
    }

    @JsonProperty("regularMarketDayHigh")
    public RegularMarketDayHigh__6 getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayHigh")
    public void setRegularMarketDayHigh(RegularMarketDayHigh__6 regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("exchangeTimezoneName")
    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    @JsonProperty("exchangeTimezoneName")
    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    @JsonProperty("regularMarketChange")
    public RegularMarketChange__5 getRegularMarketChange() {
        return regularMarketChange;
    }

    @JsonProperty("regularMarketChange")
    public void setRegularMarketChange(RegularMarketChange__5 regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    @JsonProperty("regularMarketPreviousClose")
    public RegularMarketPreviousClose__6 getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    @JsonProperty("regularMarketPreviousClose")
    public void setRegularMarketPreviousClose(RegularMarketPreviousClose__6 regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    @JsonProperty("fiftyTwoWeekHighChange")
    public FiftyTwoWeekHighChange__4 getFiftyTwoWeekHighChange() {
        return fiftyTwoWeekHighChange;
    }

    @JsonProperty("fiftyTwoWeekHighChange")
    public void setFiftyTwoWeekHighChange(FiftyTwoWeekHighChange__4 fiftyTwoWeekHighChange) {
        this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public String getExchangeTimezoneShortName() {
        return exchangeTimezoneShortName;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public void setExchangeTimezoneShortName(String exchangeTimezoneShortName) {
        this.exchangeTimezoneShortName = exchangeTimezoneShortName;
    }

    @JsonProperty("fiftyTwoWeekLowChange")
    public FiftyTwoWeekLowChange__4 getFiftyTwoWeekLowChange() {
        return fiftyTwoWeekLowChange;
    }

    @JsonProperty("fiftyTwoWeekLowChange")
    public void setFiftyTwoWeekLowChange(FiftyTwoWeekLowChange__4 fiftyTwoWeekLowChange) {
        this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public Long getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public void setExchangeDataDelayedBy(Long exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
    }

    @JsonProperty("regularMarketDayLow")
    public RegularMarketDayLow__6 getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    @JsonProperty("regularMarketDayLow")
    public void setRegularMarketDayLow(RegularMarketDayLow__6 regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    @JsonProperty("priceHint")
    public Long getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(Long priceHint) {
        this.priceHint = priceHint;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("regularMarketPrice")
    public RegularMarketPrice__5 getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @JsonProperty("regularMarketPrice")
    public void setRegularMarketPrice(RegularMarketPrice__5 regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    @JsonProperty("regularMarketVolume")
    public RegularMarketVolume__6 getRegularMarketVolume() {
        return regularMarketVolume;
    }

    @JsonProperty("regularMarketVolume")
    public void setRegularMarketVolume(RegularMarketVolume__6 regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    @JsonProperty("isLoading")
    public Boolean getIsLoading() {
        return isLoading;
    }

    @JsonProperty("isLoading")
    public void setIsLoading(Boolean isLoading) {
        this.isLoading = isLoading;
    }

    @JsonProperty("triggerable")
    public Boolean getTriggerable() {
        return triggerable;
    }

    @JsonProperty("triggerable")
    public void setTriggerable(Boolean triggerable) {
        this.triggerable = triggerable;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public Long getGmtOffSetMilliseconds() {
        return gmtOffSetMilliseconds;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public void setGmtOffSetMilliseconds(Long gmtOffSetMilliseconds) {
        this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
    }

    @JsonProperty("firstTradeDateMilliseconds")
    public Long getFirstTradeDateMilliseconds() {
        return firstTradeDateMilliseconds;
    }

    @JsonProperty("firstTradeDateMilliseconds")
    public void setFirstTradeDateMilliseconds(Long firstTradeDateMilliseconds) {
        this.firstTradeDateMilliseconds = firstTradeDateMilliseconds;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("marketState")
    public String getMarketState() {
        return marketState;
    }

    @JsonProperty("marketState")
    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("invalid")
    public Boolean getInvalid() {
        return invalid;
    }

    @JsonProperty("invalid")
    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("fiftyTwoWeekLowChangePercent")
    public FiftyTwoWeekLowChangePercent__4 getFiftyTwoWeekLowChangePercent() {
        return fiftyTwoWeekLowChangePercent;
    }

    @JsonProperty("fiftyTwoWeekLowChangePercent")
    public void setFiftyTwoWeekLowChangePercent(FiftyTwoWeekLowChangePercent__4 fiftyTwoWeekLowChangePercent) {
        this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
    }

    @JsonProperty("regularMarketDayRange")
    public RegularMarketDayRange__4 getRegularMarketDayRange() {
        return regularMarketDayRange;
    }

    @JsonProperty("regularMarketDayRange")
    public void setRegularMarketDayRange(RegularMarketDayRange__4 regularMarketDayRange) {
        this.regularMarketDayRange = regularMarketDayRange;
    }

    @JsonProperty("messageBoardId")
    public String getMessageBoardId() {
        return messageBoardId;
    }

    @JsonProperty("messageBoardId")
    public void setMessageBoardId(String messageBoardId) {
        this.messageBoardId = messageBoardId;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public FiftyTwoWeekHigh__5 getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public void setFiftyTwoWeekHigh(FiftyTwoWeekHigh__5 fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    @JsonProperty("fiftyTwoWeekHighChangePercent")
    public FiftyTwoWeekHighChangePercent__4 getFiftyTwoWeekHighChangePercent() {
        return fiftyTwoWeekHighChangePercent;
    }

    @JsonProperty("fiftyTwoWeekHighChangePercent")
    public void setFiftyTwoWeekHighChangePercent(FiftyTwoWeekHighChangePercent__4 fiftyTwoWeekHighChangePercent) {
        this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("market")
    public String getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(String market) {
        this.market = market;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public FiftyTwoWeekLow__5 getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public void setFiftyTwoWeekLow(FiftyTwoWeekLow__5 fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    @JsonProperty("regularMarketChangePercent")
    public RegularMarketChangePercent__5 getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    @JsonProperty("regularMarketChangePercent")
    public void setRegularMarketChangePercent(RegularMarketChangePercent__5 regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    @JsonProperty("fullExchangeName")
    public String getFullExchangeName() {
        return fullExchangeName;
    }

    @JsonProperty("fullExchangeName")
    public void setFullExchangeName(String fullExchangeName) {
        this.fullExchangeName = fullExchangeName;
    }

    @JsonProperty("tradeable")
    public Boolean getTradeable() {
        return tradeable;
    }

    @JsonProperty("tradeable")
    public void setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VwrlL.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceInterval");
        sb.append('=');
        sb.append(((this.sourceInterval == null)?"<null>":this.sourceInterval));
        sb.append(',');
        sb.append("quoteSourceName");
        sb.append('=');
        sb.append(((this.quoteSourceName == null)?"<null>":this.quoteSourceName));
        sb.append(',');
        sb.append("regularMarketOpen");
        sb.append('=');
        sb.append(((this.regularMarketOpen == null)?"<null>":this.regularMarketOpen));
        sb.append(',');
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null)?"<null>":this.exchange));
        sb.append(',');
        sb.append("regularMarketTime");
        sb.append('=');
        sb.append(((this.regularMarketTime == null)?"<null>":this.regularMarketTime));
        sb.append(',');
        sb.append("fiftyTwoWeekRange");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekRange == null)?"<null>":this.fiftyTwoWeekRange));
        sb.append(',');
        sb.append("regularMarketDayHigh");
        sb.append('=');
        sb.append(((this.regularMarketDayHigh == null)?"<null>":this.regularMarketDayHigh));
        sb.append(',');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null)?"<null>":this.shortName));
        sb.append(',');
        sb.append("longName");
        sb.append('=');
        sb.append(((this.longName == null)?"<null>":this.longName));
        sb.append(',');
        sb.append("exchangeTimezoneName");
        sb.append('=');
        sb.append(((this.exchangeTimezoneName == null)?"<null>":this.exchangeTimezoneName));
        sb.append(',');
        sb.append("regularMarketChange");
        sb.append('=');
        sb.append(((this.regularMarketChange == null)?"<null>":this.regularMarketChange));
        sb.append(',');
        sb.append("regularMarketPreviousClose");
        sb.append('=');
        sb.append(((this.regularMarketPreviousClose == null)?"<null>":this.regularMarketPreviousClose));
        sb.append(',');
        sb.append("fiftyTwoWeekHighChange");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekHighChange == null)?"<null>":this.fiftyTwoWeekHighChange));
        sb.append(',');
        sb.append("exchangeTimezoneShortName");
        sb.append('=');
        sb.append(((this.exchangeTimezoneShortName == null)?"<null>":this.exchangeTimezoneShortName));
        sb.append(',');
        sb.append("fiftyTwoWeekLowChange");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekLowChange == null)?"<null>":this.fiftyTwoWeekLowChange));
        sb.append(',');
        sb.append("exchangeDataDelayedBy");
        sb.append('=');
        sb.append(((this.exchangeDataDelayedBy == null)?"<null>":this.exchangeDataDelayedBy));
        sb.append(',');
        sb.append("regularMarketDayLow");
        sb.append('=');
        sb.append(((this.regularMarketDayLow == null)?"<null>":this.regularMarketDayLow));
        sb.append(',');
        sb.append("priceHint");
        sb.append('=');
        sb.append(((this.priceHint == null)?"<null>":this.priceHint));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("regularMarketPrice");
        sb.append('=');
        sb.append(((this.regularMarketPrice == null)?"<null>":this.regularMarketPrice));
        sb.append(',');
        sb.append("regularMarketVolume");
        sb.append('=');
        sb.append(((this.regularMarketVolume == null)?"<null>":this.regularMarketVolume));
        sb.append(',');
        sb.append("isLoading");
        sb.append('=');
        sb.append(((this.isLoading == null)?"<null>":this.isLoading));
        sb.append(',');
        sb.append("triggerable");
        sb.append('=');
        sb.append(((this.triggerable == null)?"<null>":this.triggerable));
        sb.append(',');
        sb.append("gmtOffSetMilliseconds");
        sb.append('=');
        sb.append(((this.gmtOffSetMilliseconds == null)?"<null>":this.gmtOffSetMilliseconds));
        sb.append(',');
        sb.append("firstTradeDateMilliseconds");
        sb.append('=');
        sb.append(((this.firstTradeDateMilliseconds == null)?"<null>":this.firstTradeDateMilliseconds));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("marketState");
        sb.append('=');
        sb.append(((this.marketState == null)?"<null>":this.marketState));
        sb.append(',');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null)?"<null>":this.quoteType));
        sb.append(',');
        sb.append("invalid");
        sb.append('=');
        sb.append(((this.invalid == null)?"<null>":this.invalid));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("fiftyTwoWeekLowChangePercent");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekLowChangePercent == null)?"<null>":this.fiftyTwoWeekLowChangePercent));
        sb.append(',');
        sb.append("regularMarketDayRange");
        sb.append('=');
        sb.append(((this.regularMarketDayRange == null)?"<null>":this.regularMarketDayRange));
        sb.append(',');
        sb.append("messageBoardId");
        sb.append('=');
        sb.append(((this.messageBoardId == null)?"<null>":this.messageBoardId));
        sb.append(',');
        sb.append("fiftyTwoWeekHigh");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekHigh == null)?"<null>":this.fiftyTwoWeekHigh));
        sb.append(',');
        sb.append("fiftyTwoWeekHighChangePercent");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekHighChangePercent == null)?"<null>":this.fiftyTwoWeekHighChangePercent));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("market");
        sb.append('=');
        sb.append(((this.market == null)?"<null>":this.market));
        sb.append(',');
        sb.append("fiftyTwoWeekLow");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekLow == null)?"<null>":this.fiftyTwoWeekLow));
        sb.append(',');
        sb.append("regularMarketChangePercent");
        sb.append('=');
        sb.append(((this.regularMarketChangePercent == null)?"<null>":this.regularMarketChangePercent));
        sb.append(',');
        sb.append("fullExchangeName");
        sb.append('=');
        sb.append(((this.fullExchangeName == null)?"<null>":this.fullExchangeName));
        sb.append(',');
        sb.append("tradeable");
        sb.append('=');
        sb.append(((this.tradeable == null)?"<null>":this.tradeable));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.fullExchangeName == null)? 0 :this.fullExchangeName.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.fiftyTwoWeekLowChangePercent == null)? 0 :this.fiftyTwoWeekLowChangePercent.hashCode()));
        result = ((result* 31)+((this.gmtOffSetMilliseconds == null)? 0 :this.gmtOffSetMilliseconds.hashCode()));
        result = ((result* 31)+((this.regularMarketOpen == null)? 0 :this.regularMarketOpen.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.regularMarketTime == null)? 0 :this.regularMarketTime.hashCode()));
        result = ((result* 31)+((this.regularMarketChangePercent == null)? 0 :this.regularMarketChangePercent.hashCode()));
        result = ((result* 31)+((this.quoteType == null)? 0 :this.quoteType.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        result = ((result* 31)+((this.regularMarketDayRange == null)? 0 :this.regularMarketDayRange.hashCode()));
        result = ((result* 31)+((this.fiftyTwoWeekLowChange == null)? 0 :this.fiftyTwoWeekLowChange.hashCode()));
        result = ((result* 31)+((this.fiftyTwoWeekHighChangePercent == null)? 0 :this.fiftyTwoWeekHighChangePercent.hashCode()));
        result = ((result* 31)+((this.regularMarketDayHigh == null)? 0 :this.regularMarketDayHigh.hashCode()));
        result = ((result* 31)+((this.tradeable == null)? 0 :this.tradeable.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.regularMarketPreviousClose == null)? 0 :this.regularMarketPreviousClose.hashCode()));
        result = ((result* 31)+((this.fiftyTwoWeekHigh == null)? 0 :this.fiftyTwoWeekHigh.hashCode()));
        result = ((result* 31)+((this.exchangeTimezoneName == null)? 0 :this.exchangeTimezoneName.hashCode()));
        result = ((result* 31)+((this.fiftyTwoWeekHighChange == null)? 0 :this.fiftyTwoWeekHighChange.hashCode()));
        result = ((result* 31)+((this.fiftyTwoWeekRange == null)? 0 :this.fiftyTwoWeekRange.hashCode()));
        result = ((result* 31)+((this.regularMarketChange == null)? 0 :this.regularMarketChange.hashCode()));
        result = ((result* 31)+((this.exchangeDataDelayedBy == null)? 0 :this.exchangeDataDelayedBy.hashCode()));
        result = ((result* 31)+((this.firstTradeDateMilliseconds == null)? 0 :this.firstTradeDateMilliseconds.hashCode()));
        result = ((result* 31)+((this.exchangeTimezoneShortName == null)? 0 :this.exchangeTimezoneShortName.hashCode()));
        result = ((result* 31)+((this.regularMarketPrice == null)? 0 :this.regularMarketPrice.hashCode()));
        result = ((result* 31)+((this.marketState == null)? 0 :this.marketState.hashCode()));
        result = ((result* 31)+((this.fiftyTwoWeekLow == null)? 0 :this.fiftyTwoWeekLow.hashCode()));
        result = ((result* 31)+((this.regularMarketVolume == null)? 0 :this.regularMarketVolume.hashCode()));
        result = ((result* 31)+((this.isLoading == null)? 0 :this.isLoading.hashCode()));
        result = ((result* 31)+((this.market == null)? 0 :this.market.hashCode()));
        result = ((result* 31)+((this.quoteSourceName == null)? 0 :this.quoteSourceName.hashCode()));
        result = ((result* 31)+((this.messageBoardId == null)? 0 :this.messageBoardId.hashCode()));
        result = ((result* 31)+((this.priceHint == null)? 0 :this.priceHint.hashCode()));
        result = ((result* 31)+((this.invalid == null)? 0 :this.invalid.hashCode()));
        result = ((result* 31)+((this.sourceInterval == null)? 0 :this.sourceInterval.hashCode()));
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+((this.regularMarketDayLow == null)? 0 :this.regularMarketDayLow.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shortName == null)? 0 :this.shortName.hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.triggerable == null)? 0 :this.triggerable.hashCode()));
        result = ((result* 31)+((this.longName == null)? 0 :this.longName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VwrlL) == false) {
            return false;
        }
        VwrlL rhs = ((VwrlL) other);
        return ((((((((((((((((((((((((((((((((((((((((((((this.fullExchangeName == rhs.fullExchangeName)||((this.fullExchangeName!= null)&&this.fullExchangeName.equals(rhs.fullExchangeName)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.fiftyTwoWeekLowChangePercent == rhs.fiftyTwoWeekLowChangePercent)||((this.fiftyTwoWeekLowChangePercent!= null)&&this.fiftyTwoWeekLowChangePercent.equals(rhs.fiftyTwoWeekLowChangePercent))))&&((this.gmtOffSetMilliseconds == rhs.gmtOffSetMilliseconds)||((this.gmtOffSetMilliseconds!= null)&&this.gmtOffSetMilliseconds.equals(rhs.gmtOffSetMilliseconds))))&&((this.regularMarketOpen == rhs.regularMarketOpen)||((this.regularMarketOpen!= null)&&this.regularMarketOpen.equals(rhs.regularMarketOpen))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.regularMarketTime == rhs.regularMarketTime)||((this.regularMarketTime!= null)&&this.regularMarketTime.equals(rhs.regularMarketTime))))&&((this.regularMarketChangePercent == rhs.regularMarketChangePercent)||((this.regularMarketChangePercent!= null)&&this.regularMarketChangePercent.equals(rhs.regularMarketChangePercent))))&&((this.quoteType == rhs.quoteType)||((this.quoteType!= null)&&this.quoteType.equals(rhs.quoteType))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))))&&((this.regularMarketDayRange == rhs.regularMarketDayRange)||((this.regularMarketDayRange!= null)&&this.regularMarketDayRange.equals(rhs.regularMarketDayRange))))&&((this.fiftyTwoWeekLowChange == rhs.fiftyTwoWeekLowChange)||((this.fiftyTwoWeekLowChange!= null)&&this.fiftyTwoWeekLowChange.equals(rhs.fiftyTwoWeekLowChange))))&&((this.fiftyTwoWeekHighChangePercent == rhs.fiftyTwoWeekHighChangePercent)||((this.fiftyTwoWeekHighChangePercent!= null)&&this.fiftyTwoWeekHighChangePercent.equals(rhs.fiftyTwoWeekHighChangePercent))))&&((this.regularMarketDayHigh == rhs.regularMarketDayHigh)||((this.regularMarketDayHigh!= null)&&this.regularMarketDayHigh.equals(rhs.regularMarketDayHigh))))&&((this.tradeable == rhs.tradeable)||((this.tradeable!= null)&&this.tradeable.equals(rhs.tradeable))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.regularMarketPreviousClose == rhs.regularMarketPreviousClose)||((this.regularMarketPreviousClose!= null)&&this.regularMarketPreviousClose.equals(rhs.regularMarketPreviousClose))))&&((this.fiftyTwoWeekHigh == rhs.fiftyTwoWeekHigh)||((this.fiftyTwoWeekHigh!= null)&&this.fiftyTwoWeekHigh.equals(rhs.fiftyTwoWeekHigh))))&&((this.exchangeTimezoneName == rhs.exchangeTimezoneName)||((this.exchangeTimezoneName!= null)&&this.exchangeTimezoneName.equals(rhs.exchangeTimezoneName))))&&((this.fiftyTwoWeekHighChange == rhs.fiftyTwoWeekHighChange)||((this.fiftyTwoWeekHighChange!= null)&&this.fiftyTwoWeekHighChange.equals(rhs.fiftyTwoWeekHighChange))))&&((this.fiftyTwoWeekRange == rhs.fiftyTwoWeekRange)||((this.fiftyTwoWeekRange!= null)&&this.fiftyTwoWeekRange.equals(rhs.fiftyTwoWeekRange))))&&((this.regularMarketChange == rhs.regularMarketChange)||((this.regularMarketChange!= null)&&this.regularMarketChange.equals(rhs.regularMarketChange))))&&((this.exchangeDataDelayedBy == rhs.exchangeDataDelayedBy)||((this.exchangeDataDelayedBy!= null)&&this.exchangeDataDelayedBy.equals(rhs.exchangeDataDelayedBy))))&&((this.firstTradeDateMilliseconds == rhs.firstTradeDateMilliseconds)||((this.firstTradeDateMilliseconds!= null)&&this.firstTradeDateMilliseconds.equals(rhs.firstTradeDateMilliseconds))))&&((this.exchangeTimezoneShortName == rhs.exchangeTimezoneShortName)||((this.exchangeTimezoneShortName!= null)&&this.exchangeTimezoneShortName.equals(rhs.exchangeTimezoneShortName))))&&((this.regularMarketPrice == rhs.regularMarketPrice)||((this.regularMarketPrice!= null)&&this.regularMarketPrice.equals(rhs.regularMarketPrice))))&&((this.marketState == rhs.marketState)||((this.marketState!= null)&&this.marketState.equals(rhs.marketState))))&&((this.fiftyTwoWeekLow == rhs.fiftyTwoWeekLow)||((this.fiftyTwoWeekLow!= null)&&this.fiftyTwoWeekLow.equals(rhs.fiftyTwoWeekLow))))&&((this.regularMarketVolume == rhs.regularMarketVolume)||((this.regularMarketVolume!= null)&&this.regularMarketVolume.equals(rhs.regularMarketVolume))))&&((this.isLoading == rhs.isLoading)||((this.isLoading!= null)&&this.isLoading.equals(rhs.isLoading))))&&((this.market == rhs.market)||((this.market!= null)&&this.market.equals(rhs.market))))&&((this.quoteSourceName == rhs.quoteSourceName)||((this.quoteSourceName!= null)&&this.quoteSourceName.equals(rhs.quoteSourceName))))&&((this.messageBoardId == rhs.messageBoardId)||((this.messageBoardId!= null)&&this.messageBoardId.equals(rhs.messageBoardId))))&&((this.priceHint == rhs.priceHint)||((this.priceHint!= null)&&this.priceHint.equals(rhs.priceHint))))&&((this.invalid == rhs.invalid)||((this.invalid!= null)&&this.invalid.equals(rhs.invalid))))&&((this.sourceInterval == rhs.sourceInterval)||((this.sourceInterval!= null)&&this.sourceInterval.equals(rhs.sourceInterval))))&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.regularMarketDayLow == rhs.regularMarketDayLow)||((this.regularMarketDayLow!= null)&&this.regularMarketDayLow.equals(rhs.regularMarketDayLow))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.triggerable == rhs.triggerable)||((this.triggerable!= null)&&this.triggerable.equals(rhs.triggerable))))&&((this.longName == rhs.longName)||((this.longName!= null)&&this.longName.equals(rhs.longName))));
    }

}
