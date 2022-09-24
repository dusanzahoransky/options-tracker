package com.github.dusanzahoransky.optionstracker.model.yahoo.statistics;

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
    "maxAge",
    "earnings",
    "exDividendDate",
    "dividendDate"
})
public class CalendarEvents {

    @JsonProperty("maxAge")
    private Double maxAge;
    @JsonProperty("earnings")
    private Earnings earnings;
    @JsonProperty("exDividendDate")
    private ExDividendDate exDividendDate;
    @JsonProperty("dividendDate")
    private DividendDate dividendDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxAge")
    public Double getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Double maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("earnings")
    public Earnings getEarnings() {
        return earnings;
    }

    @JsonProperty("earnings")
    public void setEarnings(Earnings earnings) {
        this.earnings = earnings;
    }

    @JsonProperty("exDividendDate")
    public ExDividendDate getExDividendDate() {
        return exDividendDate;
    }

    @JsonProperty("exDividendDate")
    public void setExDividendDate(ExDividendDate exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    @JsonProperty("dividendDate")
    public DividendDate getDividendDate() {
        return dividendDate;
    }

    @JsonProperty("dividendDate")
    public void setDividendDate(DividendDate dividendDate) {
        this.dividendDate = dividendDate;
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
        sb.append(CalendarEvents.class.getName()).append('@').append(Double.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
        sb.append(',');
        sb.append("earnings");
        sb.append('=');
        sb.append(((this.earnings == null) ? "<null>" : this.earnings));
        sb.append(',');
        sb.append("exDividendDate");
        sb.append('=');
        sb.append(((this.exDividendDate == null) ? "<null>" : this.exDividendDate));
        sb.append(',');
        sb.append("dividendDate");
        sb.append('=');
        sb.append(((this.dividendDate == null) ? "<null>" : this.dividendDate));
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
        result = ((result * 31) + ((this.earnings == null) ? 0 : this.earnings.hashCode()));
        result = ((result * 31) + ((this.dividendDate == null) ? 0 : this.dividendDate.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        result = ((result * 31) + ((this.exDividendDate == null) ? 0 : this.exDividendDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CalendarEvents) == false) {
            return false;
        }
        CalendarEvents rhs = ((CalendarEvents) other);
        return ((((((this.earnings == rhs.earnings) || ((this.earnings != null) && this.earnings.equals(rhs.earnings))) && ((this.dividendDate == rhs.dividendDate) || ((this.dividendDate != null) && this.dividendDate.equals(rhs.dividendDate)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.exDividendDate == rhs.exDividendDate) || ((this.exDividendDate != null) && this.exDividendDate.equals(rhs.exDividendDate))));
    }

}
