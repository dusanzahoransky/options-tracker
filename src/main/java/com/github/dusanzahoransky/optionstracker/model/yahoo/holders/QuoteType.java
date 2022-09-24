
package com.github.dusanzahoransky.optionstracker.model.yahoo.holders;

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
    "exchange",
    "shortName",
    "longName",
    "exchangeTimezoneName",
    "exchangeTimezoneShortName",
    "isEsgPopulated",
    "gmtOffSetMilliseconds",
    "quoteType",
    "symbol",
    "messageBoardId",
    "market"
})
public class QuoteType {

    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("exchangeTimezoneName")
    private String exchangeTimezoneName;
    @JsonProperty("exchangeTimezoneShortName")
    private String exchangeTimezoneShortName;
    @JsonProperty("isEsgPopulated")
    private Boolean isEsgPopulated;
    @JsonProperty("gmtOffSetMilliseconds")
    private String gmtOffSetMilliseconds;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("messageBoardId")
    private String messageBoardId;
    @JsonProperty("market")
    private String market;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
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

    @JsonProperty("exchangeTimezoneShortName")
    public String getExchangeTimezoneShortName() {
        return exchangeTimezoneShortName;
    }

    @JsonProperty("exchangeTimezoneShortName")
    public void setExchangeTimezoneShortName(String exchangeTimezoneShortName) {
        this.exchangeTimezoneShortName = exchangeTimezoneShortName;
    }

    @JsonProperty("isEsgPopulated")
    public Boolean getIsEsgPopulated() {
        return isEsgPopulated;
    }

    @JsonProperty("isEsgPopulated")
    public void setIsEsgPopulated(Boolean isEsgPopulated) {
        this.isEsgPopulated = isEsgPopulated;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public String getGmtOffSetMilliseconds() {
        return gmtOffSetMilliseconds;
    }

    @JsonProperty("gmtOffSetMilliseconds")
    public void setGmtOffSetMilliseconds(String gmtOffSetMilliseconds) {
        this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("messageBoardId")
    public String getMessageBoardId() {
        return messageBoardId;
    }

    @JsonProperty("messageBoardId")
    public void setMessageBoardId(String messageBoardId) {
        this.messageBoardId = messageBoardId;
    }

    @JsonProperty("market")
    public String getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(String market) {
        this.market = market;
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
        sb.append(QuoteType.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null)?"<null>":this.exchange));
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
        sb.append("exchangeTimezoneShortName");
        sb.append('=');
        sb.append(((this.exchangeTimezoneShortName == null)?"<null>":this.exchangeTimezoneShortName));
        sb.append(',');
        sb.append("isEsgPopulated");
        sb.append('=');
        sb.append(((this.isEsgPopulated == null)?"<null>":this.isEsgPopulated));
        sb.append(',');
        sb.append("gmtOffSetMilliseconds");
        sb.append('=');
        sb.append(((this.gmtOffSetMilliseconds == null)?"<null>":this.gmtOffSetMilliseconds));
        sb.append(',');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null)?"<null>":this.quoteType));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("messageBoardId");
        sb.append('=');
        sb.append(((this.messageBoardId == null)?"<null>":this.messageBoardId));
        sb.append(',');
        sb.append("market");
        sb.append('=');
        sb.append(((this.market == null)?"<null>":this.market));
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
        result = ((result* 31)+((this.exchangeTimezoneName == null)? 0 :this.exchangeTimezoneName.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.isEsgPopulated == null)? 0 :this.isEsgPopulated.hashCode()));
        result = ((result* 31)+((this.gmtOffSetMilliseconds == null)? 0 :this.gmtOffSetMilliseconds.hashCode()));
        result = ((result* 31)+((this.exchangeTimezoneShortName == null)? 0 :this.exchangeTimezoneShortName.hashCode()));
        result = ((result* 31)+((this.quoteType == null)? 0 :this.quoteType.hashCode()));
        result = ((result* 31)+((this.market == null)? 0 :this.market.hashCode()));
        result = ((result* 31)+((this.messageBoardId == null)? 0 :this.messageBoardId.hashCode()));
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shortName == null)? 0 :this.shortName.hashCode()));
        result = ((result* 31)+((this.longName == null)? 0 :this.longName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuoteType) == false) {
            return false;
        }
        QuoteType rhs = ((QuoteType) other);
        return (((((((((((((this.exchangeTimezoneName == rhs.exchangeTimezoneName)||((this.exchangeTimezoneName!= null)&&this.exchangeTimezoneName.equals(rhs.exchangeTimezoneName)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.isEsgPopulated == rhs.isEsgPopulated)||((this.isEsgPopulated!= null)&&this.isEsgPopulated.equals(rhs.isEsgPopulated))))&&((this.gmtOffSetMilliseconds == rhs.gmtOffSetMilliseconds)||((this.gmtOffSetMilliseconds!= null)&&this.gmtOffSetMilliseconds.equals(rhs.gmtOffSetMilliseconds))))&&((this.exchangeTimezoneShortName == rhs.exchangeTimezoneShortName)||((this.exchangeTimezoneShortName!= null)&&this.exchangeTimezoneShortName.equals(rhs.exchangeTimezoneShortName))))&&((this.quoteType == rhs.quoteType)||((this.quoteType!= null)&&this.quoteType.equals(rhs.quoteType))))&&((this.market == rhs.market)||((this.market!= null)&&this.market.equals(rhs.market))))&&((this.messageBoardId == rhs.messageBoardId)||((this.messageBoardId!= null)&&this.messageBoardId.equals(rhs.messageBoardId))))&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName))))&&((this.longName == rhs.longName)||((this.longName!= null)&&this.longName.equals(rhs.longName))));
    }

}
