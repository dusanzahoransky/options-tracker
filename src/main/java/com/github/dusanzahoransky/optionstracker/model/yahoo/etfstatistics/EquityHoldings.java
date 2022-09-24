
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
    "priceToCashflow",
    "priceToSales",
    "priceToBookCat",
    "priceToEarningsCat",
    "medianMarketCapCat",
    "threeYearEarningsGrowthCat",
    "threeYearEarningsGrowth",
    "medianMarketCap",
    "priceToEarnings",
    "priceToBook",
    "priceToSalesCat",
    "priceToCashflowCat"
})
public class EquityHoldings {

    @JsonProperty("priceToCashflow")
    private PriceToCashflow priceToCashflow;
    @JsonProperty("priceToSales")
    private PriceToSales priceToSales;
    @JsonProperty("priceToBookCat")
    private PriceToBookCat priceToBookCat;
    @JsonProperty("priceToEarningsCat")
    private PriceToEarningsCat priceToEarningsCat;
    @JsonProperty("medianMarketCapCat")
    private MedianMarketCapCat medianMarketCapCat;
    @JsonProperty("threeYearEarningsGrowthCat")
    private ThreeYearEarningsGrowthCat threeYearEarningsGrowthCat;
    @JsonProperty("threeYearEarningsGrowth")
    private ThreeYearEarningsGrowth threeYearEarningsGrowth;
    @JsonProperty("medianMarketCap")
    private MedianMarketCap medianMarketCap;
    @JsonProperty("priceToEarnings")
    private PriceToEarnings priceToEarnings;
    @JsonProperty("priceToBook")
    private PriceToBook__1 priceToBook;
    @JsonProperty("priceToSalesCat")
    private PriceToSalesCat priceToSalesCat;
    @JsonProperty("priceToCashflowCat")
    private PriceToCashflowCat priceToCashflowCat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("priceToCashflow")
    public PriceToCashflow getPriceToCashflow() {
        return priceToCashflow;
    }

    @JsonProperty("priceToCashflow")
    public void setPriceToCashflow(PriceToCashflow priceToCashflow) {
        this.priceToCashflow = priceToCashflow;
    }

    @JsonProperty("priceToSales")
    public PriceToSales getPriceToSales() {
        return priceToSales;
    }

    @JsonProperty("priceToSales")
    public void setPriceToSales(PriceToSales priceToSales) {
        this.priceToSales = priceToSales;
    }

    @JsonProperty("priceToBookCat")
    public PriceToBookCat getPriceToBookCat() {
        return priceToBookCat;
    }

    @JsonProperty("priceToBookCat")
    public void setPriceToBookCat(PriceToBookCat priceToBookCat) {
        this.priceToBookCat = priceToBookCat;
    }

    @JsonProperty("priceToEarningsCat")
    public PriceToEarningsCat getPriceToEarningsCat() {
        return priceToEarningsCat;
    }

    @JsonProperty("priceToEarningsCat")
    public void setPriceToEarningsCat(PriceToEarningsCat priceToEarningsCat) {
        this.priceToEarningsCat = priceToEarningsCat;
    }

    @JsonProperty("medianMarketCapCat")
    public MedianMarketCapCat getMedianMarketCapCat() {
        return medianMarketCapCat;
    }

    @JsonProperty("medianMarketCapCat")
    public void setMedianMarketCapCat(MedianMarketCapCat medianMarketCapCat) {
        this.medianMarketCapCat = medianMarketCapCat;
    }

    @JsonProperty("threeYearEarningsGrowthCat")
    public ThreeYearEarningsGrowthCat getThreeYearEarningsGrowthCat() {
        return threeYearEarningsGrowthCat;
    }

    @JsonProperty("threeYearEarningsGrowthCat")
    public void setThreeYearEarningsGrowthCat(ThreeYearEarningsGrowthCat threeYearEarningsGrowthCat) {
        this.threeYearEarningsGrowthCat = threeYearEarningsGrowthCat;
    }

    @JsonProperty("threeYearEarningsGrowth")
    public ThreeYearEarningsGrowth getThreeYearEarningsGrowth() {
        return threeYearEarningsGrowth;
    }

    @JsonProperty("threeYearEarningsGrowth")
    public void setThreeYearEarningsGrowth(ThreeYearEarningsGrowth threeYearEarningsGrowth) {
        this.threeYearEarningsGrowth = threeYearEarningsGrowth;
    }

    @JsonProperty("medianMarketCap")
    public MedianMarketCap getMedianMarketCap() {
        return medianMarketCap;
    }

    @JsonProperty("medianMarketCap")
    public void setMedianMarketCap(MedianMarketCap medianMarketCap) {
        this.medianMarketCap = medianMarketCap;
    }

    @JsonProperty("priceToEarnings")
    public PriceToEarnings getPriceToEarnings() {
        return priceToEarnings;
    }

    @JsonProperty("priceToEarnings")
    public void setPriceToEarnings(PriceToEarnings priceToEarnings) {
        this.priceToEarnings = priceToEarnings;
    }

    @JsonProperty("priceToBook")
    public PriceToBook__1 getPriceToBook() {
        return priceToBook;
    }

    @JsonProperty("priceToBook")
    public void setPriceToBook(PriceToBook__1 priceToBook) {
        this.priceToBook = priceToBook;
    }

    @JsonProperty("priceToSalesCat")
    public PriceToSalesCat getPriceToSalesCat() {
        return priceToSalesCat;
    }

    @JsonProperty("priceToSalesCat")
    public void setPriceToSalesCat(PriceToSalesCat priceToSalesCat) {
        this.priceToSalesCat = priceToSalesCat;
    }

    @JsonProperty("priceToCashflowCat")
    public PriceToCashflowCat getPriceToCashflowCat() {
        return priceToCashflowCat;
    }

    @JsonProperty("priceToCashflowCat")
    public void setPriceToCashflowCat(PriceToCashflowCat priceToCashflowCat) {
        this.priceToCashflowCat = priceToCashflowCat;
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
        sb.append(EquityHoldings.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("priceToCashflow");
        sb.append('=');
        sb.append(((this.priceToCashflow == null)?"<null>":this.priceToCashflow));
        sb.append(',');
        sb.append("priceToSales");
        sb.append('=');
        sb.append(((this.priceToSales == null)?"<null>":this.priceToSales));
        sb.append(',');
        sb.append("priceToBookCat");
        sb.append('=');
        sb.append(((this.priceToBookCat == null)?"<null>":this.priceToBookCat));
        sb.append(',');
        sb.append("priceToEarningsCat");
        sb.append('=');
        sb.append(((this.priceToEarningsCat == null)?"<null>":this.priceToEarningsCat));
        sb.append(',');
        sb.append("medianMarketCapCat");
        sb.append('=');
        sb.append(((this.medianMarketCapCat == null)?"<null>":this.medianMarketCapCat));
        sb.append(',');
        sb.append("threeYearEarningsGrowthCat");
        sb.append('=');
        sb.append(((this.threeYearEarningsGrowthCat == null)?"<null>":this.threeYearEarningsGrowthCat));
        sb.append(',');
        sb.append("threeYearEarningsGrowth");
        sb.append('=');
        sb.append(((this.threeYearEarningsGrowth == null)?"<null>":this.threeYearEarningsGrowth));
        sb.append(',');
        sb.append("medianMarketCap");
        sb.append('=');
        sb.append(((this.medianMarketCap == null)?"<null>":this.medianMarketCap));
        sb.append(',');
        sb.append("priceToEarnings");
        sb.append('=');
        sb.append(((this.priceToEarnings == null)?"<null>":this.priceToEarnings));
        sb.append(',');
        sb.append("priceToBook");
        sb.append('=');
        sb.append(((this.priceToBook == null)?"<null>":this.priceToBook));
        sb.append(',');
        sb.append("priceToSalesCat");
        sb.append('=');
        sb.append(((this.priceToSalesCat == null)?"<null>":this.priceToSalesCat));
        sb.append(',');
        sb.append("priceToCashflowCat");
        sb.append('=');
        sb.append(((this.priceToCashflowCat == null)?"<null>":this.priceToCashflowCat));
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
        result = ((result* 31)+((this.priceToCashflow == null)? 0 :this.priceToCashflow.hashCode()));
        result = ((result* 31)+((this.priceToEarnings == null)? 0 :this.priceToEarnings.hashCode()));
        result = ((result* 31)+((this.priceToEarningsCat == null)? 0 :this.priceToEarningsCat.hashCode()));
        result = ((result* 31)+((this.threeYearEarningsGrowthCat == null)? 0 :this.threeYearEarningsGrowthCat.hashCode()));
        result = ((result* 31)+((this.priceToSalesCat == null)? 0 :this.priceToSalesCat.hashCode()));
        result = ((result* 31)+((this.medianMarketCapCat == null)? 0 :this.medianMarketCapCat.hashCode()));
        result = ((result* 31)+((this.priceToSales == null)? 0 :this.priceToSales.hashCode()));
        result = ((result* 31)+((this.priceToBookCat == null)? 0 :this.priceToBookCat.hashCode()));
        result = ((result* 31)+((this.threeYearEarningsGrowth == null)? 0 :this.threeYearEarningsGrowth.hashCode()));
        result = ((result* 31)+((this.medianMarketCap == null)? 0 :this.medianMarketCap.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priceToBook == null)? 0 :this.priceToBook.hashCode()));
        result = ((result* 31)+((this.priceToCashflowCat == null)? 0 :this.priceToCashflowCat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EquityHoldings) == false) {
            return false;
        }
        EquityHoldings rhs = ((EquityHoldings) other);
        return ((((((((((((((this.priceToCashflow == rhs.priceToCashflow)||((this.priceToCashflow!= null)&&this.priceToCashflow.equals(rhs.priceToCashflow)))&&((this.priceToEarnings == rhs.priceToEarnings)||((this.priceToEarnings!= null)&&this.priceToEarnings.equals(rhs.priceToEarnings))))&&((this.priceToEarningsCat == rhs.priceToEarningsCat)||((this.priceToEarningsCat!= null)&&this.priceToEarningsCat.equals(rhs.priceToEarningsCat))))&&((this.threeYearEarningsGrowthCat == rhs.threeYearEarningsGrowthCat)||((this.threeYearEarningsGrowthCat!= null)&&this.threeYearEarningsGrowthCat.equals(rhs.threeYearEarningsGrowthCat))))&&((this.priceToSalesCat == rhs.priceToSalesCat)||((this.priceToSalesCat!= null)&&this.priceToSalesCat.equals(rhs.priceToSalesCat))))&&((this.medianMarketCapCat == rhs.medianMarketCapCat)||((this.medianMarketCapCat!= null)&&this.medianMarketCapCat.equals(rhs.medianMarketCapCat))))&&((this.priceToSales == rhs.priceToSales)||((this.priceToSales!= null)&&this.priceToSales.equals(rhs.priceToSales))))&&((this.priceToBookCat == rhs.priceToBookCat)||((this.priceToBookCat!= null)&&this.priceToBookCat.equals(rhs.priceToBookCat))))&&((this.threeYearEarningsGrowth == rhs.threeYearEarningsGrowth)||((this.threeYearEarningsGrowth!= null)&&this.threeYearEarningsGrowth.equals(rhs.threeYearEarningsGrowth))))&&((this.medianMarketCap == rhs.medianMarketCap)||((this.medianMarketCap!= null)&&this.medianMarketCap.equals(rhs.medianMarketCap))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priceToBook == rhs.priceToBook)||((this.priceToBook!= null)&&this.priceToBook.equals(rhs.priceToBook))))&&((this.priceToCashflowCat == rhs.priceToCashflowCat)||((this.priceToCashflowCat!= null)&&this.priceToCashflowCat.equals(rhs.priceToCashflowCat))));
    }

}
