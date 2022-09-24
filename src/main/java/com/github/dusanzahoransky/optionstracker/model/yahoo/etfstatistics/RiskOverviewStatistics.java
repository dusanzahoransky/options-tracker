
package com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "riskRating",
    "riskStatistics"
})
public class RiskOverviewStatistics {

    @JsonProperty("riskRating")
    private RiskRating riskRating;
    @JsonProperty("riskStatistics")
    private List<RiskStatistic> riskStatistics = new ArrayList<RiskStatistic>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("riskRating")
    public RiskRating getRiskRating() {
        return riskRating;
    }

    @JsonProperty("riskRating")
    public void setRiskRating(RiskRating riskRating) {
        this.riskRating = riskRating;
    }

    @JsonProperty("riskStatistics")
    public List<RiskStatistic> getRiskStatistics() {
        return riskStatistics;
    }

    @JsonProperty("riskStatistics")
    public void setRiskStatistics(List<RiskStatistic> riskStatistics) {
        this.riskStatistics = riskStatistics;
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
        sb.append(RiskOverviewStatistics.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("riskRating");
        sb.append('=');
        sb.append(((this.riskRating == null)?"<null>":this.riskRating));
        sb.append(',');
        sb.append("riskStatistics");
        sb.append('=');
        sb.append(((this.riskStatistics == null)?"<null>":this.riskStatistics));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.riskRating == null)? 0 :this.riskRating.hashCode()));
        result = ((result* 31)+((this.riskStatistics == null)? 0 :this.riskStatistics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RiskOverviewStatistics) == false) {
            return false;
        }
        RiskOverviewStatistics rhs = ((RiskOverviewStatistics) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.riskRating == rhs.riskRating)||((this.riskRating!= null)&&this.riskRating.equals(rhs.riskRating))))&&((this.riskStatistics == rhs.riskStatistics)||((this.riskStatistics!= null)&&this.riskStatistics.equals(rhs.riskStatistics))));
    }

}
