
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
    "symbol",
    "holdingName",
    "holdingPercent"
})
public class Holding {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("holdingName")
    private String holdingName;
    @JsonProperty("holdingPercent")
    private HoldingPercent holdingPercent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("holdingName")
    public String getHoldingName() {
        return holdingName;
    }

    @JsonProperty("holdingName")
    public void setHoldingName(String holdingName) {
        this.holdingName = holdingName;
    }

    @JsonProperty("holdingPercent")
    public HoldingPercent getHoldingPercent() {
        return holdingPercent;
    }

    @JsonProperty("holdingPercent")
    public void setHoldingPercent(HoldingPercent holdingPercent) {
        this.holdingPercent = holdingPercent;
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
        sb.append(Holding.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("holdingName");
        sb.append('=');
        sb.append(((this.holdingName == null)?"<null>":this.holdingName));
        sb.append(',');
        sb.append("holdingPercent");
        sb.append('=');
        sb.append(((this.holdingPercent == null)?"<null>":this.holdingPercent));
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
        result = ((result* 31)+((this.holdingPercent == null)? 0 :this.holdingPercent.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.holdingName == null)? 0 :this.holdingName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Holding) == false) {
            return false;
        }
        Holding rhs = ((Holding) other);
        return (((((this.holdingPercent == rhs.holdingPercent)||((this.holdingPercent!= null)&&this.holdingPercent.equals(rhs.holdingPercent)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.holdingName == rhs.holdingName)||((this.holdingName!= null)&&this.holdingName.equals(rhs.holdingName))));
    }

}
