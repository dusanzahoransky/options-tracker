
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
    "raw",
    "fmt"
})
public class FiftyTwoWeekHigh__4 {

    @JsonProperty("raw")
    private Long raw;
    @JsonProperty("fmt")
    private String fmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("raw")
    public Long getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(Long raw) {
        this.raw = raw;
    }

    @JsonProperty("fmt")
    public String getFmt() {
        return fmt;
    }

    @JsonProperty("fmt")
    public void setFmt(String fmt) {
        this.fmt = fmt;
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
        sb.append(FiftyTwoWeekHigh__4 .class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("raw");
        sb.append('=');
        sb.append(((this.raw == null)?"<null>":this.raw));
        sb.append(',');
        sb.append("fmt");
        sb.append('=');
        sb.append(((this.fmt == null)?"<null>":this.fmt));
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
        result = ((result* 31)+((this.raw == null)? 0 :this.raw.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fmt == null)? 0 :this.fmt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FiftyTwoWeekHigh__4) == false) {
            return false;
        }
        FiftyTwoWeekHigh__4 rhs = ((FiftyTwoWeekHigh__4) other);
        return ((((this.raw == rhs.raw)||((this.raw!= null)&&this.raw.equals(rhs.raw)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fmt == rhs.fmt)||((this.fmt!= null)&&this.fmt.equals(rhs.fmt))));
    }

}
