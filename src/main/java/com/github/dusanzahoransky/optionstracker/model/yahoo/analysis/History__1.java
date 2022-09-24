
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
    "epochGradeDate",
    "firm",
    "toGrade",
    "fromGrade",
    "action"
})
public class History__1 {

    @JsonProperty("epochGradeDate")
    private Long epochGradeDate;
    @JsonProperty("firm")
    private String firm;
    @JsonProperty("toGrade")
    private String toGrade;
    @JsonProperty("fromGrade")
    private String fromGrade;
    @JsonProperty("action")
    private String action;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("epochGradeDate")
    public Long getEpochGradeDate() {
        return epochGradeDate;
    }

    @JsonProperty("epochGradeDate")
    public void setEpochGradeDate(Long epochGradeDate) {
        this.epochGradeDate = epochGradeDate;
    }

    @JsonProperty("firm")
    public String getFirm() {
        return firm;
    }

    @JsonProperty("firm")
    public void setFirm(String firm) {
        this.firm = firm;
    }

    @JsonProperty("toGrade")
    public String getToGrade() {
        return toGrade;
    }

    @JsonProperty("toGrade")
    public void setToGrade(String toGrade) {
        this.toGrade = toGrade;
    }

    @JsonProperty("fromGrade")
    public String getFromGrade() {
        return fromGrade;
    }

    @JsonProperty("fromGrade")
    public void setFromGrade(String fromGrade) {
        this.fromGrade = fromGrade;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
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
        sb.append(History__1 .class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("epochGradeDate");
        sb.append('=');
        sb.append(((this.epochGradeDate == null)?"<null>":this.epochGradeDate));
        sb.append(',');
        sb.append("firm");
        sb.append('=');
        sb.append(((this.firm == null)?"<null>":this.firm));
        sb.append(',');
        sb.append("toGrade");
        sb.append('=');
        sb.append(((this.toGrade == null)?"<null>":this.toGrade));
        sb.append(',');
        sb.append("fromGrade");
        sb.append('=');
        sb.append(((this.fromGrade == null)?"<null>":this.fromGrade));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
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
        result = ((result* 31)+((this.firm == null)? 0 :this.firm.hashCode()));
        result = ((result* 31)+((this.toGrade == null)? 0 :this.toGrade.hashCode()));
        result = ((result* 31)+((this.fromGrade == null)? 0 :this.fromGrade.hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.epochGradeDate == null)? 0 :this.epochGradeDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof History__1) == false) {
            return false;
        }
        History__1 rhs = ((History__1) other);
        return (((((((this.firm == rhs.firm)||((this.firm!= null)&&this.firm.equals(rhs.firm)))&&((this.toGrade == rhs.toGrade)||((this.toGrade!= null)&&this.toGrade.equals(rhs.toGrade))))&&((this.fromGrade == rhs.fromGrade)||((this.fromGrade!= null)&&this.fromGrade.equals(rhs.fromGrade))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.epochGradeDate == rhs.epochGradeDate)||((this.epochGradeDate!= null)&&this.epochGradeDate.equals(rhs.epochGradeDate))));
    }

}
