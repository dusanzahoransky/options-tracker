
package com.github.dusanzahoransky.optionstracker.model.yahoo.analysis;

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
    "recommendationTrend",
    "financialsTemplate",
    "price",
    "earningsHistory",
    "indexTrend",
    "financialData",
    "earningsTrend",
    "quoteType",
    "sectorTrend",
    "summaryDetail",
    "symbol",
    "upgradeDowngradeHistory",
    "pageViews",
    "industryTrend"
})
public class AnalysisResponse {

    @JsonProperty("recommendationTrend")
    private RecommendationTrend recommendationTrend;
    @JsonProperty("financialsTemplate")
    private FinancialsTemplate financialsTemplate;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("earningsHistory")
    private EarningsHistory earningsHistory;
    @JsonProperty("indexTrend")
    private IndexTrend indexTrend;
    @JsonProperty("financialData")
    private FinancialData financialData;
    @JsonProperty("earningsTrend")
    private EarningsTrend earningsTrend;
    @JsonProperty("quoteType")
    private QuoteType quoteType;
    @JsonProperty("sectorTrend")
    private SectorTrend sectorTrend;
    @JsonProperty("summaryDetail")
    private SummaryDetail summaryDetail;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("upgradeDowngradeHistory")
    private UpgradeDowngradeHistory upgradeDowngradeHistory;
    @JsonProperty("pageViews")
    private PageViews pageViews;
    @JsonProperty("industryTrend")
    private IndustryTrend industryTrend;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recommendationTrend")
    public RecommendationTrend getRecommendationTrend() {
        return recommendationTrend;
    }

    @JsonProperty("recommendationTrend")
    public void setRecommendationTrend(RecommendationTrend recommendationTrend) {
        this.recommendationTrend = recommendationTrend;
    }

    @JsonProperty("financialsTemplate")
    public FinancialsTemplate getFinancialsTemplate() {
        return financialsTemplate;
    }

    @JsonProperty("financialsTemplate")
    public void setFinancialsTemplate(FinancialsTemplate financialsTemplate) {
        this.financialsTemplate = financialsTemplate;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("earningsHistory")
    public EarningsHistory getEarningsHistory() {
        return earningsHistory;
    }

    @JsonProperty("earningsHistory")
    public void setEarningsHistory(EarningsHistory earningsHistory) {
        this.earningsHistory = earningsHistory;
    }

    @JsonProperty("indexTrend")
    public IndexTrend getIndexTrend() {
        return indexTrend;
    }

    @JsonProperty("indexTrend")
    public void setIndexTrend(IndexTrend indexTrend) {
        this.indexTrend = indexTrend;
    }

    @JsonProperty("financialData")
    public FinancialData getFinancialData() {
        return financialData;
    }

    @JsonProperty("financialData")
    public void setFinancialData(FinancialData financialData) {
        this.financialData = financialData;
    }

    @JsonProperty("earningsTrend")
    public EarningsTrend getEarningsTrend() {
        return earningsTrend;
    }

    @JsonProperty("earningsTrend")
    public void setEarningsTrend(EarningsTrend earningsTrend) {
        this.earningsTrend = earningsTrend;
    }

    @JsonProperty("quoteType")
    public QuoteType getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("sectorTrend")
    public SectorTrend getSectorTrend() {
        return sectorTrend;
    }

    @JsonProperty("sectorTrend")
    public void setSectorTrend(SectorTrend sectorTrend) {
        this.sectorTrend = sectorTrend;
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

    @JsonProperty("upgradeDowngradeHistory")
    public UpgradeDowngradeHistory getUpgradeDowngradeHistory() {
        return upgradeDowngradeHistory;
    }

    @JsonProperty("upgradeDowngradeHistory")
    public void setUpgradeDowngradeHistory(UpgradeDowngradeHistory upgradeDowngradeHistory) {
        this.upgradeDowngradeHistory = upgradeDowngradeHistory;
    }

    @JsonProperty("pageViews")
    public PageViews getPageViews() {
        return pageViews;
    }

    @JsonProperty("pageViews")
    public void setPageViews(PageViews pageViews) {
        this.pageViews = pageViews;
    }

    @JsonProperty("industryTrend")
    public IndustryTrend getIndustryTrend() {
        return industryTrend;
    }

    @JsonProperty("industryTrend")
    public void setIndustryTrend(IndustryTrend industryTrend) {
        this.industryTrend = industryTrend;
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
        sb.append(AnalysisResponse.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recommendationTrend");
        sb.append('=');
        sb.append(((this.recommendationTrend == null)?"<null>":this.recommendationTrend));
        sb.append(',');
        sb.append("financialsTemplate");
        sb.append('=');
        sb.append(((this.financialsTemplate == null)?"<null>":this.financialsTemplate));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("earningsHistory");
        sb.append('=');
        sb.append(((this.earningsHistory == null)?"<null>":this.earningsHistory));
        sb.append(',');
        sb.append("indexTrend");
        sb.append('=');
        sb.append(((this.indexTrend == null)?"<null>":this.indexTrend));
        sb.append(',');
        sb.append("financialData");
        sb.append('=');
        sb.append(((this.financialData == null)?"<null>":this.financialData));
        sb.append(',');
        sb.append("earningsTrend");
        sb.append('=');
        sb.append(((this.earningsTrend == null)?"<null>":this.earningsTrend));
        sb.append(',');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null)?"<null>":this.quoteType));
        sb.append(',');
        sb.append("sectorTrend");
        sb.append('=');
        sb.append(((this.sectorTrend == null)?"<null>":this.sectorTrend));
        sb.append(',');
        sb.append("summaryDetail");
        sb.append('=');
        sb.append(((this.summaryDetail == null)?"<null>":this.summaryDetail));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("upgradeDowngradeHistory");
        sb.append('=');
        sb.append(((this.upgradeDowngradeHistory == null)?"<null>":this.upgradeDowngradeHistory));
        sb.append(',');
        sb.append("pageViews");
        sb.append('=');
        sb.append(((this.pageViews == null)?"<null>":this.pageViews));
        sb.append(',');
        sb.append("industryTrend");
        sb.append('=');
        sb.append(((this.industryTrend == null)?"<null>":this.industryTrend));
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
        result = ((result* 31)+((this.recommendationTrend == null)? 0 :this.recommendationTrend.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.earningsHistory == null)? 0 :this.earningsHistory.hashCode()));
        result = ((result* 31)+((this.indexTrend == null)? 0 :this.indexTrend.hashCode()));
        result = ((result* 31)+((this.industryTrend == null)? 0 :this.industryTrend.hashCode()));
        result = ((result* 31)+((this.financialsTemplate == null)? 0 :this.financialsTemplate.hashCode()));
        result = ((result* 31)+((this.quoteType == null)? 0 :this.quoteType.hashCode()));
        result = ((result* 31)+((this.sectorTrend == null)? 0 :this.sectorTrend.hashCode()));
        result = ((result* 31)+((this.summaryDetail == null)? 0 :this.summaryDetail.hashCode()));
        result = ((result* 31)+((this.upgradeDowngradeHistory == null)? 0 :this.upgradeDowngradeHistory.hashCode()));
        result = ((result* 31)+((this.pageViews == null)? 0 :this.pageViews.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.earningsTrend == null)? 0 :this.earningsTrend.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.financialData == null)? 0 :this.financialData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AnalysisResponse) == false) {
            return false;
        }
        AnalysisResponse rhs = ((AnalysisResponse) other);
        return ((((((((((((((((this.recommendationTrend == rhs.recommendationTrend)||((this.recommendationTrend!= null)&&this.recommendationTrend.equals(rhs.recommendationTrend)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.earningsHistory == rhs.earningsHistory)||((this.earningsHistory!= null)&&this.earningsHistory.equals(rhs.earningsHistory))))&&((this.indexTrend == rhs.indexTrend)||((this.indexTrend!= null)&&this.indexTrend.equals(rhs.indexTrend))))&&((this.industryTrend == rhs.industryTrend)||((this.industryTrend!= null)&&this.industryTrend.equals(rhs.industryTrend))))&&((this.financialsTemplate == rhs.financialsTemplate)||((this.financialsTemplate!= null)&&this.financialsTemplate.equals(rhs.financialsTemplate))))&&((this.quoteType == rhs.quoteType)||((this.quoteType!= null)&&this.quoteType.equals(rhs.quoteType))))&&((this.sectorTrend == rhs.sectorTrend)||((this.sectorTrend!= null)&&this.sectorTrend.equals(rhs.sectorTrend))))&&((this.summaryDetail == rhs.summaryDetail)||((this.summaryDetail!= null)&&this.summaryDetail.equals(rhs.summaryDetail))))&&((this.upgradeDowngradeHistory == rhs.upgradeDowngradeHistory)||((this.upgradeDowngradeHistory!= null)&&this.upgradeDowngradeHistory.equals(rhs.upgradeDowngradeHistory))))&&((this.pageViews == rhs.pageViews)||((this.pageViews!= null)&&this.pageViews.equals(rhs.pageViews))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.earningsTrend == rhs.earningsTrend)||((this.earningsTrend!= null)&&this.earningsTrend.equals(rhs.earningsTrend))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.financialData == rhs.financialData)||((this.financialData!= null)&&this.financialData.equals(rhs.financialData))));
    }

}
