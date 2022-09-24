package com.github.dusanzahoransky.optionstracker.model.yahoo.balancesheet;

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
    "maxAge",
    "earningsChart",
    "financialsChart",
    "financialCurrency"
})
public class Earnings {

    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("earningsChart")
    private EarningsChart earningsChart;
    @JsonProperty("financialsChart")
    private FinancialsChart financialsChart;
    @JsonProperty("financialCurrency")
    private String financialCurrency;
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

    @JsonProperty("earningsChart")
    public EarningsChart getEarningsChart() {
        return earningsChart;
    }

    @JsonProperty("earningsChart")
    public void setEarningsChart(EarningsChart earningsChart) {
        this.earningsChart = earningsChart;
    }

    @JsonProperty("financialsChart")
    public FinancialsChart getFinancialsChart() {
        return financialsChart;
    }

    @JsonProperty("financialsChart")
    public void setFinancialsChart(FinancialsChart financialsChart) {
        this.financialsChart = financialsChart;
    }

    @JsonProperty("financialCurrency")
    public String getFinancialCurrency() {
        return financialCurrency;
    }

    @JsonProperty("financialCurrency")
    public void setFinancialCurrency(String financialCurrency) {
        this.financialCurrency = financialCurrency;
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
        sb.append(Earnings.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
        sb.append(',');
        sb.append("earningsChart");
        sb.append('=');
        sb.append(((this.earningsChart == null) ? "<null>" : this.earningsChart));
        sb.append(',');
        sb.append("financialsChart");
        sb.append('=');
        sb.append(((this.financialsChart == null) ? "<null>" : this.financialsChart));
        sb.append(',');
        sb.append("financialCurrency");
        sb.append('=');
        sb.append(((this.financialCurrency == null) ? "<null>" : this.financialCurrency));
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
        result = ((result * 31) + ((this.financialsChart == null) ? 0 : this.financialsChart.hashCode()));
        result = ((result * 31) + ((this.financialCurrency == null) ? 0 : this.financialCurrency.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        result = ((result * 31) + ((this.earningsChart == null) ? 0 : this.earningsChart.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Earnings) == false) {
            return false;
        }
        Earnings rhs = ((Earnings) other);
        return ((((((this.financialsChart == rhs.financialsChart) || ((this.financialsChart != null) && this.financialsChart.equals(rhs.financialsChart))) && ((this.financialCurrency == rhs.financialCurrency) || ((this.financialCurrency != null) && this.financialCurrency.equals(rhs.financialCurrency)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.earningsChart == rhs.earningsChart) || ((this.earningsChart != null) && this.earningsChart.equals(rhs.earningsChart))));
    }

}
