
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
    "maxAge",
    "period",
    "endDate",
    "growth",
    "earningsEstimate",
    "revenueEstimate",
    "epsTrend",
    "epsRevisions"
})
public class Trend__1 {

    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("period")
    private String period;
    @JsonProperty("endDate")
    private Object endDate;
    @JsonProperty("growth")
    private Growth__1 growth;
    @JsonProperty("earningsEstimate")
    private EarningsEstimate earningsEstimate;
    @JsonProperty("revenueEstimate")
    private RevenueEstimate revenueEstimate;
    @JsonProperty("epsTrend")
    private EpsTrend epsTrend;
    @JsonProperty("epsRevisions")
    private EpsRevisions epsRevisions;
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

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("endDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("growth")
    public Growth__1 getGrowth() {
        return growth;
    }

    @JsonProperty("growth")
    public void setGrowth(Growth__1 growth) {
        this.growth = growth;
    }

    @JsonProperty("earningsEstimate")
    public EarningsEstimate getEarningsEstimate() {
        return earningsEstimate;
    }

    @JsonProperty("earningsEstimate")
    public void setEarningsEstimate(EarningsEstimate earningsEstimate) {
        this.earningsEstimate = earningsEstimate;
    }

    @JsonProperty("revenueEstimate")
    public RevenueEstimate getRevenueEstimate() {
        return revenueEstimate;
    }

    @JsonProperty("revenueEstimate")
    public void setRevenueEstimate(RevenueEstimate revenueEstimate) {
        this.revenueEstimate = revenueEstimate;
    }

    @JsonProperty("epsTrend")
    public EpsTrend getEpsTrend() {
        return epsTrend;
    }

    @JsonProperty("epsTrend")
    public void setEpsTrend(EpsTrend epsTrend) {
        this.epsTrend = epsTrend;
    }

    @JsonProperty("epsRevisions")
    public EpsRevisions getEpsRevisions() {
        return epsRevisions;
    }

    @JsonProperty("epsRevisions")
    public void setEpsRevisions(EpsRevisions epsRevisions) {
        this.epsRevisions = epsRevisions;
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
        sb.append(Trend__1 .class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("growth");
        sb.append('=');
        sb.append(((this.growth == null)?"<null>":this.growth));
        sb.append(',');
        sb.append("earningsEstimate");
        sb.append('=');
        sb.append(((this.earningsEstimate == null)?"<null>":this.earningsEstimate));
        sb.append(',');
        sb.append("revenueEstimate");
        sb.append('=');
        sb.append(((this.revenueEstimate == null)?"<null>":this.revenueEstimate));
        sb.append(',');
        sb.append("epsTrend");
        sb.append('=');
        sb.append(((this.epsTrend == null)?"<null>":this.epsTrend));
        sb.append(',');
        sb.append("epsRevisions");
        sb.append('=');
        sb.append(((this.epsRevisions == null)?"<null>":this.epsRevisions));
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
        result = ((result* 31)+((this.revenueEstimate == null)? 0 :this.revenueEstimate.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.epsTrend == null)? 0 :this.epsTrend.hashCode()));
        result = ((result* 31)+((this.epsRevisions == null)? 0 :this.epsRevisions.hashCode()));
        result = ((result* 31)+((this.earningsEstimate == null)? 0 :this.earningsEstimate.hashCode()));
        result = ((result* 31)+((this.growth == null)? 0 :this.growth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trend__1) == false) {
            return false;
        }
        Trend__1 rhs = ((Trend__1) other);
        return ((((((((((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period)))&&((this.revenueEstimate == rhs.revenueEstimate)||((this.revenueEstimate!= null)&&this.revenueEstimate.equals(rhs.revenueEstimate))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.epsTrend == rhs.epsTrend)||((this.epsTrend!= null)&&this.epsTrend.equals(rhs.epsTrend))))&&((this.epsRevisions == rhs.epsRevisions)||((this.epsRevisions!= null)&&this.epsRevisions.equals(rhs.epsRevisions))))&&((this.earningsEstimate == rhs.earningsEstimate)||((this.earningsEstimate!= null)&&this.earningsEstimate.equals(rhs.earningsEstimate))))&&((this.growth == rhs.growth)||((this.growth!= null)&&this.growth.equals(rhs.growth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
