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
    "cashflowStatements",
    "maxAge"
})
public class CashflowStatementHistory {

    @JsonProperty("cashflowStatements")
    private List<CashflowStatement> cashflowStatements = new ArrayList<CashflowStatement>();
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cashflowStatements")
    public List<CashflowStatement> getCashflowStatements() {
        return cashflowStatements;
    }

    @JsonProperty("cashflowStatements")
    public void setCashflowStatements(List<CashflowStatement> cashflowStatements) {
        this.cashflowStatements = cashflowStatements;
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
        sb.append(CashflowStatementHistory.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cashflowStatements");
        sb.append('=');
        sb.append(((this.cashflowStatements == null) ? "<null>" : this.cashflowStatements));
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
        result = ((result * 31) + ((this.cashflowStatements == null) ? 0 : this.cashflowStatements.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CashflowStatementHistory) == false) {
            return false;
        }
        CashflowStatementHistory rhs = ((CashflowStatementHistory) other);
        return ((((this.cashflowStatements == rhs.cashflowStatements) || ((this.cashflowStatements != null) && this.cashflowStatements.equals(rhs.cashflowStatements))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge))));
    }

}
