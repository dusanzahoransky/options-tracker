package com.github.dusanzahoransky.optionstracker.model.yahoo.financials;

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
    "symbol",
    "start",
    "end",
    "timeUnit"
})
public class Meta {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("start")
    private Long start;
    @JsonProperty("end")
    private Long end;
    @JsonProperty("timeUnit")
    private String timeUnit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("start")
    public Long getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Long start) {
        this.start = start;
    }

    @JsonProperty("end")
    public Long getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(Long end) {
        this.end = end;
    }

    @JsonProperty("timeUnit")
    public String getTimeUnit() {
        return timeUnit;
    }

    @JsonProperty("timeUnit")
    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
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
        sb.append(Meta.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null) ? "<null>" : this.symbol));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null) ? "<null>" : this.start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null) ? "<null>" : this.end));
        sb.append(',');
        sb.append("timeUnit");
        sb.append('=');
        sb.append(((this.timeUnit == null) ? "<null>" : this.timeUnit));
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
        result = ((result * 31) + ((this.symbol == null) ? 0 : this.symbol.hashCode()));
        result = ((result * 31) + ((this.end == null) ? 0 : this.end.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.timeUnit == null) ? 0 : this.timeUnit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return ((((((this.start == rhs.start) || ((this.start != null) && this.start.equals(rhs.start))) && ((this.symbol == rhs.symbol) || ((this.symbol != null) && this.symbol.equals(rhs.symbol)))) && ((this.end == rhs.end) || ((this.end != null) && this.end.equals(rhs.end)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.timeUnit == rhs.timeUnit) || ((this.timeUnit != null) && this.timeUnit.equals(rhs.timeUnit))));
    }

}
