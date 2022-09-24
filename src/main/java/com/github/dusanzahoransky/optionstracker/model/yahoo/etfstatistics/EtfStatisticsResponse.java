
package com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics;

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
    "defaultKeyStatistics",
    "fundProfile",
    "financialsTemplate",
    "topHoldings",
    "price",
    "fundPerformance",
    "quoteType",
    "summaryDetail",
    "symbol",
    "assetProfile",
    "esgScores",
    "pageViews",
    "quoteData",
    "mktmData"
})
public class EtfStatisticsResponse {

    @JsonProperty("defaultKeyStatistics")
    private DefaultKeyStatistics defaultKeyStatistics;
    @JsonProperty("fundProfile")
    private FundProfile fundProfile;
    @JsonProperty("financialsTemplate")
    private FinancialsTemplate financialsTemplate;
    @JsonProperty("topHoldings")
    private TopHoldings topHoldings;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("fundPerformance")
    private FundPerformance fundPerformance;
    @JsonProperty("quoteType")
    private QuoteType quoteType;
    @JsonProperty("summaryDetail")
    private SummaryDetail summaryDetail;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("assetProfile")
    private AssetProfile assetProfile;
    @JsonProperty("esgScores")
    private EsgScores esgScores;
    @JsonProperty("pageViews")
    private PageViews pageViews;
    @JsonProperty("quoteData")
    private QuoteData quoteData;
    @JsonProperty("mktmData")
    private MktmData mktmData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("defaultKeyStatistics")
    public DefaultKeyStatistics getDefaultKeyStatistics() {
        return defaultKeyStatistics;
    }

    @JsonProperty("defaultKeyStatistics")
    public void setDefaultKeyStatistics(DefaultKeyStatistics defaultKeyStatistics) {
        this.defaultKeyStatistics = defaultKeyStatistics;
    }

    @JsonProperty("fundProfile")
    public FundProfile getFundProfile() {
        return fundProfile;
    }

    @JsonProperty("fundProfile")
    public void setFundProfile(FundProfile fundProfile) {
        this.fundProfile = fundProfile;
    }

    @JsonProperty("financialsTemplate")
    public FinancialsTemplate getFinancialsTemplate() {
        return financialsTemplate;
    }

    @JsonProperty("financialsTemplate")
    public void setFinancialsTemplate(FinancialsTemplate financialsTemplate) {
        this.financialsTemplate = financialsTemplate;
    }

    @JsonProperty("topHoldings")
    public TopHoldings getTopHoldings() {
        return topHoldings;
    }

    @JsonProperty("topHoldings")
    public void setTopHoldings(TopHoldings topHoldings) {
        this.topHoldings = topHoldings;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("fundPerformance")
    public FundPerformance getFundPerformance() {
        return fundPerformance;
    }

    @JsonProperty("fundPerformance")
    public void setFundPerformance(FundPerformance fundPerformance) {
        this.fundPerformance = fundPerformance;
    }

    @JsonProperty("quoteType")
    public QuoteType getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
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

    @JsonProperty("assetProfile")
    public AssetProfile getAssetProfile() {
        return assetProfile;
    }

    @JsonProperty("assetProfile")
    public void setAssetProfile(AssetProfile assetProfile) {
        this.assetProfile = assetProfile;
    }

    @JsonProperty("esgScores")
    public EsgScores getEsgScores() {
        return esgScores;
    }

    @JsonProperty("esgScores")
    public void setEsgScores(EsgScores esgScores) {
        this.esgScores = esgScores;
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
        sb.append(EtfStatisticsResponse.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defaultKeyStatistics");
        sb.append('=');
        sb.append(((this.defaultKeyStatistics == null)?"<null>":this.defaultKeyStatistics));
        sb.append(',');
        sb.append("fundProfile");
        sb.append('=');
        sb.append(((this.fundProfile == null)?"<null>":this.fundProfile));
        sb.append(',');
        sb.append("financialsTemplate");
        sb.append('=');
        sb.append(((this.financialsTemplate == null)?"<null>":this.financialsTemplate));
        sb.append(',');
        sb.append("topHoldings");
        sb.append('=');
        sb.append(((this.topHoldings == null)?"<null>":this.topHoldings));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("fundPerformance");
        sb.append('=');
        sb.append(((this.fundPerformance == null)?"<null>":this.fundPerformance));
        sb.append(',');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null)?"<null>":this.quoteType));
        sb.append(',');
        sb.append("summaryDetail");
        sb.append('=');
        sb.append(((this.summaryDetail == null)?"<null>":this.summaryDetail));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("assetProfile");
        sb.append('=');
        sb.append(((this.assetProfile == null)?"<null>":this.assetProfile));
        sb.append(',');
        sb.append("esgScores");
        sb.append('=');
        sb.append(((this.esgScores == null)?"<null>":this.esgScores));
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
        result = ((result* 31)+((this.assetProfile == null)? 0 :this.assetProfile.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.esgScores == null)? 0 :this.esgScores.hashCode()));
        result = ((result* 31)+((this.defaultKeyStatistics == null)? 0 :this.defaultKeyStatistics.hashCode()));
        result = ((result* 31)+((this.topHoldings == null)? 0 :this.topHoldings.hashCode()));
        result = ((result* 31)+((this.financialsTemplate == null)? 0 :this.financialsTemplate.hashCode()));
        result = ((result* 31)+((this.fundPerformance == null)? 0 :this.fundPerformance.hashCode()));
        result = ((result* 31)+((this.mktmData == null)? 0 :this.mktmData.hashCode()));
        result = ((result* 31)+((this.quoteType == null)? 0 :this.quoteType.hashCode()));
        result = ((result* 31)+((this.fundProfile == null)? 0 :this.fundProfile.hashCode()));
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
        if ((other instanceof EtfStatisticsResponse) == false) {
            return false;
        }
        EtfStatisticsResponse rhs = ((EtfStatisticsResponse) other);
        return ((((((((((((((((this.assetProfile == rhs.assetProfile)||((this.assetProfile!= null)&&this.assetProfile.equals(rhs.assetProfile)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.esgScores == rhs.esgScores)||((this.esgScores!= null)&&this.esgScores.equals(rhs.esgScores))))&&((this.defaultKeyStatistics == rhs.defaultKeyStatistics)||((this.defaultKeyStatistics!= null)&&this.defaultKeyStatistics.equals(rhs.defaultKeyStatistics))))&&((this.topHoldings == rhs.topHoldings)||((this.topHoldings!= null)&&this.topHoldings.equals(rhs.topHoldings))))&&((this.financialsTemplate == rhs.financialsTemplate)||((this.financialsTemplate!= null)&&this.financialsTemplate.equals(rhs.financialsTemplate))))&&((this.fundPerformance == rhs.fundPerformance)||((this.fundPerformance!= null)&&this.fundPerformance.equals(rhs.fundPerformance))))&&((this.mktmData == rhs.mktmData)||((this.mktmData!= null)&&this.mktmData.equals(rhs.mktmData))))&&((this.quoteType == rhs.quoteType)||((this.quoteType!= null)&&this.quoteType.equals(rhs.quoteType))))&&((this.fundProfile == rhs.fundProfile)||((this.fundProfile!= null)&&this.fundProfile.equals(rhs.fundProfile))))&&((this.summaryDetail == rhs.summaryDetail)||((this.summaryDetail!= null)&&this.summaryDetail.equals(rhs.summaryDetail))))&&((this.quoteData == rhs.quoteData)||((this.quoteData!= null)&&this.quoteData.equals(rhs.quoteData))))&&((this.pageViews == rhs.pageViews)||((this.pageViews!= null)&&this.pageViews.equals(rhs.pageViews))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
