
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
    "year",
    "annualValue"
})
public class Return {

    @JsonProperty("year")
    private String year;
    @JsonProperty("annualValue")
    private AnnualValue annualValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("annualValue")
    public AnnualValue getAnnualValue() {
        return annualValue;
    }

    @JsonProperty("annualValue")
    public void setAnnualValue(AnnualValue annualValue) {
        this.annualValue = annualValue;
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
        sb.append(Return.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("annualValue");
        sb.append('=');
        sb.append(((this.annualValue == null)?"<null>":this.annualValue));
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
        result = ((result* 31)+((this.annualValue == null)? 0 :this.annualValue.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Return) == false) {
            return false;
        }
        Return rhs = ((Return) other);
        return ((((this.annualValue == rhs.annualValue)||((this.annualValue!= null)&&this.annualValue.equals(rhs.annualValue)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))));
    }

}
