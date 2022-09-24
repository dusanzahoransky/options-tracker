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
    "trailingSellingGeneralAndAdministration",
    "annualOtherIncomeExpense",
    "annualDilutedAverageShares",
    "annualGrossProfit",
    "annualOperatingExpense",
    "trailingGrossProfit",
    "trailingNetIncome",
    "annualResearchAndDevelopment",
    "trailingNetIncomeCommonStockholders",
    "annualBasicAverageShares",
    "annualSellingGeneralAndAdministration",
    "annualTaxProvision",
    "trailingTaxProvision",
    "trailingPretaxIncome",
    "annualNetIncomeCommonStockholders",
    "annualPretaxIncome",
    "annualInterestExpense",
    "trailingCostOfRevenue",
    "trailingInterestExpense",
    "annualEbitda",
    "annualNetIncomeContinuousOperations",
    "annualCostOfRevenue",
    "annualTotalRevenue",
    "trailingOperatingIncome",
    "annualDilutedEPS",
    "trailingTotalRevenue",
    "annualNetIncome",
    "trailingResearchAndDevelopment",
    "trailingOtherIncomeExpense",
    "annualBasicEPS",
    "trailingNetIncomeContinuousOperations",
    "annualOperatingIncome",
    "trailingOperatingExpense",
    "trailingDilutedEPS",
    "trailingDilutedAverageShares",
    "trailingBasicEPS",
    "trailingBasicAverageShares",
    "timestamp"
})
public class TimeSeries {

    @JsonProperty("trailingSellingGeneralAndAdministration")
    private List<TrailingSellingGeneralAndAdministration> trailingSellingGeneralAndAdministration = new ArrayList<TrailingSellingGeneralAndAdministration>();
    @JsonProperty("annualOtherIncomeExpense")
    private List<AnnualOtherIncomeExpense> annualOtherIncomeExpense = new ArrayList<AnnualOtherIncomeExpense>();
    @JsonProperty("annualDilutedAverageShares")
    private List<AnnualDilutedAverageShare> annualDilutedAverageShares = new ArrayList<AnnualDilutedAverageShare>();
    @JsonProperty("annualGrossProfit")
    private List<AnnualGrossProfit> annualGrossProfit = new ArrayList<AnnualGrossProfit>();
    @JsonProperty("annualOperatingExpense")
    private List<AnnualOperatingExpense> annualOperatingExpense = new ArrayList<AnnualOperatingExpense>();
    @JsonProperty("trailingGrossProfit")
    private List<TrailingGrossProfit> trailingGrossProfit = new ArrayList<TrailingGrossProfit>();
    @JsonProperty("trailingNetIncome")
    private List<TrailingNetIncome> trailingNetIncome = new ArrayList<TrailingNetIncome>();
    @JsonProperty("annualResearchAndDevelopment")
    private List<AnnualResearchAndDevelopment> annualResearchAndDevelopment = new ArrayList<AnnualResearchAndDevelopment>();
    @JsonProperty("trailingNetIncomeCommonStockholders")
    private List<TrailingNetIncomeCommonStockholder> trailingNetIncomeCommonStockholders = new ArrayList<TrailingNetIncomeCommonStockholder>();
    @JsonProperty("annualBasicAverageShares")
    private List<AnnualBasicAverageShare> annualBasicAverageShares = new ArrayList<AnnualBasicAverageShare>();
    @JsonProperty("annualSellingGeneralAndAdministration")
    private List<AnnualSellingGeneralAndAdministration> annualSellingGeneralAndAdministration = new ArrayList<AnnualSellingGeneralAndAdministration>();
    @JsonProperty("annualTaxProvision")
    private List<AnnualTaxProvision> annualTaxProvision = new ArrayList<AnnualTaxProvision>();
    @JsonProperty("trailingTaxProvision")
    private List<TrailingTaxProvision> trailingTaxProvision = new ArrayList<TrailingTaxProvision>();
    @JsonProperty("trailingPretaxIncome")
    private List<TrailingPretaxIncome> trailingPretaxIncome = new ArrayList<TrailingPretaxIncome>();
    @JsonProperty("annualNetIncomeCommonStockholders")
    private List<AnnualNetIncomeCommonStockholder> annualNetIncomeCommonStockholders = new ArrayList<AnnualNetIncomeCommonStockholder>();
    @JsonProperty("annualPretaxIncome")
    private List<AnnualPretaxIncome> annualPretaxIncome = new ArrayList<AnnualPretaxIncome>();
    @JsonProperty("annualInterestExpense")
    private List<AnnualInterestExpense> annualInterestExpense = new ArrayList<AnnualInterestExpense>();
    @JsonProperty("trailingCostOfRevenue")
    private List<TrailingCostOfRevenue> trailingCostOfRevenue = new ArrayList<TrailingCostOfRevenue>();
    @JsonProperty("trailingInterestExpense")
    private List<TrailingInterestExpense> trailingInterestExpense = new ArrayList<TrailingInterestExpense>();
    @JsonProperty("annualEbitda")
    private List<AnnualEbitda> annualEbitda = new ArrayList<AnnualEbitda>();
    @JsonProperty("annualNetIncomeContinuousOperations")
    private List<AnnualNetIncomeContinuousOperation> annualNetIncomeContinuousOperations = new ArrayList<AnnualNetIncomeContinuousOperation>();
    @JsonProperty("annualCostOfRevenue")
    private List<AnnualCostOfRevenue> annualCostOfRevenue = new ArrayList<AnnualCostOfRevenue>();
    @JsonProperty("annualTotalRevenue")
    private List<AnnualTotalRevenue> annualTotalRevenue = new ArrayList<AnnualTotalRevenue>();
    @JsonProperty("trailingOperatingIncome")
    private List<TrailingOperatingIncome> trailingOperatingIncome = new ArrayList<TrailingOperatingIncome>();
    @JsonProperty("annualDilutedEPS")
    private List<AnnualDilutedEP> annualDilutedEPS = new ArrayList<AnnualDilutedEP>();
    @JsonProperty("trailingTotalRevenue")
    private List<TrailingTotalRevenue> trailingTotalRevenue = new ArrayList<TrailingTotalRevenue>();
    @JsonProperty("annualNetIncome")
    private List<AnnualNetIncome> annualNetIncome = new ArrayList<AnnualNetIncome>();
    @JsonProperty("trailingResearchAndDevelopment")
    private List<TrailingResearchAndDevelopment> trailingResearchAndDevelopment = new ArrayList<TrailingResearchAndDevelopment>();
    @JsonProperty("trailingOtherIncomeExpense")
    private List<TrailingOtherIncomeExpense> trailingOtherIncomeExpense = new ArrayList<TrailingOtherIncomeExpense>();
    @JsonProperty("annualBasicEPS")
    private List<AnnualBasicEP> annualBasicEPS = new ArrayList<AnnualBasicEP>();
    @JsonProperty("trailingNetIncomeContinuousOperations")
    private List<TrailingNetIncomeContinuousOperation> trailingNetIncomeContinuousOperations = new ArrayList<TrailingNetIncomeContinuousOperation>();
    @JsonProperty("annualOperatingIncome")
    private List<AnnualOperatingIncome> annualOperatingIncome = new ArrayList<AnnualOperatingIncome>();
    @JsonProperty("trailingOperatingExpense")
    private List<TrailingOperatingExpense> trailingOperatingExpense = new ArrayList<TrailingOperatingExpense>();
    @JsonProperty("trailingDilutedEPS")
    private List<Object> trailingDilutedEPS = new ArrayList<Object>();
    @JsonProperty("trailingDilutedAverageShares")
    private List<Object> trailingDilutedAverageShares = new ArrayList<Object>();
    @JsonProperty("trailingBasicEPS")
    private List<Object> trailingBasicEPS = new ArrayList<Object>();
    @JsonProperty("trailingBasicAverageShares")
    private List<Object> trailingBasicAverageShares = new ArrayList<Object>();
    @JsonProperty("timestamp")
    private List<Long> timestamp = new ArrayList<Long>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("trailingSellingGeneralAndAdministration")
    public List<TrailingSellingGeneralAndAdministration> getTrailingSellingGeneralAndAdministration() {
        return trailingSellingGeneralAndAdministration;
    }

    @JsonProperty("trailingSellingGeneralAndAdministration")
    public void setTrailingSellingGeneralAndAdministration(List<TrailingSellingGeneralAndAdministration> trailingSellingGeneralAndAdministration) {
        this.trailingSellingGeneralAndAdministration = trailingSellingGeneralAndAdministration;
    }

    @JsonProperty("annualOtherIncomeExpense")
    public List<AnnualOtherIncomeExpense> getAnnualOtherIncomeExpense() {
        return annualOtherIncomeExpense;
    }

    @JsonProperty("annualOtherIncomeExpense")
    public void setAnnualOtherIncomeExpense(List<AnnualOtherIncomeExpense> annualOtherIncomeExpense) {
        this.annualOtherIncomeExpense = annualOtherIncomeExpense;
    }

    @JsonProperty("annualDilutedAverageShares")
    public List<AnnualDilutedAverageShare> getAnnualDilutedAverageShares() {
        return annualDilutedAverageShares;
    }

    @JsonProperty("annualDilutedAverageShares")
    public void setAnnualDilutedAverageShares(List<AnnualDilutedAverageShare> annualDilutedAverageShares) {
        this.annualDilutedAverageShares = annualDilutedAverageShares;
    }

    @JsonProperty("annualGrossProfit")
    public List<AnnualGrossProfit> getAnnualGrossProfit() {
        return annualGrossProfit;
    }

    @JsonProperty("annualGrossProfit")
    public void setAnnualGrossProfit(List<AnnualGrossProfit> annualGrossProfit) {
        this.annualGrossProfit = annualGrossProfit;
    }

    @JsonProperty("annualOperatingExpense")
    public List<AnnualOperatingExpense> getAnnualOperatingExpense() {
        return annualOperatingExpense;
    }

    @JsonProperty("annualOperatingExpense")
    public void setAnnualOperatingExpense(List<AnnualOperatingExpense> annualOperatingExpense) {
        this.annualOperatingExpense = annualOperatingExpense;
    }

    @JsonProperty("trailingGrossProfit")
    public List<TrailingGrossProfit> getTrailingGrossProfit() {
        return trailingGrossProfit;
    }

    @JsonProperty("trailingGrossProfit")
    public void setTrailingGrossProfit(List<TrailingGrossProfit> trailingGrossProfit) {
        this.trailingGrossProfit = trailingGrossProfit;
    }

    @JsonProperty("trailingNetIncome")
    public List<TrailingNetIncome> getTrailingNetIncome() {
        return trailingNetIncome;
    }

    @JsonProperty("trailingNetIncome")
    public void setTrailingNetIncome(List<TrailingNetIncome> trailingNetIncome) {
        this.trailingNetIncome = trailingNetIncome;
    }

    @JsonProperty("annualResearchAndDevelopment")
    public List<AnnualResearchAndDevelopment> getAnnualResearchAndDevelopment() {
        return annualResearchAndDevelopment;
    }

    @JsonProperty("annualResearchAndDevelopment")
    public void setAnnualResearchAndDevelopment(List<AnnualResearchAndDevelopment> annualResearchAndDevelopment) {
        this.annualResearchAndDevelopment = annualResearchAndDevelopment;
    }

    @JsonProperty("trailingNetIncomeCommonStockholders")
    public List<TrailingNetIncomeCommonStockholder> getTrailingNetIncomeCommonStockholders() {
        return trailingNetIncomeCommonStockholders;
    }

    @JsonProperty("trailingNetIncomeCommonStockholders")
    public void setTrailingNetIncomeCommonStockholders(List<TrailingNetIncomeCommonStockholder> trailingNetIncomeCommonStockholders) {
        this.trailingNetIncomeCommonStockholders = trailingNetIncomeCommonStockholders;
    }

    @JsonProperty("annualBasicAverageShares")
    public List<AnnualBasicAverageShare> getAnnualBasicAverageShares() {
        return annualBasicAverageShares;
    }

    @JsonProperty("annualBasicAverageShares")
    public void setAnnualBasicAverageShares(List<AnnualBasicAverageShare> annualBasicAverageShares) {
        this.annualBasicAverageShares = annualBasicAverageShares;
    }

    @JsonProperty("annualSellingGeneralAndAdministration")
    public List<AnnualSellingGeneralAndAdministration> getAnnualSellingGeneralAndAdministration() {
        return annualSellingGeneralAndAdministration;
    }

    @JsonProperty("annualSellingGeneralAndAdministration")
    public void setAnnualSellingGeneralAndAdministration(List<AnnualSellingGeneralAndAdministration> annualSellingGeneralAndAdministration) {
        this.annualSellingGeneralAndAdministration = annualSellingGeneralAndAdministration;
    }

    @JsonProperty("annualTaxProvision")
    public List<AnnualTaxProvision> getAnnualTaxProvision() {
        return annualTaxProvision;
    }

    @JsonProperty("annualTaxProvision")
    public void setAnnualTaxProvision(List<AnnualTaxProvision> annualTaxProvision) {
        this.annualTaxProvision = annualTaxProvision;
    }

    @JsonProperty("trailingTaxProvision")
    public List<TrailingTaxProvision> getTrailingTaxProvision() {
        return trailingTaxProvision;
    }

    @JsonProperty("trailingTaxProvision")
    public void setTrailingTaxProvision(List<TrailingTaxProvision> trailingTaxProvision) {
        this.trailingTaxProvision = trailingTaxProvision;
    }

    @JsonProperty("trailingPretaxIncome")
    public List<TrailingPretaxIncome> getTrailingPretaxIncome() {
        return trailingPretaxIncome;
    }

    @JsonProperty("trailingPretaxIncome")
    public void setTrailingPretaxIncome(List<TrailingPretaxIncome> trailingPretaxIncome) {
        this.trailingPretaxIncome = trailingPretaxIncome;
    }

    @JsonProperty("annualNetIncomeCommonStockholders")
    public List<AnnualNetIncomeCommonStockholder> getAnnualNetIncomeCommonStockholders() {
        return annualNetIncomeCommonStockholders;
    }

    @JsonProperty("annualNetIncomeCommonStockholders")
    public void setAnnualNetIncomeCommonStockholders(List<AnnualNetIncomeCommonStockholder> annualNetIncomeCommonStockholders) {
        this.annualNetIncomeCommonStockholders = annualNetIncomeCommonStockholders;
    }

    @JsonProperty("annualPretaxIncome")
    public List<AnnualPretaxIncome> getAnnualPretaxIncome() {
        return annualPretaxIncome;
    }

    @JsonProperty("annualPretaxIncome")
    public void setAnnualPretaxIncome(List<AnnualPretaxIncome> annualPretaxIncome) {
        this.annualPretaxIncome = annualPretaxIncome;
    }

    @JsonProperty("annualInterestExpense")
    public List<AnnualInterestExpense> getAnnualInterestExpense() {
        return annualInterestExpense;
    }

    @JsonProperty("annualInterestExpense")
    public void setAnnualInterestExpense(List<AnnualInterestExpense> annualInterestExpense) {
        this.annualInterestExpense = annualInterestExpense;
    }

    @JsonProperty("trailingCostOfRevenue")
    public List<TrailingCostOfRevenue> getTrailingCostOfRevenue() {
        return trailingCostOfRevenue;
    }

    @JsonProperty("trailingCostOfRevenue")
    public void setTrailingCostOfRevenue(List<TrailingCostOfRevenue> trailingCostOfRevenue) {
        this.trailingCostOfRevenue = trailingCostOfRevenue;
    }

    @JsonProperty("trailingInterestExpense")
    public List<TrailingInterestExpense> getTrailingInterestExpense() {
        return trailingInterestExpense;
    }

    @JsonProperty("trailingInterestExpense")
    public void setTrailingInterestExpense(List<TrailingInterestExpense> trailingInterestExpense) {
        this.trailingInterestExpense = trailingInterestExpense;
    }

    @JsonProperty("annualEbitda")
    public List<AnnualEbitda> getAnnualEbitda() {
        return annualEbitda;
    }

    @JsonProperty("annualEbitda")
    public void setAnnualEbitda(List<AnnualEbitda> annualEbitda) {
        this.annualEbitda = annualEbitda;
    }

    @JsonProperty("annualNetIncomeContinuousOperations")
    public List<AnnualNetIncomeContinuousOperation> getAnnualNetIncomeContinuousOperations() {
        return annualNetIncomeContinuousOperations;
    }

    @JsonProperty("annualNetIncomeContinuousOperations")
    public void setAnnualNetIncomeContinuousOperations(List<AnnualNetIncomeContinuousOperation> annualNetIncomeContinuousOperations) {
        this.annualNetIncomeContinuousOperations = annualNetIncomeContinuousOperations;
    }

    @JsonProperty("annualCostOfRevenue")
    public List<AnnualCostOfRevenue> getAnnualCostOfRevenue() {
        return annualCostOfRevenue;
    }

    @JsonProperty("annualCostOfRevenue")
    public void setAnnualCostOfRevenue(List<AnnualCostOfRevenue> annualCostOfRevenue) {
        this.annualCostOfRevenue = annualCostOfRevenue;
    }

    @JsonProperty("annualTotalRevenue")
    public List<AnnualTotalRevenue> getAnnualTotalRevenue() {
        return annualTotalRevenue;
    }

    @JsonProperty("annualTotalRevenue")
    public void setAnnualTotalRevenue(List<AnnualTotalRevenue> annualTotalRevenue) {
        this.annualTotalRevenue = annualTotalRevenue;
    }

    @JsonProperty("trailingOperatingIncome")
    public List<TrailingOperatingIncome> getTrailingOperatingIncome() {
        return trailingOperatingIncome;
    }

    @JsonProperty("trailingOperatingIncome")
    public void setTrailingOperatingIncome(List<TrailingOperatingIncome> trailingOperatingIncome) {
        this.trailingOperatingIncome = trailingOperatingIncome;
    }

    @JsonProperty("annualDilutedEPS")
    public List<AnnualDilutedEP> getAnnualDilutedEPS() {
        return annualDilutedEPS;
    }

    @JsonProperty("annualDilutedEPS")
    public void setAnnualDilutedEPS(List<AnnualDilutedEP> annualDilutedEPS) {
        this.annualDilutedEPS = annualDilutedEPS;
    }

    @JsonProperty("trailingTotalRevenue")
    public List<TrailingTotalRevenue> getTrailingTotalRevenue() {
        return trailingTotalRevenue;
    }

    @JsonProperty("trailingTotalRevenue")
    public void setTrailingTotalRevenue(List<TrailingTotalRevenue> trailingTotalRevenue) {
        this.trailingTotalRevenue = trailingTotalRevenue;
    }

    @JsonProperty("annualNetIncome")
    public List<AnnualNetIncome> getAnnualNetIncome() {
        return annualNetIncome;
    }

    @JsonProperty("annualNetIncome")
    public void setAnnualNetIncome(List<AnnualNetIncome> annualNetIncome) {
        this.annualNetIncome = annualNetIncome;
    }

    @JsonProperty("trailingResearchAndDevelopment")
    public List<TrailingResearchAndDevelopment> getTrailingResearchAndDevelopment() {
        return trailingResearchAndDevelopment;
    }

    @JsonProperty("trailingResearchAndDevelopment")
    public void setTrailingResearchAndDevelopment(List<TrailingResearchAndDevelopment> trailingResearchAndDevelopment) {
        this.trailingResearchAndDevelopment = trailingResearchAndDevelopment;
    }

    @JsonProperty("trailingOtherIncomeExpense")
    public List<TrailingOtherIncomeExpense> getTrailingOtherIncomeExpense() {
        return trailingOtherIncomeExpense;
    }

    @JsonProperty("trailingOtherIncomeExpense")
    public void setTrailingOtherIncomeExpense(List<TrailingOtherIncomeExpense> trailingOtherIncomeExpense) {
        this.trailingOtherIncomeExpense = trailingOtherIncomeExpense;
    }

    @JsonProperty("annualBasicEPS")
    public List<AnnualBasicEP> getAnnualBasicEPS() {
        return annualBasicEPS;
    }

    @JsonProperty("annualBasicEPS")
    public void setAnnualBasicEPS(List<AnnualBasicEP> annualBasicEPS) {
        this.annualBasicEPS = annualBasicEPS;
    }

    @JsonProperty("trailingNetIncomeContinuousOperations")
    public List<TrailingNetIncomeContinuousOperation> getTrailingNetIncomeContinuousOperations() {
        return trailingNetIncomeContinuousOperations;
    }

    @JsonProperty("trailingNetIncomeContinuousOperations")
    public void setTrailingNetIncomeContinuousOperations(List<TrailingNetIncomeContinuousOperation> trailingNetIncomeContinuousOperations) {
        this.trailingNetIncomeContinuousOperations = trailingNetIncomeContinuousOperations;
    }

    @JsonProperty("annualOperatingIncome")
    public List<AnnualOperatingIncome> getAnnualOperatingIncome() {
        return annualOperatingIncome;
    }

    @JsonProperty("annualOperatingIncome")
    public void setAnnualOperatingIncome(List<AnnualOperatingIncome> annualOperatingIncome) {
        this.annualOperatingIncome = annualOperatingIncome;
    }

    @JsonProperty("trailingOperatingExpense")
    public List<TrailingOperatingExpense> getTrailingOperatingExpense() {
        return trailingOperatingExpense;
    }

    @JsonProperty("trailingOperatingExpense")
    public void setTrailingOperatingExpense(List<TrailingOperatingExpense> trailingOperatingExpense) {
        this.trailingOperatingExpense = trailingOperatingExpense;
    }

    @JsonProperty("trailingDilutedEPS")
    public List<Object> getTrailingDilutedEPS() {
        return trailingDilutedEPS;
    }

    @JsonProperty("trailingDilutedEPS")
    public void setTrailingDilutedEPS(List<Object> trailingDilutedEPS) {
        this.trailingDilutedEPS = trailingDilutedEPS;
    }

    @JsonProperty("trailingDilutedAverageShares")
    public List<Object> getTrailingDilutedAverageShares() {
        return trailingDilutedAverageShares;
    }

    @JsonProperty("trailingDilutedAverageShares")
    public void setTrailingDilutedAverageShares(List<Object> trailingDilutedAverageShares) {
        this.trailingDilutedAverageShares = trailingDilutedAverageShares;
    }

    @JsonProperty("trailingBasicEPS")
    public List<Object> getTrailingBasicEPS() {
        return trailingBasicEPS;
    }

    @JsonProperty("trailingBasicEPS")
    public void setTrailingBasicEPS(List<Object> trailingBasicEPS) {
        this.trailingBasicEPS = trailingBasicEPS;
    }

    @JsonProperty("trailingBasicAverageShares")
    public List<Object> getTrailingBasicAverageShares() {
        return trailingBasicAverageShares;
    }

    @JsonProperty("trailingBasicAverageShares")
    public void setTrailingBasicAverageShares(List<Object> trailingBasicAverageShares) {
        this.trailingBasicAverageShares = trailingBasicAverageShares;
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
        sb.append("trailingSellingGeneralAndAdministration");
        sb.append('=');
        sb.append(((this.trailingSellingGeneralAndAdministration == null) ? "<null>" : this.trailingSellingGeneralAndAdministration));
        sb.append(',');
        sb.append("annualOtherIncomeExpense");
        sb.append('=');
        sb.append(((this.annualOtherIncomeExpense == null) ? "<null>" : this.annualOtherIncomeExpense));
        sb.append(',');
        sb.append("annualDilutedAverageShares");
        sb.append('=');
        sb.append(((this.annualDilutedAverageShares == null) ? "<null>" : this.annualDilutedAverageShares));
        sb.append(',');
        sb.append("annualGrossProfit");
        sb.append('=');
        sb.append(((this.annualGrossProfit == null) ? "<null>" : this.annualGrossProfit));
        sb.append(',');
        sb.append("annualOperatingExpense");
        sb.append('=');
        sb.append(((this.annualOperatingExpense == null) ? "<null>" : this.annualOperatingExpense));
        sb.append(',');
        sb.append("trailingGrossProfit");
        sb.append('=');
        sb.append(((this.trailingGrossProfit == null) ? "<null>" : this.trailingGrossProfit));
        sb.append(',');
        sb.append("trailingNetIncome");
        sb.append('=');
        sb.append(((this.trailingNetIncome == null) ? "<null>" : this.trailingNetIncome));
        sb.append(',');
        sb.append("annualResearchAndDevelopment");
        sb.append('=');
        sb.append(((this.annualResearchAndDevelopment == null) ? "<null>" : this.annualResearchAndDevelopment));
        sb.append(',');
        sb.append("trailingNetIncomeCommonStockholders");
        sb.append('=');
        sb.append(((this.trailingNetIncomeCommonStockholders == null) ? "<null>" : this.trailingNetIncomeCommonStockholders));
        sb.append(',');
        sb.append("annualBasicAverageShares");
        sb.append('=');
        sb.append(((this.annualBasicAverageShares == null) ? "<null>" : this.annualBasicAverageShares));
        sb.append(',');
        sb.append("annualSellingGeneralAndAdministration");
        sb.append('=');
        sb.append(((this.annualSellingGeneralAndAdministration == null) ? "<null>" : this.annualSellingGeneralAndAdministration));
        sb.append(',');
        sb.append("annualTaxProvision");
        sb.append('=');
        sb.append(((this.annualTaxProvision == null) ? "<null>" : this.annualTaxProvision));
        sb.append(',');
        sb.append("trailingTaxProvision");
        sb.append('=');
        sb.append(((this.trailingTaxProvision == null) ? "<null>" : this.trailingTaxProvision));
        sb.append(',');
        sb.append("trailingPretaxIncome");
        sb.append('=');
        sb.append(((this.trailingPretaxIncome == null) ? "<null>" : this.trailingPretaxIncome));
        sb.append(',');
        sb.append("annualNetIncomeCommonStockholders");
        sb.append('=');
        sb.append(((this.annualNetIncomeCommonStockholders == null) ? "<null>" : this.annualNetIncomeCommonStockholders));
        sb.append(',');
        sb.append("annualPretaxIncome");
        sb.append('=');
        sb.append(((this.annualPretaxIncome == null) ? "<null>" : this.annualPretaxIncome));
        sb.append(',');
        sb.append("annualInterestExpense");
        sb.append('=');
        sb.append(((this.annualInterestExpense == null) ? "<null>" : this.annualInterestExpense));
        sb.append(',');
        sb.append("trailingCostOfRevenue");
        sb.append('=');
        sb.append(((this.trailingCostOfRevenue == null) ? "<null>" : this.trailingCostOfRevenue));
        sb.append(',');
        sb.append("trailingInterestExpense");
        sb.append('=');
        sb.append(((this.trailingInterestExpense == null) ? "<null>" : this.trailingInterestExpense));
        sb.append(',');
        sb.append("annualEbitda");
        sb.append('=');
        sb.append(((this.annualEbitda == null) ? "<null>" : this.annualEbitda));
        sb.append(',');
        sb.append("annualNetIncomeContinuousOperations");
        sb.append('=');
        sb.append(((this.annualNetIncomeContinuousOperations == null) ? "<null>" : this.annualNetIncomeContinuousOperations));
        sb.append(',');
        sb.append("annualCostOfRevenue");
        sb.append('=');
        sb.append(((this.annualCostOfRevenue == null) ? "<null>" : this.annualCostOfRevenue));
        sb.append(',');
        sb.append("annualTotalRevenue");
        sb.append('=');
        sb.append(((this.annualTotalRevenue == null) ? "<null>" : this.annualTotalRevenue));
        sb.append(',');
        sb.append("trailingOperatingIncome");
        sb.append('=');
        sb.append(((this.trailingOperatingIncome == null) ? "<null>" : this.trailingOperatingIncome));
        sb.append(',');
        sb.append("annualDilutedEPS");
        sb.append('=');
        sb.append(((this.annualDilutedEPS == null) ? "<null>" : this.annualDilutedEPS));
        sb.append(',');
        sb.append("trailingTotalRevenue");
        sb.append('=');
        sb.append(((this.trailingTotalRevenue == null) ? "<null>" : this.trailingTotalRevenue));
        sb.append(',');
        sb.append("annualNetIncome");
        sb.append('=');
        sb.append(((this.annualNetIncome == null) ? "<null>" : this.annualNetIncome));
        sb.append(',');
        sb.append("trailingResearchAndDevelopment");
        sb.append('=');
        sb.append(((this.trailingResearchAndDevelopment == null) ? "<null>" : this.trailingResearchAndDevelopment));
        sb.append(',');
        sb.append("trailingOtherIncomeExpense");
        sb.append('=');
        sb.append(((this.trailingOtherIncomeExpense == null) ? "<null>" : this.trailingOtherIncomeExpense));
        sb.append(',');
        sb.append("annualBasicEPS");
        sb.append('=');
        sb.append(((this.annualBasicEPS == null) ? "<null>" : this.annualBasicEPS));
        sb.append(',');
        sb.append("trailingNetIncomeContinuousOperations");
        sb.append('=');
        sb.append(((this.trailingNetIncomeContinuousOperations == null) ? "<null>" : this.trailingNetIncomeContinuousOperations));
        sb.append(',');
        sb.append("annualOperatingIncome");
        sb.append('=');
        sb.append(((this.annualOperatingIncome == null) ? "<null>" : this.annualOperatingIncome));
        sb.append(',');
        sb.append("trailingOperatingExpense");
        sb.append('=');
        sb.append(((this.trailingOperatingExpense == null) ? "<null>" : this.trailingOperatingExpense));
        sb.append(',');
        sb.append("trailingDilutedEPS");
        sb.append('=');
        sb.append(((this.trailingDilutedEPS == null) ? "<null>" : this.trailingDilutedEPS));
        sb.append(',');
        sb.append("trailingDilutedAverageShares");
        sb.append('=');
        sb.append(((this.trailingDilutedAverageShares == null) ? "<null>" : this.trailingDilutedAverageShares));
        sb.append(',');
        sb.append("trailingBasicEPS");
        sb.append('=');
        sb.append(((this.trailingBasicEPS == null) ? "<null>" : this.trailingBasicEPS));
        sb.append(',');
        sb.append("trailingBasicAverageShares");
        sb.append('=');
        sb.append(((this.trailingBasicAverageShares == null) ? "<null>" : this.trailingBasicAverageShares));
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
        result = ((result * 31) + ((this.annualTotalRevenue == null) ? 0 : this.annualTotalRevenue.hashCode()));
        result = ((result * 31) + ((this.annualOperatingExpense == null) ? 0 : this.annualOperatingExpense.hashCode()));
        result = ((result * 31) + ((this.trailingCostOfRevenue == null) ? 0 : this.trailingCostOfRevenue.hashCode()));
        result = ((result * 31) + ((this.annualResearchAndDevelopment == null) ? 0 : this.annualResearchAndDevelopment.hashCode()));
        result = ((result * 31) + ((this.trailingInterestExpense == null) ? 0 : this.trailingInterestExpense.hashCode()));
        result = ((result * 31) + ((this.trailingTaxProvision == null) ? 0 : this.trailingTaxProvision.hashCode()));
        result = ((result * 31) + ((this.annualNetIncomeCommonStockholders == null) ? 0 : this.annualNetIncomeCommonStockholders.hashCode()));
        result = ((result * 31) + ((this.annualInterestExpense == null) ? 0 : this.annualInterestExpense.hashCode()));
        result = ((result * 31) + ((this.annualOtherIncomeExpense == null) ? 0 : this.annualOtherIncomeExpense.hashCode()));
        result = ((result * 31) + ((this.annualDilutedAverageShares == null) ? 0 : this.annualDilutedAverageShares.hashCode()));
        result = ((result * 31) + ((this.annualTaxProvision == null) ? 0 : this.annualTaxProvision.hashCode()));
        result = ((result * 31) + ((this.annualCostOfRevenue == null) ? 0 : this.annualCostOfRevenue.hashCode()));
        result = ((result * 31) + ((this.trailingTotalRevenue == null) ? 0 : this.trailingTotalRevenue.hashCode()));
        result = ((result * 31) + ((this.trailingNetIncomeContinuousOperations == null) ? 0 : this.trailingNetIncomeContinuousOperations.hashCode()));
        result = ((result * 31) + ((this.annualBasicAverageShares == null) ? 0 : this.annualBasicAverageShares.hashCode()));
        result = ((result * 31) + ((this.trailingOtherIncomeExpense == null) ? 0 : this.trailingOtherIncomeExpense.hashCode()));
        result = ((result * 31) + ((this.annualPretaxIncome == null) ? 0 : this.annualPretaxIncome.hashCode()));
        result = ((result * 31) + ((this.timestamp == null) ? 0 : this.timestamp.hashCode()));
        result = ((result * 31) + ((this.trailingNetIncomeCommonStockholders == null) ? 0 : this.trailingNetIncomeCommonStockholders.hashCode()));
        result = ((result * 31) + ((this.trailingResearchAndDevelopment == null) ? 0 : this.trailingResearchAndDevelopment.hashCode()));
        result = ((result * 31) + ((this.annualDilutedEPS == null) ? 0 : this.annualDilutedEPS.hashCode()));
        result = ((result * 31) + ((this.trailingNetIncome == null) ? 0 : this.trailingNetIncome.hashCode()));
        result = ((result * 31) + ((this.annualNetIncomeContinuousOperations == null) ? 0 : this.annualNetIncomeContinuousOperations.hashCode()));
        result = ((result * 31) + ((this.annualNetIncome == null) ? 0 : this.annualNetIncome.hashCode()));
        result = ((result * 31) + ((this.trailingGrossProfit == null) ? 0 : this.trailingGrossProfit.hashCode()));
        result = ((result * 31) + ((this.trailingDilutedAverageShares == null) ? 0 : this.trailingDilutedAverageShares.hashCode()));
        result = ((result * 31) + ((this.annualOperatingIncome == null) ? 0 : this.annualOperatingIncome.hashCode()));
        result = ((result * 31) + ((this.annualGrossProfit == null) ? 0 : this.annualGrossProfit.hashCode()));
        result = ((result * 31) + ((this.trailingOperatingExpense == null) ? 0 : this.trailingOperatingExpense.hashCode()));
        result = ((result * 31) + ((this.trailingOperatingIncome == null) ? 0 : this.trailingOperatingIncome.hashCode()));
        result = ((result * 31) + ((this.annualSellingGeneralAndAdministration == null) ? 0 : this.annualSellingGeneralAndAdministration.hashCode()));
        result = ((result * 31) + ((this.annualEbitda == null) ? 0 : this.annualEbitda.hashCode()));
        result = ((result * 31) + ((this.trailingBasicAverageShares == null) ? 0 : this.trailingBasicAverageShares.hashCode()));
        result = ((result * 31) + ((this.annualBasicEPS == null) ? 0 : this.annualBasicEPS.hashCode()));
        result = ((result * 31) + ((this.trailingDilutedEPS == null) ? 0 : this.trailingDilutedEPS.hashCode()));
        result = ((result * 31) + ((this.trailingPretaxIncome == null) ? 0 : this.trailingPretaxIncome.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.trailingSellingGeneralAndAdministration == null) ? 0 : this.trailingSellingGeneralAndAdministration.hashCode()));
        result = ((result * 31) + ((this.trailingBasicEPS == null) ? 0 : this.trailingBasicEPS.hashCode()));
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
        return ((((((((((((((((((((((((((((((((((((((((this.annualTotalRevenue == rhs.annualTotalRevenue) || ((this.annualTotalRevenue != null) && this.annualTotalRevenue.equals(rhs.annualTotalRevenue))) && ((this.annualOperatingExpense == rhs.annualOperatingExpense) || ((this.annualOperatingExpense != null) && this.annualOperatingExpense.equals(rhs.annualOperatingExpense)))) && ((this.trailingCostOfRevenue == rhs.trailingCostOfRevenue) || ((this.trailingCostOfRevenue != null) && this.trailingCostOfRevenue.equals(rhs.trailingCostOfRevenue)))) && ((this.annualResearchAndDevelopment == rhs.annualResearchAndDevelopment) || ((this.annualResearchAndDevelopment != null) && this.annualResearchAndDevelopment.equals(rhs.annualResearchAndDevelopment)))) && ((this.trailingInterestExpense == rhs.trailingInterestExpense) || ((this.trailingInterestExpense != null) && this.trailingInterestExpense.equals(rhs.trailingInterestExpense)))) && ((this.trailingTaxProvision == rhs.trailingTaxProvision) || ((this.trailingTaxProvision != null) && this.trailingTaxProvision.equals(rhs.trailingTaxProvision)))) && ((this.annualNetIncomeCommonStockholders == rhs.annualNetIncomeCommonStockholders) || ((this.annualNetIncomeCommonStockholders != null) && this.annualNetIncomeCommonStockholders.equals(rhs.annualNetIncomeCommonStockholders)))) && ((this.annualInterestExpense == rhs.annualInterestExpense) || ((this.annualInterestExpense != null) && this.annualInterestExpense.equals(rhs.annualInterestExpense)))) && ((this.annualOtherIncomeExpense == rhs.annualOtherIncomeExpense) || ((this.annualOtherIncomeExpense != null) && this.annualOtherIncomeExpense.equals(rhs.annualOtherIncomeExpense)))) && ((this.annualDilutedAverageShares == rhs.annualDilutedAverageShares) || ((this.annualDilutedAverageShares != null) && this.annualDilutedAverageShares.equals(rhs.annualDilutedAverageShares)))) && ((this.annualTaxProvision == rhs.annualTaxProvision) || ((this.annualTaxProvision != null) && this.annualTaxProvision.equals(rhs.annualTaxProvision)))) && ((this.annualCostOfRevenue == rhs.annualCostOfRevenue) || ((this.annualCostOfRevenue != null) && this.annualCostOfRevenue.equals(rhs.annualCostOfRevenue)))) && ((this.trailingTotalRevenue == rhs.trailingTotalRevenue) || ((this.trailingTotalRevenue != null) && this.trailingTotalRevenue.equals(rhs.trailingTotalRevenue)))) && ((this.trailingNetIncomeContinuousOperations == rhs.trailingNetIncomeContinuousOperations) || ((this.trailingNetIncomeContinuousOperations != null) && this.trailingNetIncomeContinuousOperations.equals(rhs.trailingNetIncomeContinuousOperations)))) && ((this.annualBasicAverageShares == rhs.annualBasicAverageShares) || ((this.annualBasicAverageShares != null) && this.annualBasicAverageShares.equals(rhs.annualBasicAverageShares)))) && ((this.trailingOtherIncomeExpense == rhs.trailingOtherIncomeExpense) || ((this.trailingOtherIncomeExpense != null) && this.trailingOtherIncomeExpense.equals(rhs.trailingOtherIncomeExpense)))) && ((this.annualPretaxIncome == rhs.annualPretaxIncome) || ((this.annualPretaxIncome != null) && this.annualPretaxIncome.equals(rhs.annualPretaxIncome)))) && ((this.timestamp == rhs.timestamp) || ((this.timestamp != null) && this.timestamp.equals(rhs.timestamp)))) && ((this.trailingNetIncomeCommonStockholders == rhs.trailingNetIncomeCommonStockholders) || ((this.trailingNetIncomeCommonStockholders != null) && this.trailingNetIncomeCommonStockholders.equals(rhs.trailingNetIncomeCommonStockholders)))) && ((this.trailingResearchAndDevelopment == rhs.trailingResearchAndDevelopment) || ((this.trailingResearchAndDevelopment != null) && this.trailingResearchAndDevelopment.equals(rhs.trailingResearchAndDevelopment)))) && ((this.annualDilutedEPS == rhs.annualDilutedEPS) || ((this.annualDilutedEPS != null) && this.annualDilutedEPS.equals(rhs.annualDilutedEPS)))) && ((this.trailingNetIncome == rhs.trailingNetIncome) || ((this.trailingNetIncome != null) && this.trailingNetIncome.equals(rhs.trailingNetIncome)))) && ((this.annualNetIncomeContinuousOperations == rhs.annualNetIncomeContinuousOperations) || ((this.annualNetIncomeContinuousOperations != null) && this.annualNetIncomeContinuousOperations.equals(rhs.annualNetIncomeContinuousOperations)))) && ((this.annualNetIncome == rhs.annualNetIncome) || ((this.annualNetIncome != null) && this.annualNetIncome.equals(rhs.annualNetIncome)))) && ((this.trailingGrossProfit == rhs.trailingGrossProfit) || ((this.trailingGrossProfit != null) && this.trailingGrossProfit.equals(rhs.trailingGrossProfit)))) && ((this.trailingDilutedAverageShares == rhs.trailingDilutedAverageShares) || ((this.trailingDilutedAverageShares != null) && this.trailingDilutedAverageShares.equals(rhs.trailingDilutedAverageShares)))) && ((this.annualOperatingIncome == rhs.annualOperatingIncome) || ((this.annualOperatingIncome != null) && this.annualOperatingIncome.equals(rhs.annualOperatingIncome)))) && ((this.annualGrossProfit == rhs.annualGrossProfit) || ((this.annualGrossProfit != null) && this.annualGrossProfit.equals(rhs.annualGrossProfit)))) && ((this.trailingOperatingExpense == rhs.trailingOperatingExpense) || ((this.trailingOperatingExpense != null) && this.trailingOperatingExpense.equals(rhs.trailingOperatingExpense)))) && ((this.trailingOperatingIncome == rhs.trailingOperatingIncome) || ((this.trailingOperatingIncome != null) && this.trailingOperatingIncome.equals(rhs.trailingOperatingIncome)))) && ((this.annualSellingGeneralAndAdministration == rhs.annualSellingGeneralAndAdministration) || ((this.annualSellingGeneralAndAdministration != null) && this.annualSellingGeneralAndAdministration.equals(rhs.annualSellingGeneralAndAdministration)))) && ((this.annualEbitda == rhs.annualEbitda) || ((this.annualEbitda != null) && this.annualEbitda.equals(rhs.annualEbitda)))) && ((this.trailingBasicAverageShares == rhs.trailingBasicAverageShares) || ((this.trailingBasicAverageShares != null) && this.trailingBasicAverageShares.equals(rhs.trailingBasicAverageShares)))) && ((this.annualBasicEPS == rhs.annualBasicEPS) || ((this.annualBasicEPS != null) && this.annualBasicEPS.equals(rhs.annualBasicEPS)))) && ((this.trailingDilutedEPS == rhs.trailingDilutedEPS) || ((this.trailingDilutedEPS != null) && this.trailingDilutedEPS.equals(rhs.trailingDilutedEPS)))) && ((this.trailingPretaxIncome == rhs.trailingPretaxIncome) || ((this.trailingPretaxIncome != null) && this.trailingPretaxIncome.equals(rhs.trailingPretaxIncome)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.trailingSellingGeneralAndAdministration == rhs.trailingSellingGeneralAndAdministration) || ((this.trailingSellingGeneralAndAdministration != null) && this.trailingSellingGeneralAndAdministration.equals(rhs.trailingSellingGeneralAndAdministration)))) && ((this.trailingBasicEPS == rhs.trailingBasicEPS) || ((this.trailingBasicEPS != null) && this.trailingBasicEPS.equals(rhs.trailingBasicEPS))));
    }

}
