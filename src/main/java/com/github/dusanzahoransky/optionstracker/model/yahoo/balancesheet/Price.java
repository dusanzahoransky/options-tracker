package com.github.dusanzahoransky.optionstracker.model.yahoo.balancesheet;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
    "quoteSourceName",
    "regularMarketOpen",
    "averageDailyVolume3Month",
    "exchange",
    "regularMarketTime",
    "volume24Hr",
    "regularMarketDayHigh",
    "shortName",
    "averageDailyVolume10Day",
    "longName",
    "regularMarketChange",
    "currencySymbol",
    "regularMarketPreviousClose",
    "postMarketTime",
    "preMarketPrice",
    "preMarketTime",
    "exchangeDataDelayedBy",
    "toCurrency",
    "postMarketChange",
    "postMarketPrice",
    "exchangeName",
    "preMarketChange",
    "circulatingSupply",
    "regularMarketDayLow",
    "priceHint",
    "currency",
    "regularMarketPrice",
    "regularMarketVolume",
    "lastMarket",
    "regularMarketSource",
    "openInterest",
    "marketState",
    "underlyingSymbol",
    "marketCap",
    "quoteType",
    "preMarketChangePercent",
    "volumeAllCurrencies",
    "postMarketSource",
    "strikePrice",
    "symbol",
    "postMarketChangePercent",
    "preMarketSource",
    "maxAge",
    "fromCurrency",
    "regularMarketChangePercent"
})
public class Price {

    @JsonProperty("quoteSourceName")
    private String quoteSourceName;
    @JsonProperty("regularMarketOpen")
    private RegularMarketOpen regularMarketOpen;
    @JsonProperty("averageDailyVolume3Month")
    private AverageDailyVolume3Month averageDailyVolume3Month;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("regularMarketTime")
    private Long regularMarketTime;
    @JsonProperty("volume24Hr")
    private Volume24Hr volume24Hr;
    @JsonProperty("regularMarketDayHigh")
    private RegularMarketDayHigh regularMarketDayHigh;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("averageDailyVolume10Day")
    private AverageDailyVolume10Day averageDailyVolume10Day;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("regularMarketChange")
    private RegularMarketChange regularMarketChange;
    @JsonProperty("currencySymbol")
    private String currencySymbol;
    @JsonProperty("regularMarketPreviousClose")
    private RegularMarketPreviousClose regularMarketPreviousClose;
    @JsonProperty("postMarketTime")
    private Long postMarketTime;
    @JsonProperty("preMarketPrice")
    private PreMarketPrice preMarketPrice;
    @JsonProperty("preMarketTime")
    private Long preMarketTime;
    @JsonProperty("exchangeDataDelayedBy")
    private Long exchangeDataDelayedBy;
    @JsonProperty("toCurrency")
    private Object toCurrency;
    @JsonProperty("postMarketChange")
    private PostMarketChange postMarketChange;
    @JsonProperty("postMarketPrice")
    private PostMarketPrice postMarketPrice;
    @JsonProperty("exchangeName")
    private String exchangeName;
    @JsonProperty("preMarketChange")
    private PreMarketChange preMarketChange;
    @JsonProperty("circulatingSupply")
    private CirculatingSupply circulatingSupply;
    @JsonProperty("regularMarketDayLow")
    private RegularMarketDayLow regularMarketDayLow;
    @JsonProperty("priceHint")
    private PriceHint priceHint;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("regularMarketPrice")
    private RegularMarketPrice regularMarketPrice;
    @JsonProperty("regularMarketVolume")
    private RegularMarketVolume regularMarketVolume;
    @JsonProperty("lastMarket")
    private Object lastMarket;
    @JsonProperty("regularMarketSource")
    private String regularMarketSource;
    @JsonProperty("openInterest")
    private OpenInterest openInterest;
    @JsonProperty("marketState")
    private String marketState;
    @JsonProperty("underlyingSymbol")
    private Object underlyingSymbol;
    @JsonProperty("marketCap")
    private MarketCap marketCap;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("preMarketChangePercent")
    private PreMarketChangePercent preMarketChangePercent;
    @JsonProperty("volumeAllCurrencies")
    private VolumeAllCurrencies volumeAllCurrencies;
    @JsonProperty("postMarketSource")
    private String postMarketSource;
    @JsonProperty("strikePrice")
    private StrikePrice strikePrice;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("postMarketChangePercent")
    private PostMarketChangePercent postMarketChangePercent;
    @JsonProperty("preMarketSource")
    private String preMarketSource;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("fromCurrency")
    private Object fromCurrency;
    @JsonProperty("regularMarketChangePercent")
    private RegularMarketChangePercent regularMarketChangePercent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quoteSourceName")
    public String getQuoteSourceName() {
        return quoteSourceName;
    }

    @JsonProperty("quoteSourceName")
    public void setQuoteSourceName(String quoteSourceName) {
        this.quoteSourceName = quoteSourceName;
    }

    @JsonProperty("regularMarketOpen")
    public RegularMarketOpen getRegularMarketOpen() {
        return regularMarketOpen;
    }

    @JsonProperty("regularMarketOpen")
    public void setRegularMarketOpen(RegularMarketOpen regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    @JsonProperty("averageDailyVolume3Month")
    public AverageDailyVolume3Month getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    @JsonProperty("averageDailyVolume3Month")
    public void setAverageDailyVolume3Month(AverageDailyVolume3Month averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
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
    public Long getRegularMarketTime() {
        return regularMarketTime;
    }

    @JsonProperty("regularMarketTime")
    public void setRegularMarketTime(Long regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    @JsonProperty("volume24Hr")
    public Volume24Hr getVolume24Hr() {
        return volume24Hr;
    }

    @JsonProperty("volume24Hr")
    public void setVolume24Hr(Volume24Hr volume24Hr) {
        this.volume24Hr = volume24Hr;
    }

    @JsonProperty("regularMarketDayHigh")
    public RegularMarketDayHigh getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayHigh")
    public void setRegularMarketDayHigh(RegularMarketDayHigh regularMarketDayHigh) {
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

    @JsonProperty("averageDailyVolume10Day")
    public AverageDailyVolume10Day getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    @JsonProperty("averageDailyVolume10Day")
    public void setAverageDailyVolume10Day(AverageDailyVolume10Day averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("regularMarketChange")
    public RegularMarketChange getRegularMarketChange() {
        return regularMarketChange;
    }

    @JsonProperty("regularMarketChange")
    public void setRegularMarketChange(RegularMarketChange regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    @JsonProperty("currencySymbol")
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    @JsonProperty("currencySymbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    @JsonProperty("regularMarketPreviousClose")
    public RegularMarketPreviousClose getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    @JsonProperty("regularMarketPreviousClose")
    public void setRegularMarketPreviousClose(RegularMarketPreviousClose regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    @JsonProperty("postMarketTime")
    public Long getPostMarketTime() {
        return postMarketTime;
    }

    @JsonProperty("postMarketTime")
    public void setPostMarketTime(Long postMarketTime) {
        this.postMarketTime = postMarketTime;
    }

    @JsonProperty("preMarketPrice")
    public PreMarketPrice getPreMarketPrice() {
        return preMarketPrice;
    }

    @JsonProperty("preMarketPrice")
    public void setPreMarketPrice(PreMarketPrice preMarketPrice) {
        this.preMarketPrice = preMarketPrice;
    }

    @JsonProperty("preMarketTime")
    public Long getPreMarketTime() {
        return preMarketTime;
    }

    @JsonProperty("preMarketTime")
    public void setPreMarketTime(Long preMarketTime) {
        this.preMarketTime = preMarketTime;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public Long getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    @JsonProperty("exchangeDataDelayedBy")
    public void setExchangeDataDelayedBy(Long exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
    }

    @JsonProperty("toCurrency")
    public Object getToCurrency() {
        return toCurrency;
    }

    @JsonProperty("toCurrency")
    public void setToCurrency(Object toCurrency) {
        this.toCurrency = toCurrency;
    }

    @JsonProperty("postMarketChange")
    public PostMarketChange getPostMarketChange() {
        return postMarketChange;
    }

    @JsonProperty("postMarketChange")
    public void setPostMarketChange(PostMarketChange postMarketChange) {
        this.postMarketChange = postMarketChange;
    }

    @JsonProperty("postMarketPrice")
    public PostMarketPrice getPostMarketPrice() {
        return postMarketPrice;
    }

    @JsonProperty("postMarketPrice")
    public void setPostMarketPrice(PostMarketPrice postMarketPrice) {
        this.postMarketPrice = postMarketPrice;
    }

    @JsonProperty("exchangeName")
    public String getExchangeName() {
        return exchangeName;
    }

    @JsonProperty("exchangeName")
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    @JsonProperty("preMarketChange")
    public PreMarketChange getPreMarketChange() {
        return preMarketChange;
    }

    @JsonProperty("preMarketChange")
    public void setPreMarketChange(PreMarketChange preMarketChange) {
        this.preMarketChange = preMarketChange;
    }

    @JsonProperty("circulatingSupply")
    public CirculatingSupply getCirculatingSupply() {
        return circulatingSupply;
    }

    @JsonProperty("circulatingSupply")
    public void setCirculatingSupply(CirculatingSupply circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    @JsonProperty("regularMarketDayLow")
    public RegularMarketDayLow getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    @JsonProperty("regularMarketDayLow")
    public void setRegularMarketDayLow(RegularMarketDayLow regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    @JsonProperty("priceHint")
    public PriceHint getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(PriceHint priceHint) {
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
    public RegularMarketPrice getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @JsonProperty("regularMarketPrice")
    public void setRegularMarketPrice(RegularMarketPrice regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    @JsonProperty("regularMarketVolume")
    public RegularMarketVolume getRegularMarketVolume() {
        return regularMarketVolume;
    }

    @JsonProperty("regularMarketVolume")
    public void setRegularMarketVolume(RegularMarketVolume regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    @JsonProperty("lastMarket")
    public Object getLastMarket() {
        return lastMarket;
    }

    @JsonProperty("lastMarket")
    public void setLastMarket(Object lastMarket) {
        this.lastMarket = lastMarket;
    }

    @JsonProperty("regularMarketSource")
    public String getRegularMarketSource() {
        return regularMarketSource;
    }

    @JsonProperty("regularMarketSource")
    public void setRegularMarketSource(String regularMarketSource) {
        this.regularMarketSource = regularMarketSource;
    }

    @JsonProperty("openInterest")
    public OpenInterest getOpenInterest() {
        return openInterest;
    }

    @JsonProperty("openInterest")
    public void setOpenInterest(OpenInterest openInterest) {
        this.openInterest = openInterest;
    }

    @JsonProperty("marketState")
    public String getMarketState() {
        return marketState;
    }

    @JsonProperty("marketState")
    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    @JsonProperty("underlyingSymbol")
    public Object getUnderlyingSymbol() {
        return underlyingSymbol;
    }

    @JsonProperty("underlyingSymbol")
    public void setUnderlyingSymbol(Object underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
    }

    @JsonProperty("marketCap")
    public MarketCap getMarketCap() {
        return marketCap;
    }

    @JsonProperty("marketCap")
    public void setMarketCap(MarketCap marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("preMarketChangePercent")
    public PreMarketChangePercent getPreMarketChangePercent() {
        return preMarketChangePercent;
    }

    @JsonProperty("preMarketChangePercent")
    public void setPreMarketChangePercent(PreMarketChangePercent preMarketChangePercent) {
        this.preMarketChangePercent = preMarketChangePercent;
    }

    @JsonProperty("volumeAllCurrencies")
    public VolumeAllCurrencies getVolumeAllCurrencies() {
        return volumeAllCurrencies;
    }

    @JsonProperty("volumeAllCurrencies")
    public void setVolumeAllCurrencies(VolumeAllCurrencies volumeAllCurrencies) {
        this.volumeAllCurrencies = volumeAllCurrencies;
    }

    @JsonProperty("postMarketSource")
    public String getPostMarketSource() {
        return postMarketSource;
    }

    @JsonProperty("postMarketSource")
    public void setPostMarketSource(String postMarketSource) {
        this.postMarketSource = postMarketSource;
    }

    @JsonProperty("strikePrice")
    public StrikePrice getStrikePrice() {
        return strikePrice;
    }

    @JsonProperty("strikePrice")
    public void setStrikePrice(StrikePrice strikePrice) {
        this.strikePrice = strikePrice;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("postMarketChangePercent")
    public PostMarketChangePercent getPostMarketChangePercent() {
        return postMarketChangePercent;
    }

    @JsonProperty("postMarketChangePercent")
    public void setPostMarketChangePercent(PostMarketChangePercent postMarketChangePercent) {
        this.postMarketChangePercent = postMarketChangePercent;
    }

    @JsonProperty("preMarketSource")
    public String getPreMarketSource() {
        return preMarketSource;
    }

    @JsonProperty("preMarketSource")
    public void setPreMarketSource(String preMarketSource) {
        this.preMarketSource = preMarketSource;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("fromCurrency")
    public Object getFromCurrency() {
        return fromCurrency;
    }

    @JsonProperty("fromCurrency")
    public void setFromCurrency(Object fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    @JsonProperty("regularMarketChangePercent")
    public RegularMarketChangePercent getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    @JsonProperty("regularMarketChangePercent")
    public void setRegularMarketChangePercent(RegularMarketChangePercent regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
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
        sb.append(Price.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quoteSourceName");
        sb.append('=');
        sb.append(((this.quoteSourceName == null) ? "<null>" : this.quoteSourceName));
        sb.append(',');
        sb.append("regularMarketOpen");
        sb.append('=');
        sb.append(((this.regularMarketOpen == null) ? "<null>" : this.regularMarketOpen));
        sb.append(',');
        sb.append("averageDailyVolume3Month");
        sb.append('=');
        sb.append(((this.averageDailyVolume3Month == null) ? "<null>" : this.averageDailyVolume3Month));
        sb.append(',');
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null) ? "<null>" : this.exchange));
        sb.append(',');
        sb.append("regularMarketTime");
        sb.append('=');
        sb.append(((this.regularMarketTime == null) ? "<null>" : this.regularMarketTime));
        sb.append(',');
        sb.append("volume24Hr");
        sb.append('=');
        sb.append(((this.volume24Hr == null) ? "<null>" : this.volume24Hr));
        sb.append(',');
        sb.append("regularMarketDayHigh");
        sb.append('=');
        sb.append(((this.regularMarketDayHigh == null) ? "<null>" : this.regularMarketDayHigh));
        sb.append(',');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null) ? "<null>" : this.shortName));
        sb.append(',');
        sb.append("averageDailyVolume10Day");
        sb.append('=');
        sb.append(((this.averageDailyVolume10Day == null) ? "<null>" : this.averageDailyVolume10Day));
        sb.append(',');
        sb.append("longName");
        sb.append('=');
        sb.append(((this.longName == null) ? "<null>" : this.longName));
        sb.append(',');
        sb.append("regularMarketChange");
        sb.append('=');
        sb.append(((this.regularMarketChange == null) ? "<null>" : this.regularMarketChange));
        sb.append(',');
        sb.append("currencySymbol");
        sb.append('=');
        sb.append(((this.currencySymbol == null) ? "<null>" : this.currencySymbol));
        sb.append(',');
        sb.append("regularMarketPreviousClose");
        sb.append('=');
        sb.append(((this.regularMarketPreviousClose == null) ? "<null>" : this.regularMarketPreviousClose));
        sb.append(',');
        sb.append("postMarketTime");
        sb.append('=');
        sb.append(((this.postMarketTime == null) ? "<null>" : this.postMarketTime));
        sb.append(',');
        sb.append("preMarketPrice");
        sb.append('=');
        sb.append(((this.preMarketPrice == null) ? "<null>" : this.preMarketPrice));
        sb.append(',');
        sb.append("preMarketTime");
        sb.append('=');
        sb.append(((this.preMarketTime == null) ? "<null>" : this.preMarketTime));
        sb.append(',');
        sb.append("exchangeDataDelayedBy");
        sb.append('=');
        sb.append(((this.exchangeDataDelayedBy == null) ? "<null>" : this.exchangeDataDelayedBy));
        sb.append(',');
        sb.append("toCurrency");
        sb.append('=');
        sb.append(((this.toCurrency == null) ? "<null>" : this.toCurrency));
        sb.append(',');
        sb.append("postMarketChange");
        sb.append('=');
        sb.append(((this.postMarketChange == null) ? "<null>" : this.postMarketChange));
        sb.append(',');
        sb.append("postMarketPrice");
        sb.append('=');
        sb.append(((this.postMarketPrice == null) ? "<null>" : this.postMarketPrice));
        sb.append(',');
        sb.append("exchangeName");
        sb.append('=');
        sb.append(((this.exchangeName == null) ? "<null>" : this.exchangeName));
        sb.append(',');
        sb.append("preMarketChange");
        sb.append('=');
        sb.append(((this.preMarketChange == null) ? "<null>" : this.preMarketChange));
        sb.append(',');
        sb.append("circulatingSupply");
        sb.append('=');
        sb.append(((this.circulatingSupply == null) ? "<null>" : this.circulatingSupply));
        sb.append(',');
        sb.append("regularMarketDayLow");
        sb.append('=');
        sb.append(((this.regularMarketDayLow == null) ? "<null>" : this.regularMarketDayLow));
        sb.append(',');
        sb.append("priceHint");
        sb.append('=');
        sb.append(((this.priceHint == null) ? "<null>" : this.priceHint));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null) ? "<null>" : this.currency));
        sb.append(',');
        sb.append("regularMarketPrice");
        sb.append('=');
        sb.append(((this.regularMarketPrice == null) ? "<null>" : this.regularMarketPrice));
        sb.append(',');
        sb.append("regularMarketVolume");
        sb.append('=');
        sb.append(((this.regularMarketVolume == null) ? "<null>" : this.regularMarketVolume));
        sb.append(',');
        sb.append("lastMarket");
        sb.append('=');
        sb.append(((this.lastMarket == null) ? "<null>" : this.lastMarket));
        sb.append(',');
        sb.append("regularMarketSource");
        sb.append('=');
        sb.append(((this.regularMarketSource == null) ? "<null>" : this.regularMarketSource));
        sb.append(',');
        sb.append("openInterest");
        sb.append('=');
        sb.append(((this.openInterest == null) ? "<null>" : this.openInterest));
        sb.append(',');
        sb.append("marketState");
        sb.append('=');
        sb.append(((this.marketState == null) ? "<null>" : this.marketState));
        sb.append(',');
        sb.append("underlyingSymbol");
        sb.append('=');
        sb.append(((this.underlyingSymbol == null) ? "<null>" : this.underlyingSymbol));
        sb.append(',');
        sb.append("marketCap");
        sb.append('=');
        sb.append(((this.marketCap == null) ? "<null>" : this.marketCap));
        sb.append(',');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null) ? "<null>" : this.quoteType));
        sb.append(',');
        sb.append("preMarketChangePercent");
        sb.append('=');
        sb.append(((this.preMarketChangePercent == null) ? "<null>" : this.preMarketChangePercent));
        sb.append(',');
        sb.append("volumeAllCurrencies");
        sb.append('=');
        sb.append(((this.volumeAllCurrencies == null) ? "<null>" : this.volumeAllCurrencies));
        sb.append(',');
        sb.append("postMarketSource");
        sb.append('=');
        sb.append(((this.postMarketSource == null) ? "<null>" : this.postMarketSource));
        sb.append(',');
        sb.append("strikePrice");
        sb.append('=');
        sb.append(((this.strikePrice == null) ? "<null>" : this.strikePrice));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null) ? "<null>" : this.symbol));
        sb.append(',');
        sb.append("postMarketChangePercent");
        sb.append('=');
        sb.append(((this.postMarketChangePercent == null) ? "<null>" : this.postMarketChangePercent));
        sb.append(',');
        sb.append("preMarketSource");
        sb.append('=');
        sb.append(((this.preMarketSource == null) ? "<null>" : this.preMarketSource));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
        sb.append(',');
        sb.append("fromCurrency");
        sb.append('=');
        sb.append(((this.fromCurrency == null) ? "<null>" : this.fromCurrency));
        sb.append(',');
        sb.append("regularMarketChangePercent");
        sb.append('=');
        sb.append(((this.regularMarketChangePercent == null) ? "<null>" : this.regularMarketChangePercent));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.symbol == null) ? 0 : this.symbol.hashCode()));
        result = ((result * 31) + ((this.openInterest == null) ? 0 : this.openInterest.hashCode()));
        result = ((result * 31) + ((this.regularMarketOpen == null) ? 0 : this.regularMarketOpen.hashCode()));
        result = ((result * 31) + ((this.regularMarketTime == null) ? 0 : this.regularMarketTime.hashCode()));
        result = ((result * 31) + ((this.regularMarketChangePercent == null) ? 0 : this.regularMarketChangePercent.hashCode()));
        result = ((result * 31) + ((this.quoteType == null) ? 0 : this.quoteType.hashCode()));
        result = ((result * 31) + ((this.preMarketSource == null) ? 0 : this.preMarketSource.hashCode()));
        result = ((result * 31) + ((this.circulatingSupply == null) ? 0 : this.circulatingSupply.hashCode()));
        result = ((result * 31) + ((this.preMarketChangePercent == null) ? 0 : this.preMarketChangePercent.hashCode()));
        result = ((result * 31) + ((this.postMarketSource == null) ? 0 : this.postMarketSource.hashCode()));
        result = ((result * 31) + ((this.averageDailyVolume10Day == null) ? 0 : this.averageDailyVolume10Day.hashCode()));
        result = ((result * 31) + ((this.underlyingSymbol == null) ? 0 : this.underlyingSymbol.hashCode()));
        result = ((result * 31) + ((this.regularMarketDayHigh == null) ? 0 : this.regularMarketDayHigh.hashCode()));
        result = ((result * 31) + ((this.regularMarketSource == null) ? 0 : this.regularMarketSource.hashCode()));
        result = ((result * 31) + ((this.postMarketTime == null) ? 0 : this.postMarketTime.hashCode()));
        result = ((result * 31) + ((this.preMarketPrice == null) ? 0 : this.preMarketPrice.hashCode()));
        result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
        result = ((result * 31) + ((this.fromCurrency == null) ? 0 : this.fromCurrency.hashCode()));
        result = ((result * 31) + ((this.regularMarketPreviousClose == null) ? 0 : this.regularMarketPreviousClose.hashCode()));
        result = ((result * 31) + ((this.postMarketChangePercent == null) ? 0 : this.postMarketChangePercent.hashCode()));
        result = ((result * 31) + ((this.marketCap == null) ? 0 : this.marketCap.hashCode()));
        result = ((result * 31) + ((this.volume24Hr == null) ? 0 : this.volume24Hr.hashCode()));
        result = ((result * 31) + ((this.regularMarketChange == null) ? 0 : this.regularMarketChange.hashCode()));
        result = ((result * 31) + ((this.lastMarket == null) ? 0 : this.lastMarket.hashCode()));
        result = ((result * 31) + ((this.volumeAllCurrencies == null) ? 0 : this.volumeAllCurrencies.hashCode()));
        result = ((result * 31) + ((this.averageDailyVolume3Month == null) ? 0 : this.averageDailyVolume3Month.hashCode()));
        result = ((result * 31) + ((this.currencySymbol == null) ? 0 : this.currencySymbol.hashCode()));
        result = ((result * 31) + ((this.exchangeDataDelayedBy == null) ? 0 : this.exchangeDataDelayedBy.hashCode()));
        result = ((result * 31) + ((this.regularMarketPrice == null) ? 0 : this.regularMarketPrice.hashCode()));
        result = ((result * 31) + ((this.marketState == null) ? 0 : this.marketState.hashCode()));
        result = ((result * 31) + ((this.regularMarketVolume == null) ? 0 : this.regularMarketVolume.hashCode()));
        result = ((result * 31) + ((this.postMarketPrice == null) ? 0 : this.postMarketPrice.hashCode()));
        result = ((result * 31) + ((this.preMarketChange == null) ? 0 : this.preMarketChange.hashCode()));
        result = ((result * 31) + ((this.quoteSourceName == null) ? 0 : this.quoteSourceName.hashCode()));
        result = ((result * 31) + ((this.postMarketChange == null) ? 0 : this.postMarketChange.hashCode()));
        result = ((result * 31) + ((this.toCurrency == null) ? 0 : this.toCurrency.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        result = ((result * 31) + ((this.priceHint == null) ? 0 : this.priceHint.hashCode()));
        result = ((result * 31) + ((this.exchange == null) ? 0 : this.exchange.hashCode()));
        result = ((result * 31) + ((this.exchangeName == null) ? 0 : this.exchangeName.hashCode()));
        result = ((result * 31) + ((this.regularMarketDayLow == null) ? 0 : this.regularMarketDayLow.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.shortName == null) ? 0 : this.shortName.hashCode()));
        result = ((result * 31) + ((this.preMarketTime == null) ? 0 : this.preMarketTime.hashCode()));
        result = ((result * 31) + ((this.strikePrice == null) ? 0 : this.strikePrice.hashCode()));
        result = ((result * 31) + ((this.longName == null) ? 0 : this.longName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Price) == false) {
            return false;
        }
        Price rhs = ((Price) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((this.symbol == rhs.symbol) || ((this.symbol != null) && this.symbol.equals(rhs.symbol))) && ((this.openInterest == rhs.openInterest) || ((this.openInterest != null) && this.openInterest.equals(rhs.openInterest)))) && ((this.regularMarketOpen == rhs.regularMarketOpen) || ((this.regularMarketOpen != null) && this.regularMarketOpen.equals(rhs.regularMarketOpen)))) && ((this.regularMarketTime == rhs.regularMarketTime) || ((this.regularMarketTime != null) && this.regularMarketTime.equals(rhs.regularMarketTime)))) && ((this.regularMarketChangePercent == rhs.regularMarketChangePercent) || ((this.regularMarketChangePercent != null) && this.regularMarketChangePercent.equals(rhs.regularMarketChangePercent)))) && ((this.quoteType == rhs.quoteType) || ((this.quoteType != null) && this.quoteType.equals(rhs.quoteType)))) && ((this.preMarketSource == rhs.preMarketSource) || ((this.preMarketSource != null) && this.preMarketSource.equals(rhs.preMarketSource)))) && ((this.circulatingSupply == rhs.circulatingSupply) || ((this.circulatingSupply != null) && this.circulatingSupply.equals(rhs.circulatingSupply)))) && ((this.preMarketChangePercent == rhs.preMarketChangePercent) || ((this.preMarketChangePercent != null) && this.preMarketChangePercent.equals(rhs.preMarketChangePercent)))) && ((this.postMarketSource == rhs.postMarketSource) || ((this.postMarketSource != null) && this.postMarketSource.equals(rhs.postMarketSource)))) && ((this.averageDailyVolume10Day == rhs.averageDailyVolume10Day) || ((this.averageDailyVolume10Day != null) && this.averageDailyVolume10Day.equals(rhs.averageDailyVolume10Day)))) && ((this.underlyingSymbol == rhs.underlyingSymbol) || ((this.underlyingSymbol != null) && this.underlyingSymbol.equals(rhs.underlyingSymbol)))) && ((this.regularMarketDayHigh == rhs.regularMarketDayHigh) || ((this.regularMarketDayHigh != null) && this.regularMarketDayHigh.equals(rhs.regularMarketDayHigh)))) && ((this.regularMarketSource == rhs.regularMarketSource) || ((this.regularMarketSource != null) && this.regularMarketSource.equals(rhs.regularMarketSource)))) && ((this.postMarketTime == rhs.postMarketTime) || ((this.postMarketTime != null) && this.postMarketTime.equals(rhs.postMarketTime)))) && ((this.preMarketPrice == rhs.preMarketPrice) || ((this.preMarketPrice != null) && this.preMarketPrice.equals(rhs.preMarketPrice)))) && ((this.currency == rhs.currency) || ((this.currency != null) && this.currency.equals(rhs.currency)))) && ((this.fromCurrency == rhs.fromCurrency) || ((this.fromCurrency != null) && this.fromCurrency.equals(rhs.fromCurrency)))) && ((this.regularMarketPreviousClose == rhs.regularMarketPreviousClose) || ((this.regularMarketPreviousClose != null) && this.regularMarketPreviousClose.equals(rhs.regularMarketPreviousClose)))) && ((this.postMarketChangePercent == rhs.postMarketChangePercent) || ((this.postMarketChangePercent != null) && this.postMarketChangePercent.equals(rhs.postMarketChangePercent)))) && ((this.marketCap == rhs.marketCap) || ((this.marketCap != null) && this.marketCap.equals(rhs.marketCap)))) && ((this.volume24Hr == rhs.volume24Hr) || ((this.volume24Hr != null) && this.volume24Hr.equals(rhs.volume24Hr)))) && ((this.regularMarketChange == rhs.regularMarketChange) || ((this.regularMarketChange != null) && this.regularMarketChange.equals(rhs.regularMarketChange)))) && ((this.lastMarket == rhs.lastMarket) || ((this.lastMarket != null) && this.lastMarket.equals(rhs.lastMarket)))) && ((this.volumeAllCurrencies == rhs.volumeAllCurrencies) || ((this.volumeAllCurrencies != null) && this.volumeAllCurrencies.equals(rhs.volumeAllCurrencies)))) && ((this.averageDailyVolume3Month == rhs.averageDailyVolume3Month) || ((this.averageDailyVolume3Month != null) && this.averageDailyVolume3Month.equals(rhs.averageDailyVolume3Month)))) && ((this.currencySymbol == rhs.currencySymbol) || ((this.currencySymbol != null) && this.currencySymbol.equals(rhs.currencySymbol)))) && ((this.exchangeDataDelayedBy == rhs.exchangeDataDelayedBy) || ((this.exchangeDataDelayedBy != null) && this.exchangeDataDelayedBy.equals(rhs.exchangeDataDelayedBy)))) && ((this.regularMarketPrice == rhs.regularMarketPrice) || ((this.regularMarketPrice != null) && this.regularMarketPrice.equals(rhs.regularMarketPrice)))) && ((this.marketState == rhs.marketState) || ((this.marketState != null) && this.marketState.equals(rhs.marketState)))) && ((this.regularMarketVolume == rhs.regularMarketVolume) || ((this.regularMarketVolume != null) && this.regularMarketVolume.equals(rhs.regularMarketVolume)))) && ((this.postMarketPrice == rhs.postMarketPrice) || ((this.postMarketPrice != null) && this.postMarketPrice.equals(rhs.postMarketPrice)))) && ((this.preMarketChange == rhs.preMarketChange) || ((this.preMarketChange != null) && this.preMarketChange.equals(rhs.preMarketChange)))) && ((this.quoteSourceName == rhs.quoteSourceName) || ((this.quoteSourceName != null) && this.quoteSourceName.equals(rhs.quoteSourceName)))) && ((this.postMarketChange == rhs.postMarketChange) || ((this.postMarketChange != null) && this.postMarketChange.equals(rhs.postMarketChange)))) && ((this.toCurrency == rhs.toCurrency) || ((this.toCurrency != null) && this.toCurrency.equals(rhs.toCurrency)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.priceHint == rhs.priceHint) || ((this.priceHint != null) && this.priceHint.equals(rhs.priceHint)))) && ((this.exchange == rhs.exchange) || ((this.exchange != null) && this.exchange.equals(rhs.exchange)))) && ((this.exchangeName == rhs.exchangeName) || ((this.exchangeName != null) && this.exchangeName.equals(rhs.exchangeName)))) && ((this.regularMarketDayLow == rhs.regularMarketDayLow) || ((this.regularMarketDayLow != null) && this.regularMarketDayLow.equals(rhs.regularMarketDayLow)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.shortName == rhs.shortName) || ((this.shortName != null) && this.shortName.equals(rhs.shortName)))) && ((this.preMarketTime == rhs.preMarketTime) || ((this.preMarketTime != null) && this.preMarketTime.equals(rhs.preMarketTime)))) && ((this.strikePrice == rhs.strikePrice) || ((this.strikePrice != null) && this.strikePrice.equals(rhs.strikePrice)))) && ((this.longName == rhs.longName) || ((this.longName != null) && this.longName.equals(rhs.longName))));
    }

}
