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
    "date",
    "actual",
    "estimate"
})
public class Quarterly {

    @JsonProperty("date")
    private String date;
    @JsonProperty("actual")
    private Actual actual;
    @JsonProperty("estimate")
    private Estimate estimate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("actual")
    public Actual getActual() {
        return actual;
    }

    @JsonProperty("actual")
    public void setActual(Actual actual) {
        this.actual = actual;
    }

    @JsonProperty("estimate")
    public Estimate getEstimate() {
        return estimate;
    }

    @JsonProperty("estimate")
    public void setEstimate(Estimate estimate) {
        this.estimate = estimate;
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
        sb.append(Quarterly.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null) ? "<null>" : this.date));
        sb.append(',');
        sb.append("actual");
        sb.append('=');
        sb.append(((this.actual == null) ? "<null>" : this.actual));
        sb.append(',');
        sb.append("estimate");
        sb.append('=');
        sb.append(((this.estimate == null) ? "<null>" : this.estimate));
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
        result = ((result * 31) + ((this.date == null) ? 0 : this.date.hashCode()));
        result = ((result * 31) + ((this.estimate == null) ? 0 : this.estimate.hashCode()));
        result = ((result * 31) + ((this.actual == null) ? 0 : this.actual.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Quarterly) == false) {
            return false;
        }
        Quarterly rhs = ((Quarterly) other);
        return (((((this.date == rhs.date) || ((this.date != null) && this.date.equals(rhs.date))) && ((this.estimate == rhs.estimate) || ((this.estimate != null) && this.estimate.equals(rhs.estimate)))) && ((this.actual == rhs.actual) || ((this.actual != null) && this.actual.equals(rhs.actual)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
