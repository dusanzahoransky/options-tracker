package com.github.dusanzahoransky.optionstracker.model.yahoo.balancesheet;

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
    "yearly",
    "quarterly"
})
public class FinancialsChart {

    @JsonProperty("yearly")
    private List<Yearly> yearly = new ArrayList<Yearly>();
    @JsonProperty("quarterly")
    private List<Quarterly> quarterly = new ArrayList<Quarterly>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("yearly")
    public List<Yearly> getYearly() {
        return yearly;
    }

    @JsonProperty("yearly")
    public void setYearly(List<Yearly> yearly) {
        this.yearly = yearly;
    }

    @JsonProperty("quarterly")
    public List<Quarterly> getQuarterly() {
        return quarterly;
    }

    @JsonProperty("quarterly")
    public void setQuarterly(List<Quarterly> quarterly) {
        this.quarterly = quarterly;
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
        sb.append(FinancialsChart.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("yearly");
        sb.append('=');
        sb.append(((this.yearly == null) ? "<null>" : this.yearly));
        sb.append(',');
        sb.append("quarterly");
        sb.append('=');
        sb.append(((this.quarterly == null) ? "<null>" : this.quarterly));
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
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.quarterly == null) ? 0 : this.quarterly.hashCode()));
        result = ((result * 31) + ((this.yearly == null) ? 0 : this.yearly.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialsChart) == false) {
            return false;
        }
        FinancialsChart rhs = ((FinancialsChart) other);
        return ((((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))) && ((this.quarterly == rhs.quarterly) || ((this.quarterly != null) && this.quarterly.equals(rhs.quarterly)))) && ((this.yearly == rhs.yearly) || ((this.yearly != null) && this.yearly.equals(rhs.yearly))));
    }

}
