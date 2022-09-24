package com.github.dusanzahoransky.optionstracker.model.yahoo.statistics;

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
    "earningsDate",
    "earningsAverage",
    "earningsLow",
    "earningsHigh",
    "revenueAverage",
    "revenueLow",
    "revenueHigh"
})
public class Earnings {

    @JsonProperty("earningsDate")
    private List<EarningsDate> earningsDate = new ArrayList<EarningsDate>();
    @JsonProperty("earningsAverage")
    private EarningsAverage earningsAverage;
    @JsonProperty("earningsLow")
    private EarningsLow earningsLow;
    @JsonProperty("earningsHigh")
    private EarningsHigh earningsHigh;
    @JsonProperty("revenueAverage")
    private RevenueAverage revenueAverage;
    @JsonProperty("revenueLow")
    private RevenueLow revenueLow;
    @JsonProperty("revenueHigh")
    private RevenueHigh revenueHigh;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("earningsDate")
    public List<EarningsDate> getEarningsDate() {
        return earningsDate;
    }

    @JsonProperty("earningsDate")
    public void setEarningsDate(List<EarningsDate> earningsDate) {
        this.earningsDate = earningsDate;
    }

    @JsonProperty("earningsAverage")
    public EarningsAverage getEarningsAverage() {
        return earningsAverage;
    }

    @JsonProperty("earningsAverage")
    public void setEarningsAverage(EarningsAverage earningsAverage) {
        this.earningsAverage = earningsAverage;
    }

    @JsonProperty("earningsLow")
    public EarningsLow getEarningsLow() {
        return earningsLow;
    }

    @JsonProperty("earningsLow")
    public void setEarningsLow(EarningsLow earningsLow) {
        this.earningsLow = earningsLow;
    }

    @JsonProperty("earningsHigh")
    public EarningsHigh getEarningsHigh() {
        return earningsHigh;
    }

    @JsonProperty("earningsHigh")
    public void setEarningsHigh(EarningsHigh earningsHigh) {
        this.earningsHigh = earningsHigh;
    }

    @JsonProperty("revenueAverage")
    public RevenueAverage getRevenueAverage() {
        return revenueAverage;
    }

    @JsonProperty("revenueAverage")
    public void setRevenueAverage(RevenueAverage revenueAverage) {
        this.revenueAverage = revenueAverage;
    }

    @JsonProperty("revenueLow")
    public RevenueLow getRevenueLow() {
        return revenueLow;
    }

    @JsonProperty("revenueLow")
    public void setRevenueLow(RevenueLow revenueLow) {
        this.revenueLow = revenueLow;
    }

    @JsonProperty("revenueHigh")
    public RevenueHigh getRevenueHigh() {
        return revenueHigh;
    }

    @JsonProperty("revenueHigh")
    public void setRevenueHigh(RevenueHigh revenueHigh) {
        this.revenueHigh = revenueHigh;
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
        sb.append(Earnings.class.getName()).append('@').append(Double.toHexString(System.identityHashCode(this))).append('[');
        sb.append("earningsDate");
        sb.append('=');
        sb.append(((this.earningsDate == null) ? "<null>" : this.earningsDate));
        sb.append(',');
        sb.append("earningsAverage");
        sb.append('=');
        sb.append(((this.earningsAverage == null) ? "<null>" : this.earningsAverage));
        sb.append(',');
        sb.append("earningsLow");
        sb.append('=');
        sb.append(((this.earningsLow == null) ? "<null>" : this.earningsLow));
        sb.append(',');
        sb.append("earningsHigh");
        sb.append('=');
        sb.append(((this.earningsHigh == null) ? "<null>" : this.earningsHigh));
        sb.append(',');
        sb.append("revenueAverage");
        sb.append('=');
        sb.append(((this.revenueAverage == null) ? "<null>" : this.revenueAverage));
        sb.append(',');
        sb.append("revenueLow");
        sb.append('=');
        sb.append(((this.revenueLow == null) ? "<null>" : this.revenueLow));
        sb.append(',');
        sb.append("revenueHigh");
        sb.append('=');
        sb.append(((this.revenueHigh == null) ? "<null>" : this.revenueHigh));
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
        result = ((result * 31) + ((this.revenueLow == null) ? 0 : this.revenueLow.hashCode()));
        result = ((result * 31) + ((this.revenueAverage == null) ? 0 : this.revenueAverage.hashCode()));
        result = ((result * 31) + ((this.earningsLow == null) ? 0 : this.earningsLow.hashCode()));
        result = ((result * 31) + ((this.earningsHigh == null) ? 0 : this.earningsHigh.hashCode()));
        result = ((result * 31) + ((this.revenueHigh == null) ? 0 : this.revenueHigh.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.earningsDate == null) ? 0 : this.earningsDate.hashCode()));
        result = ((result * 31) + ((this.earningsAverage == null) ? 0 : this.earningsAverage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Earnings) == false) {
            return false;
        }
        Earnings rhs = ((Earnings) other);
        return (((((((((this.revenueLow == rhs.revenueLow) || ((this.revenueLow != null) && this.revenueLow.equals(rhs.revenueLow))) && ((this.revenueAverage == rhs.revenueAverage) || ((this.revenueAverage != null) && this.revenueAverage.equals(rhs.revenueAverage)))) && ((this.earningsLow == rhs.earningsLow) || ((this.earningsLow != null) && this.earningsLow.equals(rhs.earningsLow)))) && ((this.earningsHigh == rhs.earningsHigh) || ((this.earningsHigh != null) && this.earningsHigh.equals(rhs.earningsHigh)))) && ((this.revenueHigh == rhs.revenueHigh) || ((this.revenueHigh != null) && this.revenueHigh.equals(rhs.revenueHigh)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.earningsDate == rhs.earningsDate) || ((this.earningsDate != null) && this.earningsDate.equals(rhs.earningsDate)))) && ((this.earningsAverage == rhs.earningsAverage) || ((this.earningsAverage != null) && this.earningsAverage.equals(rhs.earningsAverage))));
    }

}
