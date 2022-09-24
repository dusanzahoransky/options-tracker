
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
    "ytd",
    "oneMonth",
    "threeMonth",
    "oneYear",
    "threeYear",
    "fiveYear",
    "tenYear"
})
public class TrailingReturnsNav {

    @JsonProperty("ytd")
    private Ytd__2 ytd;
    @JsonProperty("oneMonth")
    private OneMonth__2 oneMonth;
    @JsonProperty("threeMonth")
    private ThreeMonth__2 threeMonth;
    @JsonProperty("oneYear")
    private OneYear__2 oneYear;
    @JsonProperty("threeYear")
    private ThreeYear__2 threeYear;
    @JsonProperty("fiveYear")
    private FiveYear__2 fiveYear;
    @JsonProperty("tenYear")
    private TenYear__2 tenYear;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ytd")
    public Ytd__2 getYtd() {
        return ytd;
    }

    @JsonProperty("ytd")
    public void setYtd(Ytd__2 ytd) {
        this.ytd = ytd;
    }

    @JsonProperty("oneMonth")
    public OneMonth__2 getOneMonth() {
        return oneMonth;
    }

    @JsonProperty("oneMonth")
    public void setOneMonth(OneMonth__2 oneMonth) {
        this.oneMonth = oneMonth;
    }

    @JsonProperty("threeMonth")
    public ThreeMonth__2 getThreeMonth() {
        return threeMonth;
    }

    @JsonProperty("threeMonth")
    public void setThreeMonth(ThreeMonth__2 threeMonth) {
        this.threeMonth = threeMonth;
    }

    @JsonProperty("oneYear")
    public OneYear__2 getOneYear() {
        return oneYear;
    }

    @JsonProperty("oneYear")
    public void setOneYear(OneYear__2 oneYear) {
        this.oneYear = oneYear;
    }

    @JsonProperty("threeYear")
    public ThreeYear__2 getThreeYear() {
        return threeYear;
    }

    @JsonProperty("threeYear")
    public void setThreeYear(ThreeYear__2 threeYear) {
        this.threeYear = threeYear;
    }

    @JsonProperty("fiveYear")
    public FiveYear__2 getFiveYear() {
        return fiveYear;
    }

    @JsonProperty("fiveYear")
    public void setFiveYear(FiveYear__2 fiveYear) {
        this.fiveYear = fiveYear;
    }

    @JsonProperty("tenYear")
    public TenYear__2 getTenYear() {
        return tenYear;
    }

    @JsonProperty("tenYear")
    public void setTenYear(TenYear__2 tenYear) {
        this.tenYear = tenYear;
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
        sb.append(TrailingReturnsNav.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ytd");
        sb.append('=');
        sb.append(((this.ytd == null)?"<null>":this.ytd));
        sb.append(',');
        sb.append("oneMonth");
        sb.append('=');
        sb.append(((this.oneMonth == null)?"<null>":this.oneMonth));
        sb.append(',');
        sb.append("threeMonth");
        sb.append('=');
        sb.append(((this.threeMonth == null)?"<null>":this.threeMonth));
        sb.append(',');
        sb.append("oneYear");
        sb.append('=');
        sb.append(((this.oneYear == null)?"<null>":this.oneYear));
        sb.append(',');
        sb.append("threeYear");
        sb.append('=');
        sb.append(((this.threeYear == null)?"<null>":this.threeYear));
        sb.append(',');
        sb.append("fiveYear");
        sb.append('=');
        sb.append(((this.fiveYear == null)?"<null>":this.fiveYear));
        sb.append(',');
        sb.append("tenYear");
        sb.append('=');
        sb.append(((this.tenYear == null)?"<null>":this.tenYear));
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
        result = ((result* 31)+((this.ytd == null)? 0 :this.ytd.hashCode()));
        result = ((result* 31)+((this.threeMonth == null)? 0 :this.threeMonth.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.threeYear == null)? 0 :this.threeYear.hashCode()));
        result = ((result* 31)+((this.tenYear == null)? 0 :this.tenYear.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrailingReturnsNav) == false) {
            return false;
        }
        TrailingReturnsNav rhs = ((TrailingReturnsNav) other);
        return (((((((((this.oneMonth == rhs.oneMonth)||((this.oneMonth!= null)&&this.oneMonth.equals(rhs.oneMonth)))&&((this.oneYear == rhs.oneYear)||((this.oneYear!= null)&&this.oneYear.equals(rhs.oneYear))))&&((this.fiveYear == rhs.fiveYear)||((this.fiveYear!= null)&&this.fiveYear.equals(rhs.fiveYear))))&&((this.ytd == rhs.ytd)||((this.ytd!= null)&&this.ytd.equals(rhs.ytd))))&&((this.threeMonth == rhs.threeMonth)||((this.threeMonth!= null)&&this.threeMonth.equals(rhs.threeMonth))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.threeYear == rhs.threeYear)||((this.threeYear!= null)&&this.threeYear.equals(rhs.threeYear))))&&((this.tenYear == rhs.tenYear)||((this.tenYear!= null)&&this.tenYear.equals(rhs.tenYear))));
    }

}
