
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
    "trailingReturns",
    "performanceOverview",
    "riskOverviewStatistics",
    "riskOverviewStatisticsCat",
    "performanceOverviewCat",
    "trailingReturnsCat",
    "maxAge",
    "pastQuarterlyReturns",
    "trailingReturnsNav",
    "annualTotalReturns"
})
public class FundPerformance {

    @JsonProperty("trailingReturns")
    private TrailingReturns trailingReturns;
    @JsonProperty("performanceOverview")
    private PerformanceOverview performanceOverview;
    @JsonProperty("riskOverviewStatistics")
    private RiskOverviewStatistics riskOverviewStatistics;
    @JsonProperty("riskOverviewStatisticsCat")
    private RiskOverviewStatisticsCat riskOverviewStatisticsCat;
    @JsonProperty("performanceOverviewCat")
    private PerformanceOverviewCat performanceOverviewCat;
    @JsonProperty("trailingReturnsCat")
    private TrailingReturnsCat trailingReturnsCat;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("pastQuarterlyReturns")
    private PastQuarterlyReturns pastQuarterlyReturns;
    @JsonProperty("trailingReturnsNav")
    private TrailingReturnsNav trailingReturnsNav;
    @JsonProperty("annualTotalReturns")
    private AnnualTotalReturns annualTotalReturns;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("trailingReturns")
    public TrailingReturns getTrailingReturns() {
        return trailingReturns;
    }

    @JsonProperty("trailingReturns")
    public void setTrailingReturns(TrailingReturns trailingReturns) {
        this.trailingReturns = trailingReturns;
    }

    @JsonProperty("performanceOverview")
    public PerformanceOverview getPerformanceOverview() {
        return performanceOverview;
    }

    @JsonProperty("performanceOverview")
    public void setPerformanceOverview(PerformanceOverview performanceOverview) {
        this.performanceOverview = performanceOverview;
    }

    @JsonProperty("riskOverviewStatistics")
    public RiskOverviewStatistics getRiskOverviewStatistics() {
        return riskOverviewStatistics;
    }

    @JsonProperty("riskOverviewStatistics")
    public void setRiskOverviewStatistics(RiskOverviewStatistics riskOverviewStatistics) {
        this.riskOverviewStatistics = riskOverviewStatistics;
    }

    @JsonProperty("riskOverviewStatisticsCat")
    public RiskOverviewStatisticsCat getRiskOverviewStatisticsCat() {
        return riskOverviewStatisticsCat;
    }

    @JsonProperty("riskOverviewStatisticsCat")
    public void setRiskOverviewStatisticsCat(RiskOverviewStatisticsCat riskOverviewStatisticsCat) {
        this.riskOverviewStatisticsCat = riskOverviewStatisticsCat;
    }

    @JsonProperty("performanceOverviewCat")
    public PerformanceOverviewCat getPerformanceOverviewCat() {
        return performanceOverviewCat;
    }

    @JsonProperty("performanceOverviewCat")
    public void setPerformanceOverviewCat(PerformanceOverviewCat performanceOverviewCat) {
        this.performanceOverviewCat = performanceOverviewCat;
    }

    @JsonProperty("trailingReturnsCat")
    public TrailingReturnsCat getTrailingReturnsCat() {
        return trailingReturnsCat;
    }

    @JsonProperty("trailingReturnsCat")
    public void setTrailingReturnsCat(TrailingReturnsCat trailingReturnsCat) {
        this.trailingReturnsCat = trailingReturnsCat;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("pastQuarterlyReturns")
    public PastQuarterlyReturns getPastQuarterlyReturns() {
        return pastQuarterlyReturns;
    }

    @JsonProperty("pastQuarterlyReturns")
    public void setPastQuarterlyReturns(PastQuarterlyReturns pastQuarterlyReturns) {
        this.pastQuarterlyReturns = pastQuarterlyReturns;
    }

    @JsonProperty("trailingReturnsNav")
    public TrailingReturnsNav getTrailingReturnsNav() {
        return trailingReturnsNav;
    }

    @JsonProperty("trailingReturnsNav")
    public void setTrailingReturnsNav(TrailingReturnsNav trailingReturnsNav) {
        this.trailingReturnsNav = trailingReturnsNav;
    }

    @JsonProperty("annualTotalReturns")
    public AnnualTotalReturns getAnnualTotalReturns() {
        return annualTotalReturns;
    }

    @JsonProperty("annualTotalReturns")
    public void setAnnualTotalReturns(AnnualTotalReturns annualTotalReturns) {
        this.annualTotalReturns = annualTotalReturns;
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
        sb.append(FundPerformance.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trailingReturns");
        sb.append('=');
        sb.append(((this.trailingReturns == null)?"<null>":this.trailingReturns));
        sb.append(',');
        sb.append("performanceOverview");
        sb.append('=');
        sb.append(((this.performanceOverview == null)?"<null>":this.performanceOverview));
        sb.append(',');
        sb.append("riskOverviewStatistics");
        sb.append('=');
        sb.append(((this.riskOverviewStatistics == null)?"<null>":this.riskOverviewStatistics));
        sb.append(',');
        sb.append("riskOverviewStatisticsCat");
        sb.append('=');
        sb.append(((this.riskOverviewStatisticsCat == null)?"<null>":this.riskOverviewStatisticsCat));
        sb.append(',');
        sb.append("performanceOverviewCat");
        sb.append('=');
        sb.append(((this.performanceOverviewCat == null)?"<null>":this.performanceOverviewCat));
        sb.append(',');
        sb.append("trailingReturnsCat");
        sb.append('=');
        sb.append(((this.trailingReturnsCat == null)?"<null>":this.trailingReturnsCat));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("pastQuarterlyReturns");
        sb.append('=');
        sb.append(((this.pastQuarterlyReturns == null)?"<null>":this.pastQuarterlyReturns));
        sb.append(',');
        sb.append("trailingReturnsNav");
        sb.append('=');
        sb.append(((this.trailingReturnsNav == null)?"<null>":this.trailingReturnsNav));
        sb.append(',');
        sb.append("annualTotalReturns");
        sb.append('=');
        sb.append(((this.annualTotalReturns == null)?"<null>":this.annualTotalReturns));
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
        result = ((result* 31)+((this.performanceOverview == null)? 0 :this.performanceOverview.hashCode()));
        result = ((result* 31)+((this.trailingReturnsCat == null)? 0 :this.trailingReturnsCat.hashCode()));
        result = ((result* 31)+((this.trailingReturnsNav == null)? 0 :this.trailingReturnsNav.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.pastQuarterlyReturns == null)? 0 :this.pastQuarterlyReturns.hashCode()));
        result = ((result* 31)+((this.trailingReturns == null)? 0 :this.trailingReturns.hashCode()));
        result = ((result* 31)+((this.riskOverviewStatistics == null)? 0 :this.riskOverviewStatistics.hashCode()));
        result = ((result* 31)+((this.riskOverviewStatisticsCat == null)? 0 :this.riskOverviewStatisticsCat.hashCode()));
        result = ((result* 31)+((this.performanceOverviewCat == null)? 0 :this.performanceOverviewCat.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.annualTotalReturns == null)? 0 :this.annualTotalReturns.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundPerformance) == false) {
            return false;
        }
        FundPerformance rhs = ((FundPerformance) other);
        return ((((((((((((this.performanceOverview == rhs.performanceOverview)||((this.performanceOverview!= null)&&this.performanceOverview.equals(rhs.performanceOverview)))&&((this.trailingReturnsCat == rhs.trailingReturnsCat)||((this.trailingReturnsCat!= null)&&this.trailingReturnsCat.equals(rhs.trailingReturnsCat))))&&((this.trailingReturnsNav == rhs.trailingReturnsNav)||((this.trailingReturnsNav!= null)&&this.trailingReturnsNav.equals(rhs.trailingReturnsNav))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.pastQuarterlyReturns == rhs.pastQuarterlyReturns)||((this.pastQuarterlyReturns!= null)&&this.pastQuarterlyReturns.equals(rhs.pastQuarterlyReturns))))&&((this.trailingReturns == rhs.trailingReturns)||((this.trailingReturns!= null)&&this.trailingReturns.equals(rhs.trailingReturns))))&&((this.riskOverviewStatistics == rhs.riskOverviewStatistics)||((this.riskOverviewStatistics!= null)&&this.riskOverviewStatistics.equals(rhs.riskOverviewStatistics))))&&((this.riskOverviewStatisticsCat == rhs.riskOverviewStatisticsCat)||((this.riskOverviewStatisticsCat!= null)&&this.riskOverviewStatisticsCat.equals(rhs.riskOverviewStatisticsCat))))&&((this.performanceOverviewCat == rhs.performanceOverviewCat)||((this.performanceOverviewCat!= null)&&this.performanceOverviewCat.equals(rhs.performanceOverviewCat))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.annualTotalReturns == rhs.annualTotalReturns)||((this.annualTotalReturns!= null)&&this.annualTotalReturns.equals(rhs.annualTotalReturns))));
    }

}
