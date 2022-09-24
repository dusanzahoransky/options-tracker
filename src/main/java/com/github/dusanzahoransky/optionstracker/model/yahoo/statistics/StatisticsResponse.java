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
    "quoteType",
    "symbol",
    "price",
    "summaryDetail",
    "pageViews",
    "defaultKeyStatistics",
    "financialData",
    "calendarEvents",
    "quoteData",
    "mktmData"
})
public class StatisticsResponse {

    @JsonProperty("quoteType")
    private QuoteType quoteType;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("summaryDetail")
    private SummaryDetail summaryDetail;
    @JsonProperty("pageViews")
    private PageViews pageViews;
    @JsonProperty("defaultKeyStatistics")
    private DefaultKeyStatistics defaultKeyStatistics;
    @JsonProperty("financialData")
    private FinancialData financialData;
    @JsonProperty("calendarEvents")
    private CalendarEvents calendarEvents;
    @JsonProperty("quoteData")
    private QuoteData quoteData;
    @JsonProperty("mktmData")
    private MktmData mktmData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quoteType")
    public QuoteType getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("summaryDetail")
    public SummaryDetail getSummaryDetail() {
        return summaryDetail;
    }

    @JsonProperty("summaryDetail")
    public void setSummaryDetail(SummaryDetail summaryDetail) {
        this.summaryDetail = summaryDetail;
    }

    @JsonProperty("pageViews")
    public PageViews getPageViews() {
        return pageViews;
    }

    @JsonProperty("pageViews")
    public void setPageViews(PageViews pageViews) {
        this.pageViews = pageViews;
    }

    @JsonProperty("defaultKeyStatistics")
    public DefaultKeyStatistics getDefaultKeyStatistics() {
        return defaultKeyStatistics;
    }

    @JsonProperty("defaultKeyStatistics")
    public void setDefaultKeyStatistics(DefaultKeyStatistics defaultKeyStatistics) {
        this.defaultKeyStatistics = defaultKeyStatistics;
    }

    @JsonProperty("financialData")
    public FinancialData getFinancialData() {
        return financialData;
    }

    @JsonProperty("financialData")
    public void setFinancialData(FinancialData financialData) {
        this.financialData = financialData;
    }

    @JsonProperty("calendarEvents")
    public CalendarEvents getCalendarEvents() {
        return calendarEvents;
    }

    @JsonProperty("calendarEvents")
    public void setCalendarEvents(CalendarEvents calendarEvents) {
        this.calendarEvents = calendarEvents;
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
        sb.append(StatisticsResponse.class.getName()).append('@').append(Double.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null) ? "<null>" : this.quoteType));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null) ? "<null>" : this.symbol));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null) ? "<null>" : this.price));
        sb.append(',');
        sb.append("summaryDetail");
        sb.append('=');
        sb.append(((this.summaryDetail == null) ? "<null>" : this.summaryDetail));
        sb.append(',');
        sb.append("pageViews");
        sb.append('=');
        sb.append(((this.pageViews == null) ? "<null>" : this.pageViews));
        sb.append(',');
        sb.append("defaultKeyStatistics");
        sb.append('=');
        sb.append(((this.defaultKeyStatistics == null) ? "<null>" : this.defaultKeyStatistics));
        sb.append(',');
        sb.append("financialData");
        sb.append('=');
        sb.append(((this.financialData == null) ? "<null>" : this.financialData));
        sb.append(',');
        sb.append("calendarEvents");
        sb.append('=');
        sb.append(((this.calendarEvents == null) ? "<null>" : this.calendarEvents));
        sb.append(',');
        sb.append("quoteData");
        sb.append('=');
        sb.append(((this.quoteData == null) ? "<null>" : this.quoteData));
        sb.append(',');
        sb.append("mktmData");
        sb.append('=');
        sb.append(((this.mktmData == null) ? "<null>" : this.mktmData));
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
        result = ((result * 31) + ((this.symbol == null) ? 0 : this.symbol.hashCode()));
        result = ((result * 31) + ((this.summaryDetail == null) ? 0 : this.summaryDetail.hashCode()));
        result = ((result * 31) + ((this.calendarEvents == null) ? 0 : this.calendarEvents.hashCode()));
        result = ((result * 31) + ((this.quoteData == null) ? 0 : this.quoteData.hashCode()));
        result = ((result * 31) + ((this.pageViews == null) ? 0 : this.pageViews.hashCode()));
        result = ((result * 31) + ((this.price == null) ? 0 : this.price.hashCode()));
        result = ((result * 31) + ((this.defaultKeyStatistics == null) ? 0 : this.defaultKeyStatistics.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.mktmData == null) ? 0 : this.mktmData.hashCode()));
        result = ((result * 31) + ((this.quoteType == null) ? 0 : this.quoteType.hashCode()));
        result = ((result * 31) + ((this.financialData == null) ? 0 : this.financialData.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatisticsResponse) == false) {
            return false;
        }
        StatisticsResponse rhs = ((StatisticsResponse) other);
        return ((((((((((((this.symbol == rhs.symbol) || ((this.symbol != null) && this.symbol.equals(rhs.symbol))) && ((this.summaryDetail == rhs.summaryDetail) || ((this.summaryDetail != null) && this.summaryDetail.equals(rhs.summaryDetail)))) && ((this.calendarEvents == rhs.calendarEvents) || ((this.calendarEvents != null) && this.calendarEvents.equals(rhs.calendarEvents)))) && ((this.quoteData == rhs.quoteData) || ((this.quoteData != null) && this.quoteData.equals(rhs.quoteData)))) && ((this.pageViews == rhs.pageViews) || ((this.pageViews != null) && this.pageViews.equals(rhs.pageViews)))) && ((this.price == rhs.price) || ((this.price != null) && this.price.equals(rhs.price)))) && ((this.defaultKeyStatistics == rhs.defaultKeyStatistics) || ((this.defaultKeyStatistics != null) && this.defaultKeyStatistics.equals(rhs.defaultKeyStatistics)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.mktmData == rhs.mktmData) || ((this.mktmData != null) && this.mktmData.equals(rhs.mktmData)))) && ((this.quoteType == rhs.quoteType) || ((this.quoteType != null) && this.quoteType.equals(rhs.quoteType)))) && ((this.financialData == rhs.financialData) || ((this.financialData != null) && this.financialData.equals(rhs.financialData))));
    }

}
