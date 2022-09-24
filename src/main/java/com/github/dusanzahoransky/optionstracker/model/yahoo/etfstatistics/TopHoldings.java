
package com.github.dusanzahoransky.optionstracker.model.yahoo.etfstatistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferredPosition",
    "bondPosition",
    "convertiblePosition",
    "sectorWeightings",
    "holdings",
    "bondHoldings",
    "bondRatings",
    "equityHoldings",
    "otherPosition",
    "maxAge",
    "cashPosition",
    "stockPosition"
})
public class TopHoldings {

    @JsonProperty("preferredPosition")
    private PreferredPosition preferredPosition;
    @JsonProperty("bondPosition")
    private BondPosition bondPosition;
    @JsonProperty("convertiblePosition")
    private ConvertiblePosition convertiblePosition;
    @JsonProperty("sectorWeightings")
    private List<SectorWeighting> sectorWeightings = new ArrayList<SectorWeighting>();
    @JsonProperty("holdings")
    private List<Holding> holdings = new ArrayList<Holding>();
    @JsonProperty("bondHoldings")
    private BondHoldings bondHoldings;
    @JsonProperty("bondRatings")
    private List<BondRating> bondRatings = new ArrayList<BondRating>();
    @JsonProperty("equityHoldings")
    private EquityHoldings equityHoldings;
    @JsonProperty("otherPosition")
    private OtherPosition otherPosition;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("cashPosition")
    private CashPosition cashPosition;
    @JsonProperty("stockPosition")
    private StockPosition stockPosition;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("preferredPosition")
    public PreferredPosition getPreferredPosition() {
        return preferredPosition;
    }

    @JsonProperty("preferredPosition")
    public void setPreferredPosition(PreferredPosition preferredPosition) {
        this.preferredPosition = preferredPosition;
    }

    @JsonProperty("bondPosition")
    public BondPosition getBondPosition() {
        return bondPosition;
    }

    @JsonProperty("bondPosition")
    public void setBondPosition(BondPosition bondPosition) {
        this.bondPosition = bondPosition;
    }

    @JsonProperty("convertiblePosition")
    public ConvertiblePosition getConvertiblePosition() {
        return convertiblePosition;
    }

    @JsonProperty("convertiblePosition")
    public void setConvertiblePosition(ConvertiblePosition convertiblePosition) {
        this.convertiblePosition = convertiblePosition;
    }

    @JsonProperty("sectorWeightings")
    public List<SectorWeighting> getSectorWeightings() {
        return sectorWeightings;
    }

    @JsonProperty("sectorWeightings")
    public void setSectorWeightings(List<SectorWeighting> sectorWeightings) {
        this.sectorWeightings = sectorWeightings;
    }

    @JsonProperty("holdings")
    public List<Holding> getHoldings() {
        return holdings;
    }

    @JsonProperty("holdings")
    public void setHoldings(List<Holding> holdings) {
        this.holdings = holdings;
    }

    @JsonProperty("bondHoldings")
    public BondHoldings getBondHoldings() {
        return bondHoldings;
    }

    @JsonProperty("bondHoldings")
    public void setBondHoldings(BondHoldings bondHoldings) {
        this.bondHoldings = bondHoldings;
    }

    @JsonProperty("bondRatings")
    public List<BondRating> getBondRatings() {
        return bondRatings;
    }

    @JsonProperty("bondRatings")
    public void setBondRatings(List<BondRating> bondRatings) {
        this.bondRatings = bondRatings;
    }

    @JsonProperty("equityHoldings")
    public EquityHoldings getEquityHoldings() {
        return equityHoldings;
    }

    @JsonProperty("equityHoldings")
    public void setEquityHoldings(EquityHoldings equityHoldings) {
        this.equityHoldings = equityHoldings;
    }

    @JsonProperty("otherPosition")
    public OtherPosition getOtherPosition() {
        return otherPosition;
    }

    @JsonProperty("otherPosition")
    public void setOtherPosition(OtherPosition otherPosition) {
        this.otherPosition = otherPosition;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("cashPosition")
    public CashPosition getCashPosition() {
        return cashPosition;
    }

    @JsonProperty("cashPosition")
    public void setCashPosition(CashPosition cashPosition) {
        this.cashPosition = cashPosition;
    }

    @JsonProperty("stockPosition")
    public StockPosition getStockPosition() {
        return stockPosition;
    }

    @JsonProperty("stockPosition")
    public void setStockPosition(StockPosition stockPosition) {
        this.stockPosition = stockPosition;
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
        sb.append(TopHoldings.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preferredPosition");
        sb.append('=');
        sb.append(((this.preferredPosition == null)?"<null>":this.preferredPosition));
        sb.append(',');
        sb.append("bondPosition");
        sb.append('=');
        sb.append(((this.bondPosition == null)?"<null>":this.bondPosition));
        sb.append(',');
        sb.append("convertiblePosition");
        sb.append('=');
        sb.append(((this.convertiblePosition == null)?"<null>":this.convertiblePosition));
        sb.append(',');
        sb.append("sectorWeightings");
        sb.append('=');
        sb.append(((this.sectorWeightings == null)?"<null>":this.sectorWeightings));
        sb.append(',');
        sb.append("holdings");
        sb.append('=');
        sb.append(((this.holdings == null)?"<null>":this.holdings));
        sb.append(',');
        sb.append("bondHoldings");
        sb.append('=');
        sb.append(((this.bondHoldings == null)?"<null>":this.bondHoldings));
        sb.append(',');
        sb.append("bondRatings");
        sb.append('=');
        sb.append(((this.bondRatings == null)?"<null>":this.bondRatings));
        sb.append(',');
        sb.append("equityHoldings");
        sb.append('=');
        sb.append(((this.equityHoldings == null)?"<null>":this.equityHoldings));
        sb.append(',');
        sb.append("otherPosition");
        sb.append('=');
        sb.append(((this.otherPosition == null)?"<null>":this.otherPosition));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("cashPosition");
        sb.append('=');
        sb.append(((this.cashPosition == null)?"<null>":this.cashPosition));
        sb.append(',');
        sb.append("stockPosition");
        sb.append('=');
        sb.append(((this.stockPosition == null)?"<null>":this.stockPosition));
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
        result = ((result* 31)+((this.bondHoldings == null)? 0 :this.bondHoldings.hashCode()));
        result = ((result* 31)+((this.bondRatings == null)? 0 :this.bondRatings.hashCode()));
        result = ((result* 31)+((this.bondPosition == null)? 0 :this.bondPosition.hashCode()));
        result = ((result* 31)+((this.convertiblePosition == null)? 0 :this.convertiblePosition.hashCode()));
        result = ((result* 31)+((this.stockPosition == null)? 0 :this.stockPosition.hashCode()));
        result = ((result* 31)+((this.otherPosition == null)? 0 :this.otherPosition.hashCode()));
        result = ((result* 31)+((this.cashPosition == null)? 0 :this.cashPosition.hashCode()));
        result = ((result* 31)+((this.equityHoldings == null)? 0 :this.equityHoldings.hashCode()));
        result = ((result* 31)+((this.preferredPosition == null)? 0 :this.preferredPosition.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.sectorWeightings == null)? 0 :this.sectorWeightings.hashCode()));
        result = ((result* 31)+((this.holdings == null)? 0 :this.holdings.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopHoldings) == false) {
            return false;
        }
        TopHoldings rhs = ((TopHoldings) other);
        return ((((((((((((((this.bondHoldings == rhs.bondHoldings)||((this.bondHoldings!= null)&&this.bondHoldings.equals(rhs.bondHoldings)))&&((this.bondRatings == rhs.bondRatings)||((this.bondRatings!= null)&&this.bondRatings.equals(rhs.bondRatings))))&&((this.bondPosition == rhs.bondPosition)||((this.bondPosition!= null)&&this.bondPosition.equals(rhs.bondPosition))))&&((this.convertiblePosition == rhs.convertiblePosition)||((this.convertiblePosition!= null)&&this.convertiblePosition.equals(rhs.convertiblePosition))))&&((this.stockPosition == rhs.stockPosition)||((this.stockPosition!= null)&&this.stockPosition.equals(rhs.stockPosition))))&&((this.otherPosition == rhs.otherPosition)||((this.otherPosition!= null)&&this.otherPosition.equals(rhs.otherPosition))))&&((this.cashPosition == rhs.cashPosition)||((this.cashPosition!= null)&&this.cashPosition.equals(rhs.cashPosition))))&&((this.equityHoldings == rhs.equityHoldings)||((this.equityHoldings!= null)&&this.equityHoldings.equals(rhs.equityHoldings))))&&((this.preferredPosition == rhs.preferredPosition)||((this.preferredPosition!= null)&&this.preferredPosition.equals(rhs.preferredPosition))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.sectorWeightings == rhs.sectorWeightings)||((this.sectorWeightings!= null)&&this.sectorWeightings.equals(rhs.sectorWeightings))))&&((this.holdings == rhs.holdings)||((this.holdings!= null)&&this.holdings.equals(rhs.holdings))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
