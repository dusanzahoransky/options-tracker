package com.github.dusanzahoransky.optionstracker.model.yahoo.chart;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
    "close",
    "open",
    "high",
    "volume",
    "low"
})
public class Quote {

    @JsonProperty("close")
    private List<Double> close = new ArrayList<Double>();
    @JsonProperty("open")
    private List<Double> open = new ArrayList<Double>();
    @JsonProperty("high")
    private List<Double> high = new ArrayList<Double>();
    @JsonProperty("volume")
    private List<Integer> volume = new ArrayList<Integer>();
    @JsonProperty("low")
    private List<Double> low = new ArrayList<Double>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("close")
    public List<Double> getClose() {
        return close;
    }

    @JsonProperty("close")
    public void setClose(List<Double> close) {
        this.close = close;
    }

    @JsonProperty("open")
    public List<Double> getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(List<Double> open) {
        this.open = open;
    }

    @JsonProperty("high")
    public List<Double> getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(List<Double> high) {
        this.high = high;
    }

    @JsonProperty("volume")
    public List<Integer> getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(List<Integer> volume) {
        this.volume = volume;
    }

    @JsonProperty("low")
    public List<Double> getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(List<Double> low) {
        this.low = low;
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
        sb.append(Quote.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("close");
        sb.append('=');
        sb.append(((this.close == null) ? "<null>" : this.close));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null) ? "<null>" : this.open));
        sb.append(',');
        sb.append("high");
        sb.append('=');
        sb.append(((this.high == null) ? "<null>" : this.high));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null) ? "<null>" : this.volume));
        sb.append(',');
        sb.append("low");
        sb.append('=');
        sb.append(((this.low == null) ? "<null>" : this.low));
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
        result = ((result * 31) + ((this.volume == null) ? 0 : this.volume.hashCode()));
        result = ((result * 31) + ((this.high == null) ? 0 : this.high.hashCode()));
        result = ((result * 31) + ((this.low == null) ? 0 : this.low.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.close == null) ? 0 : this.close.hashCode()));
        result = ((result * 31) + ((this.open == null) ? 0 : this.open.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Quote) == false) {
            return false;
        }
        Quote rhs = ((Quote) other);
        return (((((((this.volume == rhs.volume) || ((this.volume != null) && this.volume.equals(rhs.volume))) && ((this.high == rhs.high) || ((this.high != null) && this.high.equals(rhs.high)))) && ((this.low == rhs.low) || ((this.low != null) && this.low.equals(rhs.low)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.close == rhs.close) || ((this.close != null) && this.close.equals(rhs.close)))) && ((this.open == rhs.open) || ((this.open != null) && this.open.equals(rhs.open))));
    }

}
