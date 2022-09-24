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
    "previousClose",
    "regularMarketOpen",
    "twoHundredDayAverage",
    "trailingAnnualDividendYield",
    "payoutRatio",
    "volume24Hr",
    "regularMarketDayHigh",
    "navPrice",
    "averageDailyVolume10Day",
    "totalAssets",
    "regularMarketPreviousClose",
    "fiftyDayAverage",
    "trailingAnnualDividendRate",
    "open",
    "toCurrency",
    "averageVolume10days",
    "expireDate",
    "yield",
    "algorithm",
    "dividendRate",
    "exDividendDate",
    "beta",
    "circulatingSupply",
    "startDate",
    "regularMarketDayLow",
    "priceHint",
    "currency",
    "trailingPE",
    "regularMarketVolume",
    "lastMarket",
    "maxSupply",
    "openInterest",
    "marketCap",
    "volumeAllCurrencies",
    "strikePrice",
    "averageVolume",
    "priceToSalesTrailing12Months",
    "dayLow",
    "ask",
    "ytdReturn",
    "askSize",
    "volume",
    "fiftyTwoWeekHigh",
    "forwardPE",
    "maxAge",
    "fromCurrency",
    "fiveYearAvgDividendYield",
    "fiftyTwoWeekLow",
    "bid",
    "tradeable",
    "dividendYield",
    "bidSize",
    "dayHigh"
})
public class SummaryDetail {

    @JsonProperty("previousClose")
    private PreviousClose previousClose;
    @JsonProperty("regularMarketOpen")
    private RegularMarketOpen__1 regularMarketOpen;
    @JsonProperty("twoHundredDayAverage")
    private TwoHundredDayAverage twoHundredDayAverage;
    @JsonProperty("trailingAnnualDividendYield")
    private TrailingAnnualDividendYield trailingAnnualDividendYield;
    @JsonProperty("payoutRatio")
    private PayoutRatio payoutRatio;
    @JsonProperty("volume24Hr")
    private Volume24Hr__1 volume24Hr;
    @JsonProperty("regularMarketDayHigh")
    private RegularMarketDayHigh__1 regularMarketDayHigh;
    @JsonProperty("navPrice")
    private NavPrice navPrice;
    @JsonProperty("averageDailyVolume10Day")
    private AverageDailyVolume10Day__1 averageDailyVolume10Day;
    @JsonProperty("totalAssets")
    private TotalAssets__2 totalAssets;
    @JsonProperty("regularMarketPreviousClose")
    private RegularMarketPreviousClose__1 regularMarketPreviousClose;
    @JsonProperty("fiftyDayAverage")
    private FiftyDayAverage fiftyDayAverage;
    @JsonProperty("trailingAnnualDividendRate")
    private TrailingAnnualDividendRate trailingAnnualDividendRate;
    @JsonProperty("open")
    private Open open;
    @JsonProperty("toCurrency")
    private Object toCurrency;
    @JsonProperty("averageVolume10days")
    private AverageVolume10days averageVolume10days;
    @JsonProperty("expireDate")
    private ExpireDate expireDate;
    @JsonProperty("yield")
    private Yield yield;
    @JsonProperty("algorithm")
    private Object algorithm;
    @JsonProperty("dividendRate")
    private DividendRate dividendRate;
    @JsonProperty("exDividendDate")
    private ExDividendDate exDividendDate;
    @JsonProperty("beta")
    private Beta beta;
    @JsonProperty("circulatingSupply")
    private CirculatingSupply__1 circulatingSupply;
    @JsonProperty("startDate")
    private StartDate startDate;
    @JsonProperty("regularMarketDayLow")
    private RegularMarketDayLow__1 regularMarketDayLow;
    @JsonProperty("priceHint")
    private PriceHint__1 priceHint;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("trailingPE")
    private TrailingPE trailingPE;
    @JsonProperty("regularMarketVolume")
    private RegularMarketVolume__1 regularMarketVolume;
    @JsonProperty("lastMarket")
    private Object lastMarket;
    @JsonProperty("maxSupply")
    private MaxSupply maxSupply;
    @JsonProperty("openInterest")
    private OpenInterest__1 openInterest;
    @JsonProperty("marketCap")
    private MarketCap__1 marketCap;
    @JsonProperty("volumeAllCurrencies")
    private VolumeAllCurrencies__1 volumeAllCurrencies;
    @JsonProperty("strikePrice")
    private StrikePrice__1 strikePrice;
    @JsonProperty("averageVolume")
    private AverageVolume averageVolume;
    @JsonProperty("priceToSalesTrailing12Months")
    private PriceToSalesTrailing12Months priceToSalesTrailing12Months;
    @JsonProperty("dayLow")
    private DayLow dayLow;
    @JsonProperty("ask")
    private Ask ask;
    @JsonProperty("ytdReturn")
    private YtdReturn ytdReturn;
    @JsonProperty("askSize")
    private AskSize askSize;
    @JsonProperty("volume")
    private Volume volume;
    @JsonProperty("fiftyTwoWeekHigh")
    private FiftyTwoWeekHigh fiftyTwoWeekHigh;
    @JsonProperty("forwardPE")
    private ForwardPE forwardPE;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("fromCurrency")
    private Object fromCurrency;
    @JsonProperty("fiveYearAvgDividendYield")
    private FiveYearAvgDividendYield fiveYearAvgDividendYield;
    @JsonProperty("fiftyTwoWeekLow")
    private FiftyTwoWeekLow fiftyTwoWeekLow;
    @JsonProperty("bid")
    private Bid bid;
    @JsonProperty("tradeable")
    private Boolean tradeable;
    @JsonProperty("dividendYield")
    private DividendYield dividendYield;
    @JsonProperty("bidSize")
    private BidSize bidSize;
    @JsonProperty("dayHigh")
    private DayHigh dayHigh;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("previousClose")
    public PreviousClose getPreviousClose() {
        return previousClose;
    }

    @JsonProperty("previousClose")
    public void setPreviousClose(PreviousClose previousClose) {
        this.previousClose = previousClose;
    }

    @JsonProperty("regularMarketOpen")
    public RegularMarketOpen__1 getRegularMarketOpen() {
        return regularMarketOpen;
    }

    @JsonProperty("regularMarketOpen")
    public void setRegularMarketOpen(RegularMarketOpen__1 regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    @JsonProperty("twoHundredDayAverage")
    public TwoHundredDayAverage getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    @JsonProperty("twoHundredDayAverage")
    public void setTwoHundredDayAverage(TwoHundredDayAverage twoHundredDayAverage) {
        this.twoHundredDayAverage = twoHundredDayAverage;
    }

    @JsonProperty("trailingAnnualDividendYield")
    public TrailingAnnualDividendYield getTrailingAnnualDividendYield() {
        return trailingAnnualDividendYield;
    }

    @JsonProperty("trailingAnnualDividendYield")
    public void setTrailingAnnualDividendYield(TrailingAnnualDividendYield trailingAnnualDividendYield) {
        this.trailingAnnualDividendYield = trailingAnnualDividendYield;
    }

    @JsonProperty("payoutRatio")
    public PayoutRatio getPayoutRatio() {
        return payoutRatio;
    }

    @JsonProperty("payoutRatio")
    public void setPayoutRatio(PayoutRatio payoutRatio) {
        this.payoutRatio = payoutRatio;
    }

    @JsonProperty("volume24Hr")
    public Volume24Hr__1 getVolume24Hr() {
        return volume24Hr;
    }

    @JsonProperty("volume24Hr")
    public void setVolume24Hr(Volume24Hr__1 volume24Hr) {
        this.volume24Hr = volume24Hr;
    }

    @JsonProperty("regularMarketDayHigh")
    public RegularMarketDayHigh__1 getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    @JsonProperty("regularMarketDayHigh")
    public void setRegularMarketDayHigh(RegularMarketDayHigh__1 regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    @JsonProperty("navPrice")
    public NavPrice getNavPrice() {
        return navPrice;
    }

    @JsonProperty("navPrice")
    public void setNavPrice(NavPrice navPrice) {
        this.navPrice = navPrice;
    }

    @JsonProperty("averageDailyVolume10Day")
    public AverageDailyVolume10Day__1 getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    @JsonProperty("averageDailyVolume10Day")
    public void setAverageDailyVolume10Day(AverageDailyVolume10Day__1 averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    @JsonProperty("totalAssets")
    public TotalAssets__2 getTotalAssets() {
        return totalAssets;
    }

    @JsonProperty("totalAssets")
    public void setTotalAssets(TotalAssets__2 totalAssets) {
        this.totalAssets = totalAssets;
    }

    @JsonProperty("regularMarketPreviousClose")
    public RegularMarketPreviousClose__1 getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    @JsonProperty("regularMarketPreviousClose")
    public void setRegularMarketPreviousClose(RegularMarketPreviousClose__1 regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    @JsonProperty("fiftyDayAverage")
    public FiftyDayAverage getFiftyDayAverage() {
        return fiftyDayAverage;
    }

    @JsonProperty("fiftyDayAverage")
    public void setFiftyDayAverage(FiftyDayAverage fiftyDayAverage) {
        this.fiftyDayAverage = fiftyDayAverage;
    }

    @JsonProperty("trailingAnnualDividendRate")
    public TrailingAnnualDividendRate getTrailingAnnualDividendRate() {
        return trailingAnnualDividendRate;
    }

    @JsonProperty("trailingAnnualDividendRate")
    public void setTrailingAnnualDividendRate(TrailingAnnualDividendRate trailingAnnualDividendRate) {
        this.trailingAnnualDividendRate = trailingAnnualDividendRate;
    }

    @JsonProperty("open")
    public Open getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(Open open) {
        this.open = open;
    }

    @JsonProperty("toCurrency")
    public Object getToCurrency() {
        return toCurrency;
    }

    @JsonProperty("toCurrency")
    public void setToCurrency(Object toCurrency) {
        this.toCurrency = toCurrency;
    }

    @JsonProperty("averageVolume10days")
    public AverageVolume10days getAverageVolume10days() {
        return averageVolume10days;
    }

    @JsonProperty("averageVolume10days")
    public void setAverageVolume10days(AverageVolume10days averageVolume10days) {
        this.averageVolume10days = averageVolume10days;
    }

    @JsonProperty("expireDate")
    public ExpireDate getExpireDate() {
        return expireDate;
    }

    @JsonProperty("expireDate")
    public void setExpireDate(ExpireDate expireDate) {
        this.expireDate = expireDate;
    }

    @JsonProperty("yield")
    public Yield getYield() {
        return yield;
    }

    @JsonProperty("yield")
    public void setYield(Yield yield) {
        this.yield = yield;
    }

    @JsonProperty("algorithm")
    public Object getAlgorithm() {
        return algorithm;
    }

    @JsonProperty("algorithm")
    public void setAlgorithm(Object algorithm) {
        this.algorithm = algorithm;
    }

    @JsonProperty("dividendRate")
    public DividendRate getDividendRate() {
        return dividendRate;
    }

    @JsonProperty("dividendRate")
    public void setDividendRate(DividendRate dividendRate) {
        this.dividendRate = dividendRate;
    }

    @JsonProperty("exDividendDate")
    public ExDividendDate getExDividendDate() {
        return exDividendDate;
    }

    @JsonProperty("exDividendDate")
    public void setExDividendDate(ExDividendDate exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    @JsonProperty("beta")
    public Beta getBeta() {
        return beta;
    }

    @JsonProperty("beta")
    public void setBeta(Beta beta) {
        this.beta = beta;
    }

    @JsonProperty("circulatingSupply")
    public CirculatingSupply__1 getCirculatingSupply() {
        return circulatingSupply;
    }

    @JsonProperty("circulatingSupply")
    public void setCirculatingSupply(CirculatingSupply__1 circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    @JsonProperty("startDate")
    public StartDate getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(StartDate startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("regularMarketDayLow")
    public RegularMarketDayLow__1 getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    @JsonProperty("regularMarketDayLow")
    public void setRegularMarketDayLow(RegularMarketDayLow__1 regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    @JsonProperty("priceHint")
    public PriceHint__1 getPriceHint() {
        return priceHint;
    }

    @JsonProperty("priceHint")
    public void setPriceHint(PriceHint__1 priceHint) {
        this.priceHint = priceHint;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("trailingPE")
    public TrailingPE getTrailingPE() {
        return trailingPE;
    }

    @JsonProperty("trailingPE")
    public void setTrailingPE(TrailingPE trailingPE) {
        this.trailingPE = trailingPE;
    }

    @JsonProperty("regularMarketVolume")
    public RegularMarketVolume__1 getRegularMarketVolume() {
        return regularMarketVolume;
    }

    @JsonProperty("regularMarketVolume")
    public void setRegularMarketVolume(RegularMarketVolume__1 regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    @JsonProperty("lastMarket")
    public Object getLastMarket() {
        return lastMarket;
    }

    @JsonProperty("lastMarket")
    public void setLastMarket(Object lastMarket) {
        this.lastMarket = lastMarket;
    }

    @JsonProperty("maxSupply")
    public MaxSupply getMaxSupply() {
        return maxSupply;
    }

    @JsonProperty("maxSupply")
    public void setMaxSupply(MaxSupply maxSupply) {
        this.maxSupply = maxSupply;
    }

    @JsonProperty("openInterest")
    public OpenInterest__1 getOpenInterest() {
        return openInterest;
    }

    @JsonProperty("openInterest")
    public void setOpenInterest(OpenInterest__1 openInterest) {
        this.openInterest = openInterest;
    }

    @JsonProperty("marketCap")
    public MarketCap__1 getMarketCap() {
        return marketCap;
    }

    @JsonProperty("marketCap")
    public void setMarketCap(MarketCap__1 marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("volumeAllCurrencies")
    public VolumeAllCurrencies__1 getVolumeAllCurrencies() {
        return volumeAllCurrencies;
    }

    @JsonProperty("volumeAllCurrencies")
    public void setVolumeAllCurrencies(VolumeAllCurrencies__1 volumeAllCurrencies) {
        this.volumeAllCurrencies = volumeAllCurrencies;
    }

    @JsonProperty("strikePrice")
    public StrikePrice__1 getStrikePrice() {
        return strikePrice;
    }

    @JsonProperty("strikePrice")
    public void setStrikePrice(StrikePrice__1 strikePrice) {
        this.strikePrice = strikePrice;
    }

    @JsonProperty("averageVolume")
    public AverageVolume getAverageVolume() {
        return averageVolume;
    }

    @JsonProperty("averageVolume")
    public void setAverageVolume(AverageVolume averageVolume) {
        this.averageVolume = averageVolume;
    }

    @JsonProperty("priceToSalesTrailing12Months")
    public PriceToSalesTrailing12Months getPriceToSalesTrailing12Months() {
        return priceToSalesTrailing12Months;
    }

    @JsonProperty("priceToSalesTrailing12Months")
    public void setPriceToSalesTrailing12Months(PriceToSalesTrailing12Months priceToSalesTrailing12Months) {
        this.priceToSalesTrailing12Months = priceToSalesTrailing12Months;
    }

    @JsonProperty("dayLow")
    public DayLow getDayLow() {
        return dayLow;
    }

    @JsonProperty("dayLow")
    public void setDayLow(DayLow dayLow) {
        this.dayLow = dayLow;
    }

    @JsonProperty("ask")
    public Ask getAsk() {
        return ask;
    }

    @JsonProperty("ask")
    public void setAsk(Ask ask) {
        this.ask = ask;
    }

    @JsonProperty("ytdReturn")
    public YtdReturn getYtdReturn() {
        return ytdReturn;
    }

    @JsonProperty("ytdReturn")
    public void setYtdReturn(YtdReturn ytdReturn) {
        this.ytdReturn = ytdReturn;
    }

    @JsonProperty("askSize")
    public AskSize getAskSize() {
        return askSize;
    }

    @JsonProperty("askSize")
    public void setAskSize(AskSize askSize) {
        this.askSize = askSize;
    }

    @JsonProperty("volume")
    public Volume getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public FiftyTwoWeekHigh getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    @JsonProperty("fiftyTwoWeekHigh")
    public void setFiftyTwoWeekHigh(FiftyTwoWeekHigh fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
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

    @JsonProperty("fromCurrency")
    public Object getFromCurrency() {
        return fromCurrency;
    }

    @JsonProperty("fromCurrency")
    public void setFromCurrency(Object fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    @JsonProperty("fiveYearAvgDividendYield")
    public FiveYearAvgDividendYield getFiveYearAvgDividendYield() {
        return fiveYearAvgDividendYield;
    }

    @JsonProperty("fiveYearAvgDividendYield")
    public void setFiveYearAvgDividendYield(FiveYearAvgDividendYield fiveYearAvgDividendYield) {
        this.fiveYearAvgDividendYield = fiveYearAvgDividendYield;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public FiftyTwoWeekLow getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    @JsonProperty("fiftyTwoWeekLow")
    public void setFiftyTwoWeekLow(FiftyTwoWeekLow fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    @JsonProperty("bid")
    public Bid getBid() {
        return bid;
    }

    @JsonProperty("bid")
    public void setBid(Bid bid) {
        this.bid = bid;
    }

    @JsonProperty("tradeable")
    public Boolean getTradeable() {
        return tradeable;
    }

    @JsonProperty("tradeable")
    public void setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
    }

    @JsonProperty("dividendYield")
    public DividendYield getDividendYield() {
        return dividendYield;
    }

    @JsonProperty("dividendYield")
    public void setDividendYield(DividendYield dividendYield) {
        this.dividendYield = dividendYield;
    }

    @JsonProperty("bidSize")
    public BidSize getBidSize() {
        return bidSize;
    }

    @JsonProperty("bidSize")
    public void setBidSize(BidSize bidSize) {
        this.bidSize = bidSize;
    }

    @JsonProperty("dayHigh")
    public DayHigh getDayHigh() {
        return dayHigh;
    }

    @JsonProperty("dayHigh")
    public void setDayHigh(DayHigh dayHigh) {
        this.dayHigh = dayHigh;
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
        sb.append(SummaryDetail.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("previousClose");
        sb.append('=');
        sb.append(((this.previousClose == null) ? "<null>" : this.previousClose));
        sb.append(',');
        sb.append("regularMarketOpen");
        sb.append('=');
        sb.append(((this.regularMarketOpen == null) ? "<null>" : this.regularMarketOpen));
        sb.append(',');
        sb.append("twoHundredDayAverage");
        sb.append('=');
        sb.append(((this.twoHundredDayAverage == null) ? "<null>" : this.twoHundredDayAverage));
        sb.append(',');
        sb.append("trailingAnnualDividendYield");
        sb.append('=');
        sb.append(((this.trailingAnnualDividendYield == null) ? "<null>" : this.trailingAnnualDividendYield));
        sb.append(',');
        sb.append("payoutRatio");
        sb.append('=');
        sb.append(((this.payoutRatio == null) ? "<null>" : this.payoutRatio));
        sb.append(',');
        sb.append("volume24Hr");
        sb.append('=');
        sb.append(((this.volume24Hr == null) ? "<null>" : this.volume24Hr));
        sb.append(',');
        sb.append("regularMarketDayHigh");
        sb.append('=');
        sb.append(((this.regularMarketDayHigh == null) ? "<null>" : this.regularMarketDayHigh));
        sb.append(',');
        sb.append("navPrice");
        sb.append('=');
        sb.append(((this.navPrice == null) ? "<null>" : this.navPrice));
        sb.append(',');
        sb.append("averageDailyVolume10Day");
        sb.append('=');
        sb.append(((this.averageDailyVolume10Day == null) ? "<null>" : this.averageDailyVolume10Day));
        sb.append(',');
        sb.append("totalAssets");
        sb.append('=');
        sb.append(((this.totalAssets == null) ? "<null>" : this.totalAssets));
        sb.append(',');
        sb.append("regularMarketPreviousClose");
        sb.append('=');
        sb.append(((this.regularMarketPreviousClose == null) ? "<null>" : this.regularMarketPreviousClose));
        sb.append(',');
        sb.append("fiftyDayAverage");
        sb.append('=');
        sb.append(((this.fiftyDayAverage == null) ? "<null>" : this.fiftyDayAverage));
        sb.append(',');
        sb.append("trailingAnnualDividendRate");
        sb.append('=');
        sb.append(((this.trailingAnnualDividendRate == null) ? "<null>" : this.trailingAnnualDividendRate));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null) ? "<null>" : this.open));
        sb.append(',');
        sb.append("toCurrency");
        sb.append('=');
        sb.append(((this.toCurrency == null) ? "<null>" : this.toCurrency));
        sb.append(',');
        sb.append("averageVolume10days");
        sb.append('=');
        sb.append(((this.averageVolume10days == null) ? "<null>" : this.averageVolume10days));
        sb.append(',');
        sb.append("expireDate");
        sb.append('=');
        sb.append(((this.expireDate == null) ? "<null>" : this.expireDate));
        sb.append(',');
        sb.append("yield");
        sb.append('=');
        sb.append(((this.yield == null) ? "<null>" : this.yield));
        sb.append(',');
        sb.append("algorithm");
        sb.append('=');
        sb.append(((this.algorithm == null) ? "<null>" : this.algorithm));
        sb.append(',');
        sb.append("dividendRate");
        sb.append('=');
        sb.append(((this.dividendRate == null) ? "<null>" : this.dividendRate));
        sb.append(',');
        sb.append("exDividendDate");
        sb.append('=');
        sb.append(((this.exDividendDate == null) ? "<null>" : this.exDividendDate));
        sb.append(',');
        sb.append("beta");
        sb.append('=');
        sb.append(((this.beta == null) ? "<null>" : this.beta));
        sb.append(',');
        sb.append("circulatingSupply");
        sb.append('=');
        sb.append(((this.circulatingSupply == null) ? "<null>" : this.circulatingSupply));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null) ? "<null>" : this.startDate));
        sb.append(',');
        sb.append("regularMarketDayLow");
        sb.append('=');
        sb.append(((this.regularMarketDayLow == null) ? "<null>" : this.regularMarketDayLow));
        sb.append(',');
        sb.append("priceHint");
        sb.append('=');
        sb.append(((this.priceHint == null) ? "<null>" : this.priceHint));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null) ? "<null>" : this.currency));
        sb.append(',');
        sb.append("trailingPE");
        sb.append('=');
        sb.append(((this.trailingPE == null) ? "<null>" : this.trailingPE));
        sb.append(',');
        sb.append("regularMarketVolume");
        sb.append('=');
        sb.append(((this.regularMarketVolume == null) ? "<null>" : this.regularMarketVolume));
        sb.append(',');
        sb.append("lastMarket");
        sb.append('=');
        sb.append(((this.lastMarket == null) ? "<null>" : this.lastMarket));
        sb.append(',');
        sb.append("maxSupply");
        sb.append('=');
        sb.append(((this.maxSupply == null) ? "<null>" : this.maxSupply));
        sb.append(',');
        sb.append("openInterest");
        sb.append('=');
        sb.append(((this.openInterest == null) ? "<null>" : this.openInterest));
        sb.append(',');
        sb.append("marketCap");
        sb.append('=');
        sb.append(((this.marketCap == null) ? "<null>" : this.marketCap));
        sb.append(',');
        sb.append("volumeAllCurrencies");
        sb.append('=');
        sb.append(((this.volumeAllCurrencies == null) ? "<null>" : this.volumeAllCurrencies));
        sb.append(',');
        sb.append("strikePrice");
        sb.append('=');
        sb.append(((this.strikePrice == null) ? "<null>" : this.strikePrice));
        sb.append(',');
        sb.append("averageVolume");
        sb.append('=');
        sb.append(((this.averageVolume == null) ? "<null>" : this.averageVolume));
        sb.append(',');
        sb.append("priceToSalesTrailing12Months");
        sb.append('=');
        sb.append(((this.priceToSalesTrailing12Months == null) ? "<null>" : this.priceToSalesTrailing12Months));
        sb.append(',');
        sb.append("dayLow");
        sb.append('=');
        sb.append(((this.dayLow == null) ? "<null>" : this.dayLow));
        sb.append(',');
        sb.append("ask");
        sb.append('=');
        sb.append(((this.ask == null) ? "<null>" : this.ask));
        sb.append(',');
        sb.append("ytdReturn");
        sb.append('=');
        sb.append(((this.ytdReturn == null) ? "<null>" : this.ytdReturn));
        sb.append(',');
        sb.append("askSize");
        sb.append('=');
        sb.append(((this.askSize == null) ? "<null>" : this.askSize));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null) ? "<null>" : this.volume));
        sb.append(',');
        sb.append("fiftyTwoWeekHigh");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekHigh == null) ? "<null>" : this.fiftyTwoWeekHigh));
        sb.append(',');
        sb.append("forwardPE");
        sb.append('=');
        sb.append(((this.forwardPE == null) ? "<null>" : this.forwardPE));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null) ? "<null>" : this.maxAge));
        sb.append(',');
        sb.append("fromCurrency");
        sb.append('=');
        sb.append(((this.fromCurrency == null) ? "<null>" : this.fromCurrency));
        sb.append(',');
        sb.append("fiveYearAvgDividendYield");
        sb.append('=');
        sb.append(((this.fiveYearAvgDividendYield == null) ? "<null>" : this.fiveYearAvgDividendYield));
        sb.append(',');
        sb.append("fiftyTwoWeekLow");
        sb.append('=');
        sb.append(((this.fiftyTwoWeekLow == null) ? "<null>" : this.fiftyTwoWeekLow));
        sb.append(',');
        sb.append("bid");
        sb.append('=');
        sb.append(((this.bid == null) ? "<null>" : this.bid));
        sb.append(',');
        sb.append("tradeable");
        sb.append('=');
        sb.append(((this.tradeable == null) ? "<null>" : this.tradeable));
        sb.append(',');
        sb.append("dividendYield");
        sb.append('=');
        sb.append(((this.dividendYield == null) ? "<null>" : this.dividendYield));
        sb.append(',');
        sb.append("bidSize");
        sb.append('=');
        sb.append(((this.bidSize == null) ? "<null>" : this.bidSize));
        sb.append(',');
        sb.append("dayHigh");
        sb.append('=');
        sb.append(((this.dayHigh == null) ? "<null>" : this.dayHigh));
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
        result = ((result * 31) + ((this.totalAssets == null) ? 0 : this.totalAssets.hashCode()));
        result = ((result * 31) + ((this.circulatingSupply == null) ? 0 : this.circulatingSupply.hashCode()));
        result = ((result * 31) + ((this.dividendYield == null) ? 0 : this.dividendYield.hashCode()));
        result = ((result * 31) + ((this.navPrice == null) ? 0 : this.navPrice.hashCode()));
        result = ((result * 31) + ((this.regularMarketDayHigh == null) ? 0 : this.regularMarketDayHigh.hashCode()));
        result = ((result * 31) + ((this.fromCurrency == null) ? 0 : this.fromCurrency.hashCode()));
        result = ((result * 31) + ((this.twoHundredDayAverage == null) ? 0 : this.twoHundredDayAverage.hashCode()));
        result = ((result * 31) + ((this.askSize == null) ? 0 : this.askSize.hashCode()));
        result = ((result * 31) + ((this.dayHigh == null) ? 0 : this.dayHigh.hashCode()));
        result = ((result * 31) + ((this.algorithm == null) ? 0 : this.algorithm.hashCode()));
        result = ((result * 31) + ((this.marketCap == null) ? 0 : this.marketCap.hashCode()));
        result = ((result * 31) + ((this.priceToSalesTrailing12Months == null) ? 0 : this.priceToSalesTrailing12Months.hashCode()));
        result = ((result * 31) + ((this.lastMarket == null) ? 0 : this.lastMarket.hashCode()));
        result = ((result * 31) + ((this.dividendRate == null) ? 0 : this.dividendRate.hashCode()));
        result = ((result * 31) + ((this.dayLow == null) ? 0 : this.dayLow.hashCode()));
        result = ((result * 31) + ((this.trailingAnnualDividendRate == null) ? 0 : this.trailingAnnualDividendRate.hashCode()));
        result = ((result * 31) + ((this.fiftyTwoWeekLow == null) ? 0 : this.fiftyTwoWeekLow.hashCode()));
        result = ((result * 31) + ((this.regularMarketVolume == null) ? 0 : this.regularMarketVolume.hashCode()));
        result = ((result * 31) + ((this.volume == null) ? 0 : this.volume.hashCode()));
        result = ((result * 31) + ((this.toCurrency == null) ? 0 : this.toCurrency.hashCode()));
        result = ((result * 31) + ((this.priceHint == null) ? 0 : this.priceHint.hashCode()));
        result = ((result * 31) + ((this.regularMarketDayLow == null) ? 0 : this.regularMarketDayLow.hashCode()));
        result = ((result * 31) + ((this.ytdReturn == null) ? 0 : this.ytdReturn.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.payoutRatio == null) ? 0 : this.payoutRatio.hashCode()));
        result = ((result * 31) + ((this.startDate == null) ? 0 : this.startDate.hashCode()));
        result = ((result * 31) + ((this.strikePrice == null) ? 0 : this.strikePrice.hashCode()));
        result = ((result * 31) + ((this.openInterest == null) ? 0 : this.openInterest.hashCode()));
        result = ((result * 31) + ((this.regularMarketOpen == null) ? 0 : this.regularMarketOpen.hashCode()));
        result = ((result * 31) + ((this.trailingAnnualDividendYield == null) ? 0 : this.trailingAnnualDividendYield.hashCode()));
        result = ((result * 31) + ((this.previousClose == null) ? 0 : this.previousClose.hashCode()));
        result = ((result * 31) + ((this.averageDailyVolume10Day == null) ? 0 : this.averageDailyVolume10Day.hashCode()));
        result = ((result * 31) + ((this.trailingPE == null) ? 0 : this.trailingPE.hashCode()));
        result = ((result * 31) + ((this.yield == null) ? 0 : this.yield.hashCode()));
        result = ((result * 31) + ((this.tradeable == null) ? 0 : this.tradeable.hashCode()));
        result = ((result * 31) + ((this.averageVolume10days == null) ? 0 : this.averageVolume10days.hashCode()));
        result = ((result * 31) + ((this.expireDate == null) ? 0 : this.expireDate.hashCode()));
        result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
        result = ((result * 31) + ((this.maxSupply == null) ? 0 : this.maxSupply.hashCode()));
        result = ((result * 31) + ((this.regularMarketPreviousClose == null) ? 0 : this.regularMarketPreviousClose.hashCode()));
        result = ((result * 31) + ((this.fiftyTwoWeekHigh == null) ? 0 : this.fiftyTwoWeekHigh.hashCode()));
        result = ((result * 31) + ((this.beta == null) ? 0 : this.beta.hashCode()));
        result = ((result * 31) + ((this.volume24Hr == null) ? 0 : this.volume24Hr.hashCode()));
        result = ((result * 31) + ((this.exDividendDate == null) ? 0 : this.exDividendDate.hashCode()));
        result = ((result * 31) + ((this.bidSize == null) ? 0 : this.bidSize.hashCode()));
        result = ((result * 31) + ((this.volumeAllCurrencies == null) ? 0 : this.volumeAllCurrencies.hashCode()));
        result = ((result * 31) + ((this.fiveYearAvgDividendYield == null) ? 0 : this.fiveYearAvgDividendYield.hashCode()));
        result = ((result * 31) + ((this.fiftyDayAverage == null) ? 0 : this.fiftyDayAverage.hashCode()));
        result = ((result * 31) + ((this.forwardPE == null) ? 0 : this.forwardPE.hashCode()));
        result = ((result * 31) + ((this.averageVolume == null) ? 0 : this.averageVolume.hashCode()));
        result = ((result * 31) + ((this.maxAge == null) ? 0 : this.maxAge.hashCode()));
        result = ((result * 31) + ((this.ask == null) ? 0 : this.ask.hashCode()));
        result = ((result * 31) + ((this.bid == null) ? 0 : this.bid.hashCode()));
        result = ((result * 31) + ((this.open == null) ? 0 : this.open.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SummaryDetail) == false) {
            return false;
        }
        SummaryDetail rhs = ((SummaryDetail) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((this.totalAssets == rhs.totalAssets) || ((this.totalAssets != null) && this.totalAssets.equals(rhs.totalAssets))) && ((this.circulatingSupply == rhs.circulatingSupply) || ((this.circulatingSupply != null) && this.circulatingSupply.equals(rhs.circulatingSupply)))) && ((this.dividendYield == rhs.dividendYield) || ((this.dividendYield != null) && this.dividendYield.equals(rhs.dividendYield)))) && ((this.navPrice == rhs.navPrice) || ((this.navPrice != null) && this.navPrice.equals(rhs.navPrice)))) && ((this.regularMarketDayHigh == rhs.regularMarketDayHigh) || ((this.regularMarketDayHigh != null) && this.regularMarketDayHigh.equals(rhs.regularMarketDayHigh)))) && ((this.fromCurrency == rhs.fromCurrency) || ((this.fromCurrency != null) && this.fromCurrency.equals(rhs.fromCurrency)))) && ((this.twoHundredDayAverage == rhs.twoHundredDayAverage) || ((this.twoHundredDayAverage != null) && this.twoHundredDayAverage.equals(rhs.twoHundredDayAverage)))) && ((this.askSize == rhs.askSize) || ((this.askSize != null) && this.askSize.equals(rhs.askSize)))) && ((this.dayHigh == rhs.dayHigh) || ((this.dayHigh != null) && this.dayHigh.equals(rhs.dayHigh)))) && ((this.algorithm == rhs.algorithm) || ((this.algorithm != null) && this.algorithm.equals(rhs.algorithm)))) && ((this.marketCap == rhs.marketCap) || ((this.marketCap != null) && this.marketCap.equals(rhs.marketCap)))) && ((this.priceToSalesTrailing12Months == rhs.priceToSalesTrailing12Months) || ((this.priceToSalesTrailing12Months != null) && this.priceToSalesTrailing12Months.equals(rhs.priceToSalesTrailing12Months)))) && ((this.lastMarket == rhs.lastMarket) || ((this.lastMarket != null) && this.lastMarket.equals(rhs.lastMarket)))) && ((this.dividendRate == rhs.dividendRate) || ((this.dividendRate != null) && this.dividendRate.equals(rhs.dividendRate)))) && ((this.dayLow == rhs.dayLow) || ((this.dayLow != null) && this.dayLow.equals(rhs.dayLow)))) && ((this.trailingAnnualDividendRate == rhs.trailingAnnualDividendRate) || ((this.trailingAnnualDividendRate != null) && this.trailingAnnualDividendRate.equals(rhs.trailingAnnualDividendRate)))) && ((this.fiftyTwoWeekLow == rhs.fiftyTwoWeekLow) || ((this.fiftyTwoWeekLow != null) && this.fiftyTwoWeekLow.equals(rhs.fiftyTwoWeekLow)))) && ((this.regularMarketVolume == rhs.regularMarketVolume) || ((this.regularMarketVolume != null) && this.regularMarketVolume.equals(rhs.regularMarketVolume)))) && ((this.volume == rhs.volume) || ((this.volume != null) && this.volume.equals(rhs.volume)))) && ((this.toCurrency == rhs.toCurrency) || ((this.toCurrency != null) && this.toCurrency.equals(rhs.toCurrency)))) && ((this.priceHint == rhs.priceHint) || ((this.priceHint != null) && this.priceHint.equals(rhs.priceHint)))) && ((this.regularMarketDayLow == rhs.regularMarketDayLow) || ((this.regularMarketDayLow != null) && this.regularMarketDayLow.equals(rhs.regularMarketDayLow)))) && ((this.ytdReturn == rhs.ytdReturn) || ((this.ytdReturn != null) && this.ytdReturn.equals(rhs.ytdReturn)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.payoutRatio == rhs.payoutRatio) || ((this.payoutRatio != null) && this.payoutRatio.equals(rhs.payoutRatio)))) && ((this.startDate == rhs.startDate) || ((this.startDate != null) && this.startDate.equals(rhs.startDate)))) && ((this.strikePrice == rhs.strikePrice) || ((this.strikePrice != null) && this.strikePrice.equals(rhs.strikePrice)))) && ((this.openInterest == rhs.openInterest) || ((this.openInterest != null) && this.openInterest.equals(rhs.openInterest)))) && ((this.regularMarketOpen == rhs.regularMarketOpen) || ((this.regularMarketOpen != null) && this.regularMarketOpen.equals(rhs.regularMarketOpen)))) && ((this.trailingAnnualDividendYield == rhs.trailingAnnualDividendYield) || ((this.trailingAnnualDividendYield != null) && this.trailingAnnualDividendYield.equals(rhs.trailingAnnualDividendYield)))) && ((this.previousClose == rhs.previousClose) || ((this.previousClose != null) && this.previousClose.equals(rhs.previousClose)))) && ((this.averageDailyVolume10Day == rhs.averageDailyVolume10Day) || ((this.averageDailyVolume10Day != null) && this.averageDailyVolume10Day.equals(rhs.averageDailyVolume10Day)))) && ((this.trailingPE == rhs.trailingPE) || ((this.trailingPE != null) && this.trailingPE.equals(rhs.trailingPE)))) && ((this.yield == rhs.yield) || ((this.yield != null) && this.yield.equals(rhs.yield)))) && ((this.tradeable == rhs.tradeable) || ((this.tradeable != null) && this.tradeable.equals(rhs.tradeable)))) && ((this.averageVolume10days == rhs.averageVolume10days) || ((this.averageVolume10days != null) && this.averageVolume10days.equals(rhs.averageVolume10days)))) && ((this.expireDate == rhs.expireDate) || ((this.expireDate != null) && this.expireDate.equals(rhs.expireDate)))) && ((this.currency == rhs.currency) || ((this.currency != null) && this.currency.equals(rhs.currency)))) && ((this.maxSupply == rhs.maxSupply) || ((this.maxSupply != null) && this.maxSupply.equals(rhs.maxSupply)))) && ((this.regularMarketPreviousClose == rhs.regularMarketPreviousClose) || ((this.regularMarketPreviousClose != null) && this.regularMarketPreviousClose.equals(rhs.regularMarketPreviousClose)))) && ((this.fiftyTwoWeekHigh == rhs.fiftyTwoWeekHigh) || ((this.fiftyTwoWeekHigh != null) && this.fiftyTwoWeekHigh.equals(rhs.fiftyTwoWeekHigh)))) && ((this.beta == rhs.beta) || ((this.beta != null) && this.beta.equals(rhs.beta)))) && ((this.volume24Hr == rhs.volume24Hr) || ((this.volume24Hr != null) && this.volume24Hr.equals(rhs.volume24Hr)))) && ((this.exDividendDate == rhs.exDividendDate) || ((this.exDividendDate != null) && this.exDividendDate.equals(rhs.exDividendDate)))) && ((this.bidSize == rhs.bidSize) || ((this.bidSize != null) && this.bidSize.equals(rhs.bidSize)))) && ((this.volumeAllCurrencies == rhs.volumeAllCurrencies) || ((this.volumeAllCurrencies != null) && this.volumeAllCurrencies.equals(rhs.volumeAllCurrencies)))) && ((this.fiveYearAvgDividendYield == rhs.fiveYearAvgDividendYield) || ((this.fiveYearAvgDividendYield != null) && this.fiveYearAvgDividendYield.equals(rhs.fiveYearAvgDividendYield)))) && ((this.fiftyDayAverage == rhs.fiftyDayAverage) || ((this.fiftyDayAverage != null) && this.fiftyDayAverage.equals(rhs.fiftyDayAverage)))) && ((this.forwardPE == rhs.forwardPE) || ((this.forwardPE != null) && this.forwardPE.equals(rhs.forwardPE)))) && ((this.averageVolume == rhs.averageVolume) || ((this.averageVolume != null) && this.averageVolume.equals(rhs.averageVolume)))) && ((this.maxAge == rhs.maxAge) || ((this.maxAge != null) && this.maxAge.equals(rhs.maxAge)))) && ((this.ask == rhs.ask) || ((this.ask != null) && this.ask.equals(rhs.ask)))) && ((this.bid == rhs.bid) || ((this.bid != null) && this.bid.equals(rhs.bid)))) && ((this.open == rhs.open) || ((this.open != null) && this.open.equals(rhs.open))));
    }

}
