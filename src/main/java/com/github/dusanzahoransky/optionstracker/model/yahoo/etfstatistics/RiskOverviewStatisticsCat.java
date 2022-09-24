
package com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics;

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
    "riskStatisticsCat"
})
public class RiskOverviewStatisticsCat {

    @JsonProperty("riskStatisticsCat")
    private List<Object> riskStatisticsCat = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("riskStatisticsCat")
    public List<Object> getRiskStatisticsCat() {
        return riskStatisticsCat;
    }

    @JsonProperty("riskStatisticsCat")
    public void setRiskStatisticsCat(List<Object> riskStatisticsCat) {
        this.riskStatisticsCat = riskStatisticsCat;
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
        sb.append(RiskOverviewStatisticsCat.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("riskStatisticsCat");
        sb.append('=');
        sb.append(((this.riskStatisticsCat == null)?"<null>":this.riskStatisticsCat));
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
        result = ((result* 31)+((this.riskStatisticsCat == null)? 0 :this.riskStatisticsCat.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RiskOverviewStatisticsCat) == false) {
            return false;
        }
        RiskOverviewStatisticsCat rhs = ((RiskOverviewStatisticsCat) other);
        return (((this.riskStatisticsCat == rhs.riskStatisticsCat)||((this.riskStatisticsCat!= null)&&this.riskStatisticsCat.equals(rhs.riskStatisticsCat)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
