
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
    "shortTermTrend",
    "midTermTrend",
    "longTermTrend",
    "maxAge"
})
public class PageViews {

    @JsonProperty("shortTermTrend")
    private String shortTermTrend;
    @JsonProperty("midTermTrend")
    private String midTermTrend;
    @JsonProperty("longTermTrend")
    private String longTermTrend;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shortTermTrend")
    public String getShortTermTrend() {
        return shortTermTrend;
    }

    @JsonProperty("shortTermTrend")
    public void setShortTermTrend(String shortTermTrend) {
        this.shortTermTrend = shortTermTrend;
    }

    @JsonProperty("midTermTrend")
    public String getMidTermTrend() {
        return midTermTrend;
    }

    @JsonProperty("midTermTrend")
    public void setMidTermTrend(String midTermTrend) {
        this.midTermTrend = midTermTrend;
    }

    @JsonProperty("longTermTrend")
    public String getLongTermTrend() {
        return longTermTrend;
    }

    @JsonProperty("longTermTrend")
    public void setLongTermTrend(String longTermTrend) {
        this.longTermTrend = longTermTrend;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
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
        sb.append(PageViews.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shortTermTrend");
        sb.append('=');
        sb.append(((this.shortTermTrend == null)?"<null>":this.shortTermTrend));
        sb.append(',');
        sb.append("midTermTrend");
        sb.append('=');
        sb.append(((this.midTermTrend == null)?"<null>":this.midTermTrend));
        sb.append(',');
        sb.append("longTermTrend");
        sb.append('=');
        sb.append(((this.longTermTrend == null)?"<null>":this.longTermTrend));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
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
        result = ((result* 31)+((this.longTermTrend == null)? 0 :this.longTermTrend.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shortTermTrend == null)? 0 :this.shortTermTrend.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.midTermTrend == null)? 0 :this.midTermTrend.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PageViews) == false) {
            return false;
        }
        PageViews rhs = ((PageViews) other);
        return ((((((this.longTermTrend == rhs.longTermTrend)||((this.longTermTrend!= null)&&this.longTermTrend.equals(rhs.longTermTrend)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shortTermTrend == rhs.shortTermTrend)||((this.shortTermTrend!= null)&&this.shortTermTrend.equals(rhs.shortTermTrend))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.midTermTrend == rhs.midTermTrend)||((this.midTermTrend!= null)&&this.midTermTrend.equals(rhs.midTermTrend))));
    }

}
