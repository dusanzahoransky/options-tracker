
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
    "reportDate",
    "organization",
    "pctHeld",
    "position",
    "value"
})
public class Ownership {

    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("reportDate")
    private ReportDate reportDate;
    @JsonProperty("organization")
    private String organization;
    @JsonProperty("pctHeld")
    private PctHeld pctHeld;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("value")
    private Value value;
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

    @JsonProperty("reportDate")
    public ReportDate getReportDate() {
        return reportDate;
    }

    @JsonProperty("reportDate")
    public void setReportDate(ReportDate reportDate) {
        this.reportDate = reportDate;
    }

    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @JsonProperty("pctHeld")
    public PctHeld getPctHeld() {
        return pctHeld;
    }

    @JsonProperty("pctHeld")
    public void setPctHeld(PctHeld pctHeld) {
        this.pctHeld = pctHeld;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
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
        sb.append(Ownership.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("reportDate");
        sb.append('=');
        sb.append(((this.reportDate == null)?"<null>":this.reportDate));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("pctHeld");
        sb.append('=');
        sb.append(((this.pctHeld == null)?"<null>":this.pctHeld));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.reportDate == null)? 0 :this.reportDate.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.pctHeld == null)? 0 :this.pctHeld.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ownership) == false) {
            return false;
        }
        Ownership rhs = ((Ownership) other);
        return ((((((((this.reportDate == rhs.reportDate)||((this.reportDate!= null)&&this.reportDate.equals(rhs.reportDate)))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.pctHeld == rhs.pctHeld)||((this.pctHeld!= null)&&this.pctHeld.equals(rhs.pctHeld))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
