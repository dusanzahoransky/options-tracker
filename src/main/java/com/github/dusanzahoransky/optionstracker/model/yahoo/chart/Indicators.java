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
    "quote",
    "adjclose"
})
public class Indicators {

    @JsonProperty("quote")
    private List<Quote> quote = new ArrayList<Quote>();
    @JsonProperty("adjclose")
    private List<Adjclose> adjclose = new ArrayList<Adjclose>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quote")
    public List<Quote> getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(List<Quote> quote) {
        this.quote = quote;
    }

    @JsonProperty("adjclose")
    public List<Adjclose> getAdjclose() {
        return adjclose;
    }

    @JsonProperty("adjclose")
    public void setAdjclose(List<Adjclose> adjclose) {
        this.adjclose = adjclose;
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
        sb.append(Indicators.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quote");
        sb.append('=');
        sb.append(((this.quote == null) ? "<null>" : this.quote));
        sb.append(',');
        sb.append("adjclose");
        sb.append('=');
        sb.append(((this.adjclose == null) ? "<null>" : this.adjclose));
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
        result = ((result * 31) + ((this.adjclose == null) ? 0 : this.adjclose.hashCode()));
        result = ((result * 31) + ((this.quote == null) ? 0 : this.quote.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Indicators) == false) {
            return false;
        }
        Indicators rhs = ((Indicators) other);
        return ((((this.adjclose == rhs.adjclose) || ((this.adjclose != null) && this.adjclose.equals(rhs.adjclose))) && ((this.quote == rhs.quote) || ((this.quote != null) && this.quote.equals(rhs.quote)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
