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
    "intangibleAssets",
    "totalLiab",
    "totalStockholderEquity",
    "otherCurrentLiab",
    "totalAssets",
    "endDate",
    "commonStock",
    "otherCurrentAssets",
    "retainedEarnings",
    "otherLiab",
    "goodWill",
    "treasuryStock",
    "otherAssets",
    "cash",
    "totalCurrentLiabilities",
    "deferredLongTermAssetCharges",
    "otherStockholderEquity",
    "propertyPlantEquipment",
    "totalCurrentAssets",
    "longTermInvestments",
    "netTangibleAssets",
    "shortTermInvestments",
    "netReceivables",
    "maxAge",
    "longTermDebt",
    "inventory",
    "accountsPayable"
})
public class BalanceSheetStatement {

    @JsonProperty("intangibleAssets")
    private IntangibleAssets intangibleAssets;
    @JsonProperty("totalLiab")
    private TotalLiab totalLiab;
    @JsonProperty("totalStockholderEquity")
    private TotalStockholderEquity totalStockholderEquity;
    @JsonProperty("otherCurrentLiab")
    private OtherCurrentLiab otherCurrentLiab;
    @JsonProperty("totalAssets")
    private TotalAssets totalAssets;
    @JsonProperty("endDate")
    private EndDate endDate;
    @JsonProperty("commonStock")
    private CommonStock commonStock;
    @JsonProperty("otherCurrentAssets")
    private OtherCurrentAssets otherCurrentAssets;
    @JsonProperty("retainedEarnings")
    private RetainedEarnings retainedEarnings;
    @JsonProperty("otherLiab")
    private OtherLiab otherLiab;
    @JsonProperty("goodWill")
    private GoodWill goodWill;
    @JsonProperty("treasuryStock")
    private TreasuryStock treasuryStock;
    @JsonProperty("otherAssets")
    private OtherAssets otherAssets;
    @JsonProperty("cash")
    private Cash cash;
    @JsonProperty("totalCurrentLiabilities")
    private TotalCurrentLiabilities totalCurrentLiabilities;
    @JsonProperty("deferredLongTermAssetCharges")
    private DeferredLongTermAssetCharges deferredLongTermAssetCharges;
    @JsonProperty("otherStockholderEquity")
    private OtherStockholderEquity otherStockholderEquity;
    @JsonProperty("propertyPlantEquipment")
    private PropertyPlantEquipment propertyPlantEquipment;
    @JsonProperty("totalCurrentAssets")
    private TotalCurrentAssets totalCurrentAssets;
    @JsonProperty("longTermInvestments")
    private LongTermInvestments longTermInvestments;
    @JsonProperty("netTangibleAssets")
    private NetTangibleAssets netTangibleAssets;
    @JsonProperty("shortTermInvestments")
    private ShortTermInvestments shortTermInvestments;
    @JsonProperty("netReceivables")
    private NetReceivables netReceivables;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("longTermDebt")
    private LongTermDebt longTermDebt;
    @JsonProperty("inventory")
    private Inventory inventory;
    @JsonProperty("accountsPayable")
    private AccountsPayable accountsPayable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("intangibleAssets")
    public IntangibleAssets getIntangibleAssets() {
        return intangibleAssets;
    }

    @JsonProperty("intangibleAssets")
    public void setIntangibleAssets(IntangibleAssets intangibleAssets) {
        this.intangibleAssets = intangibleAssets;
    }

    @JsonProperty("totalLiab")
    public TotalLiab getTotalLiab() {
        return totalLiab;
    }

    @JsonProperty("totalLiab")
    public void setTotalLiab(TotalLiab totalLiab) {
        this.totalLiab = totalLiab;
    }

    @JsonProperty("totalStockholderEquity")
    public TotalStockholderEquity getTotalStockholderEquity() {
        return totalStockholderEquity;
    }

    @JsonProperty("totalStockholderEquity")
    public void setTotalStockholderEquity(TotalStockholderEquity totalStockholderEquity) {
        this.totalStockholderEquity = totalStockholderEquity;
    }

    @JsonProperty("otherCurrentLiab")
    public OtherCurrentLiab getOtherCurrentLiab() {
        return otherCurrentLiab;
    }

    @JsonProperty("otherCurrentLiab")
    public void setOtherCurrentLiab(OtherCurrentLiab otherCurrentLiab) {
        this.otherCurrentLiab = otherCurrentLiab;
    }

    @JsonProperty("totalAssets")
    public TotalAssets getTotalAssets() {
        return totalAssets;
    }

    @JsonProperty("totalAssets")
    public void setTotalAssets(TotalAssets totalAssets) {
        this.totalAssets = totalAssets;
    }

    @JsonProperty("endDate")
    public EndDate getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(EndDate endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("commonStock")
    public CommonStock getCommonStock() {
        return commonStock;
    }

    @JsonProperty("commonStock")
    public void setCommonStock(CommonStock commonStock) {
        this.commonStock = commonStock;
    }

    @JsonProperty("otherCurrentAssets")
    public OtherCurrentAssets getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    @JsonProperty("otherCurrentAssets")
    public void setOtherCurrentAssets(OtherCurrentAssets otherCurrentAssets) {
        this.otherCurrentAssets = otherCurrentAssets;
    }

    @JsonProperty("retainedEarnings")
    public RetainedEarnings getRetainedEarnings() {
        return retainedEarnings;
    }

    @JsonProperty("retainedEarnings")
    public void setRetainedEarnings(RetainedEarnings retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
    }

    @JsonProperty("otherLiab")
    public OtherLiab getOtherLiab() {
        return otherLiab;
    }

    @JsonProperty("otherLiab")
    public void setOtherLiab(OtherLiab otherLiab) {
        this.otherLiab = otherLiab;
    }

    @JsonProperty("goodWill")
    public GoodWill getGoodWill() {
        return goodWill;
    }

    @JsonProperty("goodWill")
    public void setGoodWill(GoodWill goodWill) {
        this.goodWill = goodWill;
    }

    @JsonProperty("treasuryStock")
    public TreasuryStock getTreasuryStock() {
        return treasuryStock;
    }

    @JsonProperty("treasuryStock")
    public void setTreasuryStock(TreasuryStock treasuryStock) {
        this.treasuryStock = treasuryStock;
    }

    @JsonProperty("otherAssets")
    public OtherAssets getOtherAssets() {
        return otherAssets;
    }

    @JsonProperty("otherAssets")
    public void setOtherAssets(OtherAssets otherAssets) {
        this.otherAssets = otherAssets;
    }

    @JsonProperty("cash")
    public Cash getCash() {
        return cash;
    }

    @JsonProperty("cash")
    public void setCash(Cash cash) {
        this.cash = cash;
    }

    @JsonProperty("totalCurrentLiabilities")
    public TotalCurrentLiabilities getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    @JsonProperty("totalCurrentLiabilities")
    public void setTotalCurrentLiabilities(TotalCurrentLiabilities totalCurrentLiabilities) {
        this.totalCurrentLiabilities = totalCurrentLiabilities;
    }

    @JsonProperty("deferredLongTermAssetCharges")
    public DeferredLongTermAssetCharges getDeferredLongTermAssetCharges() {
        return deferredLongTermAssetCharges;
    }

    @JsonProperty("deferredLongTermAssetCharges")
    public void setDeferredLongTermAssetCharges(DeferredLongTermAssetCharges deferredLongTermAssetCharges) {
        this.deferredLongTermAssetCharges = deferredLongTermAssetCharges;
    }

    @JsonProperty("otherStockholderEquity")
    public OtherStockholderEquity getOtherStockholderEquity() {
        return otherStockholderEquity;
    }

    @JsonProperty("otherStockholderEquity")
    public void setOtherStockholderEquity(OtherStockholderEquity otherStockholderEquity) {
        this.otherStockholderEquity = otherStockholderEquity;
    }

    @JsonProperty("propertyPlantEquipment")
    public PropertyPlantEquipment getPropertyPlantEquipment() {
        return propertyPlantEquipment;
    }

    @JsonProperty("propertyPlantEquipment")
    public void setPropertyPlantEquipment(PropertyPlantEquipment propertyPlantEquipment) {
        this.propertyPlantEquipment = propertyPlantEquipment;
    }

    @JsonProperty("totalCurrentAssets")
    public TotalCurrentAssets getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    @JsonProperty("totalCurrentAssets")
    public void setTotalCurrentAssets(TotalCurrentAssets totalCurrentAssets) {
        this.totalCurrentAssets = totalCurrentAssets;
    }

    @JsonProperty("longTermInvestments")
    public LongTermInvestments getLongTermInvestments() {
        return longTermInvestments;
    }

    @JsonProperty("longTermInvestments")
    public void setLongTermInvestments(LongTermInvestments longTermInvestments) {
        this.longTermInvestments = longTermInvestments;
    }

    @JsonProperty("netTangibleAssets")
    public NetTangibleAssets getNetTangibleAssets() {
        return netTangibleAssets;
    }

    @JsonProperty("netTangibleAssets")
    public void setNetTangibleAssets(NetTangibleAssets netTangibleAssets) {
        this.netTangibleAssets = netTangibleAssets;
    }

    @JsonProperty("shortTermInvestments")
    public ShortTermInvestments getShortTermInvestments() {
        return shortTermInvestments;
    }

    @JsonProperty("shortTermInvestments")
    public void setShortTermInvestments(ShortTermInvestments shortTermInvestments) {
        this.shortTermInvestments = shortTermInvestments;
    }

    @JsonProperty("netReceivables")
    public NetReceivables getNetReceivables() {
        return netReceivables;
    }

    @JsonProperty("netReceivables")
    public void setNetReceivables(NetReceivables netReceivables) {
        this.netReceivables = netReceivables;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("longTermDebt")
    public LongTermDebt getLongTermDebt() {
        return longTermDebt;
    }

    @JsonProperty("longTermDebt")
    public void setLongTermDebt(LongTermDebt longTermDebt) {
        this.longTermDebt = longTermDebt;
    }

    @JsonProperty("inventory")
    public Inventory getInventory() {
        return inventory;
    }

    @JsonProperty("inventory")
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @JsonProperty("accountsPayable")
    public AccountsPayable getAccountsPayable() {
        return accountsPayable;
    }

    @JsonProperty("accountsPayable")
    public void setAccountsPayable(AccountsPayable accountsPayable) {
        this.accountsPayable = accountsPayable;
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
        sb.append(BalanceSheetStatement.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("intangibleAssets");
        sb.append('=');
        sb.append(((this.intangibleAssets == null) ? "<null>" : this.intangibleAssets));
        sb.append(',');
        sb.append("totalLiab");
        sb.append('=');
        sb.append(((this.totalLiab == null) ? "<null>" : this.totalLiab));
        sb.append(',');
        sb.append("totalStockholderEquity");
        sb.append('=');
        sb.append(((this.totalStockholderEquity == null) ? "<null>" : this.totalStockholderEquity));
        sb.append(',');
        sb.append("otherCurrentLiab");
        sb.append('=');
        sb.append(((this.otherCurrentLiab == null) ? "<null>" : this.otherCurrentLiab));
        sb.append(',');
        sb.append("totalAssets");
        sb.append('=');
        sb.append(((this.totalAssets == null) ? "<null>" : this.totalAssets));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null) ? "<null>" : this.endDate));
        sb.append(',');
        sb.append("commonStock");
        sb.append('=');
        sb.append(((this.commonStock == null) ? "<null>" : this.commonStock));
        sb.append(',');
        sb.append("otherCurrentAssets");
        sb.append('=');
        sb.append(((this.otherCurrentAssets == null) ? "<null>" : this.otherCurrentAssets));
        sb.append(',');
        sb.append("retainedEarnings");
        sb.append('=');
        sb.append(((this.retainedEarnings == null) ? "<null>" : this.retainedEarnings));
        sb.append(',');
        sb.append("otherLiab");
        sb.append('=');
        sb.append(((this.otherLiab == null) ? "<null>" : this.otherLiab));
        sb.append(',');
        sb.append("goodWill");
        sb.append('=');
        sb.append(((this.goodWill == null) ? "<null>" : this.goodWill));
        sb.append(',');
        sb.append("treasuryStock");
        sb.append('=');
        sb.append(((this.treasuryStock == null) ? "<null>" : this.treasuryStock));
        sb.append(',');
        sb.append("otherAssets");
        sb.append('=');
        sb.append(((this.otherAssets == null) ? "<null>" : this.otherAssets));
        sb.append(',');
        sb.append("cash");
        sb.append('=');
        sb.append(((this.cash == null) ? "<null>" : this.cash));
        sb.append(',');
        sb.append("totalCurrentLiabilities");
        sb.append('=');
        sb.append(((this.totalCurrentLiabilities == null) ? "<null>" : this.totalCurrentLiabilities));
        sb.append(',');
        sb.append("deferredLongTermAssetCharges");
        sb.append('=');
        sb.append(((this.deferredLongTermAssetCharges == null) ? "<null>" : this.deferredLongTermAssetCharges));
        sb.append(',');
        sb.append("otherStockholderEquity");
        sb.append('=');
        sb.append(((this.otherStockholderEquity == null) ? "<null>" : this.otherStockholderEquity));
        sb.append(',');
        sb.append("propertyPlantEquipment");
        sb.append('=');
        sb.append(((this.propertyPlantEquipment == null) ? "<null>" : this.propertyPlantEquipment));
        sb.append(',');
        sb.append("totalCurrentAssets");
        sb.append('=');
        sb.append(((this.totalCurrentAssets == null) ? "<null>" : this.totalCurrentAssets));
        sb.append(',');
        sb.append("longTermInvestments");
        sb.append('=');
        sb.append(((this.longTermInvestments == null) ? "<null>" : this.longTermInvestments));
        sb.append(',');
        sb.append("netTangibleAssets");
        sb.append('=');
        sb.append(((this.netTangibleAssets == null) ? "<null>" : this.netTangibleAssets));
        sb.append(',');
        sb.append("shortTermInvestments");
        sb.append('=');
        sb.append(((this.shortTermInvestments == null) ? "<null>" : this.shortTermInvestments));
        sb.append(',');
        sb.append("netReceivables");
        sb.append('=');
        sb.append(((this.netReceivables == null) ? "<null>" : this.netReceivables));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
        sb.append(',');
        sb.append("longTermDebt");
        sb.append('=');
        sb.append(((this.longTermDebt == null) ? "<null>" : this.longTermDebt));
        sb.append(',');
        sb.append("inventory");
        sb.append('=');
        sb.append(((this.inventory == null) ? "<null>" : this.inventory));
        sb.append(',');
        sb.append("accountsPayable");
        sb.append('=');
        sb.append(((this.accountsPayable == null) ? "<null>" : this.accountsPayable));
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
        result = ((result * 31) + ((this.shortTermInvestments == null) ? 0 : this.shortTermInvestments.hashCode()));
        result = ((result * 31) + ((this.totalAssets == null) ? 0 : this.totalAssets.hashCode()));
        result = ((result * 31) + ((this.endDate == null) ? 0 : this.endDate.hashCode()));
        result = ((result * 31) + ((this.otherCurrentLiab == null) ? 0 : this.otherCurrentLiab.hashCode()));
        result = ((result * 31) + ((this.totalCurrentLiabilities == null) ? 0 : this.totalCurrentLiabilities.hashCode()));
        result = ((result * 31) + ((this.totalStockholderEquity == null) ? 0 : this.totalStockholderEquity.hashCode()));
        result = ((result * 31) + ((this.inventory == null) ? 0 : this.inventory.hashCode()));
        result = ((result * 31) + ((this.otherCurrentAssets == null) ? 0 : this.otherCurrentAssets.hashCode()));
        result = ((result * 31) + ((this.otherLiab == null) ? 0 : this.otherLiab.hashCode()));
        result = ((result * 31) + ((this.netTangibleAssets == null) ? 0 : this.netTangibleAssets.hashCode()));
        result = ((result * 31) + ((this.otherStockholderEquity == null) ? 0 : this.otherStockholderEquity.hashCode()));
        result = ((result * 31) + ((this.totalLiab == null) ? 0 : this.totalLiab.hashCode()));
        result = ((result * 31) + ((this.longTermInvestments == null) ? 0 : this.longTermInvestments.hashCode()));
        result = ((result * 31) + ((this.retainedEarnings == null) ? 0 : this.retainedEarnings.hashCode()));
        result = ((result * 31) + ((this.accountsPayable == null) ? 0 : this.accountsPayable.hashCode()));
        result = ((result * 31) + ((this.cash == null) ? 0 : this.cash.hashCode()));
        result = ((result * 31) + ((this.otherAssets == null) ? 0 : this.otherAssets.hashCode()));
        result = ((result * 31) + ((this.totalCurrentAssets == null) ? 0 : this.totalCurrentAssets.hashCode()));
        result = ((result * 31) + ((this.longTermDebt == null) ? 0 : this.longTermDebt.hashCode()));
        result = ((result * 31) + ((this.treasuryStock == null) ? 0 : this.treasuryStock.hashCode()));
        result = ((result * 31) + ((this.netReceivables == null) ? 0 : this.netReceivables.hashCode()));
        result = ((result * 31) + ((this.goodWill == null) ? 0 : this.goodWill.hashCode()));
        result = ((result * 31) + ((this.deferredLongTermAssetCharges == null) ? 0 : this.deferredLongTermAssetCharges.hashCode()));
        result = ((result * 31) + ((this.intangibleAssets == null) ? 0 : this.intangibleAssets.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        result = ((result * 31) + ((this.commonStock == null) ? 0 : this.commonStock.hashCode()));
        result = ((result * 31) + ((this.propertyPlantEquipment == null) ? 0 : this.propertyPlantEquipment.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BalanceSheetStatement) == false) {
            return false;
        }
        BalanceSheetStatement rhs = ((BalanceSheetStatement) other);
        return (((((((((((((((((((((((((((((this.shortTermInvestments == rhs.shortTermInvestments) || ((this.shortTermInvestments != null) && this.shortTermInvestments.equals(rhs.shortTermInvestments))) && ((this.totalAssets == rhs.totalAssets) || ((this.totalAssets != null) && this.totalAssets.equals(rhs.totalAssets)))) && ((this.endDate == rhs.endDate) || ((this.endDate != null) && this.endDate.equals(rhs.endDate)))) && ((this.otherCurrentLiab == rhs.otherCurrentLiab) || ((this.otherCurrentLiab != null) && this.otherCurrentLiab.equals(rhs.otherCurrentLiab)))) && ((this.totalCurrentLiabilities == rhs.totalCurrentLiabilities) || ((this.totalCurrentLiabilities != null) && this.totalCurrentLiabilities.equals(rhs.totalCurrentLiabilities)))) && ((this.totalStockholderEquity == rhs.totalStockholderEquity) || ((this.totalStockholderEquity != null) && this.totalStockholderEquity.equals(rhs.totalStockholderEquity)))) && ((this.inventory == rhs.inventory) || ((this.inventory != null) && this.inventory.equals(rhs.inventory)))) && ((this.otherCurrentAssets == rhs.otherCurrentAssets) || ((this.otherCurrentAssets != null) && this.otherCurrentAssets.equals(rhs.otherCurrentAssets)))) && ((this.otherLiab == rhs.otherLiab) || ((this.otherLiab != null) && this.otherLiab.equals(rhs.otherLiab)))) && ((this.netTangibleAssets == rhs.netTangibleAssets) || ((this.netTangibleAssets != null) && this.netTangibleAssets.equals(rhs.netTangibleAssets)))) && ((this.otherStockholderEquity == rhs.otherStockholderEquity) || ((this.otherStockholderEquity != null) && this.otherStockholderEquity.equals(rhs.otherStockholderEquity)))) && ((this.totalLiab == rhs.totalLiab) || ((this.totalLiab != null) && this.totalLiab.equals(rhs.totalLiab)))) && ((this.longTermInvestments == rhs.longTermInvestments) || ((this.longTermInvestments != null) && this.longTermInvestments.equals(rhs.longTermInvestments)))) && ((this.retainedEarnings == rhs.retainedEarnings) || ((this.retainedEarnings != null) && this.retainedEarnings.equals(rhs.retainedEarnings)))) && ((this.accountsPayable == rhs.accountsPayable) || ((this.accountsPayable != null) && this.accountsPayable.equals(rhs.accountsPayable)))) && ((this.cash == rhs.cash) || ((this.cash != null) && this.cash.equals(rhs.cash)))) && ((this.otherAssets == rhs.otherAssets) || ((this.otherAssets != null) && this.otherAssets.equals(rhs.otherAssets)))) && ((this.totalCurrentAssets == rhs.totalCurrentAssets) || ((this.totalCurrentAssets != null) && this.totalCurrentAssets.equals(rhs.totalCurrentAssets)))) && ((this.longTermDebt == rhs.longTermDebt) || ((this.longTermDebt != null) && this.longTermDebt.equals(rhs.longTermDebt)))) && ((this.treasuryStock == rhs.treasuryStock) || ((this.treasuryStock != null) && this.treasuryStock.equals(rhs.treasuryStock)))) && ((this.netReceivables == rhs.netReceivables) || ((this.netReceivables != null) && this.netReceivables.equals(rhs.netReceivables)))) && ((this.goodWill == rhs.goodWill) || ((this.goodWill != null) && this.goodWill.equals(rhs.goodWill)))) && ((this.deferredLongTermAssetCharges == rhs.deferredLongTermAssetCharges) || ((this.deferredLongTermAssetCharges != null) && this.deferredLongTermAssetCharges.equals(rhs.deferredLongTermAssetCharges)))) && ((this.intangibleAssets == rhs.intangibleAssets) || ((this.intangibleAssets != null) && this.intangibleAssets.equals(rhs.intangibleAssets)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.commonStock == rhs.commonStock) || ((this.commonStock != null) && this.commonStock.equals(rhs.commonStock)))) && ((this.propertyPlantEquipment == rhs.propertyPlantEquipment) || ((this.propertyPlantEquipment != null) && this.propertyPlantEquipment.equals(rhs.propertyPlantEquipment)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
