
package com.github.dusanzahoransky.optionstracker.model.yahoo.holders;

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
    "maxAge",
    "name",
    "relation",
    "url",
    "transactionDescription",
    "latestTransDate",
    "positionDirect",
    "positionDirectDate",
    "positionIndirect",
    "positionIndirectDate"
})
public class Holder {

    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("name")
    private String name;
    @JsonProperty("relation")
    private String relation;
    @JsonProperty("url")
    private String url;
    @JsonProperty("transactionDescription")
    private String transactionDescription;
    @JsonProperty("latestTransDate")
    private LatestTransDate latestTransDate;
    @JsonProperty("positionDirect")
    private PositionDirect positionDirect;
    @JsonProperty("positionDirectDate")
    private PositionDirectDate positionDirectDate;
    @JsonProperty("positionIndirect")
    private PositionIndirect positionIndirect;
    @JsonProperty("positionIndirectDate")
    private PositionIndirectDate positionIndirectDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("relation")
    public String getRelation() {
        return relation;
    }

    @JsonProperty("relation")
    public void setRelation(String relation) {
        this.relation = relation;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("transactionDescription")
    public String getTransactionDescription() {
        return transactionDescription;
    }

    @JsonProperty("transactionDescription")
    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    @JsonProperty("latestTransDate")
    public LatestTransDate getLatestTransDate() {
        return latestTransDate;
    }

    @JsonProperty("latestTransDate")
    public void setLatestTransDate(LatestTransDate latestTransDate) {
        this.latestTransDate = latestTransDate;
    }

    @JsonProperty("positionDirect")
    public PositionDirect getPositionDirect() {
        return positionDirect;
    }

    @JsonProperty("positionDirect")
    public void setPositionDirect(PositionDirect positionDirect) {
        this.positionDirect = positionDirect;
    }

    @JsonProperty("positionDirectDate")
    public PositionDirectDate getPositionDirectDate() {
        return positionDirectDate;
    }

    @JsonProperty("positionDirectDate")
    public void setPositionDirectDate(PositionDirectDate positionDirectDate) {
        this.positionDirectDate = positionDirectDate;
    }

    @JsonProperty("positionIndirect")
    public PositionIndirect getPositionIndirect() {
        return positionIndirect;
    }

    @JsonProperty("positionIndirect")
    public void setPositionIndirect(PositionIndirect positionIndirect) {
        this.positionIndirect = positionIndirect;
    }

    @JsonProperty("positionIndirectDate")
    public PositionIndirectDate getPositionIndirectDate() {
        return positionIndirectDate;
    }

    @JsonProperty("positionIndirectDate")
    public void setPositionIndirectDate(PositionIndirectDate positionIndirectDate) {
        this.positionIndirectDate = positionIndirectDate;
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
        sb.append(Holder.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("relation");
        sb.append('=');
        sb.append(((this.relation == null)?"<null>":this.relation));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("transactionDescription");
        sb.append('=');
        sb.append(((this.transactionDescription == null)?"<null>":this.transactionDescription));
        sb.append(',');
        sb.append("latestTransDate");
        sb.append('=');
        sb.append(((this.latestTransDate == null)?"<null>":this.latestTransDate));
        sb.append(',');
        sb.append("positionDirect");
        sb.append('=');
        sb.append(((this.positionDirect == null)?"<null>":this.positionDirect));
        sb.append(',');
        sb.append("positionDirectDate");
        sb.append('=');
        sb.append(((this.positionDirectDate == null)?"<null>":this.positionDirectDate));
        sb.append(',');
        sb.append("positionIndirect");
        sb.append('=');
        sb.append(((this.positionIndirect == null)?"<null>":this.positionIndirect));
        sb.append(',');
        sb.append("positionIndirectDate");
        sb.append('=');
        sb.append(((this.positionIndirectDate == null)?"<null>":this.positionIndirectDate));
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
        result = ((result* 31)+((this.positionDirect == null)? 0 :this.positionDirect.hashCode()));
        result = ((result* 31)+((this.positionIndirect == null)? 0 :this.positionIndirect.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.positionIndirectDate == null)? 0 :this.positionIndirectDate.hashCode()));
        result = ((result* 31)+((this.positionDirectDate == null)? 0 :this.positionDirectDate.hashCode()));
        result = ((result* 31)+((this.transactionDescription == null)? 0 :this.transactionDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.latestTransDate == null)? 0 :this.latestTransDate.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.relation == null)? 0 :this.relation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Holder) == false) {
            return false;
        }
        Holder rhs = ((Holder) other);
        return ((((((((((((this.positionDirect == rhs.positionDirect)||((this.positionDirect!= null)&&this.positionDirect.equals(rhs.positionDirect)))&&((this.positionIndirect == rhs.positionIndirect)||((this.positionIndirect!= null)&&this.positionIndirect.equals(rhs.positionIndirect))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.positionIndirectDate == rhs.positionIndirectDate)||((this.positionIndirectDate!= null)&&this.positionIndirectDate.equals(rhs.positionIndirectDate))))&&((this.positionDirectDate == rhs.positionDirectDate)||((this.positionDirectDate!= null)&&this.positionDirectDate.equals(rhs.positionDirectDate))))&&((this.transactionDescription == rhs.transactionDescription)||((this.transactionDescription!= null)&&this.transactionDescription.equals(rhs.transactionDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.latestTransDate == rhs.latestTransDate)||((this.latestTransDate!= null)&&this.latestTransDate.equals(rhs.latestTransDate))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.relation == rhs.relation)||((this.relation!= null)&&this.relation.equals(rhs.relation))));
    }

}
