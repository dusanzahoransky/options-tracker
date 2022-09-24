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
    "annualTotalNonCurrentAssets",
    "annualCurrentLiabilities",
    "annualGainsLossesNotAffectingRetainedEarnings",
    "annualNetPPE",
    "annualCurrentAccruedExpenses",
    "annualRetainedEarnings",
    "annualAccountsPayable",
    "annualOtherShortTermInvestments",
    "annualGrossPPE",
    "annualOtherNonCurrentAssets",
    "annualGoodwill",
    "annualInventory",
    "annualIncomeTaxPayable",
    "annualCashAndCashEquivalents",
    "annualTotalAssets",
    "annualNonCurrentDeferredTaxesLiabilities",
    "annualTotalNonCurrentLiabilitiesNetMinorityInterest",
    "annualTotalLiabilitiesNetMinorityInterest",
    "annualAccumulatedDepreciation",
    "annualCashCashEquivalentsAndShortTermInvestments",
    "annualOtherCurrentLiabilities",
    "annualOtherIntangibleAssets",
    "annualStockholdersEquity",
    "annualCurrentDeferredRevenue",
    "annualCurrentDebt",
    "annualInvestmentsAndAdvances",
    "annualNonCurrentDeferredRevenue",
    "annualOtherCurrentAssets",
    "annualOtherNonCurrentLiabilities",
    "annualCurrentAssets",
    "annualAccountsReceivable",
    "annualLongTermDebt",
    "annualCapitalStock",
    "timestamp"
})
public class TimeSeries {

    @JsonProperty("annualTotalNonCurrentAssets")
    private List<AnnualTotalNonCurrentAsset> annualTotalNonCurrentAssets = new ArrayList<AnnualTotalNonCurrentAsset>();
    @JsonProperty("annualCurrentLiabilities")
    private List<AnnualCurrentLiability> annualCurrentLiabilities = new ArrayList<AnnualCurrentLiability>();
    @JsonProperty("annualGainsLossesNotAffectingRetainedEarnings")
    private List<AnnualGainsLossesNotAffectingRetainedEarning> annualGainsLossesNotAffectingRetainedEarnings = new ArrayList<AnnualGainsLossesNotAffectingRetainedEarning>();
    @JsonProperty("annualNetPPE")
    private List<AnnualNetPPE> annualNetPPE = new ArrayList<AnnualNetPPE>();
    @JsonProperty("annualCurrentAccruedExpenses")
    private List<AnnualCurrentAccruedExpense> annualCurrentAccruedExpenses = new ArrayList<AnnualCurrentAccruedExpense>();
    @JsonProperty("annualRetainedEarnings")
    private List<AnnualRetainedEarning> annualRetainedEarnings = new ArrayList<AnnualRetainedEarning>();
    @JsonProperty("annualAccountsPayable")
    private List<AnnualAccountsPayable> annualAccountsPayable = new ArrayList<AnnualAccountsPayable>();
    @JsonProperty("annualOtherShortTermInvestments")
    private List<AnnualOtherShortTermInvestment> annualOtherShortTermInvestments = new ArrayList<AnnualOtherShortTermInvestment>();
    @JsonProperty("annualGrossPPE")
    private List<AnnualGrossPPE> annualGrossPPE = new ArrayList<AnnualGrossPPE>();
    @JsonProperty("annualOtherNonCurrentAssets")
    private List<Object> annualOtherNonCurrentAssets = new ArrayList<Object>();
    @JsonProperty("annualGoodwill")
    private List<AnnualGoodwill> annualGoodwill = new ArrayList<AnnualGoodwill>();
    @JsonProperty("annualInventory")
    private List<AnnualInventory> annualInventory = new ArrayList<AnnualInventory>();
    @JsonProperty("annualIncomeTaxPayable")
    private List<AnnualIncomeTaxPayable> annualIncomeTaxPayable = new ArrayList<AnnualIncomeTaxPayable>();
    @JsonProperty("annualCashAndCashEquivalents")
    private List<AnnualCashAndCashEquivalent> annualCashAndCashEquivalents = new ArrayList<AnnualCashAndCashEquivalent>();
    @JsonProperty("annualTotalAssets")
    private List<AnnualTotalAsset> annualTotalAssets = new ArrayList<AnnualTotalAsset>();
    @JsonProperty("annualNonCurrentDeferredTaxesLiabilities")
    private List<AnnualNonCurrentDeferredTaxesLiability> annualNonCurrentDeferredTaxesLiabilities = new ArrayList<AnnualNonCurrentDeferredTaxesLiability>();
    @JsonProperty("annualTotalNonCurrentLiabilitiesNetMinorityInterest")
    private List<AnnualTotalNonCurrentLiabilitiesNetMinorityInterest> annualTotalNonCurrentLiabilitiesNetMinorityInterest = new ArrayList<AnnualTotalNonCurrentLiabilitiesNetMinorityInterest>();
    @JsonProperty("annualTotalLiabilitiesNetMinorityInterest")
    private List<AnnualTotalLiabilitiesNetMinorityInterest> annualTotalLiabilitiesNetMinorityInterest = new ArrayList<AnnualTotalLiabilitiesNetMinorityInterest>();
    @JsonProperty("annualAccumulatedDepreciation")
    private List<AnnualAccumulatedDepreciation> annualAccumulatedDepreciation = new ArrayList<AnnualAccumulatedDepreciation>();
    @JsonProperty("annualCashCashEquivalentsAndShortTermInvestments")
    private List<AnnualCashCashEquivalentsAndShortTermInvestment> annualCashCashEquivalentsAndShortTermInvestments = new ArrayList<AnnualCashCashEquivalentsAndShortTermInvestment>();
    @JsonProperty("annualOtherCurrentLiabilities")
    private List<Object> annualOtherCurrentLiabilities = new ArrayList<Object>();
    @JsonProperty("annualOtherIntangibleAssets")
    private List<AnnualOtherIntangibleAsset> annualOtherIntangibleAssets = new ArrayList<AnnualOtherIntangibleAsset>();
    @JsonProperty("annualStockholdersEquity")
    private List<AnnualStockholdersEquity> annualStockholdersEquity = new ArrayList<AnnualStockholdersEquity>();
    @JsonProperty("annualCurrentDeferredRevenue")
    private List<AnnualCurrentDeferredRevenue> annualCurrentDeferredRevenue = new ArrayList<AnnualCurrentDeferredRevenue>();
    @JsonProperty("annualCurrentDebt")
    private List<Object> annualCurrentDebt = new ArrayList<Object>();
    @JsonProperty("annualInvestmentsAndAdvances")
    private List<AnnualInvestmentsAndAdvance> annualInvestmentsAndAdvances = new ArrayList<AnnualInvestmentsAndAdvance>();
    @JsonProperty("annualNonCurrentDeferredRevenue")
    private List<AnnualNonCurrentDeferredRevenue> annualNonCurrentDeferredRevenue = new ArrayList<AnnualNonCurrentDeferredRevenue>();
    @JsonProperty("annualOtherCurrentAssets")
    private List<Object> annualOtherCurrentAssets = new ArrayList<Object>();
    @JsonProperty("annualOtherNonCurrentLiabilities")
    private List<AnnualOtherNonCurrentLiability> annualOtherNonCurrentLiabilities = new ArrayList<AnnualOtherNonCurrentLiability>();
    @JsonProperty("annualCurrentAssets")
    private List<AnnualCurrentAsset> annualCurrentAssets = new ArrayList<AnnualCurrentAsset>();
    @JsonProperty("annualAccountsReceivable")
    private List<AnnualAccountsReceivable> annualAccountsReceivable = new ArrayList<AnnualAccountsReceivable>();
    @JsonProperty("annualLongTermDebt")
    private List<AnnualLongTermDebt> annualLongTermDebt = new ArrayList<AnnualLongTermDebt>();
    @JsonProperty("annualCapitalStock")
    private List<AnnualCapitalStock> annualCapitalStock = new ArrayList<AnnualCapitalStock>();
    @JsonProperty("timestamp")
    private List<Long> timestamp = new ArrayList<Long>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("annualTotalNonCurrentAssets")
    public List<AnnualTotalNonCurrentAsset> getAnnualTotalNonCurrentAssets() {
        return annualTotalNonCurrentAssets;
    }

    @JsonProperty("annualTotalNonCurrentAssets")
    public void setAnnualTotalNonCurrentAssets(List<AnnualTotalNonCurrentAsset> annualTotalNonCurrentAssets) {
        this.annualTotalNonCurrentAssets = annualTotalNonCurrentAssets;
    }

    @JsonProperty("annualCurrentLiabilities")
    public List<AnnualCurrentLiability> getAnnualCurrentLiabilities() {
        return annualCurrentLiabilities;
    }

    @JsonProperty("annualCurrentLiabilities")
    public void setAnnualCurrentLiabilities(List<AnnualCurrentLiability> annualCurrentLiabilities) {
        this.annualCurrentLiabilities = annualCurrentLiabilities;
    }

    @JsonProperty("annualGainsLossesNotAffectingRetainedEarnings")
    public List<AnnualGainsLossesNotAffectingRetainedEarning> getAnnualGainsLossesNotAffectingRetainedEarnings() {
        return annualGainsLossesNotAffectingRetainedEarnings;
    }

    @JsonProperty("annualGainsLossesNotAffectingRetainedEarnings")
    public void setAnnualGainsLossesNotAffectingRetainedEarnings(List<AnnualGainsLossesNotAffectingRetainedEarning> annualGainsLossesNotAffectingRetainedEarnings) {
        this.annualGainsLossesNotAffectingRetainedEarnings = annualGainsLossesNotAffectingRetainedEarnings;
    }

    @JsonProperty("annualNetPPE")
    public List<AnnualNetPPE> getAnnualNetPPE() {
        return annualNetPPE;
    }

    @JsonProperty("annualNetPPE")
    public void setAnnualNetPPE(List<AnnualNetPPE> annualNetPPE) {
        this.annualNetPPE = annualNetPPE;
    }

    @JsonProperty("annualCurrentAccruedExpenses")
    public List<AnnualCurrentAccruedExpense> getAnnualCurrentAccruedExpenses() {
        return annualCurrentAccruedExpenses;
    }

    @JsonProperty("annualCurrentAccruedExpenses")
    public void setAnnualCurrentAccruedExpenses(List<AnnualCurrentAccruedExpense> annualCurrentAccruedExpenses) {
        this.annualCurrentAccruedExpenses = annualCurrentAccruedExpenses;
    }

    @JsonProperty("annualRetainedEarnings")
    public List<AnnualRetainedEarning> getAnnualRetainedEarnings() {
        return annualRetainedEarnings;
    }

    @JsonProperty("annualRetainedEarnings")
    public void setAnnualRetainedEarnings(List<AnnualRetainedEarning> annualRetainedEarnings) {
        this.annualRetainedEarnings = annualRetainedEarnings;
    }

    @JsonProperty("annualAccountsPayable")
    public List<AnnualAccountsPayable> getAnnualAccountsPayable() {
        return annualAccountsPayable;
    }

    @JsonProperty("annualAccountsPayable")
    public void setAnnualAccountsPayable(List<AnnualAccountsPayable> annualAccountsPayable) {
        this.annualAccountsPayable = annualAccountsPayable;
    }

    @JsonProperty("annualOtherShortTermInvestments")
    public List<AnnualOtherShortTermInvestment> getAnnualOtherShortTermInvestments() {
        return annualOtherShortTermInvestments;
    }

    @JsonProperty("annualOtherShortTermInvestments")
    public void setAnnualOtherShortTermInvestments(List<AnnualOtherShortTermInvestment> annualOtherShortTermInvestments) {
        this.annualOtherShortTermInvestments = annualOtherShortTermInvestments;
    }

    @JsonProperty("annualGrossPPE")
    public List<AnnualGrossPPE> getAnnualGrossPPE() {
        return annualGrossPPE;
    }

    @JsonProperty("annualGrossPPE")
    public void setAnnualGrossPPE(List<AnnualGrossPPE> annualGrossPPE) {
        this.annualGrossPPE = annualGrossPPE;
    }

    @JsonProperty("annualOtherNonCurrentAssets")
    public List<Object> getAnnualOtherNonCurrentAssets() {
        return annualOtherNonCurrentAssets;
    }

    @JsonProperty("annualOtherNonCurrentAssets")
    public void setAnnualOtherNonCurrentAssets(List<Object> annualOtherNonCurrentAssets) {
        this.annualOtherNonCurrentAssets = annualOtherNonCurrentAssets;
    }

    @JsonProperty("annualGoodwill")
    public List<AnnualGoodwill> getAnnualGoodwill() {
        return annualGoodwill;
    }

    @JsonProperty("annualGoodwill")
    public void setAnnualGoodwill(List<AnnualGoodwill> annualGoodwill) {
        this.annualGoodwill = annualGoodwill;
    }

    @JsonProperty("annualInventory")
    public List<AnnualInventory> getAnnualInventory() {
        return annualInventory;
    }

    @JsonProperty("annualInventory")
    public void setAnnualInventory(List<AnnualInventory> annualInventory) {
        this.annualInventory = annualInventory;
    }

    @JsonProperty("annualIncomeTaxPayable")
    public List<AnnualIncomeTaxPayable> getAnnualIncomeTaxPayable() {
        return annualIncomeTaxPayable;
    }

    @JsonProperty("annualIncomeTaxPayable")
    public void setAnnualIncomeTaxPayable(List<AnnualIncomeTaxPayable> annualIncomeTaxPayable) {
        this.annualIncomeTaxPayable = annualIncomeTaxPayable;
    }

    @JsonProperty("annualCashAndCashEquivalents")
    public List<AnnualCashAndCashEquivalent> getAnnualCashAndCashEquivalents() {
        return annualCashAndCashEquivalents;
    }

    @JsonProperty("annualCashAndCashEquivalents")
    public void setAnnualCashAndCashEquivalents(List<AnnualCashAndCashEquivalent> annualCashAndCashEquivalents) {
        this.annualCashAndCashEquivalents = annualCashAndCashEquivalents;
    }

    @JsonProperty("annualTotalAssets")
    public List<AnnualTotalAsset> getAnnualTotalAssets() {
        return annualTotalAssets;
    }

    @JsonProperty("annualTotalAssets")
    public void setAnnualTotalAssets(List<AnnualTotalAsset> annualTotalAssets) {
        this.annualTotalAssets = annualTotalAssets;
    }

    @JsonProperty("annualNonCurrentDeferredTaxesLiabilities")
    public List<AnnualNonCurrentDeferredTaxesLiability> getAnnualNonCurrentDeferredTaxesLiabilities() {
        return annualNonCurrentDeferredTaxesLiabilities;
    }

    @JsonProperty("annualNonCurrentDeferredTaxesLiabilities")
    public void setAnnualNonCurrentDeferredTaxesLiabilities(List<AnnualNonCurrentDeferredTaxesLiability> annualNonCurrentDeferredTaxesLiabilities) {
        this.annualNonCurrentDeferredTaxesLiabilities = annualNonCurrentDeferredTaxesLiabilities;
    }

    @JsonProperty("annualTotalNonCurrentLiabilitiesNetMinorityInterest")
    public List<AnnualTotalNonCurrentLiabilitiesNetMinorityInterest> getAnnualTotalNonCurrentLiabilitiesNetMinorityInterest() {
        return annualTotalNonCurrentLiabilitiesNetMinorityInterest;
    }

    @JsonProperty("annualTotalNonCurrentLiabilitiesNetMinorityInterest")
    public void setAnnualTotalNonCurrentLiabilitiesNetMinorityInterest(List<AnnualTotalNonCurrentLiabilitiesNetMinorityInterest> annualTotalNonCurrentLiabilitiesNetMinorityInterest) {
        this.annualTotalNonCurrentLiabilitiesNetMinorityInterest = annualTotalNonCurrentLiabilitiesNetMinorityInterest;
    }

    @JsonProperty("annualTotalLiabilitiesNetMinorityInterest")
    public List<AnnualTotalLiabilitiesNetMinorityInterest> getAnnualTotalLiabilitiesNetMinorityInterest() {
        return annualTotalLiabilitiesNetMinorityInterest;
    }

    @JsonProperty("annualTotalLiabilitiesNetMinorityInterest")
    public void setAnnualTotalLiabilitiesNetMinorityInterest(List<AnnualTotalLiabilitiesNetMinorityInterest> annualTotalLiabilitiesNetMinorityInterest) {
        this.annualTotalLiabilitiesNetMinorityInterest = annualTotalLiabilitiesNetMinorityInterest;
    }

    @JsonProperty("annualAccumulatedDepreciation")
    public List<AnnualAccumulatedDepreciation> getAnnualAccumulatedDepreciation() {
        return annualAccumulatedDepreciation;
    }

    @JsonProperty("annualAccumulatedDepreciation")
    public void setAnnualAccumulatedDepreciation(List<AnnualAccumulatedDepreciation> annualAccumulatedDepreciation) {
        this.annualAccumulatedDepreciation = annualAccumulatedDepreciation;
    }

    @JsonProperty("annualCashCashEquivalentsAndShortTermInvestments")
    public List<AnnualCashCashEquivalentsAndShortTermInvestment> getAnnualCashCashEquivalentsAndShortTermInvestments() {
        return annualCashCashEquivalentsAndShortTermInvestments;
    }

    @JsonProperty("annualCashCashEquivalentsAndShortTermInvestments")
    public void setAnnualCashCashEquivalentsAndShortTermInvestments(List<AnnualCashCashEquivalentsAndShortTermInvestment> annualCashCashEquivalentsAndShortTermInvestments) {
        this.annualCashCashEquivalentsAndShortTermInvestments = annualCashCashEquivalentsAndShortTermInvestments;
    }

    @JsonProperty("annualOtherCurrentLiabilities")
    public List<Object> getAnnualOtherCurrentLiabilities() {
        return annualOtherCurrentLiabilities;
    }

    @JsonProperty("annualOtherCurrentLiabilities")
    public void setAnnualOtherCurrentLiabilities(List<Object> annualOtherCurrentLiabilities) {
        this.annualOtherCurrentLiabilities = annualOtherCurrentLiabilities;
    }

    @JsonProperty("annualOtherIntangibleAssets")
    public List<AnnualOtherIntangibleAsset> getAnnualOtherIntangibleAssets() {
        return annualOtherIntangibleAssets;
    }

    @JsonProperty("annualOtherIntangibleAssets")
    public void setAnnualOtherIntangibleAssets(List<AnnualOtherIntangibleAsset> annualOtherIntangibleAssets) {
        this.annualOtherIntangibleAssets = annualOtherIntangibleAssets;
    }

    @JsonProperty("annualStockholdersEquity")
    public List<AnnualStockholdersEquity> getAnnualStockholdersEquity() {
        return annualStockholdersEquity;
    }

    @JsonProperty("annualStockholdersEquity")
    public void setAnnualStockholdersEquity(List<AnnualStockholdersEquity> annualStockholdersEquity) {
        this.annualStockholdersEquity = annualStockholdersEquity;
    }

    @JsonProperty("annualCurrentDeferredRevenue")
    public List<AnnualCurrentDeferredRevenue> getAnnualCurrentDeferredRevenue() {
        return annualCurrentDeferredRevenue;
    }

    @JsonProperty("annualCurrentDeferredRevenue")
    public void setAnnualCurrentDeferredRevenue(List<AnnualCurrentDeferredRevenue> annualCurrentDeferredRevenue) {
        this.annualCurrentDeferredRevenue = annualCurrentDeferredRevenue;
    }

    @JsonProperty("annualCurrentDebt")
    public List<Object> getAnnualCurrentDebt() {
        return annualCurrentDebt;
    }

    @JsonProperty("annualCurrentDebt")
    public void setAnnualCurrentDebt(List<Object> annualCurrentDebt) {
        this.annualCurrentDebt = annualCurrentDebt;
    }

    @JsonProperty("annualInvestmentsAndAdvances")
    public List<AnnualInvestmentsAndAdvance> getAnnualInvestmentsAndAdvances() {
        return annualInvestmentsAndAdvances;
    }

    @JsonProperty("annualInvestmentsAndAdvances")
    public void setAnnualInvestmentsAndAdvances(List<AnnualInvestmentsAndAdvance> annualInvestmentsAndAdvances) {
        this.annualInvestmentsAndAdvances = annualInvestmentsAndAdvances;
    }

    @JsonProperty("annualNonCurrentDeferredRevenue")
    public List<AnnualNonCurrentDeferredRevenue> getAnnualNonCurrentDeferredRevenue() {
        return annualNonCurrentDeferredRevenue;
    }

    @JsonProperty("annualNonCurrentDeferredRevenue")
    public void setAnnualNonCurrentDeferredRevenue(List<AnnualNonCurrentDeferredRevenue> annualNonCurrentDeferredRevenue) {
        this.annualNonCurrentDeferredRevenue = annualNonCurrentDeferredRevenue;
    }

    @JsonProperty("annualOtherCurrentAssets")
    public List<Object> getAnnualOtherCurrentAssets() {
        return annualOtherCurrentAssets;
    }

    @JsonProperty("annualOtherCurrentAssets")
    public void setAnnualOtherCurrentAssets(List<Object> annualOtherCurrentAssets) {
        this.annualOtherCurrentAssets = annualOtherCurrentAssets;
    }

    @JsonProperty("annualOtherNonCurrentLiabilities")
    public List<AnnualOtherNonCurrentLiability> getAnnualOtherNonCurrentLiabilities() {
        return annualOtherNonCurrentLiabilities;
    }

    @JsonProperty("annualOtherNonCurrentLiabilities")
    public void setAnnualOtherNonCurrentLiabilities(List<AnnualOtherNonCurrentLiability> annualOtherNonCurrentLiabilities) {
        this.annualOtherNonCurrentLiabilities = annualOtherNonCurrentLiabilities;
    }

    @JsonProperty("annualCurrentAssets")
    public List<AnnualCurrentAsset> getAnnualCurrentAssets() {
        return annualCurrentAssets;
    }

    @JsonProperty("annualCurrentAssets")
    public void setAnnualCurrentAssets(List<AnnualCurrentAsset> annualCurrentAssets) {
        this.annualCurrentAssets = annualCurrentAssets;
    }

    @JsonProperty("annualAccountsReceivable")
    public List<AnnualAccountsReceivable> getAnnualAccountsReceivable() {
        return annualAccountsReceivable;
    }

    @JsonProperty("annualAccountsReceivable")
    public void setAnnualAccountsReceivable(List<AnnualAccountsReceivable> annualAccountsReceivable) {
        this.annualAccountsReceivable = annualAccountsReceivable;
    }

    @JsonProperty("annualLongTermDebt")
    public List<AnnualLongTermDebt> getAnnualLongTermDebt() {
        return annualLongTermDebt;
    }

    @JsonProperty("annualLongTermDebt")
    public void setAnnualLongTermDebt(List<AnnualLongTermDebt> annualLongTermDebt) {
        this.annualLongTermDebt = annualLongTermDebt;
    }

    @JsonProperty("annualCapitalStock")
    public List<AnnualCapitalStock> getAnnualCapitalStock() {
        return annualCapitalStock;
    }

    @JsonProperty("annualCapitalStock")
    public void setAnnualCapitalStock(List<AnnualCapitalStock> annualCapitalStock) {
        this.annualCapitalStock = annualCapitalStock;
    }

    @JsonProperty("timestamp")
    public List<Long> getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(List<Long> timestamp) {
        this.timestamp = timestamp;
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
        sb.append(TimeSeries.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annualTotalNonCurrentAssets");
        sb.append('=');
        sb.append(((this.annualTotalNonCurrentAssets == null) ? "<null>" : this.annualTotalNonCurrentAssets));
        sb.append(',');
        sb.append("annualCurrentLiabilities");
        sb.append('=');
        sb.append(((this.annualCurrentLiabilities == null) ? "<null>" : this.annualCurrentLiabilities));
        sb.append(',');
        sb.append("annualGainsLossesNotAffectingRetainedEarnings");
        sb.append('=');
        sb.append(((this.annualGainsLossesNotAffectingRetainedEarnings == null) ? "<null>" : this.annualGainsLossesNotAffectingRetainedEarnings));
        sb.append(',');
        sb.append("annualNetPPE");
        sb.append('=');
        sb.append(((this.annualNetPPE == null) ? "<null>" : this.annualNetPPE));
        sb.append(',');
        sb.append("annualCurrentAccruedExpenses");
        sb.append('=');
        sb.append(((this.annualCurrentAccruedExpenses == null) ? "<null>" : this.annualCurrentAccruedExpenses));
        sb.append(',');
        sb.append("annualRetainedEarnings");
        sb.append('=');
        sb.append(((this.annualRetainedEarnings == null) ? "<null>" : this.annualRetainedEarnings));
        sb.append(',');
        sb.append("annualAccountsPayable");
        sb.append('=');
        sb.append(((this.annualAccountsPayable == null) ? "<null>" : this.annualAccountsPayable));
        sb.append(',');
        sb.append("annualOtherShortTermInvestments");
        sb.append('=');
        sb.append(((this.annualOtherShortTermInvestments == null) ? "<null>" : this.annualOtherShortTermInvestments));
        sb.append(',');
        sb.append("annualGrossPPE");
        sb.append('=');
        sb.append(((this.annualGrossPPE == null) ? "<null>" : this.annualGrossPPE));
        sb.append(',');
        sb.append("annualOtherNonCurrentAssets");
        sb.append('=');
        sb.append(((this.annualOtherNonCurrentAssets == null) ? "<null>" : this.annualOtherNonCurrentAssets));
        sb.append(',');
        sb.append("annualGoodwill");
        sb.append('=');
        sb.append(((this.annualGoodwill == null) ? "<null>" : this.annualGoodwill));
        sb.append(',');
        sb.append("annualInventory");
        sb.append('=');
        sb.append(((this.annualInventory == null) ? "<null>" : this.annualInventory));
        sb.append(',');
        sb.append("annualIncomeTaxPayable");
        sb.append('=');
        sb.append(((this.annualIncomeTaxPayable == null) ? "<null>" : this.annualIncomeTaxPayable));
        sb.append(',');
        sb.append("annualCashAndCashEquivalents");
        sb.append('=');
        sb.append(((this.annualCashAndCashEquivalents == null) ? "<null>" : this.annualCashAndCashEquivalents));
        sb.append(',');
        sb.append("annualTotalAssets");
        sb.append('=');
        sb.append(((this.annualTotalAssets == null) ? "<null>" : this.annualTotalAssets));
        sb.append(',');
        sb.append("annualNonCurrentDeferredTaxesLiabilities");
        sb.append('=');
        sb.append(((this.annualNonCurrentDeferredTaxesLiabilities == null) ? "<null>" : this.annualNonCurrentDeferredTaxesLiabilities));
        sb.append(',');
        sb.append("annualTotalNonCurrentLiabilitiesNetMinorityInterest");
        sb.append('=');
        sb.append(((this.annualTotalNonCurrentLiabilitiesNetMinorityInterest == null) ? "<null>" : this.annualTotalNonCurrentLiabilitiesNetMinorityInterest));
        sb.append(',');
        sb.append("annualTotalLiabilitiesNetMinorityInterest");
        sb.append('=');
        sb.append(((this.annualTotalLiabilitiesNetMinorityInterest == null) ? "<null>" : this.annualTotalLiabilitiesNetMinorityInterest));
        sb.append(',');
        sb.append("annualAccumulatedDepreciation");
        sb.append('=');
        sb.append(((this.annualAccumulatedDepreciation == null) ? "<null>" : this.annualAccumulatedDepreciation));
        sb.append(',');
        sb.append("annualCashCashEquivalentsAndShortTermInvestments");
        sb.append('=');
        sb.append(((this.annualCashCashEquivalentsAndShortTermInvestments == null) ? "<null>" : this.annualCashCashEquivalentsAndShortTermInvestments));
        sb.append(',');
        sb.append("annualOtherCurrentLiabilities");
        sb.append('=');
        sb.append(((this.annualOtherCurrentLiabilities == null) ? "<null>" : this.annualOtherCurrentLiabilities));
        sb.append(',');
        sb.append("annualOtherIntangibleAssets");
        sb.append('=');
        sb.append(((this.annualOtherIntangibleAssets == null) ? "<null>" : this.annualOtherIntangibleAssets));
        sb.append(',');
        sb.append("annualStockholdersEquity");
        sb.append('=');
        sb.append(((this.annualStockholdersEquity == null) ? "<null>" : this.annualStockholdersEquity));
        sb.append(',');
        sb.append("annualCurrentDeferredRevenue");
        sb.append('=');
        sb.append(((this.annualCurrentDeferredRevenue == null) ? "<null>" : this.annualCurrentDeferredRevenue));
        sb.append(',');
        sb.append("annualCurrentDebt");
        sb.append('=');
        sb.append(((this.annualCurrentDebt == null) ? "<null>" : this.annualCurrentDebt));
        sb.append(',');
        sb.append("annualInvestmentsAndAdvances");
        sb.append('=');
        sb.append(((this.annualInvestmentsAndAdvances == null) ? "<null>" : this.annualInvestmentsAndAdvances));
        sb.append(',');
        sb.append("annualNonCurrentDeferredRevenue");
        sb.append('=');
        sb.append(((this.annualNonCurrentDeferredRevenue == null) ? "<null>" : this.annualNonCurrentDeferredRevenue));
        sb.append(',');
        sb.append("annualOtherCurrentAssets");
        sb.append('=');
        sb.append(((this.annualOtherCurrentAssets == null) ? "<null>" : this.annualOtherCurrentAssets));
        sb.append(',');
        sb.append("annualOtherNonCurrentLiabilities");
        sb.append('=');
        sb.append(((this.annualOtherNonCurrentLiabilities == null) ? "<null>" : this.annualOtherNonCurrentLiabilities));
        sb.append(',');
        sb.append("annualCurrentAssets");
        sb.append('=');
        sb.append(((this.annualCurrentAssets == null) ? "<null>" : this.annualCurrentAssets));
        sb.append(',');
        sb.append("annualAccountsReceivable");
        sb.append('=');
        sb.append(((this.annualAccountsReceivable == null) ? "<null>" : this.annualAccountsReceivable));
        sb.append(',');
        sb.append("annualLongTermDebt");
        sb.append('=');
        sb.append(((this.annualLongTermDebt == null) ? "<null>" : this.annualLongTermDebt));
        sb.append(',');
        sb.append("annualCapitalStock");
        sb.append('=');
        sb.append(((this.annualCapitalStock == null) ? "<null>" : this.annualCapitalStock));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null) ? "<null>" : this.timestamp));
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
        result = ((result * 31) + ((this.annualOtherShortTermInvestments == null) ? 0 : this.annualOtherShortTermInvestments.hashCode()));
        result = ((result * 31) + ((this.annualStockholdersEquity == null) ? 0 : this.annualStockholdersEquity.hashCode()));
        result = ((result * 31) + ((this.annualGoodwill == null) ? 0 : this.annualGoodwill.hashCode()));
        result = ((result * 31) + ((this.annualCashAndCashEquivalents == null) ? 0 : this.annualCashAndCashEquivalents.hashCode()));
        result = ((result * 31) + ((this.annualOtherNonCurrentAssets == null) ? 0 : this.annualOtherNonCurrentAssets.hashCode()));
        result = ((result * 31) + ((this.annualNonCurrentDeferredTaxesLiabilities == null) ? 0 : this.annualNonCurrentDeferredTaxesLiabilities.hashCode()));
        result = ((result * 31) + ((this.annualTotalLiabilitiesNetMinorityInterest == null) ? 0 : this.annualTotalLiabilitiesNetMinorityInterest.hashCode()));
        result = ((result * 31) + ((this.annualAccountsReceivable == null) ? 0 : this.annualAccountsReceivable.hashCode()));
        result = ((result * 31) + ((this.annualGrossPPE == null) ? 0 : this.annualGrossPPE.hashCode()));
        result = ((result * 31) + ((this.annualOtherNonCurrentLiabilities == null) ? 0 : this.annualOtherNonCurrentLiabilities.hashCode()));
        result = ((result * 31) + ((this.annualTotalNonCurrentLiabilitiesNetMinorityInterest == null) ? 0 : this.annualTotalNonCurrentLiabilitiesNetMinorityInterest.hashCode()));
        result = ((result * 31) + ((this.annualAccumulatedDepreciation == null) ? 0 : this.annualAccumulatedDepreciation.hashCode()));
        result = ((result * 31) + ((this.annualRetainedEarnings == null) ? 0 : this.annualRetainedEarnings.hashCode()));
        result = ((result * 31) + ((this.annualCurrentAssets == null) ? 0 : this.annualCurrentAssets.hashCode()));
        result = ((result * 31) + ((this.annualCurrentDeferredRevenue == null) ? 0 : this.annualCurrentDeferredRevenue.hashCode()));
        result = ((result * 31) + ((this.annualTotalAssets == null) ? 0 : this.annualTotalAssets.hashCode()));
        result = ((result * 31) + ((this.annualCashCashEquivalentsAndShortTermInvestments == null) ? 0 : this.annualCashCashEquivalentsAndShortTermInvestments.hashCode()));
        result = ((result * 31) + ((this.annualLongTermDebt == null) ? 0 : this.annualLongTermDebt.hashCode()));
        result = ((result * 31) + ((this.annualGainsLossesNotAffectingRetainedEarnings == null) ? 0 : this.annualGainsLossesNotAffectingRetainedEarnings.hashCode()));
        result = ((result * 31) + ((this.annualCurrentAccruedExpenses == null) ? 0 : this.annualCurrentAccruedExpenses.hashCode()));
        result = ((result * 31) + ((this.annualAccountsPayable == null) ? 0 : this.annualAccountsPayable.hashCode()));
        result = ((result * 31) + ((this.annualOtherCurrentLiabilities == null) ? 0 : this.annualOtherCurrentLiabilities.hashCode()));
        result = ((result * 31) + ((this.timestamp == null) ? 0 : this.timestamp.hashCode()));
        result = ((result * 31) + ((this.annualOtherIntangibleAssets == null) ? 0 : this.annualOtherIntangibleAssets.hashCode()));
        result = ((result * 31) + ((this.annualNonCurrentDeferredRevenue == null) ? 0 : this.annualNonCurrentDeferredRevenue.hashCode()));
        result = ((result * 31) + ((this.annualIncomeTaxPayable == null) ? 0 : this.annualIncomeTaxPayable.hashCode()));
        result = ((result * 31) + ((this.annualCurrentLiabilities == null) ? 0 : this.annualCurrentLiabilities.hashCode()));
        result = ((result * 31) + ((this.annualTotalNonCurrentAssets == null) ? 0 : this.annualTotalNonCurrentAssets.hashCode()));
        result = ((result * 31) + ((this.annualInventory == null) ? 0 : this.annualInventory.hashCode()));
        result = ((result * 31) + ((this.annualCurrentDebt == null) ? 0 : this.annualCurrentDebt.hashCode()));
        result = ((result * 31) + ((this.annualInvestmentsAndAdvances == null) ? 0 : this.annualInvestmentsAndAdvances.hashCode()));
        result = ((result * 31) + ((this.annualOtherCurrentAssets == null) ? 0 : this.annualOtherCurrentAssets.hashCode()));
        result = ((result * 31) + ((this.annualCapitalStock == null) ? 0 : this.annualCapitalStock.hashCode()));
        result = ((result * 31) + ((this.annualNetPPE == null) ? 0 : this.annualNetPPE.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeSeries) == false) {
            return false;
        }
        TimeSeries rhs = ((TimeSeries) other);
        return ((((((((((((((((((((((((((((((((((((this.annualOtherShortTermInvestments == rhs.annualOtherShortTermInvestments) || ((this.annualOtherShortTermInvestments != null) && this.annualOtherShortTermInvestments.equals(rhs.annualOtherShortTermInvestments))) && ((this.annualStockholdersEquity == rhs.annualStockholdersEquity) || ((this.annualStockholdersEquity != null) && this.annualStockholdersEquity.equals(rhs.annualStockholdersEquity)))) && ((this.annualGoodwill == rhs.annualGoodwill) || ((this.annualGoodwill != null) && this.annualGoodwill.equals(rhs.annualGoodwill)))) && ((this.annualCashAndCashEquivalents == rhs.annualCashAndCashEquivalents) || ((this.annualCashAndCashEquivalents != null) && this.annualCashAndCashEquivalents.equals(rhs.annualCashAndCashEquivalents)))) && ((this.annualOtherNonCurrentAssets == rhs.annualOtherNonCurrentAssets) || ((this.annualOtherNonCurrentAssets != null) && this.annualOtherNonCurrentAssets.equals(rhs.annualOtherNonCurrentAssets)))) && ((this.annualNonCurrentDeferredTaxesLiabilities == rhs.annualNonCurrentDeferredTaxesLiabilities) || ((this.annualNonCurrentDeferredTaxesLiabilities != null) && this.annualNonCurrentDeferredTaxesLiabilities.equals(rhs.annualNonCurrentDeferredTaxesLiabilities)))) && ((this.annualTotalLiabilitiesNetMinorityInterest == rhs.annualTotalLiabilitiesNetMinorityInterest) || ((this.annualTotalLiabilitiesNetMinorityInterest != null) && this.annualTotalLiabilitiesNetMinorityInterest.equals(rhs.annualTotalLiabilitiesNetMinorityInterest)))) && ((this.annualAccountsReceivable == rhs.annualAccountsReceivable) || ((this.annualAccountsReceivable != null) && this.annualAccountsReceivable.equals(rhs.annualAccountsReceivable)))) && ((this.annualGrossPPE == rhs.annualGrossPPE) || ((this.annualGrossPPE != null) && this.annualGrossPPE.equals(rhs.annualGrossPPE)))) && ((this.annualOtherNonCurrentLiabilities == rhs.annualOtherNonCurrentLiabilities) || ((this.annualOtherNonCurrentLiabilities != null) && this.annualOtherNonCurrentLiabilities.equals(rhs.annualOtherNonCurrentLiabilities)))) && ((this.annualTotalNonCurrentLiabilitiesNetMinorityInterest == rhs.annualTotalNonCurrentLiabilitiesNetMinorityInterest) || ((this.annualTotalNonCurrentLiabilitiesNetMinorityInterest != null) && this.annualTotalNonCurrentLiabilitiesNetMinorityInterest.equals(rhs.annualTotalNonCurrentLiabilitiesNetMinorityInterest)))) && ((this.annualAccumulatedDepreciation == rhs.annualAccumulatedDepreciation) || ((this.annualAccumulatedDepreciation != null) && this.annualAccumulatedDepreciation.equals(rhs.annualAccumulatedDepreciation)))) && ((this.annualRetainedEarnings == rhs.annualRetainedEarnings) || ((this.annualRetainedEarnings != null) && this.annualRetainedEarnings.equals(rhs.annualRetainedEarnings)))) && ((this.annualCurrentAssets == rhs.annualCurrentAssets) || ((this.annualCurrentAssets != null) && this.annualCurrentAssets.equals(rhs.annualCurrentAssets)))) && ((this.annualCurrentDeferredRevenue == rhs.annualCurrentDeferredRevenue) || ((this.annualCurrentDeferredRevenue != null) && this.annualCurrentDeferredRevenue.equals(rhs.annualCurrentDeferredRevenue)))) && ((this.annualTotalAssets == rhs.annualTotalAssets) || ((this.annualTotalAssets != null) && this.annualTotalAssets.equals(rhs.annualTotalAssets)))) && ((this.annualCashCashEquivalentsAndShortTermInvestments == rhs.annualCashCashEquivalentsAndShortTermInvestments) || ((this.annualCashCashEquivalentsAndShortTermInvestments != null) && this.annualCashCashEquivalentsAndShortTermInvestments.equals(rhs.annualCashCashEquivalentsAndShortTermInvestments)))) && ((this.annualLongTermDebt == rhs.annualLongTermDebt) || ((this.annualLongTermDebt != null) && this.annualLongTermDebt.equals(rhs.annualLongTermDebt)))) && ((this.annualGainsLossesNotAffectingRetainedEarnings == rhs.annualGainsLossesNotAffectingRetainedEarnings) || ((this.annualGainsLossesNotAffectingRetainedEarnings != null) && this.annualGainsLossesNotAffectingRetainedEarnings.equals(rhs.annualGainsLossesNotAffectingRetainedEarnings)))) && ((this.annualCurrentAccruedExpenses == rhs.annualCurrentAccruedExpenses) || ((this.annualCurrentAccruedExpenses != null) && this.annualCurrentAccruedExpenses.equals(rhs.annualCurrentAccruedExpenses)))) && ((this.annualAccountsPayable == rhs.annualAccountsPayable) || ((this.annualAccountsPayable != null) && this.annualAccountsPayable.equals(rhs.annualAccountsPayable)))) && ((this.annualOtherCurrentLiabilities == rhs.annualOtherCurrentLiabilities) || ((this.annualOtherCurrentLiabilities != null) && this.annualOtherCurrentLiabilities.equals(rhs.annualOtherCurrentLiabilities)))) && ((this.timestamp == rhs.timestamp) || ((this.timestamp != null) && this.timestamp.equals(rhs.timestamp)))) && ((this.annualOtherIntangibleAssets == rhs.annualOtherIntangibleAssets) || ((this.annualOtherIntangibleAssets != null) && this.annualOtherIntangibleAssets.equals(rhs.annualOtherIntangibleAssets)))) && ((this.annualNonCurrentDeferredRevenue == rhs.annualNonCurrentDeferredRevenue) || ((this.annualNonCurrentDeferredRevenue != null) && this.annualNonCurrentDeferredRevenue.equals(rhs.annualNonCurrentDeferredRevenue)))) && ((this.annualIncomeTaxPayable == rhs.annualIncomeTaxPayable) || ((this.annualIncomeTaxPayable != null) && this.annualIncomeTaxPayable.equals(rhs.annualIncomeTaxPayable)))) && ((this.annualCurrentLiabilities == rhs.annualCurrentLiabilities) || ((this.annualCurrentLiabilities != null) && this.annualCurrentLiabilities.equals(rhs.annualCurrentLiabilities)))) && ((this.annualTotalNonCurrentAssets == rhs.annualTotalNonCurrentAssets) || ((this.annualTotalNonCurrentAssets != null) && this.annualTotalNonCurrentAssets.equals(rhs.annualTotalNonCurrentAssets)))) && ((this.annualInventory == rhs.annualInventory) || ((this.annualInventory != null) && this.annualInventory.equals(rhs.annualInventory)))) && ((this.annualCurrentDebt == rhs.annualCurrentDebt) || ((this.annualCurrentDebt != null) && this.annualCurrentDebt.equals(rhs.annualCurrentDebt)))) && ((this.annualInvestmentsAndAdvances == rhs.annualInvestmentsAndAdvances) || ((this.annualInvestmentsAndAdvances != null) && this.annualInvestmentsAndAdvances.equals(rhs.annualInvestmentsAndAdvances)))) && ((this.annualOtherCurrentAssets == rhs.annualOtherCurrentAssets) || ((this.annualOtherCurrentAssets != null) && this.annualOtherCurrentAssets.equals(rhs.annualOtherCurrentAssets)))) && ((this.annualCapitalStock == rhs.annualCapitalStock) || ((this.annualCapitalStock != null) && this.annualCapitalStock.equals(rhs.annualCapitalStock)))) && ((this.annualNetPPE == rhs.annualNetPPE) || ((this.annualNetPPE != null) && this.annualNetPPE.equals(rhs.annualNetPPE)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
