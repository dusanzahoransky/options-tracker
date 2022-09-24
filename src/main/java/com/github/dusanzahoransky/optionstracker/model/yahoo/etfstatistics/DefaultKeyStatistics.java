
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
    "annualHoldingsTurnover",
    "enterpriseToRevenue",
    "beta3Year",
    "profitMargins",
    "enterpriseToEbitda",
    "52WeekChange",
    "morningStarRiskRating",
    "forwardEps",
    "revenueQuarterlyGrowth",
    "fundInceptionDate",
    "annualReportExpenseRatio",
    "totalAssets",
    "bookValue",
    "fundFamily",
    "lastFiscalYearEnd",
    "netIncomeToCommon",
    "trailingEps",
    "lastDividendValue",
    "SandP52WeekChange",
    "priceToBook",
    "nextFiscalYearEnd",
    "yield",
    "mostRecentQuarter",
    "enterpriseValue",
    "priceHint",
    "threeYearAverageReturn",
    "lastSplitDate",
    "lastSplitFactor",
    "legalType",
    "morningStarOverallRating",
    "earningsQuarterlyGrowth",
    "priceToSalesTrailing12Months",
    "pegRatio",
    "ytdReturn",
    "forwardPE",
    "maxAge",
    "lastCapGain",
    "category",
    "fiveYearAverageReturn"
})
public class DefaultKeyStatistics {

    @JsonProperty("annualHoldingsTurnover")
    private AnnualHoldingsTurnover annualHoldingsTurnover;
    @JsonProperty("enterpriseToRevenue")
    private EnterpriseToRevenue enterpriseToRevenue;
    @JsonProperty("beta3Year")
    private Beta3Year beta3Year;
    @JsonProperty("profitMargins")
    private ProfitMargins profitMargins;
    @JsonProperty("enterpriseToEbitda")
    private EnterpriseToEbitda enterpriseToEbitda;
    @JsonProperty("52WeekChange")
    private com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics._52WeekChange _52WeekChange;
    @JsonProperty("morningStarRiskRating")
    private MorningStarRiskRating morningStarRiskRating;
    @JsonProperty("forwardEps")
    private ForwardEps forwardEps;
    @JsonProperty("revenueQuarterlyGrowth")
    private RevenueQuarterlyGrowth revenueQuarterlyGrowth;
    @JsonProperty("fundInceptionDate")
    private FundInceptionDate fundInceptionDate;
    @JsonProperty("annualReportExpenseRatio")
    private AnnualReportExpenseRatio annualReportExpenseRatio;
    @JsonProperty("totalAssets")
    private TotalAssets totalAssets;
    @JsonProperty("bookValue")
    private BookValue bookValue;
    @JsonProperty("fundFamily")
    private String fundFamily;
    @JsonProperty("lastFiscalYearEnd")
    private LastFiscalYearEnd lastFiscalYearEnd;
    @JsonProperty("netIncomeToCommon")
    private NetIncomeToCommon netIncomeToCommon;
    @JsonProperty("trailingEps")
    private TrailingEps trailingEps;
    @JsonProperty("lastDividendValue")
    private LastDividendValue lastDividendValue;
    @JsonProperty("SandP52WeekChange")
    private SandP52WeekChange sandP52WeekChange;
    @JsonProperty("priceToBook")
    private PriceToBook priceToBook;
    @JsonProperty("nextFiscalYearEnd")
    private NextFiscalYearEnd nextFiscalYearEnd;
    @JsonProperty("yield")
    private Yield yield;
    @JsonProperty("mostRecentQuarter")
    private MostRecentQuarter mostRecentQuarter;
    @JsonProperty("enterpriseValue")
    private EnterpriseValue enterpriseValue;
    @JsonProperty("priceHint")
    private PriceHint priceHint;
    @JsonProperty("threeYearAverageReturn")
    private ThreeYearAverageReturn threeYearAverageReturn;
    @JsonProperty("lastSplitDate")
    private LastSplitDate lastSplitDate;
    @JsonProperty("lastSplitFactor")
    private Object lastSplitFactor;
    @JsonProperty("legalType")
    private String legalType;
    @JsonProperty("morningStarOverallRating")
    private MorningStarOverallRating morningStarOverallRating;
    @JsonProperty("earningsQuarterlyGrowth")
    private EarningsQuarterlyGrowth earningsQuarterlyGrowth;
    @JsonProperty("priceToSalesTrailing12Months")
    private PriceToSalesTrailing12Months priceToSalesTrailing12Months;
    @JsonProperty("pegRatio")
    private PegRatio pegRatio;
    @JsonProperty("ytdReturn")
    private YtdReturn ytdReturn;
    @JsonProperty("forwardPE")
    private ForwardPE forwardPE;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("lastCapGain")
    private LastCapGain lastCapGain;
    @JsonProperty("category")
    private Object category;
    @JsonProperty("fiveYearAverageReturn")
    private FiveYearAverageReturn fiveYearAverageReturn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("annualHoldingsTurnover")
    public AnnualHoldingsTurnover getAnnualHoldingsTurnover() {
        return annualHoldingsTurnover;
    }

    @JsonProperty("annualHoldingsTurnover")
    public void setAnnualHoldingsTurnover(AnnualHoldingsTurnover annualHoldingsTurnover) {
        this.annualHoldingsTurnover = annualHoldingsTurnover;
    }

    @JsonProperty("enterpriseToRevenue")
    public EnterpriseToRevenue getEnterpriseToRevenue() {
        return enterpriseToRevenue;
    }

    @JsonProperty("enterpriseToRevenue")
    public void setEnterpriseToRevenue(EnterpriseToRevenue enterpriseToRevenue) {
        this.enterpriseToRevenue = enterpriseToRevenue;
    }

    @JsonProperty("beta3Year")
    public Beta3Year getBeta3Year() {
        return beta3Year;
    }

    @JsonProperty("beta3Year")
    public void setBeta3Year(Beta3Year beta3Year) {
        this.beta3Year = beta3Year;
    }

    @JsonProperty("profitMargins")
    public ProfitMargins getProfitMargins() {
        return profitMargins;
    }

    @JsonProperty("profitMargins")
    public void setProfitMargins(ProfitMargins profitMargins) {
        this.profitMargins = profitMargins;
    }

    @JsonProperty("enterpriseToEbitda")
    public EnterpriseToEbitda getEnterpriseToEbitda() {
        return enterpriseToEbitda;
    }

    @JsonProperty("enterpriseToEbitda")
    public void setEnterpriseToEbitda(EnterpriseToEbitda enterpriseToEbitda) {
        this.enterpriseToEbitda = enterpriseToEbitda;
    }

    @JsonProperty("52WeekChange")
    public com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics._52WeekChange get52WeekChange() {
        return _52WeekChange;
    }

    @JsonProperty("52WeekChange")
    public void set52WeekChange(com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics._52WeekChange _52WeekChange) {
        this._52WeekChange = _52WeekChange;
    }

    @JsonProperty("morningStarRiskRating")
    public MorningStarRiskRating getMorningStarRiskRating() {
        return morningStarRiskRating;
    }

    @JsonProperty("morningStarRiskRating")
    public void setMorningStarRiskRating(MorningStarRiskRating morningStarRiskRating) {
        this.morningStarRiskRating = morningStarRiskRating;
    }

    @JsonProperty("forwardEps")
    public ForwardEps getForwardEps() {
        return forwardEps;
    }

    @JsonProperty("forwardEps")
    public void setForwardEps(ForwardEps forwardEps) {
        this.forwardEps = forwardEps;
    }

    @JsonProperty("revenueQuarterlyGrowth")
    public RevenueQuarterlyGrowth getRevenueQuarterlyGrowth() {
        return revenueQuarterlyGrowth;
    }

    @JsonProperty("revenueQuarterlyGrowth")
    public void setRevenueQuarterlyGrowth(RevenueQuarterlyGrowth revenueQuarterlyGrowth) {
        this.revenueQuarterlyGrowth = revenueQuarterlyGrowth;
    }

    @JsonProperty("fundInceptionDate")
    public FundInceptionDate getFundInceptionDate() {
        return fundInceptionDate;
    }

    @JsonProperty("fundInceptionDate")
    public void setFundInceptionDate(FundInceptionDate fundInceptionDate) {
        this.fundInceptionDate = fundInceptionDate;
    }

    @JsonProperty("annualReportExpenseRatio")
    public AnnualReportExpenseRatio getAnnualReportExpenseRatio() {
        return annualReportExpenseRatio;
    }

    @JsonProperty("annualReportExpenseRatio")
    public void setAnnualReportExpenseRatio(AnnualReportExpenseRatio annualReportExpenseRatio) {
        this.annualReportExpenseRatio = annualReportExpenseRatio;
    }

    @JsonProperty("totalAssets")
    public TotalAssets getTotalAssets() {
        return totalAssets;
    }

    @JsonProperty("totalAssets")
    public void setTotalAssets(TotalAssets totalAssets) {
        this.totalAssets = totalAssets;
    }

    @JsonProperty("bookValue")
    public BookValue getBookValue() {
        return bookValue;
    }

    @JsonProperty("bookValue")
    public void setBookValue(BookValue bookValue) {
        this.bookValue = bookValue;
    }

    @JsonProperty("fundFamily")
    public String getFundFamily() {
        return fundFamily;
    }

    @JsonProperty("fundFamily")
    public void setFundFamily(String fundFamily) {
        this.fundFamily = fundFamily;
    }

    @JsonProperty("lastFiscalYearEnd")
    public LastFiscalYearEnd getLastFiscalYearEnd() {
        return lastFiscalYearEnd;
    }

    @JsonProperty("lastFiscalYearEnd")
    public void setLastFiscalYearEnd(LastFiscalYearEnd lastFiscalYearEnd) {
        this.lastFiscalYearEnd = lastFiscalYearEnd;
    }

    @JsonProperty("netIncomeToCommon")
    public NetIncomeToCommon getNetIncomeToCommon() {
        return netIncomeToCommon;
    }

    @JsonProperty("netIncomeToCommon")
    public void setNetIncomeToCommon(NetIncomeToCommon netIncomeToCommon) {
        this.netIncomeToCommon = netIncomeToCommon;
    }

    @JsonProperty("trailingEps")
    public TrailingEps getTrailingEps() {
        return trailingEps;
    }

    @JsonProperty("trailingEps")
    public void setTrailingEps(TrailingEps trailingEps) {
        this.trailingEps = trailingEps;
    }

    @JsonProperty("lastDividendValue")
    public LastDividendValue getLastDividendValue() {
        return lastDividendValue;
    }

    @JsonProperty("lastDividendValue")
    public void setLastDividendValue(LastDividendValue lastDividendValue) {
        this.lastDividendValue = lastDividendValue;
    }

    @JsonProperty("SandP52WeekChange")
    public SandP52WeekChange getSandP52WeekChange() {
        return sandP52WeekChange;
    }

    @JsonProperty("SandP52WeekChange")
    public void setSandP52WeekChange(SandP52WeekChange sandP52WeekChange) {
        this.sandP52WeekChange = sandP52WeekChange;
    }

    @JsonProperty("priceToBook")
    public PriceToBook getPriceToBook() {
        return priceToBook;
    }

    @JsonProperty("priceToBook")
    public void setPriceToBook(PriceToBook priceToBook) {
        this.priceToBook = priceToBook;
    }

    @JsonProperty("nextFiscalYearEnd")
    public NextFiscalYearEnd getNextFiscalYearEnd() {
        return nextFiscalYearEnd;
    }

    @JsonProperty("nextFiscalYearEnd")
    public void setNextFiscalYearEnd(NextFiscalYearEnd nextFiscalYearEnd) {
        this.nextFiscalYearEnd = nextFiscalYearEnd;
    }

    @JsonProperty("yield")
    public Yield getYield() {
        return yield;
    }

    @JsonProperty("yield")
    public void setYield(Yield yield) {
        this.yield = yield;
    }

    @JsonProperty("mostRecentQuarter")
    public MostRecentQuarter getMostRecentQuarter() {
        return mostRecentQuarter;
    }

    @JsonProperty("mostRecentQuarter")
    public void setMostRecentQuarter(MostRecentQuarter mostRecentQuarter) {
        this.mostRecentQuarter = mostRecentQuarter;
    }

    @JsonProperty("enterpriseValue")
    public EnterpriseValue getEnterpriseValue() {
        return enterpriseValue;
    }

    @JsonProperty("enterpriseValue")
    public void setEnterpriseValue(EnterpriseValue enterpriseValue) {
        this.enterpriseValue = enterpriseValue;
    }

    @JsonProperty("priceHint")
    public PriceHint getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(PriceHint priceHint) {
        this.priceHint = priceHint;
    }

    @JsonProperty("threeYearAverageReturn")
    public ThreeYearAverageReturn getThreeYearAverageReturn() {
        return threeYearAverageReturn;
    }

    @JsonProperty("threeYearAverageReturn")
    public void setThreeYearAverageReturn(ThreeYearAverageReturn threeYearAverageReturn) {
        this.threeYearAverageReturn = threeYearAverageReturn;
    }

    @JsonProperty("lastSplitDate")
    public LastSplitDate getLastSplitDate() {
        return lastSplitDate;
    }

    @JsonProperty("lastSplitDate")
    public void setLastSplitDate(LastSplitDate lastSplitDate) {
        this.lastSplitDate = lastSplitDate;
    }

    @JsonProperty("lastSplitFactor")
    public Object getLastSplitFactor() {
        return lastSplitFactor;
    }

    @JsonProperty("lastSplitFactor")
    public void setLastSplitFactor(Object lastSplitFactor) {
        this.lastSplitFactor = lastSplitFactor;
    }

    @JsonProperty("legalType")
    public String getLegalType() {
        return legalType;
    }

    @JsonProperty("legalType")
    public void setLegalType(String legalType) {
        this.legalType = legalType;
    }

    @JsonProperty("morningStarOverallRating")
    public MorningStarOverallRating getMorningStarOverallRating() {
        return morningStarOverallRating;
    }

    @JsonProperty("morningStarOverallRating")
    public void setMorningStarOverallRating(MorningStarOverallRating morningStarOverallRating) {
        this.morningStarOverallRating = morningStarOverallRating;
    }

    @JsonProperty("earningsQuarterlyGrowth")
    public EarningsQuarterlyGrowth getEarningsQuarterlyGrowth() {
        return earningsQuarterlyGrowth;
    }

    @JsonProperty("earningsQuarterlyGrowth")
    public void setEarningsQuarterlyGrowth(EarningsQuarterlyGrowth earningsQuarterlyGrowth) {
        this.earningsQuarterlyGrowth = earningsQuarterlyGrowth;
    }

    @JsonProperty("priceToSalesTrailing12Months")
    public PriceToSalesTrailing12Months getPriceToSalesTrailing12Months() {
        return priceToSalesTrailing12Months;
    }

    @JsonProperty("priceToSalesTrailing12Months")
    public void setPriceToSalesTrailing12Months(PriceToSalesTrailing12Months priceToSalesTrailing12Months) {
        this.priceToSalesTrailing12Months = priceToSalesTrailing12Months;
    }

    @JsonProperty("pegRatio")
    public PegRatio getPegRatio() {
        return pegRatio;
    }

    @JsonProperty("pegRatio")
    public void setPegRatio(PegRatio pegRatio) {
        this.pegRatio = pegRatio;
    }

    @JsonProperty("ytdReturn")
    public YtdReturn getYtdReturn() {
        return ytdReturn;
    }

    @JsonProperty("ytdReturn")
    public void setYtdReturn(YtdReturn ytdReturn) {
        this.ytdReturn = ytdReturn;
    }

    @JsonProperty("forwardPE")
    public ForwardPE getForwardPE() {
        return forwardPE;
    }

    @JsonProperty("forwardPE")
    public void setForwardPE(ForwardPE forwardPE) {
        this.forwardPE = forwardPE;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("lastCapGain")
    public LastCapGain getLastCapGain() {
        return lastCapGain;
    }

    @JsonProperty("lastCapGain")
    public void setLastCapGain(LastCapGain lastCapGain) {
        this.lastCapGain = lastCapGain;
    }

    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    @JsonProperty("fiveYearAverageReturn")
    public FiveYearAverageReturn getFiveYearAverageReturn() {
        return fiveYearAverageReturn;
    }

    @JsonProperty("fiveYearAverageReturn")
    public void setFiveYearAverageReturn(FiveYearAverageReturn fiveYearAverageReturn) {
        this.fiveYearAverageReturn = fiveYearAverageReturn;
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
        sb.append(DefaultKeyStatistics.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annualHoldingsTurnover");
        sb.append('=');
        sb.append(((this.annualHoldingsTurnover == null)?"<null>":this.annualHoldingsTurnover));
        sb.append(',');
        sb.append("enterpriseToRevenue");
        sb.append('=');
        sb.append(((this.enterpriseToRevenue == null)?"<null>":this.enterpriseToRevenue));
        sb.append(',');
        sb.append("beta3Year");
        sb.append('=');
        sb.append(((this.beta3Year == null)?"<null>":this.beta3Year));
        sb.append(',');
        sb.append("profitMargins");
        sb.append('=');
        sb.append(((this.profitMargins == null)?"<null>":this.profitMargins));
        sb.append(',');
        sb.append("enterpriseToEbitda");
        sb.append('=');
        sb.append(((this.enterpriseToEbitda == null)?"<null>":this.enterpriseToEbitda));
        sb.append(',');
        sb.append("_52WeekChange");
        sb.append('=');
        sb.append(((this._52WeekChange == null)?"<null>":this._52WeekChange));
        sb.append(',');
        sb.append("morningStarRiskRating");
        sb.append('=');
        sb.append(((this.morningStarRiskRating == null)?"<null>":this.morningStarRiskRating));
        sb.append(',');
        sb.append("forwardEps");
        sb.append('=');
        sb.append(((this.forwardEps == null)?"<null>":this.forwardEps));
        sb.append(',');
        sb.append("revenueQuarterlyGrowth");
        sb.append('=');
        sb.append(((this.revenueQuarterlyGrowth == null)?"<null>":this.revenueQuarterlyGrowth));
        sb.append(',');
        sb.append("fundInceptionDate");
        sb.append('=');
        sb.append(((this.fundInceptionDate == null)?"<null>":this.fundInceptionDate));
        sb.append(',');
        sb.append("annualReportExpenseRatio");
        sb.append('=');
        sb.append(((this.annualReportExpenseRatio == null)?"<null>":this.annualReportExpenseRatio));
        sb.append(',');
        sb.append("totalAssets");
        sb.append('=');
        sb.append(((this.totalAssets == null)?"<null>":this.totalAssets));
        sb.append(',');
        sb.append("bookValue");
        sb.append('=');
        sb.append(((this.bookValue == null)?"<null>":this.bookValue));
        sb.append(',');
        sb.append("fundFamily");
        sb.append('=');
        sb.append(((this.fundFamily == null)?"<null>":this.fundFamily));
        sb.append(',');
        sb.append("lastFiscalYearEnd");
        sb.append('=');
        sb.append(((this.lastFiscalYearEnd == null)?"<null>":this.lastFiscalYearEnd));
        sb.append(',');
        sb.append("netIncomeToCommon");
        sb.append('=');
        sb.append(((this.netIncomeToCommon == null)?"<null>":this.netIncomeToCommon));
        sb.append(',');
        sb.append("trailingEps");
        sb.append('=');
        sb.append(((this.trailingEps == null)?"<null>":this.trailingEps));
        sb.append(',');
        sb.append("lastDividendValue");
        sb.append('=');
        sb.append(((this.lastDividendValue == null)?"<null>":this.lastDividendValue));
        sb.append(',');
        sb.append("sandP52WeekChange");
        sb.append('=');
        sb.append(((this.sandP52WeekChange == null)?"<null>":this.sandP52WeekChange));
        sb.append(',');
        sb.append("priceToBook");
        sb.append('=');
        sb.append(((this.priceToBook == null)?"<null>":this.priceToBook));
        sb.append(',');
        sb.append("nextFiscalYearEnd");
        sb.append('=');
        sb.append(((this.nextFiscalYearEnd == null)?"<null>":this.nextFiscalYearEnd));
        sb.append(',');
        sb.append("yield");
        sb.append('=');
        sb.append(((this.yield == null)?"<null>":this.yield));
        sb.append(',');
        sb.append("mostRecentQuarter");
        sb.append('=');
        sb.append(((this.mostRecentQuarter == null)?"<null>":this.mostRecentQuarter));
        sb.append(',');
        sb.append("enterpriseValue");
        sb.append('=');
        sb.append(((this.enterpriseValue == null)?"<null>":this.enterpriseValue));
        sb.append(',');
        sb.append("priceHint");
        sb.append('=');
        sb.append(((this.priceHint == null)?"<null>":this.priceHint));
        sb.append(',');
        sb.append("threeYearAverageReturn");
        sb.append('=');
        sb.append(((this.threeYearAverageReturn == null)?"<null>":this.threeYearAverageReturn));
        sb.append(',');
        sb.append("lastSplitDate");
        sb.append('=');
        sb.append(((this.lastSplitDate == null)?"<null>":this.lastSplitDate));
        sb.append(',');
        sb.append("lastSplitFactor");
        sb.append('=');
        sb.append(((this.lastSplitFactor == null)?"<null>":this.lastSplitFactor));
        sb.append(',');
        sb.append("legalType");
        sb.append('=');
        sb.append(((this.legalType == null)?"<null>":this.legalType));
        sb.append(',');
        sb.append("morningStarOverallRating");
        sb.append('=');
        sb.append(((this.morningStarOverallRating == null)?"<null>":this.morningStarOverallRating));
        sb.append(',');
        sb.append("earningsQuarterlyGrowth");
        sb.append('=');
        sb.append(((this.earningsQuarterlyGrowth == null)?"<null>":this.earningsQuarterlyGrowth));
        sb.append(',');
        sb.append("priceToSalesTrailing12Months");
        sb.append('=');
        sb.append(((this.priceToSalesTrailing12Months == null)?"<null>":this.priceToSalesTrailing12Months));
        sb.append(',');
        sb.append("pegRatio");
        sb.append('=');
        sb.append(((this.pegRatio == null)?"<null>":this.pegRatio));
        sb.append(',');
        sb.append("ytdReturn");
        sb.append('=');
        sb.append(((this.ytdReturn == null)?"<null>":this.ytdReturn));
        sb.append(',');
        sb.append("forwardPE");
        sb.append('=');
        sb.append(((this.forwardPE == null)?"<null>":this.forwardPE));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("lastCapGain");
        sb.append('=');
        sb.append(((this.lastCapGain == null)?"<null>":this.lastCapGain));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("fiveYearAverageReturn");
        sb.append('=');
        sb.append(((this.fiveYearAverageReturn == null)?"<null>":this.fiveYearAverageReturn));
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
        result = ((result* 31)+((this.enterpriseValue == null)? 0 :this.enterpriseValue.hashCode()));
        result = ((result* 31)+((this.totalAssets == null)? 0 :this.totalAssets.hashCode()));
        result = ((result* 31)+((this.trailingEps == null)? 0 :this.trailingEps.hashCode()));
        result = ((result* 31)+((this.threeYearAverageReturn == null)? 0 :this.threeYearAverageReturn.hashCode()));
        result = ((result* 31)+((this.revenueQuarterlyGrowth == null)? 0 :this.revenueQuarterlyGrowth.hashCode()));
        result = ((result* 31)+((this.lastDividendValue == null)? 0 :this.lastDividendValue.hashCode()));
        result = ((result* 31)+((this.fiveYearAverageReturn == null)? 0 :this.fiveYearAverageReturn.hashCode()));
        result = ((result* 31)+((this.profitMargins == null)? 0 :this.profitMargins.hashCode()));
        result = ((result* 31)+((this.earningsQuarterlyGrowth == null)? 0 :this.earningsQuarterlyGrowth.hashCode()));
        result = ((result* 31)+((this.lastSplitFactor == null)? 0 :this.lastSplitFactor.hashCode()));
        result = ((result* 31)+((this.lastCapGain == null)? 0 :this.lastCapGain.hashCode()));
        result = ((result* 31)+((this.pegRatio == null)? 0 :this.pegRatio.hashCode()));
        result = ((result* 31)+((this.forwardEps == null)? 0 :this.forwardEps.hashCode()));
        result = ((result* 31)+((this.mostRecentQuarter == null)? 0 :this.mostRecentQuarter.hashCode()));
        result = ((result* 31)+((this.yield == null)? 0 :this.yield.hashCode()));
        result = ((result* 31)+((this.annualReportExpenseRatio == null)? 0 :this.annualReportExpenseRatio.hashCode()));
        result = ((result* 31)+((this.enterpriseToEbitda == null)? 0 :this.enterpriseToEbitda.hashCode()));
        result = ((result* 31)+((this.nextFiscalYearEnd == null)? 0 :this.nextFiscalYearEnd.hashCode()));
        result = ((result* 31)+((this.bookValue == null)? 0 :this.bookValue.hashCode()));
        result = ((result* 31)+((this.morningStarOverallRating == null)? 0 :this.morningStarOverallRating.hashCode()));
        result = ((result* 31)+((this.priceToSalesTrailing12Months == null)? 0 :this.priceToSalesTrailing12Months.hashCode()));
        result = ((result* 31)+((this.legalType == null)? 0 :this.legalType.hashCode()));
        result = ((result* 31)+((this.lastFiscalYearEnd == null)? 0 :this.lastFiscalYearEnd.hashCode()));
        result = ((result* 31)+((this.sandP52WeekChange == null)? 0 :this.sandP52WeekChange.hashCode()));
        result = ((result* 31)+((this.lastSplitDate == null)? 0 :this.lastSplitDate.hashCode()));
        result = ((result* 31)+((this.netIncomeToCommon == null)? 0 :this.netIncomeToCommon.hashCode()));
        result = ((result* 31)+((this.enterpriseToRevenue == null)? 0 :this.enterpriseToRevenue.hashCode()));
        result = ((result* 31)+((this.forwardPE == null)? 0 :this.forwardPE.hashCode()));
        result = ((result* 31)+((this._52WeekChange == null)? 0 :this._52WeekChange.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.priceHint == null)? 0 :this.priceHint.hashCode()));
        result = ((result* 31)+((this.fundInceptionDate == null)? 0 :this.fundInceptionDate.hashCode()));
        result = ((result* 31)+((this.annualHoldingsTurnover == null)? 0 :this.annualHoldingsTurnover.hashCode()));
        result = ((result* 31)+((this.beta3Year == null)? 0 :this.beta3Year.hashCode()));
        result = ((result* 31)+((this.ytdReturn == null)? 0 :this.ytdReturn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.morningStarRiskRating == null)? 0 :this.morningStarRiskRating.hashCode()));
        result = ((result* 31)+((this.priceToBook == null)? 0 :this.priceToBook.hashCode()));
        result = ((result* 31)+((this.fundFamily == null)? 0 :this.fundFamily.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultKeyStatistics) == false) {
            return false;
        }
        DefaultKeyStatistics rhs = ((DefaultKeyStatistics) other);
        return (((((((((((((((((((((((((((((((((((((((((this.enterpriseValue == rhs.enterpriseValue)||((this.enterpriseValue!= null)&&this.enterpriseValue.equals(rhs.enterpriseValue)))&&((this.totalAssets == rhs.totalAssets)||((this.totalAssets!= null)&&this.totalAssets.equals(rhs.totalAssets))))&&((this.trailingEps == rhs.trailingEps)||((this.trailingEps!= null)&&this.trailingEps.equals(rhs.trailingEps))))&&((this.threeYearAverageReturn == rhs.threeYearAverageReturn)||((this.threeYearAverageReturn!= null)&&this.threeYearAverageReturn.equals(rhs.threeYearAverageReturn))))&&((this.revenueQuarterlyGrowth == rhs.revenueQuarterlyGrowth)||((this.revenueQuarterlyGrowth!= null)&&this.revenueQuarterlyGrowth.equals(rhs.revenueQuarterlyGrowth))))&&((this.lastDividendValue == rhs.lastDividendValue)||((this.lastDividendValue!= null)&&this.lastDividendValue.equals(rhs.lastDividendValue))))&&((this.fiveYearAverageReturn == rhs.fiveYearAverageReturn)||((this.fiveYearAverageReturn!= null)&&this.fiveYearAverageReturn.equals(rhs.fiveYearAverageReturn))))&&((this.profitMargins == rhs.profitMargins)||((this.profitMargins!= null)&&this.profitMargins.equals(rhs.profitMargins))))&&((this.earningsQuarterlyGrowth == rhs.earningsQuarterlyGrowth)||((this.earningsQuarterlyGrowth!= null)&&this.earningsQuarterlyGrowth.equals(rhs.earningsQuarterlyGrowth))))&&((this.lastSplitFactor == rhs.lastSplitFactor)||((this.lastSplitFactor!= null)&&this.lastSplitFactor.equals(rhs.lastSplitFactor))))&&((this.lastCapGain == rhs.lastCapGain)||((this.lastCapGain!= null)&&this.lastCapGain.equals(rhs.lastCapGain))))&&((this.pegRatio == rhs.pegRatio)||((this.pegRatio!= null)&&this.pegRatio.equals(rhs.pegRatio))))&&((this.forwardEps == rhs.forwardEps)||((this.forwardEps!= null)&&this.forwardEps.equals(rhs.forwardEps))))&&((this.mostRecentQuarter == rhs.mostRecentQuarter)||((this.mostRecentQuarter!= null)&&this.mostRecentQuarter.equals(rhs.mostRecentQuarter))))&&((this.yield == rhs.yield)||((this.yield!= null)&&this.yield.equals(rhs.yield))))&&((this.annualReportExpenseRatio == rhs.annualReportExpenseRatio)||((this.annualReportExpenseRatio!= null)&&this.annualReportExpenseRatio.equals(rhs.annualReportExpenseRatio))))&&((this.enterpriseToEbitda == rhs.enterpriseToEbitda)||((this.enterpriseToEbitda!= null)&&this.enterpriseToEbitda.equals(rhs.enterpriseToEbitda))))&&((this.nextFiscalYearEnd == rhs.nextFiscalYearEnd)||((this.nextFiscalYearEnd!= null)&&this.nextFiscalYearEnd.equals(rhs.nextFiscalYearEnd))))&&((this.bookValue == rhs.bookValue)||((this.bookValue!= null)&&this.bookValue.equals(rhs.bookValue))))&&((this.morningStarOverallRating == rhs.morningStarOverallRating)||((this.morningStarOverallRating!= null)&&this.morningStarOverallRating.equals(rhs.morningStarOverallRating))))&&((this.priceToSalesTrailing12Months == rhs.priceToSalesTrailing12Months)||((this.priceToSalesTrailing12Months!= null)&&this.priceToSalesTrailing12Months.equals(rhs.priceToSalesTrailing12Months))))&&((this.legalType == rhs.legalType)||((this.legalType!= null)&&this.legalType.equals(rhs.legalType))))&&((this.lastFiscalYearEnd == rhs.lastFiscalYearEnd)||((this.lastFiscalYearEnd!= null)&&this.lastFiscalYearEnd.equals(rhs.lastFiscalYearEnd))))&&((this.sandP52WeekChange == rhs.sandP52WeekChange)||((this.sandP52WeekChange!= null)&&this.sandP52WeekChange.equals(rhs.sandP52WeekChange))))&&((this.lastSplitDate == rhs.lastSplitDate)||((this.lastSplitDate!= null)&&this.lastSplitDate.equals(rhs.lastSplitDate))))&&((this.netIncomeToCommon == rhs.netIncomeToCommon)||((this.netIncomeToCommon!= null)&&this.netIncomeToCommon.equals(rhs.netIncomeToCommon))))&&((this.enterpriseToRevenue == rhs.enterpriseToRevenue)||((this.enterpriseToRevenue!= null)&&this.enterpriseToRevenue.equals(rhs.enterpriseToRevenue))))&&((this.forwardPE == rhs.forwardPE)||((this.forwardPE!= null)&&this.forwardPE.equals(rhs.forwardPE))))&&((this._52WeekChange == rhs._52WeekChange)||((this._52WeekChange!= null)&&this._52WeekChange.equals(rhs._52WeekChange))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.priceHint == rhs.priceHint)||((this.priceHint!= null)&&this.priceHint.equals(rhs.priceHint))))&&((this.fundInceptionDate == rhs.fundInceptionDate)||((this.fundInceptionDate!= null)&&this.fundInceptionDate.equals(rhs.fundInceptionDate))))&&((this.annualHoldingsTurnover == rhs.annualHoldingsTurnover)||((this.annualHoldingsTurnover!= null)&&this.annualHoldingsTurnover.equals(rhs.annualHoldingsTurnover))))&&((this.beta3Year == rhs.beta3Year)||((this.beta3Year!= null)&&this.beta3Year.equals(rhs.beta3Year))))&&((this.ytdReturn == rhs.ytdReturn)||((this.ytdReturn!= null)&&this.ytdReturn.equals(rhs.ytdReturn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.morningStarRiskRating == rhs.morningStarRiskRating)||((this.morningStarRiskRating!= null)&&this.morningStarRiskRating.equals(rhs.morningStarRiskRating))))&&((this.priceToBook == rhs.priceToBook)||((this.priceToBook!= null)&&this.priceToBook.equals(rhs.priceToBook))))&&((this.fundFamily == rhs.fundFamily)||((this.fundFamily!= null)&&this.fundFamily.equals(rhs.fundFamily))));
    }

}
