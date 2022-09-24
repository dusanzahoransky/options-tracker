package com.github.dusanzahoransky.optionstracker.model.yahoo.statistics;

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
    "ebitdaMargins",
    "profitMargins",
    "grossMargins",
    "operatingCashflow",
    "revenueGrowth",
    "operatingMargins",
    "ebitda",
    "targetLowPrice",
    "recommendationKey",
    "grossProfits",
    "freeCashflow",
    "targetMedianPrice",
    "currentPrice",
    "earningsGrowth",
    "currentRatio",
    "returnOnAssets",
    "numberOfAnalystOpinions",
    "targetMeanPrice",
    "debtToEquity",
    "returnOnEquity",
    "targetHighPrice",
    "totalCash",
    "totalDebt",
    "totalRevenue",
    "totalCashPerShare",
    "financialCurrency",
    "maxAge",
    "revenuePerShare",
    "quickRatio",
    "recommendationMean"
})
public class FinancialData {

    @JsonProperty("ebitdaMargins")
    private EbitdaMargins ebitdaMargins;
    @JsonProperty("profitMargins")
    private ProfitMargins profitMargins;
    @JsonProperty("grossMargins")
    private GrossMargins grossMargins;
    @JsonProperty("operatingCashflow")
    private OperatingCashflow operatingCashflow;
    @JsonProperty("revenueGrowth")
    private RevenueGrowth revenueGrowth;
    @JsonProperty("operatingMargins")
    private OperatingMargins operatingMargins;
    @JsonProperty("ebitda")
    private Ebitda ebitda;
    @JsonProperty("targetLowPrice")
    private TargetLowPrice targetLowPrice;
    @JsonProperty("recommendationKey")
    private String recommendationKey;
    @JsonProperty("grossProfits")
    private GrossProfits grossProfits;
    @JsonProperty("freeCashflow")
    private FreeCashflow freeCashflow;
    @JsonProperty("targetMedianPrice")
    private TargetMedianPrice targetMedianPrice;
    @JsonProperty("currentPrice")
    private CurrentPrice currentPrice;
    @JsonProperty("earningsGrowth")
    private EarningsGrowth earningsGrowth;
    @JsonProperty("currentRatio")
    private CurrentRatio currentRatio;
    @JsonProperty("returnOnAssets")
    private ReturnOnAssets returnOnAssets;
    @JsonProperty("numberOfAnalystOpinions")
    private NumberOfAnalystOpinions numberOfAnalystOpinions;
    @JsonProperty("targetMeanPrice")
    private TargetMeanPrice targetMeanPrice;
    @JsonProperty("debtToEquity")
    private DebtToEquity debtToEquity;
    @JsonProperty("returnOnEquity")
    private ReturnOnEquity returnOnEquity;
    @JsonProperty("targetHighPrice")
    private TargetHighPrice targetHighPrice;
    @JsonProperty("totalCash")
    private TotalCash totalCash;
    @JsonProperty("totalDebt")
    private TotalDebt totalDebt;
    @JsonProperty("totalRevenue")
    private TotalRevenue totalRevenue;
    @JsonProperty("totalCashPerShare")
    private TotalCashPerShare totalCashPerShare;
    @JsonProperty("financialCurrency")
    private String financialCurrency;
    @JsonProperty("maxAge")
    private Double maxAge;
    @JsonProperty("revenuePerShare")
    private RevenuePerShare revenuePerShare;
    @JsonProperty("quickRatio")
    private QuickRatio quickRatio;
    @JsonProperty("recommendationMean")
    private RecommendationMean recommendationMean;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ebitdaMargins")
    public EbitdaMargins getEbitdaMargins() {
        return ebitdaMargins;
    }

    @JsonProperty("ebitdaMargins")
    public void setEbitdaMargins(EbitdaMargins ebitdaMargins) {
        this.ebitdaMargins = ebitdaMargins;
    }

    @JsonProperty("profitMargins")
    public ProfitMargins getProfitMargins() {
        return profitMargins;
    }

    @JsonProperty("profitMargins")
    public void setProfitMargins(ProfitMargins profitMargins) {
        this.profitMargins = profitMargins;
    }

    @JsonProperty("grossMargins")
    public GrossMargins getGrossMargins() {
        return grossMargins;
    }

    @JsonProperty("grossMargins")
    public void setGrossMargins(GrossMargins grossMargins) {
        this.grossMargins = grossMargins;
    }

    @JsonProperty("operatingCashflow")
    public OperatingCashflow getOperatingCashflow() {
        return operatingCashflow;
    }

    @JsonProperty("operatingCashflow")
    public void setOperatingCashflow(OperatingCashflow operatingCashflow) {
        this.operatingCashflow = operatingCashflow;
    }

    @JsonProperty("revenueGrowth")
    public RevenueGrowth getRevenueGrowth() {
        return revenueGrowth;
    }

    @JsonProperty("revenueGrowth")
    public void setRevenueGrowth(RevenueGrowth revenueGrowth) {
        this.revenueGrowth = revenueGrowth;
    }

    @JsonProperty("operatingMargins")
    public OperatingMargins getOperatingMargins() {
        return operatingMargins;
    }

    @JsonProperty("operatingMargins")
    public void setOperatingMargins(OperatingMargins operatingMargins) {
        this.operatingMargins = operatingMargins;
    }

    @JsonProperty("ebitda")
    public Ebitda getEbitda() {
        return ebitda;
    }

    @JsonProperty("ebitda")
    public void setEbitda(Ebitda ebitda) {
        this.ebitda = ebitda;
    }

    @JsonProperty("targetLowPrice")
    public TargetLowPrice getTargetLowPrice() {
        return targetLowPrice;
    }

    @JsonProperty("targetLowPrice")
    public void setTargetLowPrice(TargetLowPrice targetLowPrice) {
        this.targetLowPrice = targetLowPrice;
    }

    @JsonProperty("recommendationKey")
    public String getRecommendationKey() {
        return recommendationKey;
    }

    @JsonProperty("recommendationKey")
    public void setRecommendationKey(String recommendationKey) {
        this.recommendationKey = recommendationKey;
    }

    @JsonProperty("grossProfits")
    public GrossProfits getGrossProfits() {
        return grossProfits;
    }

    @JsonProperty("grossProfits")
    public void setGrossProfits(GrossProfits grossProfits) {
        this.grossProfits = grossProfits;
    }

    @JsonProperty("freeCashflow")
    public FreeCashflow getFreeCashflow() {
        return freeCashflow;
    }

    @JsonProperty("freeCashflow")
    public void setFreeCashflow(FreeCashflow freeCashflow) {
        this.freeCashflow = freeCashflow;
    }

    @JsonProperty("targetMedianPrice")
    public TargetMedianPrice getTargetMedianPrice() {
        return targetMedianPrice;
    }

    @JsonProperty("targetMedianPrice")
    public void setTargetMedianPrice(TargetMedianPrice targetMedianPrice) {
        this.targetMedianPrice = targetMedianPrice;
    }

    @JsonProperty("currentPrice")
    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    @JsonProperty("currentPrice")
    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }

    @JsonProperty("earningsGrowth")
    public EarningsGrowth getEarningsGrowth() {
        return earningsGrowth;
    }

    @JsonProperty("earningsGrowth")
    public void setEarningsGrowth(EarningsGrowth earningsGrowth) {
        this.earningsGrowth = earningsGrowth;
    }

    @JsonProperty("currentRatio")
    public CurrentRatio getCurrentRatio() {
        return currentRatio;
    }

    @JsonProperty("currentRatio")
    public void setCurrentRatio(CurrentRatio currentRatio) {
        this.currentRatio = currentRatio;
    }

    @JsonProperty("returnOnAssets")
    public ReturnOnAssets getReturnOnAssets() {
        return returnOnAssets;
    }

    @JsonProperty("returnOnAssets")
    public void setReturnOnAssets(ReturnOnAssets returnOnAssets) {
        this.returnOnAssets = returnOnAssets;
    }

    @JsonProperty("numberOfAnalystOpinions")
    public NumberOfAnalystOpinions getNumberOfAnalystOpinions() {
        return numberOfAnalystOpinions;
    }

    @JsonProperty("numberOfAnalystOpinions")
    public void setNumberOfAnalystOpinions(NumberOfAnalystOpinions numberOfAnalystOpinions) {
        this.numberOfAnalystOpinions = numberOfAnalystOpinions;
    }

    @JsonProperty("targetMeanPrice")
    public TargetMeanPrice getTargetMeanPrice() {
        return targetMeanPrice;
    }

    @JsonProperty("targetMeanPrice")
    public void setTargetMeanPrice(TargetMeanPrice targetMeanPrice) {
        this.targetMeanPrice = targetMeanPrice;
    }

    @JsonProperty("debtToEquity")
    public DebtToEquity getDebtToEquity() {
        return debtToEquity;
    }

    @JsonProperty("debtToEquity")
    public void setDebtToEquity(DebtToEquity debtToEquity) {
        this.debtToEquity = debtToEquity;
    }

    @JsonProperty("returnOnEquity")
    public ReturnOnEquity getReturnOnEquity() {
        return returnOnEquity;
    }

    @JsonProperty("returnOnEquity")
    public void setReturnOnEquity(ReturnOnEquity returnOnEquity) {
        this.returnOnEquity = returnOnEquity;
    }

    @JsonProperty("targetHighPrice")
    public TargetHighPrice getTargetHighPrice() {
        return targetHighPrice;
    }

    @JsonProperty("targetHighPrice")
    public void setTargetHighPrice(TargetHighPrice targetHighPrice) {
        this.targetHighPrice = targetHighPrice;
    }

    @JsonProperty("totalCash")
    public TotalCash getTotalCash() {
        return totalCash;
    }

    @JsonProperty("totalCash")
    public void setTotalCash(TotalCash totalCash) {
        this.totalCash = totalCash;
    }

    @JsonProperty("totalDebt")
    public TotalDebt getTotalDebt() {
        return totalDebt;
    }

    @JsonProperty("totalDebt")
    public void setTotalDebt(TotalDebt totalDebt) {
        this.totalDebt = totalDebt;
    }

    @JsonProperty("totalRevenue")
    public TotalRevenue getTotalRevenue() {
        return totalRevenue;
    }

    @JsonProperty("totalRevenue")
    public void setTotalRevenue(TotalRevenue totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    @JsonProperty("totalCashPerShare")
    public TotalCashPerShare getTotalCashPerShare() {
        return totalCashPerShare;
    }

    @JsonProperty("totalCashPerShare")
    public void setTotalCashPerShare(TotalCashPerShare totalCashPerShare) {
        this.totalCashPerShare = totalCashPerShare;
    }

    @JsonProperty("financialCurrency")
    public String getFinancialCurrency() {
        return financialCurrency;
    }

    @JsonProperty("financialCurrency")
    public void setFinancialCurrency(String financialCurrency) {
        this.financialCurrency = financialCurrency;
    }

    @JsonProperty("maxAge")
    public Double getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Double maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("revenuePerShare")
    public RevenuePerShare getRevenuePerShare() {
        return revenuePerShare;
    }

    @JsonProperty("revenuePerShare")
    public void setRevenuePerShare(RevenuePerShare revenuePerShare) {
        this.revenuePerShare = revenuePerShare;
    }

    @JsonProperty("quickRatio")
    public QuickRatio getQuickRatio() {
        return quickRatio;
    }

    @JsonProperty("quickRatio")
    public void setQuickRatio(QuickRatio quickRatio) {
        this.quickRatio = quickRatio;
    }

    @JsonProperty("recommendationMean")
    public RecommendationMean getRecommendationMean() {
        return recommendationMean;
    }

    @JsonProperty("recommendationMean")
    public void setRecommendationMean(RecommendationMean recommendationMean) {
        this.recommendationMean = recommendationMean;
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
        sb.append(FinancialData.class.getName()).append('@').append(Double.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ebitdaMargins");
        sb.append('=');
        sb.append(((this.ebitdaMargins == null) ? "<null>" : this.ebitdaMargins));
        sb.append(',');
        sb.append("profitMargins");
        sb.append('=');
        sb.append(((this.profitMargins == null) ? "<null>" : this.profitMargins));
        sb.append(',');
        sb.append("grossMargins");
        sb.append('=');
        sb.append(((this.grossMargins == null) ? "<null>" : this.grossMargins));
        sb.append(',');
        sb.append("operatingCashflow");
        sb.append('=');
        sb.append(((this.operatingCashflow == null) ? "<null>" : this.operatingCashflow));
        sb.append(',');
        sb.append("revenueGrowth");
        sb.append('=');
        sb.append(((this.revenueGrowth == null) ? "<null>" : this.revenueGrowth));
        sb.append(',');
        sb.append("operatingMargins");
        sb.append('=');
        sb.append(((this.operatingMargins == null) ? "<null>" : this.operatingMargins));
        sb.append(',');
        sb.append("ebitda");
        sb.append('=');
        sb.append(((this.ebitda == null) ? "<null>" : this.ebitda));
        sb.append(',');
        sb.append("targetLowPrice");
        sb.append('=');
        sb.append(((this.targetLowPrice == null) ? "<null>" : this.targetLowPrice));
        sb.append(',');
        sb.append("recommendationKey");
        sb.append('=');
        sb.append(((this.recommendationKey == null) ? "<null>" : this.recommendationKey));
        sb.append(',');
        sb.append("grossProfits");
        sb.append('=');
        sb.append(((this.grossProfits == null) ? "<null>" : this.grossProfits));
        sb.append(',');
        sb.append("freeCashflow");
        sb.append('=');
        sb.append(((this.freeCashflow == null) ? "<null>" : this.freeCashflow));
        sb.append(',');
        sb.append("targetMedianPrice");
        sb.append('=');
        sb.append(((this.targetMedianPrice == null) ? "<null>" : this.targetMedianPrice));
        sb.append(',');
        sb.append("currentPrice");
        sb.append('=');
        sb.append(((this.currentPrice == null) ? "<null>" : this.currentPrice));
        sb.append(',');
        sb.append("earningsGrowth");
        sb.append('=');
        sb.append(((this.earningsGrowth == null) ? "<null>" : this.earningsGrowth));
        sb.append(',');
        sb.append("currentRatio");
        sb.append('=');
        sb.append(((this.currentRatio == null) ? "<null>" : this.currentRatio));
        sb.append(',');
        sb.append("returnOnAssets");
        sb.append('=');
        sb.append(((this.returnOnAssets == null) ? "<null>" : this.returnOnAssets));
        sb.append(',');
        sb.append("numberOfAnalystOpinions");
        sb.append('=');
        sb.append(((this.numberOfAnalystOpinions == null) ? "<null>" : this.numberOfAnalystOpinions));
        sb.append(',');
        sb.append("targetMeanPrice");
        sb.append('=');
        sb.append(((this.targetMeanPrice == null) ? "<null>" : this.targetMeanPrice));
        sb.append(',');
        sb.append("debtToEquity");
        sb.append('=');
        sb.append(((this.debtToEquity == null) ? "<null>" : this.debtToEquity));
        sb.append(',');
        sb.append("returnOnEquity");
        sb.append('=');
        sb.append(((this.returnOnEquity == null) ? "<null>" : this.returnOnEquity));
        sb.append(',');
        sb.append("targetHighPrice");
        sb.append('=');
        sb.append(((this.targetHighPrice == null) ? "<null>" : this.targetHighPrice));
        sb.append(',');
        sb.append("totalCash");
        sb.append('=');
        sb.append(((this.totalCash == null) ? "<null>" : this.totalCash));
        sb.append(',');
        sb.append("totalDebt");
        sb.append('=');
        sb.append(((this.totalDebt == null) ? "<null>" : this.totalDebt));
        sb.append(',');
        sb.append("totalRevenue");
        sb.append('=');
        sb.append(((this.totalRevenue == null) ? "<null>" : this.totalRevenue));
        sb.append(',');
        sb.append("totalCashPerShare");
        sb.append('=');
        sb.append(((this.totalCashPerShare == null) ? "<null>" : this.totalCashPerShare));
        sb.append(',');
        sb.append("financialCurrency");
        sb.append('=');
        sb.append(((this.financialCurrency == null) ? "<null>" : this.financialCurrency));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
        sb.append(',');
        sb.append("revenuePerShare");
        sb.append('=');
        sb.append(((this.revenuePerShare == null) ? "<null>" : this.revenuePerShare));
        sb.append(',');
        sb.append("quickRatio");
        sb.append('=');
        sb.append(((this.quickRatio == null) ? "<null>" : this.quickRatio));
        sb.append(',');
        sb.append("recommendationMean");
        sb.append('=');
        sb.append(((this.recommendationMean == null) ? "<null>" : this.recommendationMean));
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
        result = ((result * 31) + ((this.financialCurrency == null) ? 0 : this.financialCurrency.hashCode()));
        result = ((result * 31) + ((this.quickRatio == null) ? 0 : this.quickRatio.hashCode()));
        result = ((result * 31) + ((this.targetMedianPrice == null) ? 0 : this.targetMedianPrice.hashCode()));
        result = ((result * 31) + ((this.freeCashflow == null) ? 0 : this.freeCashflow.hashCode()));
        result = ((result * 31) + ((this.profitMargins == null) ? 0 : this.profitMargins.hashCode()));
        result = ((result * 31) + ((this.ebitdaMargins == null) ? 0 : this.ebitdaMargins.hashCode()));
        result = ((result * 31) + ((this.recommendationMean == null) ? 0 : this.recommendationMean.hashCode()));
        result = ((result * 31) + ((this.totalCash == null) ? 0 : this.totalCash.hashCode()));
        result = ((result * 31) + ((this.totalCashPerShare == null) ? 0 : this.totalCashPerShare.hashCode()));
        result = ((result * 31) + ((this.totalRevenue == null) ? 0 : this.totalRevenue.hashCode()));
        result = ((result * 31) + ((this.targetLowPrice == null) ? 0 : this.targetLowPrice.hashCode()));
        result = ((result * 31) + ((this.currentRatio == null) ? 0 : this.currentRatio.hashCode()));
        result = ((result * 31) + ((this.grossProfits == null) ? 0 : this.grossProfits.hashCode()));
        result = ((result * 31) + ((this.revenueGrowth == null) ? 0 : this.revenueGrowth.hashCode()));
        result = ((result * 31) + ((this.operatingMargins == null) ? 0 : this.operatingMargins.hashCode()));
        result = ((result * 31) + ((this.numberOfAnalystOpinions == null) ? 0 : this.numberOfAnalystOpinions.hashCode()));
        result = ((result * 31) + ((this.earningsGrowth == null) ? 0 : this.earningsGrowth.hashCode()));
        result = ((result * 31) + ((this.returnOnAssets == null) ? 0 : this.returnOnAssets.hashCode()));
        result = ((result * 31) + ((this.totalDebt == null) ? 0 : this.totalDebt.hashCode()));
        result = ((result * 31) + ((this.currentPrice == null) ? 0 : this.currentPrice.hashCode()));
        result = ((result * 31) + ((this.operatingCashflow == null) ? 0 : this.operatingCashflow.hashCode()));
        result = ((result * 31) + ((this.ebitda == null) ? 0 : this.ebitda.hashCode()));
        result = ((result * 31) + ((this.grossMargins == null) ? 0 : this.grossMargins.hashCode()));
        result = ((result * 31) + ((this.targetHighPrice == null) ? 0 : this.targetHighPrice.hashCode()));
        result = ((result * 31) + ((this.recommendationKey == null) ? 0 : this.recommendationKey.hashCode()));
        result = ((result * 31) + ((this.debtToEquity == null) ? 0 : this.debtToEquity.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        result = ((result * 31) + ((this.targetMeanPrice == null) ? 0 : this.targetMeanPrice.hashCode()));
        result = ((result * 31) + ((this.returnOnEquity == null) ? 0 : this.returnOnEquity.hashCode()));
        result = ((result * 31) + ((this.revenuePerShare == null) ? 0 : this.revenuePerShare.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialData) == false) {
            return false;
        }
        FinancialData rhs = ((FinancialData) other);
        return ((((((((((((((((((((((((((((((((this.financialCurrency == rhs.financialCurrency) || ((this.financialCurrency != null) && this.financialCurrency.equals(rhs.financialCurrency))) && ((this.quickRatio == rhs.quickRatio) || ((this.quickRatio != null) && this.quickRatio.equals(rhs.quickRatio)))) && ((this.targetMedianPrice == rhs.targetMedianPrice) || ((this.targetMedianPrice != null) && this.targetMedianPrice.equals(rhs.targetMedianPrice)))) && ((this.freeCashflow == rhs.freeCashflow) || ((this.freeCashflow != null) && this.freeCashflow.equals(rhs.freeCashflow)))) && ((this.profitMargins == rhs.profitMargins) || ((this.profitMargins != null) && this.profitMargins.equals(rhs.profitMargins)))) && ((this.ebitdaMargins == rhs.ebitdaMargins) || ((this.ebitdaMargins != null) && this.ebitdaMargins.equals(rhs.ebitdaMargins)))) && ((this.recommendationMean == rhs.recommendationMean) || ((this.recommendationMean != null) && this.recommendationMean.equals(rhs.recommendationMean)))) && ((this.totalCash == rhs.totalCash) || ((this.totalCash != null) && this.totalCash.equals(rhs.totalCash)))) && ((this.totalCashPerShare == rhs.totalCashPerShare) || ((this.totalCashPerShare != null) && this.totalCashPerShare.equals(rhs.totalCashPerShare)))) && ((this.totalRevenue == rhs.totalRevenue) || ((this.totalRevenue != null) && this.totalRevenue.equals(rhs.totalRevenue)))) && ((this.targetLowPrice == rhs.targetLowPrice) || ((this.targetLowPrice != null) && this.targetLowPrice.equals(rhs.targetLowPrice)))) && ((this.currentRatio == rhs.currentRatio) || ((this.currentRatio != null) && this.currentRatio.equals(rhs.currentRatio)))) && ((this.grossProfits == rhs.grossProfits) || ((this.grossProfits != null) && this.grossProfits.equals(rhs.grossProfits)))) && ((this.revenueGrowth == rhs.revenueGrowth) || ((this.revenueGrowth != null) && this.revenueGrowth.equals(rhs.revenueGrowth)))) && ((this.operatingMargins == rhs.operatingMargins) || ((this.operatingMargins != null) && this.operatingMargins.equals(rhs.operatingMargins)))) && ((this.numberOfAnalystOpinions == rhs.numberOfAnalystOpinions) || ((this.numberOfAnalystOpinions != null) && this.numberOfAnalystOpinions.equals(rhs.numberOfAnalystOpinions)))) && ((this.earningsGrowth == rhs.earningsGrowth) || ((this.earningsGrowth != null) && this.earningsGrowth.equals(rhs.earningsGrowth)))) && ((this.returnOnAssets == rhs.returnOnAssets) || ((this.returnOnAssets != null) && this.returnOnAssets.equals(rhs.returnOnAssets)))) && ((this.totalDebt == rhs.totalDebt) || ((this.totalDebt != null) && this.totalDebt.equals(rhs.totalDebt)))) && ((this.currentPrice == rhs.currentPrice) || ((this.currentPrice != null) && this.currentPrice.equals(rhs.currentPrice)))) && ((this.operatingCashflow == rhs.operatingCashflow) || ((this.operatingCashflow != null) && this.operatingCashflow.equals(rhs.operatingCashflow)))) && ((this.ebitda == rhs.ebitda) || ((this.ebitda != null) && this.ebitda.equals(rhs.ebitda)))) && ((this.grossMargins == rhs.grossMargins) || ((this.grossMargins != null) && this.grossMargins.equals(rhs.grossMargins)))) && ((this.targetHighPrice == rhs.targetHighPrice) || ((this.targetHighPrice != null) && this.targetHighPrice.equals(rhs.targetHighPrice)))) && ((this.recommendationKey == rhs.recommendationKey) || ((this.recommendationKey != null) && this.recommendationKey.equals(rhs.recommendationKey)))) && ((this.debtToEquity == rhs.debtToEquity) || ((this.debtToEquity != null) && this.debtToEquity.equals(rhs.debtToEquity)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.targetMeanPrice == rhs.targetMeanPrice) || ((this.targetMeanPrice != null) && this.targetMeanPrice.equals(rhs.targetMeanPrice)))) && ((this.returnOnEquity == rhs.returnOnEquity) || ((this.returnOnEquity != null) && this.returnOnEquity.equals(rhs.returnOnEquity)))) && ((this.revenuePerShare == rhs.revenuePerShare) || ((this.revenuePerShare != null) && this.revenuePerShare.equals(rhs.revenuePerShare)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
