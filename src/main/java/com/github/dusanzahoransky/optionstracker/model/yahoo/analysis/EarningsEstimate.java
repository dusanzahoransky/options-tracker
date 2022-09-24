
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
    "yearAgoEps",
    "numberOfAnalysts",
    "growth"
})
public class EarningsEstimate {

    @JsonProperty("avg")
    private Avg avg;
    @JsonProperty("low")
    private Low low;
    @JsonProperty("high")
    private High high;
    @JsonProperty("yearAgoEps")
    private YearAgoEps yearAgoEps;
    @JsonProperty("numberOfAnalysts")
    private NumberOfAnalysts numberOfAnalysts;
    @JsonProperty("growth")
    private Growth__2 growth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("avg")
    public Avg getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(Avg avg) {
        this.avg = avg;
    }

    @JsonProperty("low")
    public Low getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(Low low) {
        this.low = low;
    }

    @JsonProperty("high")
    public High getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(High high) {
        this.high = high;
    }

    @JsonProperty("yearAgoEps")
    public YearAgoEps getYearAgoEps() {
        return yearAgoEps;
    }

    @JsonProperty("yearAgoEps")
    public void setYearAgoEps(YearAgoEps yearAgoEps) {
        this.yearAgoEps = yearAgoEps;
    }

    @JsonProperty("numberOfAnalysts")
    public NumberOfAnalysts getNumberOfAnalysts() {
        return numberOfAnalysts;
    }

    @JsonProperty("numberOfAnalysts")
    public void setNumberOfAnalysts(NumberOfAnalysts numberOfAnalysts) {
        this.numberOfAnalysts = numberOfAnalysts;
    }

    @JsonProperty("growth")
    public Growth__2 getGrowth() {
        return growth;
    }

    @JsonProperty("growth")
    public void setGrowth(Growth__2 growth) {
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
        sb.append(EarningsEstimate.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("yearAgoEps");
        sb.append('=');
        sb.append(((this.yearAgoEps == null)?"<null>":this.yearAgoEps));
        sb.append(',');
        sb.append("numberOfAnalysts");
        sb.append('=');
        sb.append(((this.numberOfAnalysts == null)?"<null>":this.numberOfAnalysts));
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
        result = ((result* 31)+((this.yearAgoEps == null)? 0 :this.yearAgoEps.hashCode()));
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
        if ((other instanceof EarningsEstimate) == false) {
            return false;
        }
        EarningsEstimate rhs = ((EarningsEstimate) other);
        return ((((((((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high)))&&((this.avg == rhs.avg)||((this.avg!= null)&&this.avg.equals(rhs.avg))))&&((this.numberOfAnalysts == rhs.numberOfAnalysts)||((this.numberOfAnalysts!= null)&&this.numberOfAnalysts.equals(rhs.numberOfAnalysts))))&&((this.yearAgoEps == rhs.yearAgoEps)||((this.yearAgoEps!= null)&&this.yearAgoEps.equals(rhs.yearAgoEps))))&&((this.low == rhs.low)||((this.low!= null)&&this.low.equals(rhs.low))))&&((this.growth == rhs.growth)||((this.growth!= null)&&this.growth.equals(rhs.growth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
