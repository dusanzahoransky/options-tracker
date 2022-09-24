
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
    "numYearsDown",
    "asOfDate",
    "worstThreeYrTotalReturn",
    "bestOneYrTotalReturn"
})
public class PerformanceOverviewCat {

    @JsonProperty("bestThreeYrTotalReturn")
    private BestThreeYrTotalReturn__1 bestThreeYrTotalReturn;
    @JsonProperty("morningStarReturnRating")
    private MorningStarReturnRating__1 morningStarReturnRating;
    @JsonProperty("ytdReturnPct")
    private YtdReturnPct__1 ytdReturnPct;
    @JsonProperty("fiveYrAvgReturnPct")
    private FiveYrAvgReturnPct__1 fiveYrAvgReturnPct;
    @JsonProperty("numYearsUp")
    private NumYearsUp__1 numYearsUp;
    @JsonProperty("worstOneYrTotalReturn")
    private WorstOneYrTotalReturn__1 worstOneYrTotalReturn;
    @JsonProperty("numYearsDown")
    private NumYearsDown__1 numYearsDown;
    @JsonProperty("asOfDate")
    private AsOfDate__2 asOfDate;
    @JsonProperty("worstThreeYrTotalReturn")
    private WorstThreeYrTotalReturn__1 worstThreeYrTotalReturn;
    @JsonProperty("bestOneYrTotalReturn")
    private BestOneYrTotalReturn__1 bestOneYrTotalReturn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bestThreeYrTotalReturn")
    public BestThreeYrTotalReturn__1 getBestThreeYrTotalReturn() {
        return bestThreeYrTotalReturn;
    }

    @JsonProperty("bestThreeYrTotalReturn")
    public void setBestThreeYrTotalReturn(BestThreeYrTotalReturn__1 bestThreeYrTotalReturn) {
        this.bestThreeYrTotalReturn = bestThreeYrTotalReturn;
    }

    @JsonProperty("morningStarReturnRating")
    public MorningStarReturnRating__1 getMorningStarReturnRating() {
        return morningStarReturnRating;
    }

    @JsonProperty("morningStarReturnRating")
    public void setMorningStarReturnRating(MorningStarReturnRating__1 morningStarReturnRating) {
        this.morningStarReturnRating = morningStarReturnRating;
    }

    @JsonProperty("ytdReturnPct")
    public YtdReturnPct__1 getYtdReturnPct() {
        return ytdReturnPct;
    }

    @JsonProperty("ytdReturnPct")
    public void setYtdReturnPct(YtdReturnPct__1 ytdReturnPct) {
        this.ytdReturnPct = ytdReturnPct;
    }

    @JsonProperty("fiveYrAvgReturnPct")
    public FiveYrAvgReturnPct__1 getFiveYrAvgReturnPct() {
        return fiveYrAvgReturnPct;
    }

    @JsonProperty("fiveYrAvgReturnPct")
    public void setFiveYrAvgReturnPct(FiveYrAvgReturnPct__1 fiveYrAvgReturnPct) {
        this.fiveYrAvgReturnPct = fiveYrAvgReturnPct;
    }

    @JsonProperty("numYearsUp")
    public NumYearsUp__1 getNumYearsUp() {
        return numYearsUp;
    }

    @JsonProperty("numYearsUp")
    public void setNumYearsUp(NumYearsUp__1 numYearsUp) {
        this.numYearsUp = numYearsUp;
    }

    @JsonProperty("worstOneYrTotalReturn")
    public WorstOneYrTotalReturn__1 getWorstOneYrTotalReturn() {
        return worstOneYrTotalReturn;
    }

    @JsonProperty("worstOneYrTotalReturn")
    public void setWorstOneYrTotalReturn(WorstOneYrTotalReturn__1 worstOneYrTotalReturn) {
        this.worstOneYrTotalReturn = worstOneYrTotalReturn;
    }

    @JsonProperty("numYearsDown")
    public NumYearsDown__1 getNumYearsDown() {
        return numYearsDown;
    }

    @JsonProperty("numYearsDown")
    public void setNumYearsDown(NumYearsDown__1 numYearsDown) {
        this.numYearsDown = numYearsDown;
    }

    @JsonProperty("asOfDate")
    public AsOfDate__2 getAsOfDate() {
        return asOfDate;
    }

    @JsonProperty("asOfDate")
    public void setAsOfDate(AsOfDate__2 asOfDate) {
        this.asOfDate = asOfDate;
    }

    @JsonProperty("worstThreeYrTotalReturn")
    public WorstThreeYrTotalReturn__1 getWorstThreeYrTotalReturn() {
        return worstThreeYrTotalReturn;
    }

    @JsonProperty("worstThreeYrTotalReturn")
    public void setWorstThreeYrTotalReturn(WorstThreeYrTotalReturn__1 worstThreeYrTotalReturn) {
        this.worstThreeYrTotalReturn = worstThreeYrTotalReturn;
    }

    @JsonProperty("bestOneYrTotalReturn")
    public BestOneYrTotalReturn__1 getBestOneYrTotalReturn() {
        return bestOneYrTotalReturn;
    }

    @JsonProperty("bestOneYrTotalReturn")
    public void setBestOneYrTotalReturn(BestOneYrTotalReturn__1 bestOneYrTotalReturn) {
        this.bestOneYrTotalReturn = bestOneYrTotalReturn;
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
        sb.append(PerformanceOverviewCat.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.worstThreeYrTotalReturn == null)? 0 :this.worstThreeYrTotalReturn.hashCode()));
        result = ((result* 31)+((this.bestOneYrTotalReturn == null)? 0 :this.bestOneYrTotalReturn.hashCode()));
        result = ((result* 31)+((this.ytdReturnPct == null)? 0 :this.ytdReturnPct.hashCode()));
        result = ((result* 31)+((this.worstOneYrTotalReturn == null)? 0 :this.worstOneYrTotalReturn.hashCode()));
        result = ((result* 31)+((this.numYearsDown == null)? 0 :this.numYearsDown.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.asOfDate == null)? 0 :this.asOfDate.hashCode()));
        result = ((result* 31)+((this.bestThreeYrTotalReturn == null)? 0 :this.bestThreeYrTotalReturn.hashCode()));
        result = ((result* 31)+((this.numYearsUp == null)? 0 :this.numYearsUp.hashCode()));
        result = ((result* 31)+((this.fiveYrAvgReturnPct == null)? 0 :this.fiveYrAvgReturnPct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PerformanceOverviewCat) == false) {
            return false;
        }
        PerformanceOverviewCat rhs = ((PerformanceOverviewCat) other);
        return ((((((((((((this.morningStarReturnRating == rhs.morningStarReturnRating)||((this.morningStarReturnRating!= null)&&this.morningStarReturnRating.equals(rhs.morningStarReturnRating)))&&((this.worstThreeYrTotalReturn == rhs.worstThreeYrTotalReturn)||((this.worstThreeYrTotalReturn!= null)&&this.worstThreeYrTotalReturn.equals(rhs.worstThreeYrTotalReturn))))&&((this.bestOneYrTotalReturn == rhs.bestOneYrTotalReturn)||((this.bestOneYrTotalReturn!= null)&&this.bestOneYrTotalReturn.equals(rhs.bestOneYrTotalReturn))))&&((this.ytdReturnPct == rhs.ytdReturnPct)||((this.ytdReturnPct!= null)&&this.ytdReturnPct.equals(rhs.ytdReturnPct))))&&((this.worstOneYrTotalReturn == rhs.worstOneYrTotalReturn)||((this.worstOneYrTotalReturn!= null)&&this.worstOneYrTotalReturn.equals(rhs.worstOneYrTotalReturn))))&&((this.numYearsDown == rhs.numYearsDown)||((this.numYearsDown!= null)&&this.numYearsDown.equals(rhs.numYearsDown))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.asOfDate == rhs.asOfDate)||((this.asOfDate!= null)&&this.asOfDate.equals(rhs.asOfDate))))&&((this.bestThreeYrTotalReturn == rhs.bestThreeYrTotalReturn)||((this.bestThreeYrTotalReturn!= null)&&this.bestThreeYrTotalReturn.equals(rhs.bestThreeYrTotalReturn))))&&((this.numYearsUp == rhs.numYearsUp)||((this.numYearsUp!= null)&&this.numYearsUp.equals(rhs.numYearsUp))))&&((this.fiveYrAvgReturnPct == rhs.fiveYrAvgReturnPct)||((this.fiveYrAvgReturnPct!= null)&&this.fiveYrAvgReturnPct.equals(rhs.fiveYrAvgReturnPct))));
    }

}
