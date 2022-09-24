
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
    "avg",
    "low",
    "high",
    "numberOfAnalysts",
    "yearAgoRevenue",
    "growth"
})
public class RevenueEstimate {

    @JsonProperty("avg")
    private Avg__1 avg;
    @JsonProperty("low")
    private Low__1 low;
    @JsonProperty("high")
    private High__1 high;
    @JsonProperty("numberOfAnalysts")
    private NumberOfAnalysts__1 numberOfAnalysts;
    @JsonProperty("yearAgoRevenue")
    private YearAgoRevenue yearAgoRevenue;
    @JsonProperty("growth")
    private Growth__3 growth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("avg")
    public Avg__1 getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(Avg__1 avg) {
        this.avg = avg;
    }

    @JsonProperty("low")
    public Low__1 getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(Low__1 low) {
        this.low = low;
    }

    @JsonProperty("high")
    public High__1 getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(High__1 high) {
        this.high = high;
    }

    @JsonProperty("numberOfAnalysts")
    public NumberOfAnalysts__1 getNumberOfAnalysts() {
        return numberOfAnalysts;
    }

    @JsonProperty("numberOfAnalysts")
    public void setNumberOfAnalysts(NumberOfAnalysts__1 numberOfAnalysts) {
        this.numberOfAnalysts = numberOfAnalysts;
    }

    @JsonProperty("yearAgoRevenue")
    public YearAgoRevenue getYearAgoRevenue() {
        return yearAgoRevenue;
    }

    @JsonProperty("yearAgoRevenue")
    public void setYearAgoRevenue(YearAgoRevenue yearAgoRevenue) {
        this.yearAgoRevenue = yearAgoRevenue;
    }

    @JsonProperty("growth")
    public Growth__3 getGrowth() {
        return growth;
    }

    @JsonProperty("growth")
    public void setGrowth(Growth__3 growth) {
        this.growth = growth;
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
        sb.append(RevenueEstimate.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("avg");
        sb.append('=');
        sb.append(((this.avg == null)?"<null>":this.avg));
        sb.append(',');
        sb.append("low");
        sb.append('=');
        sb.append(((this.low == null)?"<null>":this.low));
        sb.append(',');
        sb.append("high");
        sb.append('=');
        sb.append(((this.high == null)?"<null>":this.high));
        sb.append(',');
        sb.append("numberOfAnalysts");
        sb.append('=');
        sb.append(((this.numberOfAnalysts == null)?"<null>":this.numberOfAnalysts));
        sb.append(',');
        sb.append("yearAgoRevenue");
        sb.append('=');
        sb.append(((this.yearAgoRevenue == null)?"<null>":this.yearAgoRevenue));
        sb.append(',');
        sb.append("growth");
        sb.append('=');
        sb.append(((this.growth == null)?"<null>":this.growth));
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
        result = ((result* 31)+((this.high == null)? 0 :this.high.hashCode()));
        result = ((result* 31)+((this.avg == null)? 0 :this.avg.hashCode()));
        result = ((result* 31)+((this.numberOfAnalysts == null)? 0 :this.numberOfAnalysts.hashCode()));
        result = ((result* 31)+((this.yearAgoRevenue == null)? 0 :this.yearAgoRevenue.hashCode()));
        result = ((result* 31)+((this.low == null)? 0 :this.low.hashCode()));
        result = ((result* 31)+((this.growth == null)? 0 :this.growth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RevenueEstimate) == false) {
            return false;
        }
        RevenueEstimate rhs = ((RevenueEstimate) other);
        return ((((((((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high)))&&((this.avg == rhs.avg)||((this.avg!= null)&&this.avg.equals(rhs.avg))))&&((this.numberOfAnalysts == rhs.numberOfAnalysts)||((this.numberOfAnalysts!= null)&&this.numberOfAnalysts.equals(rhs.numberOfAnalysts))))&&((this.yearAgoRevenue == rhs.yearAgoRevenue)||((this.yearAgoRevenue!= null)&&this.yearAgoRevenue.equals(rhs.yearAgoRevenue))))&&((this.low == rhs.low)||((this.low!= null)&&this.low.equals(rhs.low))))&&((this.growth == rhs.growth)||((this.growth!= null)&&this.growth.equals(rhs.growth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
