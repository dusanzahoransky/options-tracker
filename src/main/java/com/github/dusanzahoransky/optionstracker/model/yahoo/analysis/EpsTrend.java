
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
    "current",
    "7daysAgo",
    "30daysAgo",
    "60daysAgo",
    "90daysAgo"
})
public class EpsTrend {

    @JsonProperty("current")
    private Current current;
    @JsonProperty("7daysAgo")
    private com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._7daysAgo _7daysAgo;
    @JsonProperty("30daysAgo")
    private com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._30daysAgo _30daysAgo;
    @JsonProperty("60daysAgo")
    private com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._60daysAgo _60daysAgo;
    @JsonProperty("90daysAgo")
    private com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._90daysAgo _90daysAgo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(Current current) {
        this.current = current;
    }

    @JsonProperty("7daysAgo")
    public com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._7daysAgo get7daysAgo() {
        return _7daysAgo;
    }

    @JsonProperty("7daysAgo")
    public void set7daysAgo(com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._7daysAgo _7daysAgo) {
        this._7daysAgo = _7daysAgo;
    }

    @JsonProperty("30daysAgo")
    public com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._30daysAgo get30daysAgo() {
        return _30daysAgo;
    }

    @JsonProperty("30daysAgo")
    public void set30daysAgo(com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._30daysAgo _30daysAgo) {
        this._30daysAgo = _30daysAgo;
    }

    @JsonProperty("60daysAgo")
    public com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._60daysAgo get60daysAgo() {
        return _60daysAgo;
    }

    @JsonProperty("60daysAgo")
    public void set60daysAgo(com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._60daysAgo _60daysAgo) {
        this._60daysAgo = _60daysAgo;
    }

    @JsonProperty("90daysAgo")
    public com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._90daysAgo get90daysAgo() {
        return _90daysAgo;
    }

    @JsonProperty("90daysAgo")
    public void set90daysAgo(com.github.dusanzahoransky.optionstracker.model.yahoo.analysis._90daysAgo _90daysAgo) {
        this._90daysAgo = _90daysAgo;
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
        sb.append(EpsTrend.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("current");
        sb.append('=');
        sb.append(((this.current == null)?"<null>":this.current));
        sb.append(',');
        sb.append("_7daysAgo");
        sb.append('=');
        sb.append(((this._7daysAgo == null)?"<null>":this._7daysAgo));
        sb.append(',');
        sb.append("_30daysAgo");
        sb.append('=');
        sb.append(((this._30daysAgo == null)?"<null>":this._30daysAgo));
        sb.append(',');
        sb.append("_60daysAgo");
        sb.append('=');
        sb.append(((this._60daysAgo == null)?"<null>":this._60daysAgo));
        sb.append(',');
        sb.append("_90daysAgo");
        sb.append('=');
        sb.append(((this._90daysAgo == null)?"<null>":this._90daysAgo));
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
        result = ((result* 31)+((this.current == null)? 0 :this.current.hashCode()));
        result = ((result* 31)+((this._7daysAgo == null)? 0 :this._7daysAgo.hashCode()));
        result = ((result* 31)+((this._60daysAgo == null)? 0 :this._60daysAgo.hashCode()));
        result = ((result* 31)+((this._90daysAgo == null)? 0 :this._90daysAgo.hashCode()));
        result = ((result* 31)+((this._30daysAgo == null)? 0 :this._30daysAgo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EpsTrend) == false) {
            return false;
        }
        EpsTrend rhs = ((EpsTrend) other);
        return (((((((this.current == rhs.current)||((this.current!= null)&&this.current.equals(rhs.current)))&&((this._7daysAgo == rhs._7daysAgo)||((this._7daysAgo!= null)&&this._7daysAgo.equals(rhs._7daysAgo))))&&((this._60daysAgo == rhs._60daysAgo)||((this._60daysAgo!= null)&&this._60daysAgo.equals(rhs._60daysAgo))))&&((this._90daysAgo == rhs._90daysAgo)||((this._90daysAgo!= null)&&this._90daysAgo.equals(rhs._90daysAgo))))&&((this._30daysAgo == rhs._30daysAgo)||((this._30daysAgo!= null)&&this._30daysAgo.equals(rhs._30daysAgo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
