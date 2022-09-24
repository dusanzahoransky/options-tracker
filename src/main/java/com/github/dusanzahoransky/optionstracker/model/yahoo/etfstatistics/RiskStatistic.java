
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
    "alpha",
    "beta",
    "meanAnnualReturn",
    "rSquared",
    "stdDev",
    "sharpeRatio",
    "treynorRatio"
})
public class RiskStatistic {

    @JsonProperty("year")
    private String year;
    @JsonProperty("alpha")
    private Alpha alpha;
    @JsonProperty("beta")
    private Beta beta;
    @JsonProperty("meanAnnualReturn")
    private MeanAnnualReturn meanAnnualReturn;
    @JsonProperty("rSquared")
    private RSquared rSquared;
    @JsonProperty("stdDev")
    private StdDev stdDev;
    @JsonProperty("sharpeRatio")
    private SharpeRatio sharpeRatio;
    @JsonProperty("treynorRatio")
    private TreynorRatio treynorRatio;
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

    @JsonProperty("alpha")
    public Alpha getAlpha() {
        return alpha;
    }

    @JsonProperty("alpha")
    public void setAlpha(Alpha alpha) {
        this.alpha = alpha;
    }

    @JsonProperty("beta")
    public Beta getBeta() {
        return beta;
    }

    @JsonProperty("beta")
    public void setBeta(Beta beta) {
        this.beta = beta;
    }

    @JsonProperty("meanAnnualReturn")
    public MeanAnnualReturn getMeanAnnualReturn() {
        return meanAnnualReturn;
    }

    @JsonProperty("meanAnnualReturn")
    public void setMeanAnnualReturn(MeanAnnualReturn meanAnnualReturn) {
        this.meanAnnualReturn = meanAnnualReturn;
    }

    @JsonProperty("rSquared")
    public RSquared getrSquared() {
        return rSquared;
    }

    @JsonProperty("rSquared")
    public void setrSquared(RSquared rSquared) {
        this.rSquared = rSquared;
    }

    @JsonProperty("stdDev")
    public StdDev getStdDev() {
        return stdDev;
    }

    @JsonProperty("stdDev")
    public void setStdDev(StdDev stdDev) {
        this.stdDev = stdDev;
    }

    @JsonProperty("sharpeRatio")
    public SharpeRatio getSharpeRatio() {
        return sharpeRatio;
    }

    @JsonProperty("sharpeRatio")
    public void setSharpeRatio(SharpeRatio sharpeRatio) {
        this.sharpeRatio = sharpeRatio;
    }

    @JsonProperty("treynorRatio")
    public TreynorRatio getTreynorRatio() {
        return treynorRatio;
    }

    @JsonProperty("treynorRatio")
    public void setTreynorRatio(TreynorRatio treynorRatio) {
        this.treynorRatio = treynorRatio;
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
        sb.append(RiskStatistic.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("alpha");
        sb.append('=');
        sb.append(((this.alpha == null)?"<null>":this.alpha));
        sb.append(',');
        sb.append("beta");
        sb.append('=');
        sb.append(((this.beta == null)?"<null>":this.beta));
        sb.append(',');
        sb.append("meanAnnualReturn");
        sb.append('=');
        sb.append(((this.meanAnnualReturn == null)?"<null>":this.meanAnnualReturn));
        sb.append(',');
        sb.append("rSquared");
        sb.append('=');
        sb.append(((this.rSquared == null)?"<null>":this.rSquared));
        sb.append(',');
        sb.append("stdDev");
        sb.append('=');
        sb.append(((this.stdDev == null)?"<null>":this.stdDev));
        sb.append(',');
        sb.append("sharpeRatio");
        sb.append('=');
        sb.append(((this.sharpeRatio == null)?"<null>":this.sharpeRatio));
        sb.append(',');
        sb.append("treynorRatio");
        sb.append('=');
        sb.append(((this.treynorRatio == null)?"<null>":this.treynorRatio));
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
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.alpha == null)? 0 :this.alpha.hashCode()));
        result = ((result* 31)+((this.rSquared == null)? 0 :this.rSquared.hashCode()));
        result = ((result* 31)+((this.meanAnnualReturn == null)? 0 :this.meanAnnualReturn.hashCode()));
        result = ((result* 31)+((this.sharpeRatio == null)? 0 :this.sharpeRatio.hashCode()));
        result = ((result* 31)+((this.treynorRatio == null)? 0 :this.treynorRatio.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stdDev == null)? 0 :this.stdDev.hashCode()));
        result = ((result* 31)+((this.beta == null)? 0 :this.beta.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RiskStatistic) == false) {
            return false;
        }
        RiskStatistic rhs = ((RiskStatistic) other);
        return ((((((((((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year)))&&((this.alpha == rhs.alpha)||((this.alpha!= null)&&this.alpha.equals(rhs.alpha))))&&((this.rSquared == rhs.rSquared)||((this.rSquared!= null)&&this.rSquared.equals(rhs.rSquared))))&&((this.meanAnnualReturn == rhs.meanAnnualReturn)||((this.meanAnnualReturn!= null)&&this.meanAnnualReturn.equals(rhs.meanAnnualReturn))))&&((this.sharpeRatio == rhs.sharpeRatio)||((this.sharpeRatio!= null)&&this.sharpeRatio.equals(rhs.sharpeRatio))))&&((this.treynorRatio == rhs.treynorRatio)||((this.treynorRatio!= null)&&this.treynorRatio.equals(rhs.treynorRatio))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stdDev == rhs.stdDev)||((this.stdDev!= null)&&this.stdDev.equals(rhs.stdDev))))&&((this.beta == rhs.beta)||((this.beta!= null)&&this.beta.equals(rhs.beta))));
    }

}
