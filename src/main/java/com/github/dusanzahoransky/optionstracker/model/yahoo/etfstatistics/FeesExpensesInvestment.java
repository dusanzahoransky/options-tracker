
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
    "annualHoldingsTurnover",
    "frontEndSalesLoad",
    "annualReportExpenseRatio",
    "netExpRatio",
    "projectionValues",
    "grossExpRatio",
    "deferredSalesLoad",
    "totalNetAssets",
    "twelveBOne"
})
public class FeesExpensesInvestment {

    @JsonProperty("annualHoldingsTurnover")
    private AnnualHoldingsTurnover__1 annualHoldingsTurnover;
    @JsonProperty("frontEndSalesLoad")
    private FrontEndSalesLoad frontEndSalesLoad;
    @JsonProperty("annualReportExpenseRatio")
    private AnnualReportExpenseRatio__1 annualReportExpenseRatio;
    @JsonProperty("netExpRatio")
    private NetExpRatio netExpRatio;
    @JsonProperty("projectionValues")
    private ProjectionValues projectionValues;
    @JsonProperty("grossExpRatio")
    private GrossExpRatio grossExpRatio;
    @JsonProperty("deferredSalesLoad")
    private DeferredSalesLoad deferredSalesLoad;
    @JsonProperty("totalNetAssets")
    private TotalNetAssets totalNetAssets;
    @JsonProperty("twelveBOne")
    private TwelveBOne twelveBOne;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("annualHoldingsTurnover")
    public AnnualHoldingsTurnover__1 getAnnualHoldingsTurnover() {
        return annualHoldingsTurnover;
    }

    @JsonProperty("annualHoldingsTurnover")
    public void setAnnualHoldingsTurnover(AnnualHoldingsTurnover__1 annualHoldingsTurnover) {
        this.annualHoldingsTurnover = annualHoldingsTurnover;
    }

    @JsonProperty("frontEndSalesLoad")
    public FrontEndSalesLoad getFrontEndSalesLoad() {
        return frontEndSalesLoad;
    }

    @JsonProperty("frontEndSalesLoad")
    public void setFrontEndSalesLoad(FrontEndSalesLoad frontEndSalesLoad) {
        this.frontEndSalesLoad = frontEndSalesLoad;
    }

    @JsonProperty("annualReportExpenseRatio")
    public AnnualReportExpenseRatio__1 getAnnualReportExpenseRatio() {
        return annualReportExpenseRatio;
    }

    @JsonProperty("annualReportExpenseRatio")
    public void setAnnualReportExpenseRatio(AnnualReportExpenseRatio__1 annualReportExpenseRatio) {
        this.annualReportExpenseRatio = annualReportExpenseRatio;
    }

    @JsonProperty("netExpRatio")
    public NetExpRatio getNetExpRatio() {
        return netExpRatio;
    }

    @JsonProperty("netExpRatio")
    public void setNetExpRatio(NetExpRatio netExpRatio) {
        this.netExpRatio = netExpRatio;
    }

    @JsonProperty("projectionValues")
    public ProjectionValues getProjectionValues() {
        return projectionValues;
    }

    @JsonProperty("projectionValues")
    public void setProjectionValues(ProjectionValues projectionValues) {
        this.projectionValues = projectionValues;
    }

    @JsonProperty("grossExpRatio")
    public GrossExpRatio getGrossExpRatio() {
        return grossExpRatio;
    }

    @JsonProperty("grossExpRatio")
    public void setGrossExpRatio(GrossExpRatio grossExpRatio) {
        this.grossExpRatio = grossExpRatio;
    }

    @JsonProperty("deferredSalesLoad")
    public DeferredSalesLoad getDeferredSalesLoad() {
        return deferredSalesLoad;
    }

    @JsonProperty("deferredSalesLoad")
    public void setDeferredSalesLoad(DeferredSalesLoad deferredSalesLoad) {
        this.deferredSalesLoad = deferredSalesLoad;
    }

    @JsonProperty("totalNetAssets")
    public TotalNetAssets getTotalNetAssets() {
        return totalNetAssets;
    }

    @JsonProperty("totalNetAssets")
    public void setTotalNetAssets(TotalNetAssets totalNetAssets) {
        this.totalNetAssets = totalNetAssets;
    }

    @JsonProperty("twelveBOne")
    public TwelveBOne getTwelveBOne() {
        return twelveBOne;
    }

    @JsonProperty("twelveBOne")
    public void setTwelveBOne(TwelveBOne twelveBOne) {
        this.twelveBOne = twelveBOne;
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
        sb.append(FeesExpensesInvestment.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annualHoldingsTurnover");
        sb.append('=');
        sb.append(((this.annualHoldingsTurnover == null)?"<null>":this.annualHoldingsTurnover));
        sb.append(',');
        sb.append("frontEndSalesLoad");
        sb.append('=');
        sb.append(((this.frontEndSalesLoad == null)?"<null>":this.frontEndSalesLoad));
        sb.append(',');
        sb.append("annualReportExpenseRatio");
        sb.append('=');
        sb.append(((this.annualReportExpenseRatio == null)?"<null>":this.annualReportExpenseRatio));
        sb.append(',');
        sb.append("netExpRatio");
        sb.append('=');
        sb.append(((this.netExpRatio == null)?"<null>":this.netExpRatio));
        sb.append(',');
        sb.append("projectionValues");
        sb.append('=');
        sb.append(((this.projectionValues == null)?"<null>":this.projectionValues));
        sb.append(',');
        sb.append("grossExpRatio");
        sb.append('=');
        sb.append(((this.grossExpRatio == null)?"<null>":this.grossExpRatio));
        sb.append(',');
        sb.append("deferredSalesLoad");
        sb.append('=');
        sb.append(((this.deferredSalesLoad == null)?"<null>":this.deferredSalesLoad));
        sb.append(',');
        sb.append("totalNetAssets");
        sb.append('=');
        sb.append(((this.totalNetAssets == null)?"<null>":this.totalNetAssets));
        sb.append(',');
        sb.append("twelveBOne");
        sb.append('=');
        sb.append(((this.twelveBOne == null)?"<null>":this.twelveBOne));
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
        result = ((result* 31)+((this.twelveBOne == null)? 0 :this.twelveBOne.hashCode()));
        result = ((result* 31)+((this.netExpRatio == null)? 0 :this.netExpRatio.hashCode()));
        result = ((result* 31)+((this.totalNetAssets == null)? 0 :this.totalNetAssets.hashCode()));
        result = ((result* 31)+((this.grossExpRatio == null)? 0 :this.grossExpRatio.hashCode()));
        result = ((result* 31)+((this.annualReportExpenseRatio == null)? 0 :this.annualReportExpenseRatio.hashCode()));
        result = ((result* 31)+((this.annualHoldingsTurnover == null)? 0 :this.annualHoldingsTurnover.hashCode()));
        result = ((result* 31)+((this.deferredSalesLoad == null)? 0 :this.deferredSalesLoad.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.frontEndSalesLoad == null)? 0 :this.frontEndSalesLoad.hashCode()));
        result = ((result* 31)+((this.projectionValues == null)? 0 :this.projectionValues.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeesExpensesInvestment) == false) {
            return false;
        }
        FeesExpensesInvestment rhs = ((FeesExpensesInvestment) other);
        return (((((((((((this.twelveBOne == rhs.twelveBOne)||((this.twelveBOne!= null)&&this.twelveBOne.equals(rhs.twelveBOne)))&&((this.netExpRatio == rhs.netExpRatio)||((this.netExpRatio!= null)&&this.netExpRatio.equals(rhs.netExpRatio))))&&((this.totalNetAssets == rhs.totalNetAssets)||((this.totalNetAssets!= null)&&this.totalNetAssets.equals(rhs.totalNetAssets))))&&((this.grossExpRatio == rhs.grossExpRatio)||((this.grossExpRatio!= null)&&this.grossExpRatio.equals(rhs.grossExpRatio))))&&((this.annualReportExpenseRatio == rhs.annualReportExpenseRatio)||((this.annualReportExpenseRatio!= null)&&this.annualReportExpenseRatio.equals(rhs.annualReportExpenseRatio))))&&((this.annualHoldingsTurnover == rhs.annualHoldingsTurnover)||((this.annualHoldingsTurnover!= null)&&this.annualHoldingsTurnover.equals(rhs.annualHoldingsTurnover))))&&((this.deferredSalesLoad == rhs.deferredSalesLoad)||((this.deferredSalesLoad!= null)&&this.deferredSalesLoad.equals(rhs.deferredSalesLoad))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.frontEndSalesLoad == rhs.frontEndSalesLoad)||((this.frontEndSalesLoad!= null)&&this.frontEndSalesLoad.equals(rhs.frontEndSalesLoad))))&&((this.projectionValues == rhs.projectionValues)||((this.projectionValues!= null)&&this.projectionValues.equals(rhs.projectionValues))));
    }

}
