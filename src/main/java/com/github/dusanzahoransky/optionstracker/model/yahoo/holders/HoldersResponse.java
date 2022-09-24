
package com.github.dusanzahoransky.optionstracker.model.yahoo.holders;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "financialsTemplate",
    "majorDirectHolders",
    "price",
    "fundOwnership",
    "insiderTransactions",
    "insiderHolders",
    "netSharePurchaseActivity",
    "majorHoldersBreakdown",
    "quoteType",
    "institutionOwnership",
    "summaryDetail",
    "symbol",
    "pageViews",
    "quoteData",
    "mktmData"
})
public class HoldersResponse {

    @JsonProperty("financialsTemplate")
    private FinancialsTemplate financialsTemplate;
    @JsonProperty("majorDirectHolders")
    private MajorDirectHolders majorDirectHolders;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("fundOwnership")
    private FundOwnership fundOwnership;
    @JsonProperty("insiderTransactions")
    private InsiderTransactions insiderTransactions;
    @JsonProperty("insiderHolders")
    private InsiderHolders insiderHolders;
    @JsonProperty("netSharePurchaseActivity")
    private NetSharePurchaseActivity netSharePurchaseActivity;
    @JsonProperty("majorHoldersBreakdown")
    private MajorHoldersBreakdown majorHoldersBreakdown;
    @JsonProperty("quoteType")
    private QuoteType quoteType;
    @JsonProperty("institutionOwnership")
    private InstitutionOwnership institutionOwnership;
    @JsonProperty("summaryDetail")
    private SummaryDetail summaryDetail;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("pageViews")
    private PageViews pageViews;
    @JsonProperty("quoteData")
    private QuoteData quoteData;
    @JsonProperty("mktmData")
    private MktmData mktmData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("financialsTemplate")
    public FinancialsTemplate getFinancialsTemplate() {
        return financialsTemplate;
    }

    @JsonProperty("financialsTemplate")
    public void setFinancialsTemplate(FinancialsTemplate financialsTemplate) {
        this.financialsTemplate = financialsTemplate;
    }

    @JsonProperty("majorDirectHolders")
    public MajorDirectHolders getMajorDirectHolders() {
        return majorDirectHolders;
    }

    @JsonProperty("majorDirectHolders")
    public void setMajorDirectHolders(MajorDirectHolders majorDirectHolders) {
        this.majorDirectHolders = majorDirectHolders;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("fundOwnership")
    public FundOwnership getFundOwnership() {
        return fundOwnership;
    }

    @JsonProperty("fundOwnership")
    public void setFundOwnership(FundOwnership fundOwnership) {
        this.fundOwnership = fundOwnership;
    }

    @JsonProperty("insiderTransactions")
    public InsiderTransactions getInsiderTransactions() {
        return insiderTransactions;
    }

    @JsonProperty("insiderTransactions")
    public void setInsiderTransactions(InsiderTransactions insiderTransactions) {
        this.insiderTransactions = insiderTransactions;
    }

    @JsonProperty("insiderHolders")
    public InsiderHolders getInsiderHolders() {
        return insiderHolders;
    }

    @JsonProperty("insiderHolders")
    public void setInsiderHolders(InsiderHolders insiderHolders) {
        this.insiderHolders = insiderHolders;
    }

    @JsonProperty("netSharePurchaseActivity")
    public NetSharePurchaseActivity getNetSharePurchaseActivity() {
        return netSharePurchaseActivity;
    }

    @JsonProperty("netSharePurchaseActivity")
    public void setNetSharePurchaseActivity(NetSharePurchaseActivity netSharePurchaseActivity) {
        this.netSharePurchaseActivity = netSharePurchaseActivity;
    }

    @JsonProperty("majorHoldersBreakdown")
    public MajorHoldersBreakdown getMajorHoldersBreakdown() {
        return majorHoldersBreakdown;
    }

    @JsonProperty("majorHoldersBreakdown")
    public void setMajorHoldersBreakdown(MajorHoldersBreakdown majorHoldersBreakdown) {
        this.majorHoldersBreakdown = majorHoldersBreakdown;
    }

    @JsonProperty("quoteType")
    public QuoteType getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("institutionOwnership")
    public InstitutionOwnership getInstitutionOwnership() {
        return institutionOwnership;
    }

    @JsonProperty("institutionOwnership")
    public void setInstitutionOwnership(InstitutionOwnership institutionOwnership) {
        this.institutionOwnership = institutionOwnership;
    }

    @JsonProperty("summaryDetail")
    public SummaryDetail getSummaryDetail() {
        return summaryDetail;
    }

    @JsonProperty("summaryDetail")
    public void setSummaryDetail(SummaryDetail summaryDetail) {
        this.summaryDetail = summaryDetail;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("pageViews")
    public PageViews getPageViews() {
        return pageViews;
    }

    @JsonProperty("pageViews")
    public void setPageViews(PageViews pageViews) {
        this.pageViews = pageViews;
    }

    @JsonProperty("quoteData")
    public QuoteData getQuoteData() {
        return quoteData;
    }

    @JsonProperty("quoteData")
    public void setQuoteData(QuoteData quoteData) {
        this.quoteData = quoteData;
    }

    @JsonProperty("mktmData")
    public MktmData getMktmData() {
        return mktmData;
    }

    @JsonProperty("mktmData")
    public void setMktmData(MktmData mktmData) {
        this.mktmData = mktmData;
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
        sb.append(HoldersResponse.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("financialsTemplate");
        sb.append('=');
        sb.append(((this.financialsTemplate == null)?"<null>":this.financialsTemplate));
        sb.append(',');
        sb.append("majorDirectHolders");
        sb.append('=');
        sb.append(((this.majorDirectHolders == null)?"<null>":this.majorDirectHolders));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("fundOwnership");
        sb.append('=');
        sb.append(((this.fundOwnership == null)?"<null>":this.fundOwnership));
        sb.append(',');
        sb.append("insiderTransactions");
        sb.append('=');
        sb.append(((this.insiderTransactions == null)?"<null>":this.insiderTransactions));
        sb.append(',');
        sb.append("insiderHolders");
        sb.append('=');
        sb.append(((this.insiderHolders == null)?"<null>":this.insiderHolders));
        sb.append(',');
        sb.append("netSharePurchaseActivity");
        sb.append('=');
        sb.append(((this.netSharePurchaseActivity == null)?"<null>":this.netSharePurchaseActivity));
        sb.append(',');
        sb.append("majorHoldersBreakdown");
        sb.append('=');
        sb.append(((this.majorHoldersBreakdown == null)?"<null>":this.majorHoldersBreakdown));
        sb.append(',');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null)?"<null>":this.quoteType));
        sb.append(',');
        sb.append("institutionOwnership");
        sb.append('=');
        sb.append(((this.institutionOwnership == null)?"<null>":this.institutionOwnership));
        sb.append(',');
        sb.append("summaryDetail");
        sb.append('=');
        sb.append(((this.summaryDetail == null)?"<null>":this.summaryDetail));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("pageViews");
        sb.append('=');
        sb.append(((this.pageViews == null)?"<null>":this.pageViews));
        sb.append(',');
        sb.append("quoteData");
        sb.append('=');
        sb.append(((this.quoteData == null)?"<null>":this.quoteData));
        sb.append(',');
        sb.append("mktmData");
        sb.append('=');
        sb.append(((this.mktmData == null)?"<null>":this.mktmData));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.majorHoldersBreakdown == null)? 0 :this.majorHoldersBreakdown.hashCode()));
        result = ((result* 31)+((this.institutionOwnership == null)? 0 :this.institutionOwnership.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.majorDirectHolders == null)? 0 :this.majorDirectHolders.hashCode()));
        result = ((result* 31)+((this.netSharePurchaseActivity == null)? 0 :this.netSharePurchaseActivity.hashCode()));
        result = ((result* 31)+((this.financialsTemplate == null)? 0 :this.financialsTemplate.hashCode()));
        result = ((result* 31)+((this.insiderTransactions == null)? 0 :this.insiderTransactions.hashCode()));
        result = ((result* 31)+((this.mktmData == null)? 0 :this.mktmData.hashCode()));
        result = ((result* 31)+((this.fundOwnership == null)? 0 :this.fundOwnership.hashCode()));
        result = ((result* 31)+((this.quoteType == null)? 0 :this.quoteType.hashCode()));
        result = ((result* 31)+((this.insiderHolders == null)? 0 :this.insiderHolders.hashCode()));
        result = ((result* 31)+((this.summaryDetail == null)? 0 :this.summaryDetail.hashCode()));
        result = ((result* 31)+((this.quoteData == null)? 0 :this.quoteData.hashCode()));
        result = ((result* 31)+((this.pageViews == null)? 0 :this.pageViews.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HoldersResponse) == false) {
            return false;
        }
        HoldersResponse rhs = ((HoldersResponse) other);
        return (((((((((((((((((this.majorHoldersBreakdown == rhs.majorHoldersBreakdown)||((this.majorHoldersBreakdown!= null)&&this.majorHoldersBreakdown.equals(rhs.majorHoldersBreakdown)))&&((this.institutionOwnership == rhs.institutionOwnership)||((this.institutionOwnership!= null)&&this.institutionOwnership.equals(rhs.institutionOwnership))))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.majorDirectHolders == rhs.majorDirectHolders)||((this.majorDirectHolders!= null)&&this.majorDirectHolders.equals(rhs.majorDirectHolders))))&&((this.netSharePurchaseActivity == rhs.netSharePurchaseActivity)||((this.netSharePurchaseActivity!= null)&&this.netSharePurchaseActivity.equals(rhs.netSharePurchaseActivity))))&&((this.financialsTemplate == rhs.financialsTemplate)||((this.financialsTemplate!= null)&&this.financialsTemplate.equals(rhs.financialsTemplate))))&&((this.insiderTransactions == rhs.insiderTransactions)||((this.insiderTransactions!= null)&&this.insiderTransactions.equals(rhs.insiderTransactions))))&&((this.mktmData == rhs.mktmData)||((this.mktmData!= null)&&this.mktmData.equals(rhs.mktmData))))&&((this.fundOwnership == rhs.fundOwnership)||((this.fundOwnership!= null)&&this.fundOwnership.equals(rhs.fundOwnership))))&&((this.quoteType == rhs.quoteType)||((this.quoteType!= null)&&this.quoteType.equals(rhs.quoteType))))&&((this.insiderHolders == rhs.insiderHolders)||((this.insiderHolders!= null)&&this.insiderHolders.equals(rhs.insiderHolders))))&&((this.summaryDetail == rhs.summaryDetail)||((this.summaryDetail!= null)&&this.summaryDetail.equals(rhs.summaryDetail))))&&((this.quoteData == rhs.quoteData)||((this.quoteData!= null)&&this.quoteData.equals(rhs.quoteData))))&&((this.pageViews == rhs.pageViews)||((this.pageViews!= null)&&this.pageViews.equals(rhs.pageViews))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
