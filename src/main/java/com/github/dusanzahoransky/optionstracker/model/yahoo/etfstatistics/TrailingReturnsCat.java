
package com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics;

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
    "threeMonth",
    "oneYear",
    "ytd",
    "lastBearMkt",
    "lastBullMkt",
    "fiveYear",
    "tenYear",
    "oneMonth",
    "threeYear"
})
public class TrailingReturnsCat {

    @JsonProperty("threeMonth")
    private ThreeMonth__1 threeMonth;
    @JsonProperty("oneYear")
    private OneYear__1 oneYear;
    @JsonProperty("ytd")
    private Ytd__1 ytd;
    @JsonProperty("lastBearMkt")
    private LastBearMkt__1 lastBearMkt;
    @JsonProperty("lastBullMkt")
    private LastBullMkt__1 lastBullMkt;
    @JsonProperty("fiveYear")
    private FiveYear__1 fiveYear;
    @JsonProperty("tenYear")
    private TenYear__1 tenYear;
    @JsonProperty("oneMonth")
    private OneMonth__1 oneMonth;
    @JsonProperty("threeYear")
    private ThreeYear__1 threeYear;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("threeMonth")
    public ThreeMonth__1 getThreeMonth() {
        return threeMonth;
    }

    @JsonProperty("threeMonth")
    public void setThreeMonth(ThreeMonth__1 threeMonth) {
        this.threeMonth = threeMonth;
    }

    @JsonProperty("oneYear")
    public OneYear__1 getOneYear() {
        return oneYear;
    }

    @JsonProperty("oneYear")
    public void setOneYear(OneYear__1 oneYear) {
        this.oneYear = oneYear;
    }

    @JsonProperty("ytd")
    public Ytd__1 getYtd() {
        return ytd;
    }

    @JsonProperty("ytd")
    public void setYtd(Ytd__1 ytd) {
        this.ytd = ytd;
    }

    @JsonProperty("lastBearMkt")
    public LastBearMkt__1 getLastBearMkt() {
        return lastBearMkt;
    }

    @JsonProperty("lastBearMkt")
    public void setLastBearMkt(LastBearMkt__1 lastBearMkt) {
        this.lastBearMkt = lastBearMkt;
    }

    @JsonProperty("lastBullMkt")
    public LastBullMkt__1 getLastBullMkt() {
        return lastBullMkt;
    }

    @JsonProperty("lastBullMkt")
    public void setLastBullMkt(LastBullMkt__1 lastBullMkt) {
        this.lastBullMkt = lastBullMkt;
    }

    @JsonProperty("fiveYear")
    public FiveYear__1 getFiveYear() {
        return fiveYear;
    }

    @JsonProperty("fiveYear")
    public void setFiveYear(FiveYear__1 fiveYear) {
        this.fiveYear = fiveYear;
    }

    @JsonProperty("tenYear")
    public TenYear__1 getTenYear() {
        return tenYear;
    }

    @JsonProperty("tenYear")
    public void setTenYear(TenYear__1 tenYear) {
        this.tenYear = tenYear;
    }

    @JsonProperty("oneMonth")
    public OneMonth__1 getOneMonth() {
        return oneMonth;
    }

    @JsonProperty("oneMonth")
    public void setOneMonth(OneMonth__1 oneMonth) {
        this.oneMonth = oneMonth;
    }

    @JsonProperty("threeYear")
    public ThreeYear__1 getThreeYear() {
        return threeYear;
    }

    @JsonProperty("threeYear")
    public void setThreeYear(ThreeYear__1 threeYear) {
        this.threeYear = threeYear;
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
        sb.append(TrailingReturnsCat.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("threeMonth");
        sb.append('=');
        sb.append(((this.threeMonth == null)?"<null>":this.threeMonth));
        sb.append(',');
        sb.append("oneYear");
        sb.append('=');
        sb.append(((this.oneYear == null)?"<null>":this.oneYear));
        sb.append(',');
        sb.append("ytd");
        sb.append('=');
        sb.append(((this.ytd == null)?"<null>":this.ytd));
        sb.append(',');
        sb.append("lastBearMkt");
        sb.append('=');
        sb.append(((this.lastBearMkt == null)?"<null>":this.lastBearMkt));
        sb.append(',');
        sb.append("lastBullMkt");
        sb.append('=');
        sb.append(((this.lastBullMkt == null)?"<null>":this.lastBullMkt));
        sb.append(',');
        sb.append("fiveYear");
        sb.append('=');
        sb.append(((this.fiveYear == null)?"<null>":this.fiveYear));
        sb.append(',');
        sb.append("tenYear");
        sb.append('=');
        sb.append(((this.tenYear == null)?"<null>":this.tenYear));
        sb.append(',');
        sb.append("oneMonth");
        sb.append('=');
        sb.append(((this.oneMonth == null)?"<null>":this.oneMonth));
        sb.append(',');
        sb.append("threeYear");
        sb.append('=');
        sb.append(((this.threeYear == null)?"<null>":this.threeYear));
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
        result = ((result* 31)+((this.oneMonth == null)? 0 :this.oneMonth.hashCode()));
        result = ((result* 31)+((this.oneYear == null)? 0 :this.oneYear.hashCode()));
        result = ((result* 31)+((this.fiveYear == null)? 0 :this.fiveYear.hashCode()));
        result = ((result* 31)+((this.lastBullMkt == null)? 0 :this.lastBullMkt.hashCode()));
        result = ((result* 31)+((this.threeMonth == null)? 0 :this.threeMonth.hashCode()));
        result = ((result* 31)+((this.ytd == null)? 0 :this.ytd.hashCode()));
        result = ((result* 31)+((this.lastBearMkt == null)? 0 :this.lastBearMkt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tenYear == null)? 0 :this.tenYear.hashCode()));
        result = ((result* 31)+((this.threeYear == null)? 0 :this.threeYear.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrailingReturnsCat) == false) {
            return false;
        }
        TrailingReturnsCat rhs = ((TrailingReturnsCat) other);
        return (((((((((((this.oneMonth == rhs.oneMonth)||((this.oneMonth!= null)&&this.oneMonth.equals(rhs.oneMonth)))&&((this.oneYear == rhs.oneYear)||((this.oneYear!= null)&&this.oneYear.equals(rhs.oneYear))))&&((this.fiveYear == rhs.fiveYear)||((this.fiveYear!= null)&&this.fiveYear.equals(rhs.fiveYear))))&&((this.lastBullMkt == rhs.lastBullMkt)||((this.lastBullMkt!= null)&&this.lastBullMkt.equals(rhs.lastBullMkt))))&&((this.threeMonth == rhs.threeMonth)||((this.threeMonth!= null)&&this.threeMonth.equals(rhs.threeMonth))))&&((this.ytd == rhs.ytd)||((this.ytd!= null)&&this.ytd.equals(rhs.ytd))))&&((this.lastBearMkt == rhs.lastBearMkt)||((this.lastBearMkt!= null)&&this.lastBearMkt.equals(rhs.lastBearMkt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tenYear == rhs.tenYear)||((this.tenYear!= null)&&this.tenYear.equals(rhs.tenYear))))&&((this.threeYear == rhs.threeYear)||((this.threeYear!= null)&&this.threeYear.equals(rhs.threeYear))));
    }

}
