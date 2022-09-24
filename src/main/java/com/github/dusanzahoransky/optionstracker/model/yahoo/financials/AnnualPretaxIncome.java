package com.github.dusanzahoransky.optionstracker.model.yahoo.financials;

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
    "dataId",
    "asOfDate",
    "periodType",
    "currencyCode",
    "reportedValue"
})
public class AnnualPretaxIncome {

    @JsonProperty("dataId")
    private Long dataId;
    @JsonProperty("asOfDate")
    private String asOfDate;
    @JsonProperty("periodType")
    private String periodType;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("reportedValue")
    private ReportedValue__15 reportedValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dataId")
    public Long getDataId() {
        return dataId;
    }

    @JsonProperty("dataId")
    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    @JsonProperty("asOfDate")
    public String getAsOfDate() {
        return asOfDate;
    }

    @JsonProperty("asOfDate")
    public void setAsOfDate(String asOfDate) {
        this.asOfDate = asOfDate;
    }

    @JsonProperty("periodType")
    public String getPeriodType() {
        return periodType;
    }

    @JsonProperty("periodType")
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("reportedValue")
    public ReportedValue__15 getReportedValue() {
        return reportedValue;
    }

    @JsonProperty("reportedValue")
    public void setReportedValue(ReportedValue__15 reportedValue) {
        this.reportedValue = reportedValue;
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
        sb.append(AnnualPretaxIncome.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataId");
        sb.append('=');
        sb.append(((this.dataId == null) ? "<null>" : this.dataId));
        sb.append(',');
        sb.append("asOfDate");
        sb.append('=');
        sb.append(((this.asOfDate == null) ? "<null>" : this.asOfDate));
        sb.append(',');
        sb.append("periodType");
        sb.append('=');
        sb.append(((this.periodType == null) ? "<null>" : this.periodType));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null) ? "<null>" : this.currencyCode));
        sb.append(',');
        sb.append("reportedValue");
        sb.append('=');
        sb.append(((this.reportedValue == null) ? "<null>" : this.reportedValue));
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
        result = ((result * 31) + ((this.periodType == null) ? 0 : this.periodType.hashCode()));
        result = ((result * 31) + ((this.dataId == null) ? 0 : this.dataId.hashCode()));
        result = ((result * 31) + ((this.reportedValue == null) ? 0 : this.reportedValue.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.asOfDate == null) ? 0 : this.asOfDate.hashCode()));
        result = ((result * 31) + ((this.currencyCode == null) ? 0 : this.currencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnnualPretaxIncome) == false) {
            return false;
        }
        AnnualPretaxIncome rhs = ((AnnualPretaxIncome) other);
        return (((((((this.periodType == rhs.periodType) || ((this.periodType != null) && this.periodType.equals(rhs.periodType))) && ((this.dataId == rhs.dataId) || ((this.dataId != null) && this.dataId.equals(rhs.dataId)))) && ((this.reportedValue == rhs.reportedValue) || ((this.reportedValue != null) && this.reportedValue.equals(rhs.reportedValue)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.asOfDate == rhs.asOfDate) || ((this.asOfDate != null) && this.asOfDate.equals(rhs.asOfDate)))) && ((this.currencyCode == rhs.currencyCode) || ((this.currencyCode != null) && this.currencyCode.equals(rhs.currencyCode))));
    }

}
