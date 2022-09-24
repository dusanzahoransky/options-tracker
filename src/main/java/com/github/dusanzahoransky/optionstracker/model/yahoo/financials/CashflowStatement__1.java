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
public class CashflowStatement__1 {

    @JsonProperty("investments")
    private Investments__1 investments;
    @JsonProperty("changeToLiabilities")
    private ChangeToLiabilities__1 changeToLiabilities;
    @JsonProperty("totalCashflowsFromInvestingActivities")
    private TotalCashflowsFromInvestingActivities__1 totalCashflowsFromInvestingActivities;
    @JsonProperty("netBorrowings")
    private NetBorrowings__1 netBorrowings;
    @JsonProperty("totalCashFromFinancingActivities")
    private TotalCashFromFinancingActivities__1 totalCashFromFinancingActivities;
    @JsonProperty("changeToOperatingActivities")
    private ChangeToOperatingActivities__1 changeToOperatingActivities;
    @JsonProperty("netIncome")
    private NetIncome__3 netIncome;
    @JsonProperty("changeInCash")
    private ChangeInCash__1 changeInCash;
    @JsonProperty("endDate")
    private EndDate__5 endDate;
    @JsonProperty("repurchaseOfStock")
    private RepurchaseOfStock__1 repurchaseOfStock;
    @JsonProperty("effectOfExchangeRate")
    private EffectOfExchangeRate__1 effectOfExchangeRate;
    @JsonProperty("totalCashFromOperatingActivities")
    private TotalCashFromOperatingActivities__1 totalCashFromOperatingActivities;
    @JsonProperty("depreciation")
    private Depreciation__1 depreciation;
    @JsonProperty("otherCashflowsFromInvestingActivities")
    private OtherCashflowsFromInvestingActivities__1 otherCashflowsFromInvestingActivities;
    @JsonProperty("changeToAccountReceivables")
    private ChangeToAccountReceivables__1 changeToAccountReceivables;
    @JsonProperty("otherCashflowsFromFinancingActivities")
    private OtherCashflowsFromFinancingActivities__1 otherCashflowsFromFinancingActivities;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("changeToNetincome")
    private ChangeToNetincome__1 changeToNetincome;
    @JsonProperty("capitalExpenditures")
    private CapitalExpenditures__1 capitalExpenditures;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("investments")
    public Investments__1 getInvestments() {
        return investments;
    }

    @JsonProperty("investments")
    public void setInvestments(Investments__1 investments) {
        this.investments = investments;
    }

    @JsonProperty("changeToLiabilities")
    public ChangeToLiabilities__1 getChangeToLiabilities() {
        return changeToLiabilities;
    }

    @JsonProperty("changeToLiabilities")
    public void setChangeToLiabilities(ChangeToLiabilities__1 changeToLiabilities) {
        this.changeToLiabilities = changeToLiabilities;
    }

    @JsonProperty("totalCashflowsFromInvestingActivities")
    public TotalCashflowsFromInvestingActivities__1 getTotalCashflowsFromInvestingActivities() {
        return totalCashflowsFromInvestingActivities;
    }

    @JsonProperty("totalCashflowsFromInvestingActivities")
    public void setTotalCashflowsFromInvestingActivities(TotalCashflowsFromInvestingActivities__1 totalCashflowsFromInvestingActivities) {
        this.totalCashflowsFromInvestingActivities = totalCashflowsFromInvestingActivities;
    }

    @JsonProperty("netBorrowings")
    public NetBorrowings__1 getNetBorrowings() {
        return netBorrowings;
    }

    @JsonProperty("netBorrowings")
    public void setNetBorrowings(NetBorrowings__1 netBorrowings) {
        this.netBorrowings = netBorrowings;
    }

    @JsonProperty("totalCashFromFinancingActivities")
    public TotalCashFromFinancingActivities__1 getTotalCashFromFinancingActivities() {
        return totalCashFromFinancingActivities;
    }

    @JsonProperty("totalCashFromFinancingActivities")
    public void setTotalCashFromFinancingActivities(TotalCashFromFinancingActivities__1 totalCashFromFinancingActivities) {
        this.totalCashFromFinancingActivities = totalCashFromFinancingActivities;
    }

    @JsonProperty("changeToOperatingActivities")
    public ChangeToOperatingActivities__1 getChangeToOperatingActivities() {
        return changeToOperatingActivities;
    }

    @JsonProperty("changeToOperatingActivities")
    public void setChangeToOperatingActivities(ChangeToOperatingActivities__1 changeToOperatingActivities) {
        this.changeToOperatingActivities = changeToOperatingActivities;
    }

    @JsonProperty("netIncome")
    public NetIncome__3 getNetIncome() {
        return netIncome;
    }

    @JsonProperty("netIncome")
    public void setNetIncome(NetIncome__3 netIncome) {
        this.netIncome = netIncome;
    }

    @JsonProperty("changeInCash")
    public ChangeInCash__1 getChangeInCash() {
        return changeInCash;
    }

    @JsonProperty("changeInCash")
    public void setChangeInCash(ChangeInCash__1 changeInCash) {
        this.changeInCash = changeInCash;
    }

    @JsonProperty("endDate")
    public EndDate__5 getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(EndDate__5 endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("repurchaseOfStock")
    public RepurchaseOfStock__1 getRepurchaseOfStock() {
        return repurchaseOfStock;
    }

    @JsonProperty("repurchaseOfStock")
    public void setRepurchaseOfStock(RepurchaseOfStock__1 repurchaseOfStock) {
        this.repurchaseOfStock = repurchaseOfStock;
    }

    @JsonProperty("effectOfExchangeRate")
    public EffectOfExchangeRate__1 getEffectOfExchangeRate() {
        return effectOfExchangeRate;
    }

    @JsonProperty("effectOfExchangeRate")
    public void setEffectOfExchangeRate(EffectOfExchangeRate__1 effectOfExchangeRate) {
        this.effectOfExchangeRate = effectOfExchangeRate;
    }

    @JsonProperty("totalCashFromOperatingActivities")
    public TotalCashFromOperatingActivities__1 getTotalCashFromOperatingActivities() {
        return totalCashFromOperatingActivities;
    }

    @JsonProperty("totalCashFromOperatingActivities")
    public void setTotalCashFromOperatingActivities(TotalCashFromOperatingActivities__1 totalCashFromOperatingActivities) {
        this.totalCashFromOperatingActivities = totalCashFromOperatingActivities;
    }

    @JsonProperty("depreciation")
    public Depreciation__1 getDepreciation() {
        return depreciation;
    }

    @JsonProperty("depreciation")
    public void setDepreciation(Depreciation__1 depreciation) {
        this.depreciation = depreciation;
    }

    @JsonProperty("otherCashflowsFromInvestingActivities")
    public OtherCashflowsFromInvestingActivities__1 getOtherCashflowsFromInvestingActivities() {
        return otherCashflowsFromInvestingActivities;
    }

    @JsonProperty("otherCashflowsFromInvestingActivities")
    public void setOtherCashflowsFromInvestingActivities(OtherCashflowsFromInvestingActivities__1 otherCashflowsFromInvestingActivities) {
        this.otherCashflowsFromInvestingActivities = otherCashflowsFromInvestingActivities;
    }

    @JsonProperty("changeToAccountReceivables")
    public ChangeToAccountReceivables__1 getChangeToAccountReceivables() {
        return changeToAccountReceivables;
    }

    @JsonProperty("changeToAccountReceivables")
    public void setChangeToAccountReceivables(ChangeToAccountReceivables__1 changeToAccountReceivables) {
        this.changeToAccountReceivables = changeToAccountReceivables;
    }

    @JsonProperty("otherCashflowsFromFinancingActivities")
    public OtherCashflowsFromFinancingActivities__1 getOtherCashflowsFromFinancingActivities() {
        return otherCashflowsFromFinancingActivities;
    }

    @JsonProperty("otherCashflowsFromFinancingActivities")
    public void setOtherCashflowsFromFinancingActivities(OtherCashflowsFromFinancingActivities__1 otherCashflowsFromFinancingActivities) {
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
    public ChangeToNetincome__1 getChangeToNetincome() {
        return changeToNetincome;
    }

    @JsonProperty("changeToNetincome")
    public void setChangeToNetincome(ChangeToNetincome__1 changeToNetincome) {
        this.changeToNetincome = changeToNetincome;
    }

    @JsonProperty("capitalExpenditures")
    public CapitalExpenditures__1 getCapitalExpenditures() {
        return capitalExpenditures;
    }

    @JsonProperty("capitalExpenditures")
    public void setCapitalExpenditures(CapitalExpenditures__1 capitalExpenditures) {
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
        sb.append(CashflowStatement__1.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof CashflowStatement__1) == false) {
            return false;
        }
        CashflowStatement__1 rhs = ((CashflowStatement__1) other);
        return (((((((((((((((((((((this.endDate == rhs.endDate) || ((this.endDate != null) && this.endDate.equals(rhs.endDate))) && ((this.capitalExpenditures == rhs.capitalExpenditures) || ((this.capitalExpenditures != null) && this.capitalExpenditures.equals(rhs.capitalExpenditures)))) && ((this.repurchaseOfStock == rhs.repurchaseOfStock) || ((this.repurchaseOfStock != null) && this.repurchaseOfStock.equals(rhs.repurchaseOfStock)))) && ((this.investments == rhs.investments) || ((this.investments != null) && this.investments.equals(rhs.investments)))) && ((this.totalCashFromOperatingActivities == rhs.totalCashFromOperatingActivities) || ((this.totalCashFromOperatingActivities != null) && this.totalCashFromOperatingActivities.equals(rhs.totalCashFromOperatingActivities)))) && ((this.changeInCash == rhs.changeInCash) || ((this.changeInCash != null) && this.changeInCash.equals(rhs.changeInCash)))) && ((this.changeToAccountReceivables == rhs.changeToAccountReceivables) || ((this.changeToAccountReceivables != null) && this.changeToAccountReceivables.equals(rhs.changeToAccountReceivables)))) && ((this.netBorrowings == rhs.netBorrowings) || ((this.netBorrowings != null) && this.netBorrowings.equals(rhs.netBorrowings)))) && ((this.changeToOperatingActivities == rhs.changeToOperatingActivities) || ((this.changeToOperatingActivities != null) && this.changeToOperatingActivities.equals(rhs.changeToOperatingActivities)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.effectOfExchangeRate == rhs.effectOfExchangeRate) || ((this.effectOfExchangeRate != null) && this.effectOfExchangeRate.equals(rhs.effectOfExchangeRate)))) && ((this.totalCashflowsFromInvestingActivities == rhs.totalCashflowsFromInvestingActivities) || ((this.totalCashflowsFromInvestingActivities != null) && this.totalCashflowsFromInvestingActivities.equals(rhs.totalCashflowsFromInvestingActivities)))) && ((this.netIncome == rhs.netIncome) || ((this.netIncome != null) && this.netIncome.equals(rhs.netIncome)))) && ((this.otherCashflowsFromFinancingActivities == rhs.otherCashflowsFromFinancingActivities) || ((this.otherCashflowsFromFinancingActivities != null) && this.otherCashflowsFromFinancingActivities.equals(rhs.otherCashflowsFromFinancingActivities)))) && ((this.totalCashFromFinancingActivities == rhs.totalCashFromFinancingActivities) || ((this.totalCashFromFinancingActivities != null) && this.totalCashFromFinancingActivities.equals(rhs.totalCashFromFinancingActivities)))) && ((this.otherCashflowsFromInvestingActivities == rhs.otherCashflowsFromInvestingActivities) || ((this.otherCashflowsFromInvestingActivities != null) && this.otherCashflowsFromInvestingActivities.equals(rhs.otherCashflowsFromInvestingActivities)))) && ((this.changeToNetincome == rhs.changeToNetincome) || ((this.changeToNetincome != null) && this.changeToNetincome.equals(rhs.changeToNetincome)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.changeToLiabilities == rhs.changeToLiabilities) || ((this.changeToLiabilities != null) && this.changeToLiabilities.equals(rhs.changeToLiabilities)))) && ((this.depreciation == rhs.depreciation) || ((this.depreciation != null) && this.depreciation.equals(rhs.depreciation))));
    }

}
