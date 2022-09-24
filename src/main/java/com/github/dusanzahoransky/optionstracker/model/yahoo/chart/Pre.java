package com.github.dusanzahoransky.optionstracker.model.yahoo.chart;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
    "timezone",
    "end",
    "start",
    "gmtoffset"
})
public class Pre {

    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("end")
    private Integer end;
    @JsonProperty("start")
    private Integer start;
    @JsonProperty("gmtoffset")
    private Integer gmtoffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("end")
    public Integer getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(Integer end) {
        this.end = end;
    }

    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    @JsonProperty("gmtoffset")
    public Integer getGmtoffset() {
        return gmtoffset;
    }

    @JsonProperty("gmtoffset")
    public void setGmtoffset(Integer gmtoffset) {
        this.gmtoffset = gmtoffset;
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
        sb.append(Pre.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null) ? "<null>" : this.timezone));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null) ? "<null>" : this.end));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null) ? "<null>" : this.start));
        sb.append(',');
        sb.append("gmtoffset");
        sb.append('=');
        sb.append(((this.gmtoffset == null) ? "<null>" : this.gmtoffset));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.start == null) ? 0 : this.start.hashCode()));
        result = ((result * 31) + ((this.end == null) ? 0 : this.end.hashCode()));
        result = ((result * 31) + ((this.gmtoffset == null) ? 0 : this.gmtoffset.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.timezone == null) ? 0 : this.timezone.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pre) == false) {
            return false;
        }
        Pre rhs = ((Pre) other);
        return ((((((this.start == rhs.start) || ((this.start != null) && this.start.equals(rhs.start))) && ((this.end == rhs.end) || ((this.end != null) && this.end.equals(rhs.end)))) && ((this.gmtoffset == rhs.gmtoffset) || ((this.gmtoffset != null) && this.gmtoffset.equals(rhs.gmtoffset)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.timezone == rhs.timezone) || ((this.timezone != null) && this.timezone.equals(rhs.timezone))));
    }

}
