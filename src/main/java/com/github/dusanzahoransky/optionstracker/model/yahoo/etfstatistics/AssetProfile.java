
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
    "longBusinessSummary",
    "companyOfficers",
    "maxAge"
})
public class AssetProfile {

    @JsonProperty("longBusinessSummary")
    private String longBusinessSummary;
    @JsonProperty("companyOfficers")
    private List<Object> companyOfficers = new ArrayList<Object>();
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("longBusinessSummary")
    public String getLongBusinessSummary() {
        return longBusinessSummary;
    }

    @JsonProperty("longBusinessSummary")
    public void setLongBusinessSummary(String longBusinessSummary) {
        this.longBusinessSummary = longBusinessSummary;
    }

    @JsonProperty("companyOfficers")
    public List<Object> getCompanyOfficers() {
        return companyOfficers;
    }

    @JsonProperty("companyOfficers")
    public void setCompanyOfficers(List<Object> companyOfficers) {
        this.companyOfficers = companyOfficers;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
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
        sb.append(AssetProfile.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("longBusinessSummary");
        sb.append('=');
        sb.append(((this.longBusinessSummary == null)?"<null>":this.longBusinessSummary));
        sb.append(',');
        sb.append("companyOfficers");
        sb.append('=');
        sb.append(((this.companyOfficers == null)?"<null>":this.companyOfficers));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
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
        result = ((result* 31)+((this.companyOfficers == null)? 0 :this.companyOfficers.hashCode()));
        result = ((result* 31)+((this.longBusinessSummary == null)? 0 :this.longBusinessSummary.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetProfile) == false) {
            return false;
        }
        AssetProfile rhs = ((AssetProfile) other);
        return (((((this.companyOfficers == rhs.companyOfficers)||((this.companyOfficers!= null)&&this.companyOfficers.equals(rhs.companyOfficers)))&&((this.longBusinessSummary == rhs.longBusinessSummary)||((this.longBusinessSummary!= null)&&this.longBusinessSummary.equals(rhs.longBusinessSummary))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))));
    }

}
