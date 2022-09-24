package com.github.dusanzahoransky.optionstracker.model.yahoo.chart;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
    "currency",
    "symbol",
    "exchangeName",
    "instrumentType",
    "firstTradeDate",
    "regularMarketTime",
    "gmtoffset",
    "timezone",
    "exchangeTimezoneName",
    "regularMarketPrice",
    "chartPreviousClose",
    "priceHint",
    "currentTradingPeriod",
    "dataGranularity",
    "range",
    "validRanges"
})
public class Meta {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("exchangeName")
    private String exchangeName;
    @JsonProperty("instrumentType")
    private String instrumentType;
    @JsonProperty("firstTradeDate")
    private Integer firstTradeDate;
    @JsonProperty("regularMarketTime")
    private Integer regularMarketTime;
    @JsonProperty("gmtoffset")
    private Integer gmtoffset;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("exchangeTimezoneName")
    private String exchangeTimezoneName;
    @JsonProperty("regularMarketPrice")
    private Double regularMarketPrice;
    @JsonProperty("chartPreviousClose")
    private Double chartPreviousClose;
    @JsonProperty("priceHint")
    private Integer priceHint;
    @JsonProperty("currentTradingPeriod")
    private CurrentTradingPeriod currentTradingPeriod;
    @JsonProperty("dataGranularity")
    private String dataGranularity;
    @JsonProperty("range")
    private String range;
    @JsonProperty("validRanges")
    private List<String> validRanges = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("exchangeName")
    public String getExchangeName() {
        return exchangeName;
    }

    @JsonProperty("exchangeName")
    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    @JsonProperty("instrumentType")
    public String getInstrumentType() {
        return instrumentType;
    }

    @JsonProperty("instrumentType")
    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    @JsonProperty("firstTradeDate")
    public Integer getFirstTradeDate() {
        return firstTradeDate;
    }

    @JsonProperty("firstTradeDate")
    public void setFirstTradeDate(Integer firstTradeDate) {
        this.firstTradeDate = firstTradeDate;
    }

    @JsonProperty("regularMarketTime")
    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    @JsonProperty("regularMarketTime")
    public void setRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    @JsonProperty("gmtoffset")
    public Integer getGmtoffset() {
        return gmtoffset;
    }

    @JsonProperty("gmtoffset")
    public void setGmtoffset(Integer gmtoffset) {
        this.gmtoffset = gmtoffset;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("exchangeTimezoneName")
    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    @JsonProperty("exchangeTimezoneName")
    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    @JsonProperty("regularMarketPrice")
    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    @JsonProperty("regularMarketPrice")
    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    @JsonProperty("chartPreviousClose")
    public Double getChartPreviousClose() {
        return chartPreviousClose;
    }

    @JsonProperty("chartPreviousClose")
    public void setChartPreviousClose(Double chartPreviousClose) {
        this.chartPreviousClose = chartPreviousClose;
    }

    @JsonProperty("priceHint")
    public Integer getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(Integer priceHint) {
        this.priceHint = priceHint;
    }

    @JsonProperty("currentTradingPeriod")
    public CurrentTradingPeriod getCurrentTradingPeriod() {
        return currentTradingPeriod;
    }

    @JsonProperty("currentTradingPeriod")
    public void setCurrentTradingPeriod(CurrentTradingPeriod currentTradingPeriod) {
        this.currentTradingPeriod = currentTradingPeriod;
    }

    @JsonProperty("dataGranularity")
    public String getDataGranularity() {
        return dataGranularity;
    }

    @JsonProperty("dataGranularity")
    public void setDataGranularity(String dataGranularity) {
        this.dataGranularity = dataGranularity;
    }

    @JsonProperty("range")
    public String getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(String range) {
        this.range = range;
    }

    @JsonProperty("validRanges")
    public List<String> getValidRanges() {
        return validRanges;
    }

    @JsonProperty("validRanges")
    public void setValidRanges(List<String> validRanges) {
        this.validRanges = validRanges;
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
        sb.append(Meta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null) ? "<null>" : this.currency));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null) ? "<null>" : this.symbol));
        sb.append(',');
        sb.append("exchangeName");
        sb.append('=');
        sb.append(((this.exchangeName == null) ? "<null>" : this.exchangeName));
        sb.append(',');
        sb.append("instrumentType");
        sb.append('=');
        sb.append(((this.instrumentType == null) ? "<null>" : this.instrumentType));
        sb.append(',');
        sb.append("firstTradeDate");
        sb.append('=');
        sb.append(((this.firstTradeDate == null) ? "<null>" : this.firstTradeDate));
        sb.append(',');
        sb.append("regularMarketTime");
        sb.append('=');
        sb.append(((this.regularMarketTime == null) ? "<null>" : this.regularMarketTime));
        sb.append(',');
        sb.append("gmtoffset");
        sb.append('=');
        sb.append(((this.gmtoffset == null) ? "<null>" : this.gmtoffset));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null) ? "<null>" : this.timezone));
        sb.append(',');
        sb.append("exchangeTimezoneName");
        sb.append('=');
        sb.append(((this.exchangeTimezoneName == null) ? "<null>" : this.exchangeTimezoneName));
        sb.append(',');
        sb.append("regularMarketPrice");
        sb.append('=');
        sb.append(((this.regularMarketPrice == null) ? "<null>" : this.regularMarketPrice));
        sb.append(',');
        sb.append("chartPreviousClose");
        sb.append('=');
        sb.append(((this.chartPreviousClose == null) ? "<null>" : this.chartPreviousClose));
        sb.append(',');
        sb.append("priceHint");
        sb.append('=');
        sb.append(((this.priceHint == null) ? "<null>" : this.priceHint));
        sb.append(',');
        sb.append("currentTradingPeriod");
        sb.append('=');
        sb.append(((this.currentTradingPeriod == null) ? "<null>" : this.currentTradingPeriod));
        sb.append(',');
        sb.append("dataGranularity");
        sb.append('=');
        sb.append(((this.dataGranularity == null) ? "<null>" : this.dataGranularity));
        sb.append(',');
        sb.append("range");
        sb.append('=');
        sb.append(((this.range == null) ? "<null>" : this.range));
        sb.append(',');
        sb.append("validRanges");
        sb.append('=');
        sb.append(((this.validRanges == null) ? "<null>" : this.validRanges));
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
        result = ((result * 31) + ((this.exchangeTimezoneName == null) ? 0 : this.exchangeTimezoneName.hashCode()));
        result = ((result * 31) + ((this.symbol == null) ? 0 : this.symbol.hashCode()));
        result = ((result * 31) + ((this.instrumentType == null) ? 0 : this.instrumentType.hashCode()));
        result = ((result * 31) + ((this.firstTradeDate == null) ? 0 : this.firstTradeDate.hashCode()));
        result = ((result * 31) + ((this.timezone == null) ? 0 : this.timezone.hashCode()));
        result = ((result * 31) + ((this.range == null) ? 0 : this.range.hashCode()));
        result = ((result * 31) + ((this.regularMarketTime == null) ? 0 : this.regularMarketTime.hashCode()));
        result = ((result * 31) + ((this.dataGranularity == null) ? 0 : this.dataGranularity.hashCode()));
        result = ((result * 31) + ((this.validRanges == null) ? 0 : this.validRanges.hashCode()));
        result = ((result * 31) + ((this.regularMarketPrice == null) ? 0 : this.regularMarketPrice.hashCode()));
        result = ((result * 31) + ((this.gmtoffset == null) ? 0 : this.gmtoffset.hashCode()));
        result = ((result * 31) + ((this.chartPreviousClose == null) ? 0 : this.chartPreviousClose.hashCode()));
        result = ((result * 31) + ((this.priceHint == null) ? 0 : this.priceHint.hashCode()));
        result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
        result = ((result * 31) + ((this.exchangeName == null) ? 0 : this.exchangeName.hashCode()));
        result = ((result * 31) + ((this.currentTradingPeriod == null) ? 0 : this.currentTradingPeriod.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return ((((((((((((((((((this.exchangeTimezoneName == rhs.exchangeTimezoneName) || ((this.exchangeTimezoneName != null) && this.exchangeTimezoneName.equals(rhs.exchangeTimezoneName))) && ((this.symbol == rhs.symbol) || ((this.symbol != null) && this.symbol.equals(rhs.symbol)))) && ((this.instrumentType == rhs.instrumentType) || ((this.instrumentType != null) && this.instrumentType.equals(rhs.instrumentType)))) && ((this.firstTradeDate == rhs.firstTradeDate) || ((this.firstTradeDate != null) && this.firstTradeDate.equals(rhs.firstTradeDate)))) && ((this.timezone == rhs.timezone) || ((this.timezone != null) && this.timezone.equals(rhs.timezone)))) && ((this.range == rhs.range) || ((this.range != null) && this.range.equals(rhs.range)))) && ((this.regularMarketTime == rhs.regularMarketTime) || ((this.regularMarketTime != null) && this.regularMarketTime.equals(rhs.regularMarketTime)))) && ((this.dataGranularity == rhs.dataGranularity) || ((this.dataGranularity != null) && this.dataGranularity.equals(rhs.dataGranularity)))) && ((this.validRanges == rhs.validRanges) || ((this.validRanges != null) && this.validRanges.equals(rhs.validRanges)))) && ((this.regularMarketPrice == rhs.regularMarketPrice) || ((this.regularMarketPrice != null) && this.regularMarketPrice.equals(rhs.regularMarketPrice)))) && ((this.gmtoffset == rhs.gmtoffset) || ((this.gmtoffset != null) && this.gmtoffset.equals(rhs.gmtoffset)))) && ((this.chartPreviousClose == rhs.chartPreviousClose) || ((this.chartPreviousClose != null) && this.chartPreviousClose.equals(rhs.chartPreviousClose)))) && ((this.priceHint == rhs.priceHint) || ((this.priceHint != null) && this.priceHint.equals(rhs.priceHint)))) && ((this.currency == rhs.currency) || ((this.currency != null) && this.currency.equals(rhs.currency)))) && ((this.exchangeName == rhs.exchangeName) || ((this.exchangeName != null) && this.exchangeName.equals(rhs.exchangeName)))) && ((this.currentTradingPeriod == rhs.currentTradingPeriod) || ((this.currentTradingPeriod != null) && this.currentTradingPeriod.equals(rhs.currentTradingPeriod)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
