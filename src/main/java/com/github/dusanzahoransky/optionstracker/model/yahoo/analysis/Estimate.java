
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
    "growth"
})
public class Estimate {

    @JsonProperty("period")
    private String period;
    @JsonProperty("growth")
    private Growth growth;
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

    @JsonProperty("growth")
    public Growth getGrowth() {
        return growth;
    }

    @JsonProperty("growth")
    public void setGrowth(Growth growth) {
        this.growth = growth;
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
        sb.append(Estimate.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("growth");
        sb.append('=');
        sb.append(((this.growth == null)?"<null>":this.growth));
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
        result = ((result* 31)+((this.growth == null)? 0 :this.growth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Estimate) == false) {
            return false;
        }
        Estimate rhs = ((Estimate) other);
        return ((((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period)))&&((this.growth == rhs.growth)||((this.growth!= null)&&this.growth.equals(rhs.growth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
