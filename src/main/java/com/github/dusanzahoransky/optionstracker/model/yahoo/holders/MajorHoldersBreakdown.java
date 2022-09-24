
package com.github.dusanzahoransky.optionstracker.model.yahoo.holders;

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
    "insidersPercentHeld",
    "institutionsPercentHeld",
    "institutionsFloatPercentHeld",
    "institutionsCount"
})
public class MajorHoldersBreakdown {

    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("insidersPercentHeld")
    private InsidersPercentHeld insidersPercentHeld;
    @JsonProperty("institutionsPercentHeld")
    private InstitutionsPercentHeld institutionsPercentHeld;
    @JsonProperty("institutionsFloatPercentHeld")
    private InstitutionsFloatPercentHeld institutionsFloatPercentHeld;
    @JsonProperty("institutionsCount")
    private InstitutionsCount institutionsCount;
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

    @JsonProperty("insidersPercentHeld")
    public InsidersPercentHeld getInsidersPercentHeld() {
        return insidersPercentHeld;
    }

    @JsonProperty("insidersPercentHeld")
    public void setInsidersPercentHeld(InsidersPercentHeld insidersPercentHeld) {
        this.insidersPercentHeld = insidersPercentHeld;
    }

    @JsonProperty("institutionsPercentHeld")
    public InstitutionsPercentHeld getInstitutionsPercentHeld() {
        return institutionsPercentHeld;
    }

    @JsonProperty("institutionsPercentHeld")
    public void setInstitutionsPercentHeld(InstitutionsPercentHeld institutionsPercentHeld) {
        this.institutionsPercentHeld = institutionsPercentHeld;
    }

    @JsonProperty("institutionsFloatPercentHeld")
    public InstitutionsFloatPercentHeld getInstitutionsFloatPercentHeld() {
        return institutionsFloatPercentHeld;
    }

    @JsonProperty("institutionsFloatPercentHeld")
    public void setInstitutionsFloatPercentHeld(InstitutionsFloatPercentHeld institutionsFloatPercentHeld) {
        this.institutionsFloatPercentHeld = institutionsFloatPercentHeld;
    }

    @JsonProperty("institutionsCount")
    public InstitutionsCount getInstitutionsCount() {
        return institutionsCount;
    }

    @JsonProperty("institutionsCount")
    public void setInstitutionsCount(InstitutionsCount institutionsCount) {
        this.institutionsCount = institutionsCount;
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
        sb.append(MajorHoldersBreakdown.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("insidersPercentHeld");
        sb.append('=');
        sb.append(((this.insidersPercentHeld == null)?"<null>":this.insidersPercentHeld));
        sb.append(',');
        sb.append("institutionsPercentHeld");
        sb.append('=');
        sb.append(((this.institutionsPercentHeld == null)?"<null>":this.institutionsPercentHeld));
        sb.append(',');
        sb.append("institutionsFloatPercentHeld");
        sb.append('=');
        sb.append(((this.institutionsFloatPercentHeld == null)?"<null>":this.institutionsFloatPercentHeld));
        sb.append(',');
        sb.append("institutionsCount");
        sb.append('=');
        sb.append(((this.institutionsCount == null)?"<null>":this.institutionsCount));
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
        result = ((result* 31)+((this.institutionsCount == null)? 0 :this.institutionsCount.hashCode()));
        result = ((result* 31)+((this.insidersPercentHeld == null)? 0 :this.insidersPercentHeld.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.institutionsFloatPercentHeld == null)? 0 :this.institutionsFloatPercentHeld.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.institutionsPercentHeld == null)? 0 :this.institutionsPercentHeld.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MajorHoldersBreakdown) == false) {
            return false;
        }
        MajorHoldersBreakdown rhs = ((MajorHoldersBreakdown) other);
        return (((((((this.institutionsCount == rhs.institutionsCount)||((this.institutionsCount!= null)&&this.institutionsCount.equals(rhs.institutionsCount)))&&((this.insidersPercentHeld == rhs.insidersPercentHeld)||((this.insidersPercentHeld!= null)&&this.insidersPercentHeld.equals(rhs.insidersPercentHeld))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.institutionsFloatPercentHeld == rhs.institutionsFloatPercentHeld)||((this.institutionsFloatPercentHeld!= null)&&this.institutionsFloatPercentHeld.equals(rhs.institutionsFloatPercentHeld))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.institutionsPercentHeld == rhs.institutionsPercentHeld)||((this.institutionsPercentHeld!= null)&&this.institutionsPercentHeld.equals(rhs.institutionsPercentHeld))));
    }

}
