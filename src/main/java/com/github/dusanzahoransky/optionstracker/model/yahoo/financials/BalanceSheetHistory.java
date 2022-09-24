package com.github.dusanzahoransky.optionstracker.model.yahoo.financials;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
    "balanceSheetStatements",
    "maxAge"
})
public class BalanceSheetHistory {

    @JsonProperty("balanceSheetStatements")
    private List<BalanceSheetStatement__1> balanceSheetStatements = new ArrayList<BalanceSheetStatement__1>();
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("balanceSheetStatements")
    public List<BalanceSheetStatement__1> getBalanceSheetStatements() {
        return balanceSheetStatements;
    }

    @JsonProperty("balanceSheetStatements")
    public void setBalanceSheetStatements(List<BalanceSheetStatement__1> balanceSheetStatements) {
        this.balanceSheetStatements = balanceSheetStatements;
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
        sb.append(BalanceSheetHistory.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("balanceSheetStatements");
        sb.append('=');
        sb.append(((this.balanceSheetStatements == null) ? "<null>" : this.balanceSheetStatements));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
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
        result = ((result * 31) + ((this.balanceSheetStatements == null) ? 0 : this.balanceSheetStatements.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BalanceSheetHistory) == false) {
            return false;
        }
        BalanceSheetHistory rhs = ((BalanceSheetHistory) other);
        return ((((this.balanceSheetStatements == rhs.balanceSheetStatements) || ((this.balanceSheetStatements != null) && this.balanceSheetStatements.equals(rhs.balanceSheetStatements))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge))));
    }

}
