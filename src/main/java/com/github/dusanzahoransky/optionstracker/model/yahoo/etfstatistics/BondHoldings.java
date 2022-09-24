
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
    "maturity",
    "duration",
    "creditQuality",
    "maturityCat",
    "durationCat",
    "creditQualityCat"
})
public class BondHoldings {

    @JsonProperty("maturity")
    private Maturity maturity;
    @JsonProperty("duration")
    private Duration duration;
    @JsonProperty("creditQuality")
    private CreditQuality creditQuality;
    @JsonProperty("maturityCat")
    private MaturityCat maturityCat;
    @JsonProperty("durationCat")
    private DurationCat durationCat;
    @JsonProperty("creditQualityCat")
    private CreditQualityCat creditQualityCat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maturity")
    public Maturity getMaturity() {
        return maturity;
    }

    @JsonProperty("maturity")
    public void setMaturity(Maturity maturity) {
        this.maturity = maturity;
    }

    @JsonProperty("duration")
    public Duration getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @JsonProperty("creditQuality")
    public CreditQuality getCreditQuality() {
        return creditQuality;
    }

    @JsonProperty("creditQuality")
    public void setCreditQuality(CreditQuality creditQuality) {
        this.creditQuality = creditQuality;
    }

    @JsonProperty("maturityCat")
    public MaturityCat getMaturityCat() {
        return maturityCat;
    }

    @JsonProperty("maturityCat")
    public void setMaturityCat(MaturityCat maturityCat) {
        this.maturityCat = maturityCat;
    }

    @JsonProperty("durationCat")
    public DurationCat getDurationCat() {
        return durationCat;
    }

    @JsonProperty("durationCat")
    public void setDurationCat(DurationCat durationCat) {
        this.durationCat = durationCat;
    }

    @JsonProperty("creditQualityCat")
    public CreditQualityCat getCreditQualityCat() {
        return creditQualityCat;
    }

    @JsonProperty("creditQualityCat")
    public void setCreditQualityCat(CreditQualityCat creditQualityCat) {
        this.creditQualityCat = creditQualityCat;
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
        sb.append(BondHoldings.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maturity");
        sb.append('=');
        sb.append(((this.maturity == null)?"<null>":this.maturity));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("creditQuality");
        sb.append('=');
        sb.append(((this.creditQuality == null)?"<null>":this.creditQuality));
        sb.append(',');
        sb.append("maturityCat");
        sb.append('=');
        sb.append(((this.maturityCat == null)?"<null>":this.maturityCat));
        sb.append(',');
        sb.append("durationCat");
        sb.append('=');
        sb.append(((this.durationCat == null)?"<null>":this.durationCat));
        sb.append(',');
        sb.append("creditQualityCat");
        sb.append('=');
        sb.append(((this.creditQualityCat == null)?"<null>":this.creditQualityCat));
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
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.durationCat == null)? 0 :this.durationCat.hashCode()));
        result = ((result* 31)+((this.creditQuality == null)? 0 :this.creditQuality.hashCode()));
        result = ((result* 31)+((this.maturity == null)? 0 :this.maturity.hashCode()));
        result = ((result* 31)+((this.maturityCat == null)? 0 :this.maturityCat.hashCode()));
        result = ((result* 31)+((this.creditQualityCat == null)? 0 :this.creditQualityCat.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BondHoldings) == false) {
            return false;
        }
        BondHoldings rhs = ((BondHoldings) other);
        return ((((((((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration)))&&((this.durationCat == rhs.durationCat)||((this.durationCat!= null)&&this.durationCat.equals(rhs.durationCat))))&&((this.creditQuality == rhs.creditQuality)||((this.creditQuality!= null)&&this.creditQuality.equals(rhs.creditQuality))))&&((this.maturity == rhs.maturity)||((this.maturity!= null)&&this.maturity.equals(rhs.maturity))))&&((this.maturityCat == rhs.maturityCat)||((this.maturityCat!= null)&&this.maturityCat.equals(rhs.maturityCat))))&&((this.creditQualityCat == rhs.creditQualityCat)||((this.creditQualityCat!= null)&&this.creditQualityCat.equals(rhs.creditQualityCat))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
