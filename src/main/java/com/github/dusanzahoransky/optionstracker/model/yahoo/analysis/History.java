
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
    "epsActual",
    "epsEstimate",
    "epsDifference",
    "surprisePercent",
    "quarter",
    "period"
})
public class History {

    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("epsActual")
    private EpsActual epsActual;
    @JsonProperty("epsEstimate")
    private EpsEstimate epsEstimate;
    @JsonProperty("epsDifference")
    private EpsDifference epsDifference;
    @JsonProperty("surprisePercent")
    private SurprisePercent surprisePercent;
    @JsonProperty("quarter")
    private Quarter quarter;
    @JsonProperty("period")
    private String period;
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

    @JsonProperty("epsActual")
    public EpsActual getEpsActual() {
        return epsActual;
    }

    @JsonProperty("epsActual")
    public void setEpsActual(EpsActual epsActual) {
        this.epsActual = epsActual;
    }

    @JsonProperty("epsEstimate")
    public EpsEstimate getEpsEstimate() {
        return epsEstimate;
    }

    @JsonProperty("epsEstimate")
    public void setEpsEstimate(EpsEstimate epsEstimate) {
        this.epsEstimate = epsEstimate;
    }

    @JsonProperty("epsDifference")
    public EpsDifference getEpsDifference() {
        return epsDifference;
    }

    @JsonProperty("epsDifference")
    public void setEpsDifference(EpsDifference epsDifference) {
        this.epsDifference = epsDifference;
    }

    @JsonProperty("surprisePercent")
    public SurprisePercent getSurprisePercent() {
        return surprisePercent;
    }

    @JsonProperty("surprisePercent")
    public void setSurprisePercent(SurprisePercent surprisePercent) {
        this.surprisePercent = surprisePercent;
    }

    @JsonProperty("quarter")
    public Quarter getQuarter() {
        return quarter;
    }

    @JsonProperty("quarter")
    public void setQuarter(Quarter quarter) {
        this.quarter = quarter;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
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
        sb.append(History.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("epsActual");
        sb.append('=');
        sb.append(((this.epsActual == null)?"<null>":this.epsActual));
        sb.append(',');
        sb.append("epsEstimate");
        sb.append('=');
        sb.append(((this.epsEstimate == null)?"<null>":this.epsEstimate));
        sb.append(',');
        sb.append("epsDifference");
        sb.append('=');
        sb.append(((this.epsDifference == null)?"<null>":this.epsDifference));
        sb.append(',');
        sb.append("surprisePercent");
        sb.append('=');
        sb.append(((this.surprisePercent == null)?"<null>":this.surprisePercent));
        sb.append(',');
        sb.append("quarter");
        sb.append('=');
        sb.append(((this.quarter == null)?"<null>":this.quarter));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
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
        result = ((result* 31)+((this.epsActual == null)? 0 :this.epsActual.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.epsEstimate == null)? 0 :this.epsEstimate.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.surprisePercent == null)? 0 :this.surprisePercent.hashCode()));
        result = ((result* 31)+((this.epsDifference == null)? 0 :this.epsDifference.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.quarter == null)? 0 :this.quarter.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof History) == false) {
            return false;
        }
        History rhs = ((History) other);
        return (((((((((this.epsActual == rhs.epsActual)||((this.epsActual!= null)&&this.epsActual.equals(rhs.epsActual)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.epsEstimate == rhs.epsEstimate)||((this.epsEstimate!= null)&&this.epsEstimate.equals(rhs.epsEstimate))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.surprisePercent == rhs.surprisePercent)||((this.surprisePercent!= null)&&this.surprisePercent.equals(rhs.surprisePercent))))&&((this.epsDifference == rhs.epsDifference)||((this.epsDifference!= null)&&this.epsDifference.equals(rhs.epsDifference))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.quarter == rhs.quarter)||((this.quarter!= null)&&this.quarter.equals(rhs.quarter))));
    }

}
