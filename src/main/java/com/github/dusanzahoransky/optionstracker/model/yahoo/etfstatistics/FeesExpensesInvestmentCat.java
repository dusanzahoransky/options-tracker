
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
    "annualReportExpenseRatio",
    "frontEndSalesLoad",
    "deferredSalesLoad",
    "twelveBOne",
    "annualHoldingsTurnover",
    "totalNetAssets",
    "projectionValuesCat"
})
public class FeesExpensesInvestmentCat {

    @JsonProperty("annualReportExpenseRatio")
    private AnnualReportExpenseRatio__2 annualReportExpenseRatio;
    @JsonProperty("frontEndSalesLoad")
    private FrontEndSalesLoad__1 frontEndSalesLoad;
    @JsonProperty("deferredSalesLoad")
    private DeferredSalesLoad__1 deferredSalesLoad;
    @JsonProperty("twelveBOne")
    private TwelveBOne__1 twelveBOne;
    @JsonProperty("annualHoldingsTurnover")
    private AnnualHoldingsTurnover__2 annualHoldingsTurnover;
    @JsonProperty("totalNetAssets")
    private TotalNetAssets__1 totalNetAssets;
    @JsonProperty("projectionValuesCat")
    private ProjectionValuesCat projectionValuesCat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("annualReportExpenseRatio")
    public AnnualReportExpenseRatio__2 getAnnualReportExpenseRatio() {
        return annualReportExpenseRatio;
    }

    @JsonProperty("annualReportExpenseRatio")
    public void setAnnualReportExpenseRatio(AnnualReportExpenseRatio__2 annualReportExpenseRatio) {
        this.annualReportExpenseRatio = annualReportExpenseRatio;
    }

    @JsonProperty("frontEndSalesLoad")
    public FrontEndSalesLoad__1 getFrontEndSalesLoad() {
        return frontEndSalesLoad;
    }

    @JsonProperty("frontEndSalesLoad")
    public void setFrontEndSalesLoad(FrontEndSalesLoad__1 frontEndSalesLoad) {
        this.frontEndSalesLoad = frontEndSalesLoad;
    }

    @JsonProperty("deferredSalesLoad")
    public DeferredSalesLoad__1 getDeferredSalesLoad() {
        return deferredSalesLoad;
    }

    @JsonProperty("deferredSalesLoad")
    public void setDeferredSalesLoad(DeferredSalesLoad__1 deferredSalesLoad) {
        this.deferredSalesLoad = deferredSalesLoad;
    }

    @JsonProperty("twelveBOne")
    public TwelveBOne__1 getTwelveBOne() {
        return twelveBOne;
    }

    @JsonProperty("twelveBOne")
    public void setTwelveBOne(TwelveBOne__1 twelveBOne) {
        this.twelveBOne = twelveBOne;
    }

    @JsonProperty("annualHoldingsTurnover")
    public AnnualHoldingsTurnover__2 getAnnualHoldingsTurnover() {
        return annualHoldingsTurnover;
    }

    @JsonProperty("annualHoldingsTurnover")
    public void setAnnualHoldingsTurnover(AnnualHoldingsTurnover__2 annualHoldingsTurnover) {
        this.annualHoldingsTurnover = annualHoldingsTurnover;
    }

    @JsonProperty("totalNetAssets")
    public TotalNetAssets__1 getTotalNetAssets() {
        return totalNetAssets;
    }

    @JsonProperty("totalNetAssets")
    public void setTotalNetAssets(TotalNetAssets__1 totalNetAssets) {
        this.totalNetAssets = totalNetAssets;
    }

    @JsonProperty("projectionValuesCat")
    public ProjectionValuesCat getProjectionValuesCat() {
        return projectionValuesCat;
    }

    @JsonProperty("projectionValuesCat")
    public void setProjectionValuesCat(ProjectionValuesCat projectionValuesCat) {
        this.projectionValuesCat = projectionValuesCat;
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
        sb.append(FeesExpensesInvestmentCat.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annualReportExpenseRatio");
        sb.append('=');
        sb.append(((this.annualReportExpenseRatio == null)?"<null>":this.annualReportExpenseRatio));
        sb.append(',');
        sb.append("frontEndSalesLoad");
        sb.append('=');
        sb.append(((this.frontEndSalesLoad == null)?"<null>":this.frontEndSalesLoad));
        sb.append(',');
        sb.append("deferredSalesLoad");
        sb.append('=');
        sb.append(((this.deferredSalesLoad == null)?"<null>":this.deferredSalesLoad));
        sb.append(',');
        sb.append("twelveBOne");
        sb.append('=');
        sb.append(((this.twelveBOne == null)?"<null>":this.twelveBOne));
        sb.append(',');
        sb.append("annualHoldingsTurnover");
        sb.append('=');
        sb.append(((this.annualHoldingsTurnover == null)?"<null>":this.annualHoldingsTurnover));
        sb.append(',');
        sb.append("totalNetAssets");
        sb.append('=');
        sb.append(((this.totalNetAssets == null)?"<null>":this.totalNetAssets));
        sb.append(',');
        sb.append("projectionValuesCat");
        sb.append('=');
        sb.append(((this.projectionValuesCat == null)?"<null>":this.projectionValuesCat));
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
        result = ((result* 31)+((this.projectionValuesCat == null)? 0 :this.projectionValuesCat.hashCode()));
        result = ((result* 31)+((this.twelveBOne == null)? 0 :this.twelveBOne.hashCode()));
        result = ((result* 31)+((this.totalNetAssets == null)? 0 :this.totalNetAssets.hashCode()));
        result = ((result* 31)+((this.annualReportExpenseRatio == null)? 0 :this.annualReportExpenseRatio.hashCode()));
        result = ((result* 31)+((this.annualHoldingsTurnover == null)? 0 :this.annualHoldingsTurnover.hashCode()));
        result = ((result* 31)+((this.deferredSalesLoad == null)? 0 :this.deferredSalesLoad.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.frontEndSalesLoad == null)? 0 :this.frontEndSalesLoad.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeesExpensesInvestmentCat) == false) {
            return false;
        }
        FeesExpensesInvestmentCat rhs = ((FeesExpensesInvestmentCat) other);
        return (((((((((this.projectionValuesCat == rhs.projectionValuesCat)||((this.projectionValuesCat!= null)&&this.projectionValuesCat.equals(rhs.projectionValuesCat)))&&((this.twelveBOne == rhs.twelveBOne)||((this.twelveBOne!= null)&&this.twelveBOne.equals(rhs.twelveBOne))))&&((this.totalNetAssets == rhs.totalNetAssets)||((this.totalNetAssets!= null)&&this.totalNetAssets.equals(rhs.totalNetAssets))))&&((this.annualReportExpenseRatio == rhs.annualReportExpenseRatio)||((this.annualReportExpenseRatio!= null)&&this.annualReportExpenseRatio.equals(rhs.annualReportExpenseRatio))))&&((this.annualHoldingsTurnover == rhs.annualHoldingsTurnover)||((this.annualHoldingsTurnover!= null)&&this.annualHoldingsTurnover.equals(rhs.annualHoldingsTurnover))))&&((this.deferredSalesLoad == rhs.deferredSalesLoad)||((this.deferredSalesLoad!= null)&&this.deferredSalesLoad.equals(rhs.deferredSalesLoad))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.frontEndSalesLoad == rhs.frontEndSalesLoad)||((this.frontEndSalesLoad!= null)&&this.frontEndSalesLoad.equals(rhs.frontEndSalesLoad))));
    }

}
