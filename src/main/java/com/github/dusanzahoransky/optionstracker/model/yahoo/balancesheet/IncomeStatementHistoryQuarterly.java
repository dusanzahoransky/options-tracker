package com.github.dusanzahoransky.optionstracker.model.yahoo.balancesheet;

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
    "incomeStatementHistory",
    "maxAge"
})
public class IncomeStatementHistoryQuarterly {

    @JsonProperty("incomeStatementHistory")
    private List<IncomeStatementHistory> incomeStatementHistory = new ArrayList<IncomeStatementHistory>();
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("incomeStatementHistory")
    public List<IncomeStatementHistory> getIncomeStatementHistory() {
        return incomeStatementHistory;
    }

    @JsonProperty("incomeStatementHistory")
    public void setIncomeStatementHistory(List<IncomeStatementHistory> incomeStatementHistory) {
        this.incomeStatementHistory = incomeStatementHistory;
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
        sb.append(IncomeStatementHistoryQuarterly.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("incomeStatementHistory");
        sb.append('=');
        sb.append(((this.incomeStatementHistory == null) ? "<null>" : this.incomeStatementHistory));
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
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.incomeStatementHistory == null) ? 0 : this.incomeStatementHistory.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncomeStatementHistoryQuarterly) == false) {
            return false;
        }
        IncomeStatementHistoryQuarterly rhs = ((IncomeStatementHistoryQuarterly) other);
        return ((((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))) && ((this.incomeStatementHistory == rhs.incomeStatementHistory) || ((this.incomeStatementHistory != null) && this.incomeStatementHistory.equals(rhs.incomeStatementHistory)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge))));
    }

}
