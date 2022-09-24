
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
    "bestThreeYrTotalReturn",
    "morningStarReturnRating",
    "ytdReturnPct",
    "fiveYrAvgReturnPct",
    "numYearsUp",
    "worstOneYrTotalReturn",
    "oneYearTotalReturn",
    "numYearsDown",
    "asOfDate",
    "worstThreeYrTotalReturn",
    "bestOneYrTotalReturn",
    "threeYearTotalReturn"
})
public class PerformanceOverview {

    @JsonProperty("bestThreeYrTotalReturn")
    private BestThreeYrTotalReturn bestThreeYrTotalReturn;
    @JsonProperty("morningStarReturnRating")
    private MorningStarReturnRating morningStarReturnRating;
    @JsonProperty("ytdReturnPct")
    private YtdReturnPct ytdReturnPct;
    @JsonProperty("fiveYrAvgReturnPct")
    private FiveYrAvgReturnPct fiveYrAvgReturnPct;
    @JsonProperty("numYearsUp")
    private NumYearsUp numYearsUp;
    @JsonProperty("worstOneYrTotalReturn")
    private WorstOneYrTotalReturn worstOneYrTotalReturn;
    @JsonProperty("oneYearTotalReturn")
    private OneYearTotalReturn oneYearTotalReturn;
    @JsonProperty("numYearsDown")
    private NumYearsDown numYearsDown;
    @JsonProperty("asOfDate")
    private AsOfDate__1 asOfDate;
    @JsonProperty("worstThreeYrTotalReturn")
    private WorstThreeYrTotalReturn worstThreeYrTotalReturn;
    @JsonProperty("bestOneYrTotalReturn")
    private BestOneYrTotalReturn bestOneYrTotalReturn;
    @JsonProperty("threeYearTotalReturn")
    private ThreeYearTotalReturn threeYearTotalReturn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bestThreeYrTotalReturn")
    public BestThreeYrTotalReturn getBestThreeYrTotalReturn() {
        return bestThreeYrTotalReturn;
    }

    @JsonProperty("bestThreeYrTotalReturn")
    public void setBestThreeYrTotalReturn(BestThreeYrTotalReturn bestThreeYrTotalReturn) {
        this.bestThreeYrTotalReturn = bestThreeYrTotalReturn;
    }

    @JsonProperty("morningStarReturnRating")
    public MorningStarReturnRating getMorningStarReturnRating() {
        return morningStarReturnRating;
    }

    @JsonProperty("morningStarReturnRating")
    public void setMorningStarReturnRating(MorningStarReturnRating morningStarReturnRating) {
        this.morningStarReturnRating = morningStarReturnRating;
    }

    @JsonProperty("ytdReturnPct")
    public YtdReturnPct getYtdReturnPct() {
        return ytdReturnPct;
    }

    @JsonProperty("ytdReturnPct")
    public void setYtdReturnPct(YtdReturnPct ytdReturnPct) {
        this.ytdReturnPct = ytdReturnPct;
    }

    @JsonProperty("fiveYrAvgReturnPct")
    public FiveYrAvgReturnPct getFiveYrAvgReturnPct() {
        return fiveYrAvgReturnPct;
    }

    @JsonProperty("fiveYrAvgReturnPct")
    public void setFiveYrAvgReturnPct(FiveYrAvgReturnPct fiveYrAvgReturnPct) {
        this.fiveYrAvgReturnPct = fiveYrAvgReturnPct;
    }

    @JsonProperty("numYearsUp")
    public NumYearsUp getNumYearsUp() {
        return numYearsUp;
    }

    @JsonProperty("numYearsUp")
    public void setNumYearsUp(NumYearsUp numYearsUp) {
        this.numYearsUp = numYearsUp;
    }

    @JsonProperty("worstOneYrTotalReturn")
    public WorstOneYrTotalReturn getWorstOneYrTotalReturn() {
        return worstOneYrTotalReturn;
    }

    @JsonProperty("worstOneYrTotalReturn")
    public void setWorstOneYrTotalReturn(WorstOneYrTotalReturn worstOneYrTotalReturn) {
        this.worstOneYrTotalReturn = worstOneYrTotalReturn;
    }

    @JsonProperty("oneYearTotalReturn")
    public OneYearTotalReturn getOneYearTotalReturn() {
        return oneYearTotalReturn;
    }

    @JsonProperty("oneYearTotalReturn")
    public void setOneYearTotalReturn(OneYearTotalReturn oneYearTotalReturn) {
        this.oneYearTotalReturn = oneYearTotalReturn;
    }

    @JsonProperty("numYearsDown")
    public NumYearsDown getNumYearsDown() {
        return numYearsDown;
    }

    @JsonProperty("numYearsDown")
    public void setNumYearsDown(NumYearsDown numYearsDown) {
        this.numYearsDown = numYearsDown;
    }

    @JsonProperty("asOfDate")
    public AsOfDate__1 getAsOfDate() {
        return asOfDate;
    }

    @JsonProperty("asOfDate")
    public void setAsOfDate(AsOfDate__1 asOfDate) {
        this.asOfDate = asOfDate;
    }

    @JsonProperty("worstThreeYrTotalReturn")
    public WorstThreeYrTotalReturn getWorstThreeYrTotalReturn() {
        return worstThreeYrTotalReturn;
    }

    @JsonProperty("worstThreeYrTotalReturn")
    public void setWorstThreeYrTotalReturn(WorstThreeYrTotalReturn worstThreeYrTotalReturn) {
        this.worstThreeYrTotalReturn = worstThreeYrTotalReturn;
    }

    @JsonProperty("bestOneYrTotalReturn")
    public BestOneYrTotalReturn getBestOneYrTotalReturn() {
        return bestOneYrTotalReturn;
    }

    @JsonProperty("bestOneYrTotalReturn")
    public void setBestOneYrTotalReturn(BestOneYrTotalReturn bestOneYrTotalReturn) {
        this.bestOneYrTotalReturn = bestOneYrTotalReturn;
    }

    @JsonProperty("threeYearTotalReturn")
    public ThreeYearTotalReturn getThreeYearTotalReturn() {
        return threeYearTotalReturn;
    }

    @JsonProperty("threeYearTotalReturn")
    public void setThreeYearTotalReturn(ThreeYearTotalReturn threeYearTotalReturn) {
        this.threeYearTotalReturn = threeYearTotalReturn;
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
        sb.append(PerformanceOverview.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bestThreeYrTotalReturn");
        sb.append('=');
        sb.append(((this.bestThreeYrTotalReturn == null)?"<null>":this.bestThreeYrTotalReturn));
        sb.append(',');
        sb.append("morningStarReturnRating");
        sb.append('=');
        sb.append(((this.morningStarReturnRating == null)?"<null>":this.morningStarReturnRating));
        sb.append(',');
        sb.append("ytdReturnPct");
        sb.append('=');
        sb.append(((this.ytdReturnPct == null)?"<null>":this.ytdReturnPct));
        sb.append(',');
        sb.append("fiveYrAvgReturnPct");
        sb.append('=');
        sb.append(((this.fiveYrAvgReturnPct == null)?"<null>":this.fiveYrAvgReturnPct));
        sb.append(',');
        sb.append("numYearsUp");
        sb.append('=');
        sb.append(((this.numYearsUp == null)?"<null>":this.numYearsUp));
        sb.append(',');
        sb.append("worstOneYrTotalReturn");
        sb.append('=');
        sb.append(((this.worstOneYrTotalReturn == null)?"<null>":this.worstOneYrTotalReturn));
        sb.append(',');
        sb.append("oneYearTotalReturn");
        sb.append('=');
        sb.append(((this.oneYearTotalReturn == null)?"<null>":this.oneYearTotalReturn));
        sb.append(',');
        sb.append("numYearsDown");
        sb.append('=');
        sb.append(((this.numYearsDown == null)?"<null>":this.numYearsDown));
        sb.append(',');
        sb.append("asOfDate");
        sb.append('=');
        sb.append(((this.asOfDate == null)?"<null>":this.asOfDate));
        sb.append(',');
        sb.append("worstThreeYrTotalReturn");
        sb.append('=');
        sb.append(((this.worstThreeYrTotalReturn == null)?"<null>":this.worstThreeYrTotalReturn));
        sb.append(',');
        sb.append("bestOneYrTotalReturn");
        sb.append('=');
        sb.append(((this.bestOneYrTotalReturn == null)?"<null>":this.bestOneYrTotalReturn));
        sb.append(',');
        sb.append("threeYearTotalReturn");
        sb.append('=');
        sb.append(((this.threeYearTotalReturn == null)?"<null>":this.threeYearTotalReturn));
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
        result = ((result* 31)+((this.morningStarReturnRating == null)? 0 :this.morningStarReturnRating.hashCode()));
        result = ((result* 31)+((this.numYearsDown == null)? 0 :this.numYearsDown.hashCode()));
        result = ((result* 31)+((this.bestThreeYrTotalReturn == null)? 0 :this.bestThreeYrTotalReturn.hashCode()));
        result = ((result* 31)+((this.numYearsUp == null)? 0 :this.numYearsUp.hashCode()));
        result = ((result* 31)+((this.oneYearTotalReturn == null)? 0 :this.oneYearTotalReturn.hashCode()));
        result = ((result* 31)+((this.threeYearTotalReturn == null)? 0 :this.threeYearTotalReturn.hashCode()));
        result = ((result* 31)+((this.worstThreeYrTotalReturn == null)? 0 :this.worstThreeYrTotalReturn.hashCode()));
        result = ((result* 31)+((this.bestOneYrTotalReturn == null)? 0 :this.bestOneYrTotalReturn.hashCode()));
        result = ((result* 31)+((this.ytdReturnPct == null)? 0 :this.ytdReturnPct.hashCode()));
        result = ((result* 31)+((this.worstOneYrTotalReturn == null)? 0 :this.worstOneYrTotalReturn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.asOfDate == null)? 0 :this.asOfDate.hashCode()));
        result = ((result* 31)+((this.fiveYrAvgReturnPct == null)? 0 :this.fiveYrAvgReturnPct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PerformanceOverview) == false) {
            return false;
        }
        PerformanceOverview rhs = ((PerformanceOverview) other);
        return ((((((((((((((this.morningStarReturnRating == rhs.morningStarReturnRating)||((this.morningStarReturnRating!= null)&&this.morningStarReturnRating.equals(rhs.morningStarReturnRating)))&&((this.numYearsDown == rhs.numYearsDown)||((this.numYearsDown!= null)&&this.numYearsDown.equals(rhs.numYearsDown))))&&((this.bestThreeYrTotalReturn == rhs.bestThreeYrTotalReturn)||((this.bestThreeYrTotalReturn!= null)&&this.bestThreeYrTotalReturn.equals(rhs.bestThreeYrTotalReturn))))&&((this.numYearsUp == rhs.numYearsUp)||((this.numYearsUp!= null)&&this.numYearsUp.equals(rhs.numYearsUp))))&&((this.oneYearTotalReturn == rhs.oneYearTotalReturn)||((this.oneYearTotalReturn!= null)&&this.oneYearTotalReturn.equals(rhs.oneYearTotalReturn))))&&((this.threeYearTotalReturn == rhs.threeYearTotalReturn)||((this.threeYearTotalReturn!= null)&&this.threeYearTotalReturn.equals(rhs.threeYearTotalReturn))))&&((this.worstThreeYrTotalReturn == rhs.worstThreeYrTotalReturn)||((this.worstThreeYrTotalReturn!= null)&&this.worstThreeYrTotalReturn.equals(rhs.worstThreeYrTotalReturn))))&&((this.bestOneYrTotalReturn == rhs.bestOneYrTotalReturn)||((this.bestOneYrTotalReturn!= null)&&this.bestOneYrTotalReturn.equals(rhs.bestOneYrTotalReturn))))&&((this.ytdReturnPct == rhs.ytdReturnPct)||((this.ytdReturnPct!= null)&&this.ytdReturnPct.equals(rhs.ytdReturnPct))))&&((this.worstOneYrTotalReturn == rhs.worstOneYrTotalReturn)||((this.worstOneYrTotalReturn!= null)&&this.worstOneYrTotalReturn.equals(rhs.worstOneYrTotalReturn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.asOfDate == rhs.asOfDate)||((this.asOfDate!= null)&&this.asOfDate.equals(rhs.asOfDate))))&&((this.fiveYrAvgReturnPct == rhs.fiveYrAvgReturnPct)||((this.fiveYrAvgReturnPct!= null)&&this.fiveYrAvgReturnPct.equals(rhs.fiveYrAvgReturnPct))));
    }

}
