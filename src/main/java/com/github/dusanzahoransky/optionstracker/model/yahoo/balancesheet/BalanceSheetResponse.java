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
    "financialsTemplate",
    "cashflowStatementHistory",
    "balanceSheetHistoryQuarterly",
    "earnings",
    "price",
    "incomeStatementHistoryQuarterly",
    "incomeStatementHistory",
    "balanceSheetHistory",
    "cashflowStatementHistoryQuarterly",
    "quoteType",
    "summaryDetail",
    "symbol",
    "pageViews",
    "timeSeries",
    "meta",
    "loading",
    "errorList"
})
public class BalanceSheetResponse {

    @JsonProperty("financialsTemplate")
    private FinancialsTemplate financialsTemplate;
    @JsonProperty("cashflowStatementHistory")
    private CashflowStatementHistory cashflowStatementHistory;
    @JsonProperty("balanceSheetHistoryQuarterly")
    private BalanceSheetHistoryQuarterly balanceSheetHistoryQuarterly;
    @JsonProperty("earnings")
    private Earnings earnings;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("incomeStatementHistoryQuarterly")
    private IncomeStatementHistoryQuarterly incomeStatementHistoryQuarterly;
    @JsonProperty("incomeStatementHistory")
    private IncomeStatementHistoryAnnual incomeStatementHistory;
    @JsonProperty("balanceSheetHistory")
    private BalanceSheetHistory balanceSheetHistory;
    @JsonProperty("cashflowStatementHistoryQuarterly")
    private CashflowStatementHistoryQuarterly cashflowStatementHistoryQuarterly;
    @JsonProperty("quoteType")
    private QuoteType quoteType;
    @JsonProperty("summaryDetail")
    private SummaryDetail summaryDetail;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("pageViews")
    private PageViews pageViews;
    @JsonProperty("timeSeries")
    private TimeSeries timeSeries;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("loading")
    private Boolean loading;
    @JsonProperty("errorList")
    private List<Object> errorList = new ArrayList<Object>();
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

    @JsonProperty("cashflowStatementHistory")
    public CashflowStatementHistory getCashflowStatementHistory() {
        return cashflowStatementHistory;
    }

    @JsonProperty("cashflowStatementHistory")
    public void setCashflowStatementHistory(CashflowStatementHistory cashflowStatementHistory) {
        this.cashflowStatementHistory = cashflowStatementHistory;
    }

    @JsonProperty("balanceSheetHistoryQuarterly")
    public BalanceSheetHistoryQuarterly getBalanceSheetHistoryQuarterly() {
        return balanceSheetHistoryQuarterly;
    }

    @JsonProperty("balanceSheetHistoryQuarterly")
    public void setBalanceSheetHistoryQuarterly(BalanceSheetHistoryQuarterly balanceSheetHistoryQuarterly) {
        this.balanceSheetHistoryQuarterly = balanceSheetHistoryQuarterly;
    }

    @JsonProperty("earnings")
    public Earnings getEarnings() {
        return earnings;
    }

    @JsonProperty("earnings")
    public void setEarnings(Earnings earnings) {
        this.earnings = earnings;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("incomeStatementHistoryQuarterly")
    public IncomeStatementHistoryQuarterly getIncomeStatementHistoryQuarterly() {
        return incomeStatementHistoryQuarterly;
    }

    @JsonProperty("incomeStatementHistoryQuarterly")
    public void setIncomeStatementHistoryQuarterly(IncomeStatementHistoryQuarterly incomeStatementHistoryQuarterly) {
        this.incomeStatementHistoryQuarterly = incomeStatementHistoryQuarterly;
    }

    @JsonProperty("incomeStatementHistory")
    public IncomeStatementHistoryAnnual getIncomeStatementHistory() {
        return incomeStatementHistory;
    }

    @JsonProperty("incomeStatementHistory")
    public void setIncomeStatementHistory(IncomeStatementHistoryAnnual incomeStatementHistory) {
        this.incomeStatementHistory = incomeStatementHistory;
    }

    @JsonProperty("balanceSheetHistory")
    public BalanceSheetHistory getBalanceSheetHistory() {
        return balanceSheetHistory;
    }

    @JsonProperty("balanceSheetHistory")
    public void setBalanceSheetHistory(BalanceSheetHistory balanceSheetHistory) {
        this.balanceSheetHistory = balanceSheetHistory;
    }

    @JsonProperty("cashflowStatementHistoryQuarterly")
    public CashflowStatementHistoryQuarterly getCashflowStatementHistoryQuarterly() {
        return cashflowStatementHistoryQuarterly;
    }

    @JsonProperty("cashflowStatementHistoryQuarterly")
    public void setCashflowStatementHistoryQuarterly(CashflowStatementHistoryQuarterly cashflowStatementHistoryQuarterly) {
        this.cashflowStatementHistoryQuarterly = cashflowStatementHistoryQuarterly;
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

    @JsonProperty("pageViews")
    public PageViews getPageViews() {
        return pageViews;
    }

    @JsonProperty("pageViews")
    public void setPageViews(PageViews pageViews) {
        this.pageViews = pageViews;
    }

    @JsonProperty("timeSeries")
    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    @JsonProperty("timeSeries")
    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("loading")
    public Boolean getLoading() {
        return loading;
    }

    @JsonProperty("loading")
    public void setLoading(Boolean loading) {
        this.loading = loading;
    }

    @JsonProperty("errorList")
    public List<Object> getErrorList() {
        return errorList;
    }

    @JsonProperty("errorList")
    public void setErrorList(List<Object> errorList) {
        this.errorList = errorList;
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
        sb.append(BalanceSheetResponse.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("financialsTemplate");
        sb.append('=');
        sb.append(((this.financialsTemplate == null) ? "<null>" : this.financialsTemplate));
        sb.append(',');
        sb.append("cashflowStatementHistory");
        sb.append('=');
        sb.append(((this.cashflowStatementHistory == null) ? "<null>" : this.cashflowStatementHistory));
        sb.append(',');
        sb.append("balanceSheetHistoryQuarterly");
        sb.append('=');
        sb.append(((this.balanceSheetHistoryQuarterly == null) ? "<null>" : this.balanceSheetHistoryQuarterly));
        sb.append(',');
        sb.append("earnings");
        sb.append('=');
        sb.append(((this.earnings == null) ? "<null>" : this.earnings));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null) ? "<null>" : this.price));
        sb.append(',');
        sb.append("incomeStatementHistoryQuarterly");
        sb.append('=');
        sb.append(((this.incomeStatementHistoryQuarterly == null) ? "<null>" : this.incomeStatementHistoryQuarterly));
        sb.append(',');
        sb.append("incomeStatementHistory");
        sb.append('=');
        sb.append(((this.incomeStatementHistory == null) ? "<null>" : this.incomeStatementHistory));
        sb.append(',');
        sb.append("balanceSheetHistory");
        sb.append('=');
        sb.append(((this.balanceSheetHistory == null) ? "<null>" : this.balanceSheetHistory));
        sb.append(',');
        sb.append("cashflowStatementHistoryQuarterly");
        sb.append('=');
        sb.append(((this.cashflowStatementHistoryQuarterly == null) ? "<null>" : this.cashflowStatementHistoryQuarterly));
        sb.append(',');
        sb.append("quoteType");
        sb.append('=');
        sb.append(((this.quoteType == null) ? "<null>" : this.quoteType));
        sb.append(',');
        sb.append("summaryDetail");
        sb.append('=');
        sb.append(((this.summaryDetail == null) ? "<null>" : this.summaryDetail));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null) ? "<null>" : this.symbol));
        sb.append(',');
        sb.append("pageViews");
        sb.append('=');
        sb.append(((this.pageViews == null) ? "<null>" : this.pageViews));
        sb.append(',');
        sb.append("timeSeries");
        sb.append('=');
        sb.append(((this.timeSeries == null) ? "<null>" : this.timeSeries));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null) ? "<null>" : this.meta));
        sb.append(',');
        sb.append("loading");
        sb.append('=');
        sb.append(((this.loading == null) ? "<null>" : this.loading));
        sb.append(',');
        sb.append("errorList");
        sb.append('=');
        sb.append(((this.errorList == null) ? "<null>" : this.errorList));
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
        result = ((result * 31) + ((this.cashflowStatementHistory == null) ? 0 : this.cashflowStatementHistory.hashCode()));
        result = ((result * 31) + ((this.symbol == null) ? 0 : this.symbol.hashCode()));
        result = ((result * 31) + ((this.balanceSheetHistoryQuarterly == null) ? 0 : this.balanceSheetHistoryQuarterly.hashCode()));
        result = ((result * 31) + ((this.errorList == null) ? 0 : this.errorList.hashCode()));
        result = ((result * 31) + ((this.financialsTemplate == null) ? 0 : this.financialsTemplate.hashCode()));
        result = ((result * 31) + ((this.loading == null) ? 0 : this.loading.hashCode()));
        result = ((result * 31) + ((this.incomeStatementHistory == null) ? 0 : this.incomeStatementHistory.hashCode()));
        result = ((result * 31) + ((this.quoteType == null) ? 0 : this.quoteType.hashCode()));
        result = ((result * 31) + ((this.incomeStatementHistoryQuarterly == null) ? 0 : this.incomeStatementHistoryQuarterly.hashCode()));
        result = ((result * 31) + ((this.cashflowStatementHistoryQuarterly == null) ? 0 : this.cashflowStatementHistoryQuarterly.hashCode()));
        result = ((result * 31) + ((this.summaryDetail == null) ? 0 : this.summaryDetail.hashCode()));
        result = ((result * 31) + ((this.timeSeries == null) ? 0 : this.timeSeries.hashCode()));
        result = ((result * 31) + ((this.earnings == null) ? 0 : this.earnings.hashCode()));
        result = ((result * 31) + ((this.pageViews == null) ? 0 : this.pageViews.hashCode()));
        result = ((result * 31) + ((this.price == null) ? 0 : this.price.hashCode()));
        result = ((result * 31) + ((this.meta == null) ? 0 : this.meta.hashCode()));
        result = ((result * 31) + ((this.balanceSheetHistory == null) ? 0 : this.balanceSheetHistory.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BalanceSheetResponse) == false) {
            return false;
        }
        BalanceSheetResponse rhs = ((BalanceSheetResponse) other);
        return (((((((((((((((((((this.cashflowStatementHistory == rhs.cashflowStatementHistory) || ((this.cashflowStatementHistory != null) && this.cashflowStatementHistory.equals(rhs.cashflowStatementHistory))) && ((this.symbol == rhs.symbol) || ((this.symbol != null) && this.symbol.equals(rhs.symbol)))) && ((this.balanceSheetHistoryQuarterly == rhs.balanceSheetHistoryQuarterly) || ((this.balanceSheetHistoryQuarterly != null) && this.balanceSheetHistoryQuarterly.equals(rhs.balanceSheetHistoryQuarterly)))) && ((this.errorList == rhs.errorList) || ((this.errorList != null) && this.errorList.equals(rhs.errorList)))) && ((this.financialsTemplate == rhs.financialsTemplate) || ((this.financialsTemplate != null) && this.financialsTemplate.equals(rhs.financialsTemplate)))) && ((this.loading == rhs.loading) || ((this.loading != null) && this.loading.equals(rhs.loading)))) && ((this.incomeStatementHistory == rhs.incomeStatementHistory) || ((this.incomeStatementHistory != null) && this.incomeStatementHistory.equals(rhs.incomeStatementHistory)))) && ((this.quoteType == rhs.quoteType) || ((this.quoteType != null) && this.quoteType.equals(rhs.quoteType)))) && ((this.incomeStatementHistoryQuarterly == rhs.incomeStatementHistoryQuarterly) || ((this.incomeStatementHistoryQuarterly != null) && this.incomeStatementHistoryQuarterly.equals(rhs.incomeStatementHistoryQuarterly)))) && ((this.cashflowStatementHistoryQuarterly == rhs.cashflowStatementHistoryQuarterly) || ((this.cashflowStatementHistoryQuarterly != null) && this.cashflowStatementHistoryQuarterly.equals(rhs.cashflowStatementHistoryQuarterly)))) && ((this.summaryDetail == rhs.summaryDetail) || ((this.summaryDetail != null) && this.summaryDetail.equals(rhs.summaryDetail)))) && ((this.timeSeries == rhs.timeSeries) || ((this.timeSeries != null) && this.timeSeries.equals(rhs.timeSeries)))) && ((this.earnings == rhs.earnings) || ((this.earnings != null) && this.earnings.equals(rhs.earnings)))) && ((this.pageViews == rhs.pageViews) || ((this.pageViews != null) && this.pageViews.equals(rhs.pageViews)))) && ((this.price == rhs.price) || ((this.price != null) && this.price.equals(rhs.price)))) && ((this.meta == rhs.meta) || ((this.meta != null) && this.meta.equals(rhs.meta)))) && ((this.balanceSheetHistory == rhs.balanceSheetHistory) || ((this.balanceSheetHistory != null) && this.balanceSheetHistory.equals(rhs.balanceSheetHistory)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
