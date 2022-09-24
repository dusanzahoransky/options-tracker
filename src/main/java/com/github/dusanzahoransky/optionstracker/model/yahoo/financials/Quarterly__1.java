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
    "date",
    "revenue",
    "earnings"
})
public class Quarterly__1 {

    @JsonProperty("date")
    private String date;
    @JsonProperty("revenue")
    private Revenue__1 revenue;
    @JsonProperty("earnings")
    private Earnings__2 earnings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("revenue")
    public Revenue__1 getRevenue() {
        return revenue;
    }

    @JsonProperty("revenue")
    public void setRevenue(Revenue__1 revenue) {
        this.revenue = revenue;
    }

    @JsonProperty("earnings")
    public Earnings__2 getEarnings() {
        return earnings;
    }

    @JsonProperty("earnings")
    public void setEarnings(Earnings__2 earnings) {
        this.earnings = earnings;
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
        sb.append(Quarterly__1.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null) ? "<null>" : this.date));
        sb.append(',');
        sb.append("revenue");
        sb.append('=');
        sb.append(((this.revenue == null) ? "<null>" : this.revenue));
        sb.append(',');
        sb.append("earnings");
        sb.append('=');
        sb.append(((this.earnings == null) ? "<null>" : this.earnings));
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
        result = ((result * 31) + ((this.date == null) ? 0 : this.date.hashCode()));
        result = ((result * 31) + ((this.revenue == null) ? 0 : this.revenue.hashCode()));
        result = ((result * 31) + ((this.earnings == null) ? 0 : this.earnings.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Quarterly__1) == false) {
            return false;
        }
        Quarterly__1 rhs = ((Quarterly__1) other);
        return (((((this.date == rhs.date) || ((this.date != null) && this.date.equals(rhs.date))) && ((this.revenue == rhs.revenue) || ((this.revenue != null) && this.revenue.equals(rhs.revenue)))) && ((this.earnings == rhs.earnings) || ((this.earnings != null) && this.earnings.equals(rhs.earnings)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
