
package com.github.dusanzahoransky.optionstracker.model.yahoo.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxAge",
    "symbol",
    "peRatio",
    "pegRatio",
    "estimates"
})
public class IndexTrend {

    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("peRatio")
    private PeRatio peRatio;
    @JsonProperty("pegRatio")
    private PegRatio pegRatio;
    @JsonProperty("estimates")
    private List<Estimate> estimates = new ArrayList<Estimate>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("peRatio")
    public PeRatio getPeRatio() {
        return peRatio;
    }

    @JsonProperty("peRatio")
    public void setPeRatio(PeRatio peRatio) {
        this.peRatio = peRatio;
    }

    @JsonProperty("pegRatio")
    public PegRatio getPegRatio() {
        return pegRatio;
    }

    @JsonProperty("pegRatio")
    public void setPegRatio(PegRatio pegRatio) {
        this.pegRatio = pegRatio;
    }

    @JsonProperty("estimates")
    public List<Estimate> getEstimates() {
        return estimates;
    }

    @JsonProperty("estimates")
    public void setEstimates(List<Estimate> estimates) {
        this.estimates = estimates;
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
        sb.append(IndexTrend.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("peRatio");
        sb.append('=');
        sb.append(((this.peRatio == null)?"<null>":this.peRatio));
        sb.append(',');
        sb.append("pegRatio");
        sb.append('=');
        sb.append(((this.pegRatio == null)?"<null>":this.pegRatio));
        sb.append(',');
        sb.append("estimates");
        sb.append('=');
        sb.append(((this.estimates == null)?"<null>":this.estimates));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.peRatio == null)? 0 :this.peRatio.hashCode()));
        result = ((result* 31)+((this.pegRatio == null)? 0 :this.pegRatio.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.estimates == null)? 0 :this.estimates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndexTrend) == false) {
            return false;
        }
        IndexTrend rhs = ((IndexTrend) other);
        return (((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.peRatio == rhs.peRatio)||((this.peRatio!= null)&&this.peRatio.equals(rhs.peRatio))))&&((this.pegRatio == rhs.pegRatio)||((this.pegRatio!= null)&&this.pegRatio.equals(rhs.pegRatio))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.estimates == rhs.estimates)||((this.estimates!= null)&&this.estimates.equals(rhs.estimates))));
    }

}
