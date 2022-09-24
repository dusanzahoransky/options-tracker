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
    "quarterly",
    "currentQuarterEstimate",
    "currentQuarterEstimateDate",
    "currentQuarterEstimateYear",
    "earningsDate"
})
public class EarningsChart {

    @JsonProperty("quarterly")
    private List<Quarterly> quarterly = new ArrayList<Quarterly>();
    @JsonProperty("currentQuarterEstimate")
    private CurrentQuarterEstimate currentQuarterEstimate;
    @JsonProperty("currentQuarterEstimateDate")
    private String currentQuarterEstimateDate;
    @JsonProperty("currentQuarterEstimateYear")
    private Long currentQuarterEstimateYear;
    @JsonProperty("earningsDate")
    private List<EarningsDate> earningsDate = new ArrayList<EarningsDate>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quarterly")
    public List<Quarterly> getQuarterly() {
        return quarterly;
    }

    @JsonProperty("quarterly")
    public void setQuarterly(List<Quarterly> quarterly) {
        this.quarterly = quarterly;
    }

    @JsonProperty("currentQuarterEstimate")
    public CurrentQuarterEstimate getCurrentQuarterEstimate() {
        return currentQuarterEstimate;
    }

    @JsonProperty("currentQuarterEstimate")
    public void setCurrentQuarterEstimate(CurrentQuarterEstimate currentQuarterEstimate) {
        this.currentQuarterEstimate = currentQuarterEstimate;
    }

    @JsonProperty("currentQuarterEstimateDate")
    public String getCurrentQuarterEstimateDate() {
        return currentQuarterEstimateDate;
    }

    @JsonProperty("currentQuarterEstimateDate")
    public void setCurrentQuarterEstimateDate(String currentQuarterEstimateDate) {
        this.currentQuarterEstimateDate = currentQuarterEstimateDate;
    }

    @JsonProperty("currentQuarterEstimateYear")
    public Long getCurrentQuarterEstimateYear() {
        return currentQuarterEstimateYear;
    }

    @JsonProperty("currentQuarterEstimateYear")
    public void setCurrentQuarterEstimateYear(Long currentQuarterEstimateYear) {
        this.currentQuarterEstimateYear = currentQuarterEstimateYear;
    }

    @JsonProperty("earningsDate")
    public List<EarningsDate> getEarningsDate() {
        return earningsDate;
    }

    @JsonProperty("earningsDate")
    public void setEarningsDate(List<EarningsDate> earningsDate) {
        this.earningsDate = earningsDate;
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
        sb.append(EarningsChart.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quarterly");
        sb.append('=');
        sb.append(((this.quarterly == null) ? "<null>" : this.quarterly));
        sb.append(',');
        sb.append("currentQuarterEstimate");
        sb.append('=');
        sb.append(((this.currentQuarterEstimate == null) ? "<null>" : this.currentQuarterEstimate));
        sb.append(',');
        sb.append("currentQuarterEstimateDate");
        sb.append('=');
        sb.append(((this.currentQuarterEstimateDate == null) ? "<null>" : this.currentQuarterEstimateDate));
        sb.append(',');
        sb.append("currentQuarterEstimateYear");
        sb.append('=');
        sb.append(((this.currentQuarterEstimateYear == null) ? "<null>" : this.currentQuarterEstimateYear));
        sb.append(',');
        sb.append("earningsDate");
        sb.append('=');
        sb.append(((this.earningsDate == null) ? "<null>" : this.earningsDate));
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
        result = ((result * 31) + ((this.currentQuarterEstimateDate == null) ? 0 : this.currentQuarterEstimateDate.hashCode()));
        result = ((result * 31) + ((this.currentQuarterEstimate == null) ? 0 : this.currentQuarterEstimate.hashCode()));
        result = ((result * 31) + ((this.currentQuarterEstimateYear == null) ? 0 : this.currentQuarterEstimateYear.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.quarterly == null) ? 0 : this.quarterly.hashCode()));
        result = ((result * 31) + ((this.earningsDate == null) ? 0 : this.earningsDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EarningsChart) == false) {
            return false;
        }
        EarningsChart rhs = ((EarningsChart) other);
        return (((((((this.currentQuarterEstimateDate == rhs.currentQuarterEstimateDate) || ((this.currentQuarterEstimateDate != null) && this.currentQuarterEstimateDate.equals(rhs.currentQuarterEstimateDate))) && ((this.currentQuarterEstimate == rhs.currentQuarterEstimate) || ((this.currentQuarterEstimate != null) && this.currentQuarterEstimate.equals(rhs.currentQuarterEstimate)))) && ((this.currentQuarterEstimateYear == rhs.currentQuarterEstimateYear) || ((this.currentQuarterEstimateYear != null) && this.currentQuarterEstimateYear.equals(rhs.currentQuarterEstimateYear)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.quarterly == rhs.quarterly) || ((this.quarterly != null) && this.quarterly.equals(rhs.quarterly)))) && ((this.earningsDate == rhs.earningsDate) || ((this.earningsDate != null) && this.earningsDate.equals(rhs.earningsDate))));
    }

}
