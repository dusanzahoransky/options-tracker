package com.github.dusanzahoransky.optionstracker.model.yahoo.chart;

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
    "pre",
    "regular",
    "post"
})
public class CurrentTradingPeriod {

    @JsonProperty("pre")
    private Pre pre;
    @JsonProperty("regular")
    private Regular regular;
    @JsonProperty("post")
    private Post post;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pre")
    public Pre getPre() {
        return pre;
    }

    @JsonProperty("pre")
    public void setPre(Pre pre) {
        this.pre = pre;
    }

    @JsonProperty("regular")
    public Regular getRegular() {
        return regular;
    }

    @JsonProperty("regular")
    public void setRegular(Regular regular) {
        this.regular = regular;
    }

    @JsonProperty("post")
    public Post getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(Post post) {
        this.post = post;
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
        sb.append(CurrentTradingPeriod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pre");
        sb.append('=');
        sb.append(((this.pre == null) ? "<null>" : this.pre));
        sb.append(',');
        sb.append("regular");
        sb.append('=');
        sb.append(((this.regular == null) ? "<null>" : this.regular));
        sb.append(',');
        sb.append("post");
        sb.append('=');
        sb.append(((this.post == null) ? "<null>" : this.post));
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
        result = ((result * 31) + ((this.pre == null) ? 0 : this.pre.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.post == null) ? 0 : this.post.hashCode()));
        result = ((result * 31) + ((this.regular == null) ? 0 : this.regular.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentTradingPeriod) == false) {
            return false;
        }
        CurrentTradingPeriod rhs = ((CurrentTradingPeriod) other);
        return (((((this.pre == rhs.pre) || ((this.pre != null) && this.pre.equals(rhs.pre))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.post == rhs.post) || ((this.post != null) && this.post.equals(rhs.post)))) && ((this.regular == rhs.regular) || ((this.regular != null) && this.regular.equals(rhs.regular))));
    }

}
