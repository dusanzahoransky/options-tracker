
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
    "total",
    "offset",
    "results",
    "responseStatus"
})
public class KetRatiosResponse {

    @JsonProperty("total")
    private Long total;
    @JsonProperty("offset")
    private Long offset;
    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
    @JsonProperty("responseStatus")
    private Object responseStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @JsonProperty("offset")
    public Long getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("responseStatus")
    public Object getResponseStatus() {
        return responseStatus;
    }

    @JsonProperty("responseStatus")
    public void setResponseStatus(Object responseStatus) {
        this.responseStatus = responseStatus;
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
        sb.append(KetRatiosResponse.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
        sb.append(',');
        sb.append("results");
        sb.append('=');
        sb.append(((this.results == null)?"<null>":this.results));
        sb.append(',');
        sb.append("responseStatus");
        sb.append('=');
        sb.append(((this.responseStatus == null)?"<null>":this.responseStatus));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.responseStatus == null)? 0 :this.responseStatus.hashCode()));
        result = ((result* 31)+((this.results == null)? 0 :this.results.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KetRatiosResponse) == false) {
            return false;
        }
        KetRatiosResponse rhs = ((KetRatiosResponse) other);
        return ((((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset))))&&((this.responseStatus == rhs.responseStatus)||((this.responseStatus!= null)&&this.responseStatus.equals(rhs.responseStatus))))&&((this.results == rhs.results)||((this.results!= null)&&this.results.equals(rhs.results))));
    }

}
