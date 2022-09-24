
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
    "returns",
    "returnsCat"
})
public class AnnualTotalReturns {

    @JsonProperty("returns")
    private List<Return> returns = new ArrayList<Return>();
    @JsonProperty("returnsCat")
    private List<Object> returnsCat = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("returns")
    public List<Return> getReturns() {
        return returns;
    }

    @JsonProperty("returns")
    public void setReturns(List<Return> returns) {
        this.returns = returns;
    }

    @JsonProperty("returnsCat")
    public List<Object> getReturnsCat() {
        return returnsCat;
    }

    @JsonProperty("returnsCat")
    public void setReturnsCat(List<Object> returnsCat) {
        this.returnsCat = returnsCat;
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
        sb.append(AnnualTotalReturns.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("returns");
        sb.append('=');
        sb.append(((this.returns == null)?"<null>":this.returns));
        sb.append(',');
        sb.append("returnsCat");
        sb.append('=');
        sb.append(((this.returnsCat == null)?"<null>":this.returnsCat));
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
        result = ((result* 31)+((this.returns == null)? 0 :this.returns.hashCode()));
        result = ((result* 31)+((this.returnsCat == null)? 0 :this.returnsCat.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnnualTotalReturns) == false) {
            return false;
        }
        AnnualTotalReturns rhs = ((AnnualTotalReturns) other);
        return ((((this.returns == rhs.returns)||((this.returns!= null)&&this.returns.equals(rhs.returns)))&&((this.returnsCat == rhs.returnsCat)||((this.returnsCat!= null)&&this.returnsCat.equals(rhs.returnsCat))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
