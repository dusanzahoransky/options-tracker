
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
    "bb",
    "aa",
    "aaa",
    "a",
    "other",
    "b",
    "bbb",
    "below_b",
    "us_government"
})
public class BondRating {

    @JsonProperty("bb")
    private Bb bb;
    @JsonProperty("aa")
    private Aa aa;
    @JsonProperty("aaa")
    private Aaa aaa;
    @JsonProperty("a")
    private A a;
    @JsonProperty("other")
    private Other other;
    @JsonProperty("b")
    private B b;
    @JsonProperty("bbb")
    private Bbb bbb;
    @JsonProperty("below_b")
    private BelowB belowB;
    @JsonProperty("us_government")
    private UsGovernment usGovernment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bb")
    public Bb getBb() {
        return bb;
    }

    @JsonProperty("bb")
    public void setBb(Bb bb) {
        this.bb = bb;
    }

    @JsonProperty("aa")
    public Aa getAa() {
        return aa;
    }

    @JsonProperty("aa")
    public void setAa(Aa aa) {
        this.aa = aa;
    }

    @JsonProperty("aaa")
    public Aaa getAaa() {
        return aaa;
    }

    @JsonProperty("aaa")
    public void setAaa(Aaa aaa) {
        this.aaa = aaa;
    }

    @JsonProperty("a")
    public A getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(A a) {
        this.a = a;
    }

    @JsonProperty("other")
    public Other getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(Other other) {
        this.other = other;
    }

    @JsonProperty("b")
    public B getB() {
        return b;
    }

    @JsonProperty("b")
    public void setB(B b) {
        this.b = b;
    }

    @JsonProperty("bbb")
    public Bbb getBbb() {
        return bbb;
    }

    @JsonProperty("bbb")
    public void setBbb(Bbb bbb) {
        this.bbb = bbb;
    }

    @JsonProperty("below_b")
    public BelowB getBelowB() {
        return belowB;
    }

    @JsonProperty("below_b")
    public void setBelowB(BelowB belowB) {
        this.belowB = belowB;
    }

    @JsonProperty("us_government")
    public UsGovernment getUsGovernment() {
        return usGovernment;
    }

    @JsonProperty("us_government")
    public void setUsGovernment(UsGovernment usGovernment) {
        this.usGovernment = usGovernment;
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
        sb.append(BondRating.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bb");
        sb.append('=');
        sb.append(((this.bb == null)?"<null>":this.bb));
        sb.append(',');
        sb.append("aa");
        sb.append('=');
        sb.append(((this.aa == null)?"<null>":this.aa));
        sb.append(',');
        sb.append("aaa");
        sb.append('=');
        sb.append(((this.aaa == null)?"<null>":this.aaa));
        sb.append(',');
        sb.append("a");
        sb.append('=');
        sb.append(((this.a == null)?"<null>":this.a));
        sb.append(',');
        sb.append("other");
        sb.append('=');
        sb.append(((this.other == null)?"<null>":this.other));
        sb.append(',');
        sb.append("b");
        sb.append('=');
        sb.append(((this.b == null)?"<null>":this.b));
        sb.append(',');
        sb.append("bbb");
        sb.append('=');
        sb.append(((this.bbb == null)?"<null>":this.bbb));
        sb.append(',');
        sb.append("belowB");
        sb.append('=');
        sb.append(((this.belowB == null)?"<null>":this.belowB));
        sb.append(',');
        sb.append("usGovernment");
        sb.append('=');
        sb.append(((this.usGovernment == null)?"<null>":this.usGovernment));
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
        result = ((result* 31)+((this.bb == null)? 0 :this.bb.hashCode()));
        result = ((result* 31)+((this.aa == null)? 0 :this.aa.hashCode()));
        result = ((result* 31)+((this.aaa == null)? 0 :this.aaa.hashCode()));
        result = ((result* 31)+((this.a == null)? 0 :this.a.hashCode()));
        result = ((result* 31)+((this.other == null)? 0 :this.other.hashCode()));
        result = ((result* 31)+((this.b == null)? 0 :this.b.hashCode()));
        result = ((result* 31)+((this.bbb == null)? 0 :this.bbb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.belowB == null)? 0 :this.belowB.hashCode()));
        result = ((result* 31)+((this.usGovernment == null)? 0 :this.usGovernment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BondRating) == false) {
            return false;
        }
        BondRating rhs = ((BondRating) other);
        return (((((((((((this.bb == rhs.bb)||((this.bb!= null)&&this.bb.equals(rhs.bb)))&&((this.aa == rhs.aa)||((this.aa!= null)&&this.aa.equals(rhs.aa))))&&((this.aaa == rhs.aaa)||((this.aaa!= null)&&this.aaa.equals(rhs.aaa))))&&((this.a == rhs.a)||((this.a!= null)&&this.a.equals(rhs.a))))&&((this.other == rhs.other)||((this.other!= null)&&this.other.equals(rhs.other))))&&((this.b == rhs.b)||((this.b!= null)&&this.b.equals(rhs.b))))&&((this.bbb == rhs.bbb)||((this.bbb!= null)&&this.bbb.equals(rhs.bbb))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.belowB == rhs.belowB)||((this.belowB!= null)&&this.belowB.equals(rhs.belowB))))&&((this.usGovernment == rhs.usGovernment)||((this.usGovernment!= null)&&this.usGovernment.equals(rhs.usGovernment))));
    }

}
