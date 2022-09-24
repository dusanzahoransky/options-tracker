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
    "investments",
    "changeToLiabilities",
    "totalCashflowsFromInvestingActivities",
    "netBorrowings",
    "totalCashFromFinancingActivities",
    "changeToOperatingActivities",
    "netIncome",
    "changeInCash",
    "endDate",
    "repurchaseOfStock",
    "effectOfExchangeRate",
    "totalCashFromOperatingActivities",
    "depreciation",
    "otherCashflowsFromInvestingActivities",
    "changeToAccountReceivables",
    "otherCashflowsFromFinancingActivities",
    "maxAge",
    "changeToNetincome",
    "capitalExpenditures"
})
public class CashflowStatement {

    @JsonProperty("investments")
    private Investments investments;
    @JsonProperty("changeToLiabilities")
    private ChangeToLiabilities changeToLiabilities;
    @JsonProperty("totalCashflowsFromInvestingActivities")
    private TotalCashflowsFromInvestingActivities totalCashflowsFromInvestingActivities;
    @JsonProperty("netBorrowings")
    private NetBorrowings netBorrowings;
    @JsonProperty("totalCashFromFinancingActivities")
    private TotalCashFromFinancingActivities totalCashFromFinancingActivities;
    @JsonProperty("changeToOperatingActivities")
    private ChangeToOperatingActivities changeToOperatingActivities;
    @JsonProperty("netIncome")
    private NetIncome netIncome;
    @JsonProperty("changeInCash")
    private ChangeInCash changeInCash;
    @JsonProperty("endDate")
    private EndDate endDate;
    @JsonProperty("repurchaseOfStock")
    private RepurchaseOfStock repurchaseOfStock;
    @JsonProperty("effectOfExchangeRate")
    private EffectOfExchangeRate effectOfExchangeRate;
    @JsonProperty("totalCashFromOperatingActivities")
    private TotalCashFromOperatingActivities totalCashFromOperatingActivities;
    @JsonProperty("depreciation")
    private Depreciation depreciation;
    @JsonProperty("otherCashflowsFromInvestingActivities")
    private OtherCashflowsFromInvestingActivities otherCashflowsFromInvestingActivities;
    @JsonProperty("changeToAccountReceivables")
    private ChangeToAccountReceivables changeToAccountReceivables;
    @JsonProperty("otherCashflowsFromFinancingActivities")
    private OtherCashflowsFromFinancingActivities otherCashflowsFromFinancingActivities;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("changeToNetincome")
    private ChangeToNetincome changeToNetincome;
    @JsonProperty("capitalExpenditures")
    private CapitalExpenditures capitalExpenditures;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("investments")
    public Investments getInvestments() {
        return investments;
    }

    @JsonProperty("investments")
    public void setInvestments(Investments investments) {
        this.investments = investments;
    }

    @JsonProperty("changeToLiabilities")
    public ChangeToLiabilities getChangeToLiabilities() {
        return changeToLiabilities;
    }

    @JsonProperty("changeToLiabilities")
    public void setChangeToLiabilities(ChangeToLiabilities changeToLiabilities) {
        this.changeToLiabilities = changeToLiabilities;
    }

    @JsonProperty("totalCashflowsFromInvestingActivities")
    public TotalCashflowsFromInvestingActivities getTotalCashflowsFromInvestingActivities() {
        return totalCashflowsFromInvestingActivities;
    }

    @JsonProperty("totalCashflowsFromInvestingActivities")
    public void setTotalCashflowsFromInvestingActivities(TotalCashflowsFromInvestingActivities totalCashflowsFromInvestingActivities) {
        this.totalCashflowsFromInvestingActivities = totalCashflowsFromInvestingActivities;
    }

    @JsonProperty("netBorrowings")
    public NetBorrowings getNetBorrowings() {
        return netBorrowings;
    }

    @JsonProperty("netBorrowings")
    public void setNetBorrowings(NetBorrowings netBorrowings) {
        this.netBorrowings = netBorrowings;
    }

    @JsonProperty("totalCashFromFinancingActivities")
    public TotalCashFromFinancingActivities getTotalCashFromFinancingActivities() {
        return totalCashFromFinancingActivities;
    }

    @JsonProperty("totalCashFromFinancingActivities")
    public void setTotalCashFromFinancingActivities(TotalCashFromFinancingActivities totalCashFromFinancingActivities) {
        this.totalCashFromFinancingActivities = totalCashFromFinancingActivities;
    }

    @JsonProperty("changeToOperatingActivities")
    public ChangeToOperatingActivities getChangeToOperatingActivities() {
        return changeToOperatingActivities;
    }

    @JsonProperty("changeToOperatingActivities")
    public void setChangeToOperatingActivities(ChangeToOperatingActivities changeToOperatingActivities) {
        this.changeToOperatingActivities = changeToOperatingActivities;
    }

    @JsonProperty("netIncome")
    public NetIncome getNetIncome() {
        return netIncome;
    }

    @JsonProperty("netIncome")
    public void setNetIncome(NetIncome netIncome) {
        this.netIncome = netIncome;
    }

    @JsonProperty("changeInCash")
    public ChangeInCash getChangeInCash() {
        return changeInCash;
    }

    @JsonProperty("changeInCash")
    public void setChangeInCash(ChangeInCash changeInCash) {
        this.changeInCash = changeInCash;
    }

    @JsonProperty("endDate")
    public EndDate getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(EndDate endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("repurchaseOfStock")
    public RepurchaseOfStock getRepurchaseOfStock() {
        return repurchaseOfStock;
    }

    @JsonProperty("repurchaseOfStock")
    public void setRepurchaseOfStock(RepurchaseOfStock repurchaseOfStock) {
        this.repurchaseOfStock = repurchaseOfStock;
    }

    @JsonProperty("effectOfExchangeRate")
    public EffectOfExchangeRate getEffectOfExchangeRate() {
        return effectOfExchangeRate;
    }

    @JsonProperty("effectOfExchangeRate")
    public void setEffectOfExchangeRate(EffectOfExchangeRate effectOfExchangeRate) {
        this.effectOfExchangeRate = effectOfExchangeRate;
    }

    @JsonProperty("totalCashFromOperatingActivities")
    public TotalCashFromOperatingActivities getTotalCashFromOperatingActivities() {
        return totalCashFromOperatingActivities;
    }

    @JsonProperty("totalCashFromOperatingActivities")
    public void setTotalCashFromOperatingActivities(TotalCashFromOperatingActivities totalCashFromOperatingActivities) {
        this.totalCashFromOperatingActivities = totalCashFromOperatingActivities;
    }

    @JsonProperty("depreciation")
    public Depreciation getDepreciation() {
        return depreciation;
    }

    @JsonProperty("depreciation")
    public void setDepreciation(Depreciation depreciation) {
        this.depreciation = depreciation;
    }

    @JsonProperty("otherCashflowsFromInvestingActivities")
    public OtherCashflowsFromInvestingActivities getOtherCashflowsFromInvestingActivities() {
        return otherCashflowsFromInvestingActivities;
    }

    @JsonProperty("otherCashflowsFromInvestingActivities")
    public void setOtherCashflowsFromInvestingActivities(OtherCashflowsFromInvestingActivities otherCashflowsFromInvestingActivities) {
        this.otherCashflowsFromInvestingActivities = otherCashflowsFromInvestingActivities;
    }

    @JsonProperty("changeToAccountReceivables")
    public ChangeToAccountReceivables getChangeToAccountReceivables() {
        return changeToAccountReceivables;
    }

    @JsonProperty("changeToAccountReceivables")
    public void setChangeToAccountReceivables(ChangeToAccountReceivables changeToAccountReceivables) {
        this.changeToAccountReceivables = changeToAccountReceivables;
    }

    @JsonProperty("otherCashflowsFromFinancingActivities")
    public OtherCashflowsFromFinancingActivities getOtherCashflowsFromFinancingActivities() {
        return otherCashflowsFromFinancingActivities;
    }

    @JsonProperty("otherCashflowsFromFinancingActivities")
    public void setOtherCashflowsFromFinancingActivities(OtherCashflowsFromFinancingActivities otherCashflowsFromFinancingActivities) {
        this.otherCashflowsFromFinancingActivities = otherCashflowsFromFinancingActivities;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("changeToNetincome")
    public ChangeToNetincome getChangeToNetincome() {
        return changeToNetincome;
    }

    @JsonProperty("changeToNetincome")
    public void setChangeToNetincome(ChangeToNetincome changeToNetincome) {
        this.changeToNetincome = changeToNetincome;
    }

    @JsonProperty("capitalExpenditures")
    public CapitalExpenditures getCapitalExpenditures() {
        return capitalExpenditures;
    }

    @JsonProperty("capitalExpenditures")
    public void setCapitalExpenditures(CapitalExpenditures capitalExpenditures) {
        this.capitalExpenditures = capitalExpenditures;
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
        sb.append(CashflowStatement.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("investments");
        sb.append('=');
        sb.append(((this.investments == null) ? "<null>" : this.investments));
        sb.append(',');
        sb.append("changeToLiabilities");
        sb.append('=');
        sb.append(((this.changeToLiabilities == null) ? "<null>" : this.changeToLiabilities));
        sb.append(',');
        sb.append("totalCashflowsFromInvestingActivities");
        sb.append('=');
        sb.append(((this.totalCashflowsFromInvestingActivities == null) ? "<null>" : this.totalCashflowsFromInvestingActivities));
        sb.append(',');
        sb.append("netBorrowings");
        sb.append('=');
        sb.append(((this.netBorrowings == null) ? "<null>" : this.netBorrowings));
        sb.append(',');
        sb.append("totalCashFromFinancingActivities");
        sb.append('=');
        sb.append(((this.totalCashFromFinancingActivities == null) ? "<null>" : this.totalCashFromFinancingActivities));
        sb.append(',');
        sb.append("changeToOperatingActivities");
        sb.append('=');
        sb.append(((this.changeToOperatingActivities == null) ? "<null>" : this.changeToOperatingActivities));
        sb.append(',');
        sb.append("netIncome");
        sb.append('=');
        sb.append(((this.netIncome == null) ? "<null>" : this.netIncome));
        sb.append(',');
        sb.append("changeInCash");
        sb.append('=');
        sb.append(((this.changeInCash == null) ? "<null>" : this.changeInCash));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null) ? "<null>" : this.endDate));
        sb.append(',');
        sb.append("repurchaseOfStock");
        sb.append('=');
        sb.append(((this.repurchaseOfStock == null) ? "<null>" : this.repurchaseOfStock));
        sb.append(',');
        sb.append("effectOfExchangeRate");
        sb.append('=');
        sb.append(((this.effectOfExchangeRate == null) ? "<null>" : this.effectOfExchangeRate));
        sb.append(',');
        sb.append("totalCashFromOperatingActivities");
        sb.append('=');
        sb.append(((this.totalCashFromOperatingActivities == null) ? "<null>" : this.totalCashFromOperatingActivities));
        sb.append(',');
        sb.append("depreciation");
        sb.append('=');
        sb.append(((this.depreciation == null) ? "<null>" : this.depreciation));
        sb.append(',');
        sb.append("otherCashflowsFromInvestingActivities");
        sb.append('=');
        sb.append(((this.otherCashflowsFromInvestingActivities == null) ? "<null>" : this.otherCashflowsFromInvestingActivities));
        sb.append(',');
        sb.append("changeToAccountReceivables");
        sb.append('=');
        sb.append(((this.changeToAccountReceivables == null) ? "<null>" : this.changeToAccountReceivables));
        sb.append(',');
        sb.append("otherCashflowsFromFinancingActivities");
        sb.append('=');
        sb.append(((this.otherCashflowsFromFinancingActivities == null) ? "<null>" : this.otherCashflowsFromFinancingActivities));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
        sb.append(',');
        sb.append("changeToNetincome");
        sb.append('=');
        sb.append(((this.changeToNetincome == null) ? "<null>" : this.changeToNetincome));
        sb.append(',');
        sb.append("capitalExpenditures");
        sb.append('=');
        sb.append(((this.capitalExpenditures == null) ? "<null>" : this.capitalExpenditures));
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
        result = ((result * 31) + ((this.endDate == null) ? 0 : this.endDate.hashCode()));
        result = ((result * 31) + ((this.capitalExpenditures == null) ? 0 : this.capitalExpenditures.hashCode()));
        result = ((result * 31) + ((this.repurchaseOfStock == null) ? 0 : this.repurchaseOfStock.hashCode()));
        result = ((result * 31) + ((this.investments == null) ? 0 : this.investments.hashCode()));
        result = ((result * 31) + ((this.totalCashFromOperatingActivities == null) ? 0 : this.totalCashFromOperatingActivities.hashCode()));
        result = ((result * 31) + ((this.changeInCash == null) ? 0 : this.changeInCash.hashCode()));
        result = ((result * 31) + ((this.changeToAccountReceivables == null) ? 0 : this.changeToAccountReceivables.hashCode()));
        result = ((result * 31) + ((this.netBorrowings == null) ? 0 : this.netBorrowings.hashCode()));
        result = ((result * 31) + ((this.changeToOperatingActivities == null) ? 0 : this.changeToOperatingActivities.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        result = ((result * 31) + ((this.effectOfExchangeRate == null) ? 0 : this.effectOfExchangeRate.hashCode()));
        result = ((result * 31) + ((this.totalCashflowsFromInvestingActivities == null) ? 0 : this.totalCashflowsFromInvestingActivities.hashCode()));
        result = ((result * 31) + ((this.netIncome == null) ? 0 : this.netIncome.hashCode()));
        result = ((result * 31) + ((this.otherCashflowsFromFinancingActivities == null) ? 0 : this.otherCashflowsFromFinancingActivities.hashCode()));
        result = ((result * 31) + ((this.totalCashFromFinancingActivities == null) ? 0 : this.totalCashFromFinancingActivities.hashCode()));
        result = ((result * 31) + ((this.otherCashflowsFromInvestingActivities == null) ? 0 : this.otherCashflowsFromInvestingActivities.hashCode()));
        result = ((result * 31) + ((this.changeToNetincome == null) ? 0 : this.changeToNetincome.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.changeToLiabilities == null) ? 0 : this.changeToLiabilities.hashCode()));
        result = ((result * 31) + ((this.depreciation == null) ? 0 : this.depreciation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CashflowStatement) == false) {
            return false;
        }
        CashflowStatement rhs = ((CashflowStatement) other);
        return (((((((((((((((((((((this.endDate == rhs.endDate) || ((this.endDate != null) && this.endDate.equals(rhs.endDate))) && ((this.capitalExpenditures == rhs.capitalExpenditures) || ((this.capitalExpenditures != null) && this.capitalExpenditures.equals(rhs.capitalExpenditures)))) && ((this.repurchaseOfStock == rhs.repurchaseOfStock) || ((this.repurchaseOfStock != null) && this.repurchaseOfStock.equals(rhs.repurchaseOfStock)))) && ((this.investments == rhs.investments) || ((this.investments != null) && this.investments.equals(rhs.investments)))) && ((this.totalCashFromOperatingActivities == rhs.totalCashFromOperatingActivities) || ((this.totalCashFromOperatingActivities != null) && this.totalCashFromOperatingActivities.equals(rhs.totalCashFromOperatingActivities)))) && ((this.changeInCash == rhs.changeInCash) || ((this.changeInCash != null) && this.changeInCash.equals(rhs.changeInCash)))) && ((this.changeToAccountReceivables == rhs.changeToAccountReceivables) || ((this.changeToAccountReceivables != null) && this.changeToAccountReceivables.equals(rhs.changeToAccountReceivables)))) && ((this.netBorrowings == rhs.netBorrowings) || ((this.netBorrowings != null) && this.netBorrowings.equals(rhs.netBorrowings)))) && ((this.changeToOperatingActivities == rhs.changeToOperatingActivities) || ((this.changeToOperatingActivities != null) && this.changeToOperatingActivities.equals(rhs.changeToOperatingActivities)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.effectOfExchangeRate == rhs.effectOfExchangeRate) || ((this.effectOfExchangeRate != null) && this.effectOfExchangeRate.equals(rhs.effectOfExchangeRate)))) && ((this.totalCashflowsFromInvestingActivities == rhs.totalCashflowsFromInvestingActivities) || ((this.totalCashflowsFromInvestingActivities != null) && this.totalCashflowsFromInvestingActivities.equals(rhs.totalCashflowsFromInvestingActivities)))) && ((this.netIncome == rhs.netIncome) || ((this.netIncome != null) && this.netIncome.equals(rhs.netIncome)))) && ((this.otherCashflowsFromFinancingActivities == rhs.otherCashflowsFromFinancingActivities) || ((this.otherCashflowsFromFinancingActivities != null) && this.otherCashflowsFromFinancingActivities.equals(rhs.otherCashflowsFromFinancingActivities)))) && ((this.totalCashFromFinancingActivities == rhs.totalCashFromFinancingActivities) || ((this.totalCashFromFinancingActivities != null) && this.totalCashFromFinancingActivities.equals(rhs.totalCashFromFinancingActivities)))) && ((this.otherCashflowsFromInvestingActivities == rhs.otherCashflowsFromInvestingActivities) || ((this.otherCashflowsFromInvestingActivities != null) && this.otherCashflowsFromInvestingActivities.equals(rhs.otherCashflowsFromInvestingActivities)))) && ((this.changeToNetincome == rhs.changeToNetincome) || ((this.changeToNetincome != null) && this.changeToNetincome.equals(rhs.changeToNetincome)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.changeToLiabilities == rhs.changeToLiabilities) || ((this.changeToLiabilities != null) && this.changeToLiabilities.equals(rhs.changeToLiabilities)))) && ((this.depreciation == rhs.depreciation) || ((this.depreciation != null) && this.depreciation.equals(rhs.depreciation))));
    }

}
