
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
    "upLast7days",
    "upLast30days",
    "downLast30days",
    "downLast90days"
})
public class EpsRevisions {

    @JsonProperty("upLast7days")
    private UpLast7days upLast7days;
    @JsonProperty("upLast30days")
    private UpLast30days upLast30days;
    @JsonProperty("downLast30days")
    private DownLast30days downLast30days;
    @JsonProperty("downLast90days")
    private DownLast90days downLast90days;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("upLast7days")
    public UpLast7days getUpLast7days() {
        return upLast7days;
    }

    @JsonProperty("upLast7days")
    public void setUpLast7days(UpLast7days upLast7days) {
        this.upLast7days = upLast7days;
    }

    @JsonProperty("upLast30days")
    public UpLast30days getUpLast30days() {
        return upLast30days;
    }

    @JsonProperty("upLast30days")
    public void setUpLast30days(UpLast30days upLast30days) {
        this.upLast30days = upLast30days;
    }

    @JsonProperty("downLast30days")
    public DownLast30days getDownLast30days() {
        return downLast30days;
    }

    @JsonProperty("downLast30days")
    public void setDownLast30days(DownLast30days downLast30days) {
        this.downLast30days = downLast30days;
    }

    @JsonProperty("downLast90days")
    public DownLast90days getDownLast90days() {
        return downLast90days;
    }

    @JsonProperty("downLast90days")
    public void setDownLast90days(DownLast90days downLast90days) {
        this.downLast90days = downLast90days;
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
        sb.append(EpsRevisions.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("upLast7days");
        sb.append('=');
        sb.append(((this.upLast7days == null)?"<null>":this.upLast7days));
        sb.append(',');
        sb.append("upLast30days");
        sb.append('=');
        sb.append(((this.upLast30days == null)?"<null>":this.upLast30days));
        sb.append(',');
        sb.append("downLast30days");
        sb.append('=');
        sb.append(((this.downLast30days == null)?"<null>":this.downLast30days));
        sb.append(',');
        sb.append("downLast90days");
        sb.append('=');
        sb.append(((this.downLast90days == null)?"<null>":this.downLast90days));
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
        result = ((result* 31)+((this.upLast7days == null)? 0 :this.upLast7days.hashCode()));
        result = ((result* 31)+((this.upLast30days == null)? 0 :this.upLast30days.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.downLast90days == null)? 0 :this.downLast90days.hashCode()));
        result = ((result* 31)+((this.downLast30days == null)? 0 :this.downLast30days.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EpsRevisions) == false) {
            return false;
        }
        EpsRevisions rhs = ((EpsRevisions) other);
        return ((((((this.upLast7days == rhs.upLast7days)||((this.upLast7days!= null)&&this.upLast7days.equals(rhs.upLast7days)))&&((this.upLast30days == rhs.upLast30days)||((this.upLast30days!= null)&&this.upLast30days.equals(rhs.upLast30days))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.downLast90days == rhs.downLast90days)||((this.downLast90days!= null)&&this.downLast90days.equals(rhs.downLast90days))))&&((this.downLast30days == rhs.downLast30days)||((this.downLast30days!= null)&&this.downLast30days.equals(rhs.downLast30days))));
    }

}
