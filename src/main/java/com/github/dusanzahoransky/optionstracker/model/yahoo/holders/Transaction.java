
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
    "filerName",
    "transactionText",
    "moneyText",
    "ownership",
    "startDate",
    "value",
    "filerRelation",
    "shares",
    "filerUrl",
    "maxAge"
})
public class Transaction {

    @JsonProperty("filerName")
    private String filerName;
    @JsonProperty("transactionText")
    private String transactionText;
    @JsonProperty("moneyText")
    private String moneyText;
    @JsonProperty("ownership")
    private String ownership;
    @JsonProperty("startDate")
    private StartDate startDate;
    @JsonProperty("value")
    private Value__1 value;
    @JsonProperty("filerRelation")
    private String filerRelation;
    @JsonProperty("shares")
    private Shares shares;
    @JsonProperty("filerUrl")
    private String filerUrl;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("filerName")
    public String getFilerName() {
        return filerName;
    }

    @JsonProperty("filerName")
    public void setFilerName(String filerName) {
        this.filerName = filerName;
    }

    @JsonProperty("transactionText")
    public String getTransactionText() {
        return transactionText;
    }

    @JsonProperty("transactionText")
    public void setTransactionText(String transactionText) {
        this.transactionText = transactionText;
    }

    @JsonProperty("moneyText")
    public String getMoneyText() {
        return moneyText;
    }

    @JsonProperty("moneyText")
    public void setMoneyText(String moneyText) {
        this.moneyText = moneyText;
    }

    @JsonProperty("ownership")
    public String getOwnership() {
        return ownership;
    }

    @JsonProperty("ownership")
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    @JsonProperty("startDate")
    public StartDate getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(StartDate startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("value")
    public Value__1 getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Value__1 value) {
        this.value = value;
    }

    @JsonProperty("filerRelation")
    public String getFilerRelation() {
        return filerRelation;
    }

    @JsonProperty("filerRelation")
    public void setFilerRelation(String filerRelation) {
        this.filerRelation = filerRelation;
    }

    @JsonProperty("shares")
    public Shares getShares() {
        return shares;
    }

    @JsonProperty("shares")
    public void setShares(Shares shares) {
        this.shares = shares;
    }

    @JsonProperty("filerUrl")
    public String getFilerUrl() {
        return filerUrl;
    }

    @JsonProperty("filerUrl")
    public void setFilerUrl(String filerUrl) {
        this.filerUrl = filerUrl;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
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
        sb.append(Transaction.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("filerName");
        sb.append('=');
        sb.append(((this.filerName == null)?"<null>":this.filerName));
        sb.append(',');
        sb.append("transactionText");
        sb.append('=');
        sb.append(((this.transactionText == null)?"<null>":this.transactionText));
        sb.append(',');
        sb.append("moneyText");
        sb.append('=');
        sb.append(((this.moneyText == null)?"<null>":this.moneyText));
        sb.append(',');
        sb.append("ownership");
        sb.append('=');
        sb.append(((this.ownership == null)?"<null>":this.ownership));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("filerRelation");
        sb.append('=');
        sb.append(((this.filerRelation == null)?"<null>":this.filerRelation));
        sb.append(',');
        sb.append("shares");
        sb.append('=');
        sb.append(((this.shares == null)?"<null>":this.shares));
        sb.append(',');
        sb.append("filerUrl");
        sb.append('=');
        sb.append(((this.filerUrl == null)?"<null>":this.filerUrl));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
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
        result = ((result* 31)+((this.moneyText == null)? 0 :this.moneyText.hashCode()));
        result = ((result* 31)+((this.shares == null)? 0 :this.shares.hashCode()));
        result = ((result* 31)+((this.filerName == null)? 0 :this.filerName.hashCode()));
        result = ((result* 31)+((this.ownership == null)? 0 :this.ownership.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.transactionText == null)? 0 :this.transactionText.hashCode()));
        result = ((result* 31)+((this.filerRelation == null)? 0 :this.filerRelation.hashCode()));
        result = ((result* 31)+((this.filerUrl == null)? 0 :this.filerUrl.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return ((((((((((((this.moneyText == rhs.moneyText)||((this.moneyText!= null)&&this.moneyText.equals(rhs.moneyText)))&&((this.shares == rhs.shares)||((this.shares!= null)&&this.shares.equals(rhs.shares))))&&((this.filerName == rhs.filerName)||((this.filerName!= null)&&this.filerName.equals(rhs.filerName))))&&((this.ownership == rhs.ownership)||((this.ownership!= null)&&this.ownership.equals(rhs.ownership))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transactionText == rhs.transactionText)||((this.transactionText!= null)&&this.transactionText.equals(rhs.transactionText))))&&((this.filerRelation == rhs.filerRelation)||((this.filerRelation!= null)&&this.filerRelation.equals(rhs.filerRelation))))&&((this.filerUrl == rhs.filerUrl)||((this.filerUrl!= null)&&this.filerUrl.equals(rhs.filerUrl))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
