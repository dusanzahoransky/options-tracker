
package com.github.dusanzahoransky.optionstracker.model.yahoo.analysis;

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
    "period",
    "strongBuy",
    "buy",
    "hold",
    "sell",
    "strongSell"
})
public class Trend {

    @JsonProperty("period")
    private String period;
    @JsonProperty("strongBuy")
    private Long strongBuy;
    @JsonProperty("buy")
    private Long buy;
    @JsonProperty("hold")
    private Long hold;
    @JsonProperty("sell")
    private Long sell;
    @JsonProperty("strongSell")
    private Long strongSell;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("strongBuy")
    public Long getStrongBuy() {
        return strongBuy;
    }

    @JsonProperty("strongBuy")
    public void setStrongBuy(Long strongBuy) {
        this.strongBuy = strongBuy;
    }

    @JsonProperty("buy")
    public Long getBuy() {
        return buy;
    }

    @JsonProperty("buy")
    public void setBuy(Long buy) {
        this.buy = buy;
    }

    @JsonProperty("hold")
    public Long getHold() {
        return hold;
    }

    @JsonProperty("hold")
    public void setHold(Long hold) {
        this.hold = hold;
    }

    @JsonProperty("sell")
    public Long getSell() {
        return sell;
    }

    @JsonProperty("sell")
    public void setSell(Long sell) {
        this.sell = sell;
    }

    @JsonProperty("strongSell")
    public Long getStrongSell() {
        return strongSell;
    }

    @JsonProperty("strongSell")
    public void setStrongSell(Long strongSell) {
        this.strongSell = strongSell;
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
        sb.append(Trend.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("strongBuy");
        sb.append('=');
        sb.append(((this.strongBuy == null)?"<null>":this.strongBuy));
        sb.append(',');
        sb.append("buy");
        sb.append('=');
        sb.append(((this.buy == null)?"<null>":this.buy));
        sb.append(',');
        sb.append("hold");
        sb.append('=');
        sb.append(((this.hold == null)?"<null>":this.hold));
        sb.append(',');
        sb.append("sell");
        sb.append('=');
        sb.append(((this.sell == null)?"<null>":this.sell));
        sb.append(',');
        sb.append("strongSell");
        sb.append('=');
        sb.append(((this.strongSell == null)?"<null>":this.strongSell));
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
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.buy == null)? 0 :this.buy.hashCode()));
        result = ((result* 31)+((this.sell == null)? 0 :this.sell.hashCode()));
        result = ((result* 31)+((this.strongSell == null)? 0 :this.strongSell.hashCode()));
        result = ((result* 31)+((this.strongBuy == null)? 0 :this.strongBuy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hold == null)? 0 :this.hold.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trend) == false) {
            return false;
        }
        Trend rhs = ((Trend) other);
        return ((((((((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period)))&&((this.buy == rhs.buy)||((this.buy!= null)&&this.buy.equals(rhs.buy))))&&((this.sell == rhs.sell)||((this.sell!= null)&&this.sell.equals(rhs.sell))))&&((this.strongSell == rhs.strongSell)||((this.strongSell!= null)&&this.strongSell.equals(rhs.strongSell))))&&((this.strongBuy == rhs.strongBuy)||((this.strongBuy!= null)&&this.strongBuy.equals(rhs.strongBuy))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.hold == rhs.hold)||((this.hold!= null)&&this.hold.equals(rhs.hold))));
    }

}
