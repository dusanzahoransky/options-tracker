
package com.github.dusanzahoransky.optionstracker.model.ms.keyratios;

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
    "periodEndDate",
    "sections"
})
public class Result {

    @JsonProperty("periodEndDate")
    private String periodEndDate;
    @JsonProperty("sections")
    private List<Section> sections = new ArrayList<Section>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("periodEndDate")
    public String getPeriodEndDate() {
        return periodEndDate;
    }

    @JsonProperty("periodEndDate")
    public void setPeriodEndDate(String periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    @JsonProperty("sections")
    public List<Section> getSections() {
        return sections;
    }

    @JsonProperty("sections")
    public void setSections(List<Section> sections) {
        this.sections = sections;
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
        sb.append(Result.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("periodEndDate");
        sb.append('=');
        sb.append(((this.periodEndDate == null)?"<null>":this.periodEndDate));
        sb.append(',');
        sb.append("sections");
        sb.append('=');
        sb.append(((this.sections == null)?"<null>":this.sections));
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
        result = ((result* 31)+((this.periodEndDate == null)? 0 :this.periodEndDate.hashCode()));
        result = ((result* 31)+((this.sections == null)? 0 :this.sections.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.periodEndDate == rhs.periodEndDate)||((this.periodEndDate!= null)&&this.periodEndDate.equals(rhs.periodEndDate))))&&((this.sections == rhs.sections)||((this.sections!= null)&&this.sections.equals(rhs.sections))));
    }

}
