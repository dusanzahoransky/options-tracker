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
    "researchDevelopment",
    "effectOfAccountingCharges",
    "incomeBeforeTax",
    "minorityInterest",
    "netIncome",
    "sellingGeneralAdministrative",
    "grossProfit",
    "ebit",
    "endDate",
    "operatingIncome",
    "otherOperatingExpenses",
    "interestExpense",
    "extraordinaryItems",
    "nonRecurring",
    "otherItems",
    "incomeTaxExpense",
    "totalRevenue",
    "totalOperatingExpenses",
    "costOfRevenue",
    "totalOtherIncomeExpenseNet",
    "maxAge",
    "discontinuedOperations",
    "netIncomeFromContinuingOps",
    "netIncomeApplicableToCommonShares"
})
public class IncomeStatementHistory__2 {

    @JsonProperty("researchDevelopment")
    private ResearchDevelopment__1 researchDevelopment;
    @JsonProperty("effectOfAccountingCharges")
    private EffectOfAccountingCharges__1 effectOfAccountingCharges;
    @JsonProperty("incomeBeforeTax")
    private IncomeBeforeTax__1 incomeBeforeTax;
    @JsonProperty("minorityInterest")
    private MinorityInterest__1 minorityInterest;
    @JsonProperty("netIncome")
    private NetIncome__2 netIncome;
    @JsonProperty("sellingGeneralAdministrative")
    private SellingGeneralAdministrative__1 sellingGeneralAdministrative;
    @JsonProperty("grossProfit")
    private GrossProfit__1 grossProfit;
    @JsonProperty("ebit")
    private Ebit__1 ebit;
    @JsonProperty("endDate")
    private EndDate__3 endDate;
    @JsonProperty("operatingIncome")
    private OperatingIncome__1 operatingIncome;
    @JsonProperty("otherOperatingExpenses")
    private OtherOperatingExpenses__1 otherOperatingExpenses;
    @JsonProperty("interestExpense")
    private InterestExpense__1 interestExpense;
    @JsonProperty("extraordinaryItems")
    private ExtraordinaryItems__1 extraordinaryItems;
    @JsonProperty("nonRecurring")
    private NonRecurring__1 nonRecurring;
    @JsonProperty("otherItems")
    private OtherItems__1 otherItems;
    @JsonProperty("incomeTaxExpense")
    private IncomeTaxExpense__1 incomeTaxExpense;
    @JsonProperty("totalRevenue")
    private TotalRevenue__1 totalRevenue;
    @JsonProperty("totalOperatingExpenses")
    private TotalOperatingExpenses__1 totalOperatingExpenses;
    @JsonProperty("costOfRevenue")
    private CostOfRevenue__1 costOfRevenue;
    @JsonProperty("totalOtherIncomeExpenseNet")
    private TotalOtherIncomeExpenseNet__1 totalOtherIncomeExpenseNet;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("discontinuedOperations")
    private DiscontinuedOperations__1 discontinuedOperations;
    @JsonProperty("netIncomeFromContinuingOps")
    private NetIncomeFromContinuingOps__1 netIncomeFromContinuingOps;
    @JsonProperty("netIncomeApplicableToCommonShares")
    private NetIncomeApplicableToCommonShares__1 netIncomeApplicableToCommonShares;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("researchDevelopment")
    public ResearchDevelopment__1 getResearchDevelopment() {
        return researchDevelopment;
    }

    @JsonProperty("researchDevelopment")
    public void setResearchDevelopment(ResearchDevelopment__1 researchDevelopment) {
        this.researchDevelopment = researchDevelopment;
    }

    @JsonProperty("effectOfAccountingCharges")
    public EffectOfAccountingCharges__1 getEffectOfAccountingCharges() {
        return effectOfAccountingCharges;
    }

    @JsonProperty("effectOfAccountingCharges")
    public void setEffectOfAccountingCharges(EffectOfAccountingCharges__1 effectOfAccountingCharges) {
        this.effectOfAccountingCharges = effectOfAccountingCharges;
    }

    @JsonProperty("incomeBeforeTax")
    public IncomeBeforeTax__1 getIncomeBeforeTax() {
        return incomeBeforeTax;
    }

    @JsonProperty("incomeBeforeTax")
    public void setIncomeBeforeTax(IncomeBeforeTax__1 incomeBeforeTax) {
        this.incomeBeforeTax = incomeBeforeTax;
    }

    @JsonProperty("minorityInterest")
    public MinorityInterest__1 getMinorityInterest() {
        return minorityInterest;
    }

    @JsonProperty("minorityInterest")
    public void setMinorityInterest(MinorityInterest__1 minorityInterest) {
        this.minorityInterest = minorityInterest;
    }

    @JsonProperty("netIncome")
    public NetIncome__2 getNetIncome() {
        return netIncome;
    }

    @JsonProperty("netIncome")
    public void setNetIncome(NetIncome__2 netIncome) {
        this.netIncome = netIncome;
    }

    @JsonProperty("sellingGeneralAdministrative")
    public SellingGeneralAdministrative__1 getSellingGeneralAdministrative() {
        return sellingGeneralAdministrative;
    }

    @JsonProperty("sellingGeneralAdministrative")
    public void setSellingGeneralAdministrative(SellingGeneralAdministrative__1 sellingGeneralAdministrative) {
        this.sellingGeneralAdministrative = sellingGeneralAdministrative;
    }

    @JsonProperty("grossProfit")
    public GrossProfit__1 getGrossProfit() {
        return grossProfit;
    }

    @JsonProperty("grossProfit")
    public void setGrossProfit(GrossProfit__1 grossProfit) {
        this.grossProfit = grossProfit;
    }

    @JsonProperty("ebit")
    public Ebit__1 getEbit() {
        return ebit;
    }

    @JsonProperty("ebit")
    public void setEbit(Ebit__1 ebit) {
        this.ebit = ebit;
    }

    @JsonProperty("endDate")
    public EndDate__3 getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(EndDate__3 endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("operatingIncome")
    public OperatingIncome__1 getOperatingIncome() {
        return operatingIncome;
    }

    @JsonProperty("operatingIncome")
    public void setOperatingIncome(OperatingIncome__1 operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    @JsonProperty("otherOperatingExpenses")
    public OtherOperatingExpenses__1 getOtherOperatingExpenses() {
        return otherOperatingExpenses;
    }

    @JsonProperty("otherOperatingExpenses")
    public void setOtherOperatingExpenses(OtherOperatingExpenses__1 otherOperatingExpenses) {
        this.otherOperatingExpenses = otherOperatingExpenses;
    }

    @JsonProperty("interestExpense")
    public InterestExpense__1 getInterestExpense() {
        return interestExpense;
    }

    @JsonProperty("interestExpense")
    public void setInterestExpense(InterestExpense__1 interestExpense) {
        this.interestExpense = interestExpense;
    }

    @JsonProperty("extraordinaryItems")
    public ExtraordinaryItems__1 getExtraordinaryItems() {
        return extraordinaryItems;
    }

    @JsonProperty("extraordinaryItems")
    public void setExtraordinaryItems(ExtraordinaryItems__1 extraordinaryItems) {
        this.extraordinaryItems = extraordinaryItems;
    }

    @JsonProperty("nonRecurring")
    public NonRecurring__1 getNonRecurring() {
        return nonRecurring;
    }

    @JsonProperty("nonRecurring")
    public void setNonRecurring(NonRecurring__1 nonRecurring) {
        this.nonRecurring = nonRecurring;
    }

    @JsonProperty("otherItems")
    public OtherItems__1 getOtherItems() {
        return otherItems;
    }

    @JsonProperty("otherItems")
    public void setOtherItems(OtherItems__1 otherItems) {
        this.otherItems = otherItems;
    }

    @JsonProperty("incomeTaxExpense")
    public IncomeTaxExpense__1 getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    @JsonProperty("incomeTaxExpense")
    public void setIncomeTaxExpense(IncomeTaxExpense__1 incomeTaxExpense) {
        this.incomeTaxExpense = incomeTaxExpense;
    }

    @JsonProperty("totalRevenue")
    public TotalRevenue__1 getTotalRevenue() {
        return totalRevenue;
    }

    @JsonProperty("totalRevenue")
    public void setTotalRevenue(TotalRevenue__1 totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    @JsonProperty("totalOperatingExpenses")
    public TotalOperatingExpenses__1 getTotalOperatingExpenses() {
        return totalOperatingExpenses;
    }

    @JsonProperty("totalOperatingExpenses")
    public void setTotalOperatingExpenses(TotalOperatingExpenses__1 totalOperatingExpenses) {
        this.totalOperatingExpenses = totalOperatingExpenses;
    }

    @JsonProperty("costOfRevenue")
    public CostOfRevenue__1 getCostOfRevenue() {
        return costOfRevenue;
    }

    @JsonProperty("costOfRevenue")
    public void setCostOfRevenue(CostOfRevenue__1 costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
    }

    @JsonProperty("totalOtherIncomeExpenseNet")
    public TotalOtherIncomeExpenseNet__1 getTotalOtherIncomeExpenseNet() {
        return totalOtherIncomeExpenseNet;
    }

    @JsonProperty("totalOtherIncomeExpenseNet")
    public void setTotalOtherIncomeExpenseNet(TotalOtherIncomeExpenseNet__1 totalOtherIncomeExpenseNet) {
        this.totalOtherIncomeExpenseNet = totalOtherIncomeExpenseNet;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("discontinuedOperations")
    public DiscontinuedOperations__1 getDiscontinuedOperations() {
        return discontinuedOperations;
    }

    @JsonProperty("discontinuedOperations")
    public void setDiscontinuedOperations(DiscontinuedOperations__1 discontinuedOperations) {
        this.discontinuedOperations = discontinuedOperations;
    }

    @JsonProperty("netIncomeFromContinuingOps")
    public NetIncomeFromContinuingOps__1 getNetIncomeFromContinuingOps() {
        return netIncomeFromContinuingOps;
    }

    @JsonProperty("netIncomeFromContinuingOps")
    public void setNetIncomeFromContinuingOps(NetIncomeFromContinuingOps__1 netIncomeFromContinuingOps) {
        this.netIncomeFromContinuingOps = netIncomeFromContinuingOps;
    }

    @JsonProperty("netIncomeApplicableToCommonShares")
    public NetIncomeApplicableToCommonShares__1 getNetIncomeApplicableToCommonShares() {
        return netIncomeApplicableToCommonShares;
    }

    @JsonProperty("netIncomeApplicableToCommonShares")
    public void setNetIncomeApplicableToCommonShares(NetIncomeApplicableToCommonShares__1 netIncomeApplicableToCommonShares) {
        this.netIncomeApplicableToCommonShares = netIncomeApplicableToCommonShares;
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
        sb.append(IncomeStatementHistory__2.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("researchDevelopment");
        sb.append('=');
        sb.append(((this.researchDevelopment == null) ? "<null>" : this.researchDevelopment));
        sb.append(',');
        sb.append("effectOfAccountingCharges");
        sb.append('=');
        sb.append(((this.effectOfAccountingCharges == null) ? "<null>" : this.effectOfAccountingCharges));
        sb.append(',');
        sb.append("incomeBeforeTax");
        sb.append('=');
        sb.append(((this.incomeBeforeTax == null) ? "<null>" : this.incomeBeforeTax));
        sb.append(',');
        sb.append("minorityInterest");
        sb.append('=');
        sb.append(((this.minorityInterest == null) ? "<null>" : this.minorityInterest));
        sb.append(',');
        sb.append("netIncome");
        sb.append('=');
        sb.append(((this.netIncome == null) ? "<null>" : this.netIncome));
        sb.append(',');
        sb.append("sellingGeneralAdministrative");
        sb.append('=');
        sb.append(((this.sellingGeneralAdministrative == null) ? "<null>" : this.sellingGeneralAdministrative));
        sb.append(',');
        sb.append("grossProfit");
        sb.append('=');
        sb.append(((this.grossProfit == null) ? "<null>" : this.grossProfit));
        sb.append(',');
        sb.append("ebit");
        sb.append('=');
        sb.append(((this.ebit == null) ? "<null>" : this.ebit));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null) ? "<null>" : this.endDate));
        sb.append(',');
        sb.append("operatingIncome");
        sb.append('=');
        sb.append(((this.operatingIncome == null) ? "<null>" : this.operatingIncome));
        sb.append(',');
        sb.append("otherOperatingExpenses");
        sb.append('=');
        sb.append(((this.otherOperatingExpenses == null) ? "<null>" : this.otherOperatingExpenses));
        sb.append(',');
        sb.append("interestExpense");
        sb.append('=');
        sb.append(((this.interestExpense == null) ? "<null>" : this.interestExpense));
        sb.append(',');
        sb.append("extraordinaryItems");
        sb.append('=');
        sb.append(((this.extraordinaryItems == null) ? "<null>" : this.extraordinaryItems));
        sb.append(',');
        sb.append("nonRecurring");
        sb.append('=');
        sb.append(((this.nonRecurring == null) ? "<null>" : this.nonRecurring));
        sb.append(',');
        sb.append("otherItems");
        sb.append('=');
        sb.append(((this.otherItems == null) ? "<null>" : this.otherItems));
        sb.append(',');
        sb.append("incomeTaxExpense");
        sb.append('=');
        sb.append(((this.incomeTaxExpense == null) ? "<null>" : this.incomeTaxExpense));
        sb.append(',');
        sb.append("totalRevenue");
        sb.append('=');
        sb.append(((this.totalRevenue == null) ? "<null>" : this.totalRevenue));
        sb.append(',');
        sb.append("totalOperatingExpenses");
        sb.append('=');
        sb.append(((this.totalOperatingExpenses == null) ? "<null>" : this.totalOperatingExpenses));
        sb.append(',');
        sb.append("costOfRevenue");
        sb.append('=');
        sb.append(((this.costOfRevenue == null) ? "<null>" : this.costOfRevenue));
        sb.append(',');
        sb.append("totalOtherIncomeExpenseNet");
        sb.append('=');
        sb.append(((this.totalOtherIncomeExpenseNet == null) ? "<null>" : this.totalOtherIncomeExpenseNet));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
        sb.append(',');
        sb.append("discontinuedOperations");
        sb.append('=');
        sb.append(((this.discontinuedOperations == null) ? "<null>" : this.discontinuedOperations));
        sb.append(',');
        sb.append("netIncomeFromContinuingOps");
        sb.append('=');
        sb.append(((this.netIncomeFromContinuingOps == null) ? "<null>" : this.netIncomeFromContinuingOps));
        sb.append(',');
        sb.append("netIncomeApplicableToCommonShares");
        sb.append('=');
        sb.append(((this.netIncomeApplicableToCommonShares == null) ? "<null>" : this.netIncomeApplicableToCommonShares));
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
        result = ((result * 31) + ((this.discontinuedOperations == null) ? 0 : this.discontinuedOperations.hashCode()));
        result = ((result * 31) + ((this.interestExpense == null) ? 0 : this.interestExpense.hashCode()));
        result = ((result * 31) + ((this.sellingGeneralAdministrative == null) ? 0 : this.sellingGeneralAdministrative.hashCode()));
        result = ((result * 31) + ((this.totalRevenue == null) ? 0 : this.totalRevenue.hashCode()));
        result = ((result * 31) + ((this.grossProfit == null) ? 0 : this.grossProfit.hashCode()));
        result = ((result * 31) + ((this.otherOperatingExpenses == null) ? 0 : this.otherOperatingExpenses.hashCode()));
        result = ((result * 31) + ((this.operatingIncome == null) ? 0 : this.operatingIncome.hashCode()));
        result = ((result * 31) + ((this.netIncomeFromContinuingOps == null) ? 0 : this.netIncomeFromContinuingOps.hashCode()));
        result = ((result * 31) + ((this.ebit == null) ? 0 : this.ebit.hashCode()));
        result = ((result * 31) + ((this.researchDevelopment == null) ? 0 : this.researchDevelopment.hashCode()));
        result = ((result * 31) + ((this.costOfRevenue == null) ? 0 : this.costOfRevenue.hashCode()));
        result = ((result * 31) + ((this.nonRecurring == null) ? 0 : this.nonRecurring.hashCode()));
        result = ((result * 31) + ((this.totalOperatingExpenses == null) ? 0 : this.totalOperatingExpenses.hashCode()));
        result = ((result * 31) + ((this.effectOfAccountingCharges == null) ? 0 : this.effectOfAccountingCharges.hashCode()));
        result = ((result * 31) + ((this.incomeBeforeTax == null) ? 0 : this.incomeBeforeTax.hashCode()));
        result = ((result * 31) + ((this.extraordinaryItems == null) ? 0 : this.extraordinaryItems.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        result = ((result * 31) + ((this.totalOtherIncomeExpenseNet == null) ? 0 : this.totalOtherIncomeExpenseNet.hashCode()));
        result = ((result * 31) + ((this.netIncomeApplicableToCommonShares == null) ? 0 : this.netIncomeApplicableToCommonShares.hashCode()));
        result = ((result * 31) + ((this.netIncome == null) ? 0 : this.netIncome.hashCode()));
        result = ((result * 31) + ((this.incomeTaxExpense == null) ? 0 : this.incomeTaxExpense.hashCode()));
        result = ((result * 31) + ((this.minorityInterest == null) ? 0 : this.minorityInterest.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.otherItems == null) ? 0 : this.otherItems.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncomeStatementHistory__2) == false) {
            return false;
        }
        IncomeStatementHistory__2 rhs = ((IncomeStatementHistory__2) other);
        return ((((((((((((((((((((((((((this.endDate == rhs.endDate) || ((this.endDate != null) && this.endDate.equals(rhs.endDate))) && ((this.discontinuedOperations == rhs.discontinuedOperations) || ((this.discontinuedOperations != null) && this.discontinuedOperations.equals(rhs.discontinuedOperations)))) && ((this.interestExpense == rhs.interestExpense) || ((this.interestExpense != null) && this.interestExpense.equals(rhs.interestExpense)))) && ((this.sellingGeneralAdministrative == rhs.sellingGeneralAdministrative) || ((this.sellingGeneralAdministrative != null) && this.sellingGeneralAdministrative.equals(rhs.sellingGeneralAdministrative)))) && ((this.totalRevenue == rhs.totalRevenue) || ((this.totalRevenue != null) && this.totalRevenue.equals(rhs.totalRevenue)))) && ((this.grossProfit == rhs.grossProfit) || ((this.grossProfit != null) && this.grossProfit.equals(rhs.grossProfit)))) && ((this.otherOperatingExpenses == rhs.otherOperatingExpenses) || ((this.otherOperatingExpenses != null) && this.otherOperatingExpenses.equals(rhs.otherOperatingExpenses)))) && ((this.operatingIncome == rhs.operatingIncome) || ((this.operatingIncome != null) && this.operatingIncome.equals(rhs.operatingIncome)))) && ((this.netIncomeFromContinuingOps == rhs.netIncomeFromContinuingOps) || ((this.netIncomeFromContinuingOps != null) && this.netIncomeFromContinuingOps.equals(rhs.netIncomeFromContinuingOps)))) && ((this.ebit == rhs.ebit) || ((this.ebit != null) && this.ebit.equals(rhs.ebit)))) && ((this.researchDevelopment == rhs.researchDevelopment) || ((this.researchDevelopment != null) && this.researchDevelopment.equals(rhs.researchDevelopment)))) && ((this.costOfRevenue == rhs.costOfRevenue) || ((this.costOfRevenue != null) && this.costOfRevenue.equals(rhs.costOfRevenue)))) && ((this.nonRecurring == rhs.nonRecurring) || ((this.nonRecurring != null) && this.nonRecurring.equals(rhs.nonRecurring)))) && ((this.totalOperatingExpenses == rhs.totalOperatingExpenses) || ((this.totalOperatingExpenses != null) && this.totalOperatingExpenses.equals(rhs.totalOperatingExpenses)))) && ((this.effectOfAccountingCharges == rhs.effectOfAccountingCharges) || ((this.effectOfAccountingCharges != null) && this.effectOfAccountingCharges.equals(rhs.effectOfAccountingCharges)))) && ((this.incomeBeforeTax == rhs.incomeBeforeTax) || ((this.incomeBeforeTax != null) && this.incomeBeforeTax.equals(rhs.incomeBeforeTax)))) && ((this.extraordinaryItems == rhs.extraordinaryItems) || ((this.extraordinaryItems != null) && this.extraordinaryItems.equals(rhs.extraordinaryItems)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.totalOtherIncomeExpenseNet == rhs.totalOtherIncomeExpenseNet) || ((this.totalOtherIncomeExpenseNet != null) && this.totalOtherIncomeExpenseNet.equals(rhs.totalOtherIncomeExpenseNet)))) && ((this.netIncomeApplicableToCommonShares == rhs.netIncomeApplicableToCommonShares) || ((this.netIncomeApplicableToCommonShares != null) && this.netIncomeApplicableToCommonShares.equals(rhs.netIncomeApplicableToCommonShares)))) && ((this.netIncome == rhs.netIncome) || ((this.netIncome != null) && this.netIncome.equals(rhs.netIncome)))) && ((this.incomeTaxExpense == rhs.incomeTaxExpense) || ((this.incomeTaxExpense != null) && this.incomeTaxExpense.equals(rhs.incomeTaxExpense)))) && ((this.minorityInterest == rhs.minorityInterest) || ((this.minorityInterest != null) && this.minorityInterest.equals(rhs.minorityInterest)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.otherItems == rhs.otherItems) || ((this.otherItems != null) && this.otherItems.equals(rhs.otherItems))));
    }

}
