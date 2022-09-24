
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
    "period",
    "netPercentInsiderShares",
    "netInfoCount",
    "totalInsiderShares",
    "buyInfoShares",
    "buyPercentInsiderShares",
    "sellInfoCount",
    "sellInfoShares",
    "sellPercentInsiderShares",
    "maxAge",
    "buyInfoCount",
    "netInfoShares"
})
public class NetSharePurchaseActivity {

    @JsonProperty("period")
    private String period;
    @JsonProperty("netPercentInsiderShares")
    private NetPercentInsiderShares netPercentInsiderShares;
    @JsonProperty("netInfoCount")
    private NetInfoCount netInfoCount;
    @JsonProperty("totalInsiderShares")
    private TotalInsiderShares totalInsiderShares;
    @JsonProperty("buyInfoShares")
    private BuyInfoShares buyInfoShares;
    @JsonProperty("buyPercentInsiderShares")
    private BuyPercentInsiderShares buyPercentInsiderShares;
    @JsonProperty("sellInfoCount")
    private SellInfoCount sellInfoCount;
    @JsonProperty("sellInfoShares")
    private SellInfoShares sellInfoShares;
    @JsonProperty("sellPercentInsiderShares")
    private SellPercentInsiderShares sellPercentInsiderShares;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("buyInfoCount")
    private BuyInfoCount buyInfoCount;
    @JsonProperty("netInfoShares")
    private NetInfoShares netInfoShares;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("netPercentInsiderShares")
    public NetPercentInsiderShares getNetPercentInsiderShares() {
        return netPercentInsiderShares;
    }

    @JsonProperty("netPercentInsiderShares")
    public void setNetPercentInsiderShares(NetPercentInsiderShares netPercentInsiderShares) {
        this.netPercentInsiderShares = netPercentInsiderShares;
    }

    @JsonProperty("netInfoCount")
    public NetInfoCount getNetInfoCount() {
        return netInfoCount;
    }

    @JsonProperty("netInfoCount")
    public void setNetInfoCount(NetInfoCount netInfoCount) {
        this.netInfoCount = netInfoCount;
    }

    @JsonProperty("totalInsiderShares")
    public TotalInsiderShares getTotalInsiderShares() {
        return totalInsiderShares;
    }

    @JsonProperty("totalInsiderShares")
    public void setTotalInsiderShares(TotalInsiderShares totalInsiderShares) {
        this.totalInsiderShares = totalInsiderShares;
    }

    @JsonProperty("buyInfoShares")
    public BuyInfoShares getBuyInfoShares() {
        return buyInfoShares;
    }

    @JsonProperty("buyInfoShares")
    public void setBuyInfoShares(BuyInfoShares buyInfoShares) {
        this.buyInfoShares = buyInfoShares;
    }

    @JsonProperty("buyPercentInsiderShares")
    public BuyPercentInsiderShares getBuyPercentInsiderShares() {
        return buyPercentInsiderShares;
    }

    @JsonProperty("buyPercentInsiderShares")
    public void setBuyPercentInsiderShares(BuyPercentInsiderShares buyPercentInsiderShares) {
        this.buyPercentInsiderShares = buyPercentInsiderShares;
    }

    @JsonProperty("sellInfoCount")
    public SellInfoCount getSellInfoCount() {
        return sellInfoCount;
    }

    @JsonProperty("sellInfoCount")
    public void setSellInfoCount(SellInfoCount sellInfoCount) {
        this.sellInfoCount = sellInfoCount;
    }

    @JsonProperty("sellInfoShares")
    public SellInfoShares getSellInfoShares() {
        return sellInfoShares;
    }

    @JsonProperty("sellInfoShares")
    public void setSellInfoShares(SellInfoShares sellInfoShares) {
        this.sellInfoShares = sellInfoShares;
    }

    @JsonProperty("sellPercentInsiderShares")
    public SellPercentInsiderShares getSellPercentInsiderShares() {
        return sellPercentInsiderShares;
    }

    @JsonProperty("sellPercentInsiderShares")
    public void setSellPercentInsiderShares(SellPercentInsiderShares sellPercentInsiderShares) {
        this.sellPercentInsiderShares = sellPercentInsiderShares;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("buyInfoCount")
    public BuyInfoCount getBuyInfoCount() {
        return buyInfoCount;
    }

    @JsonProperty("buyInfoCount")
    public void setBuyInfoCount(BuyInfoCount buyInfoCount) {
        this.buyInfoCount = buyInfoCount;
    }

    @JsonProperty("netInfoShares")
    public NetInfoShares getNetInfoShares() {
        return netInfoShares;
    }

    @JsonProperty("netInfoShares")
    public void setNetInfoShares(NetInfoShares netInfoShares) {
        this.netInfoShares = netInfoShares;
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
        sb.append(NetSharePurchaseActivity.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("netPercentInsiderShares");
        sb.append('=');
        sb.append(((this.netPercentInsiderShares == null)?"<null>":this.netPercentInsiderShares));
        sb.append(',');
        sb.append("netInfoCount");
        sb.append('=');
        sb.append(((this.netInfoCount == null)?"<null>":this.netInfoCount));
        sb.append(',');
        sb.append("totalInsiderShares");
        sb.append('=');
        sb.append(((this.totalInsiderShares == null)?"<null>":this.totalInsiderShares));
        sb.append(',');
        sb.append("buyInfoShares");
        sb.append('=');
        sb.append(((this.buyInfoShares == null)?"<null>":this.buyInfoShares));
        sb.append(',');
        sb.append("buyPercentInsiderShares");
        sb.append('=');
        sb.append(((this.buyPercentInsiderShares == null)?"<null>":this.buyPercentInsiderShares));
        sb.append(',');
        sb.append("sellInfoCount");
        sb.append('=');
        sb.append(((this.sellInfoCount == null)?"<null>":this.sellInfoCount));
        sb.append(',');
        sb.append("sellInfoShares");
        sb.append('=');
        sb.append(((this.sellInfoShares == null)?"<null>":this.sellInfoShares));
        sb.append(',');
        sb.append("sellPercentInsiderShares");
        sb.append('=');
        sb.append(((this.sellPercentInsiderShares == null)?"<null>":this.sellPercentInsiderShares));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("buyInfoCount");
        sb.append('=');
        sb.append(((this.buyInfoCount == null)?"<null>":this.buyInfoCount));
        sb.append(',');
        sb.append("netInfoShares");
        sb.append('=');
        sb.append(((this.netInfoShares == null)?"<null>":this.netInfoShares));
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
        result = ((result* 31)+((this.netInfoCount == null)? 0 :this.netInfoCount.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.netInfoShares == null)? 0 :this.netInfoShares.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.buyPercentInsiderShares == null)? 0 :this.buyPercentInsiderShares.hashCode()));
        result = ((result* 31)+((this.buyInfoShares == null)? 0 :this.buyInfoShares.hashCode()));
        result = ((result* 31)+((this.sellInfoCount == null)? 0 :this.sellInfoCount.hashCode()));
        result = ((result* 31)+((this.buyInfoCount == null)? 0 :this.buyInfoCount.hashCode()));
        result = ((result* 31)+((this.totalInsiderShares == null)? 0 :this.totalInsiderShares.hashCode()));
        result = ((result* 31)+((this.netPercentInsiderShares == null)? 0 :this.netPercentInsiderShares.hashCode()));
        result = ((result* 31)+((this.sellInfoShares == null)? 0 :this.sellInfoShares.hashCode()));
        result = ((result* 31)+((this.sellPercentInsiderShares == null)? 0 :this.sellPercentInsiderShares.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetSharePurchaseActivity) == false) {
            return false;
        }
        NetSharePurchaseActivity rhs = ((NetSharePurchaseActivity) other);
        return ((((((((((((((this.netInfoCount == rhs.netInfoCount)||((this.netInfoCount!= null)&&this.netInfoCount.equals(rhs.netInfoCount)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.netInfoShares == rhs.netInfoShares)||((this.netInfoShares!= null)&&this.netInfoShares.equals(rhs.netInfoShares))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.buyPercentInsiderShares == rhs.buyPercentInsiderShares)||((this.buyPercentInsiderShares!= null)&&this.buyPercentInsiderShares.equals(rhs.buyPercentInsiderShares))))&&((this.buyInfoShares == rhs.buyInfoShares)||((this.buyInfoShares!= null)&&this.buyInfoShares.equals(rhs.buyInfoShares))))&&((this.sellInfoCount == rhs.sellInfoCount)||((this.sellInfoCount!= null)&&this.sellInfoCount.equals(rhs.sellInfoCount))))&&((this.buyInfoCount == rhs.buyInfoCount)||((this.buyInfoCount!= null)&&this.buyInfoCount.equals(rhs.buyInfoCount))))&&((this.totalInsiderShares == rhs.totalInsiderShares)||((this.totalInsiderShares!= null)&&this.totalInsiderShares.equals(rhs.totalInsiderShares))))&&((this.netPercentInsiderShares == rhs.netPercentInsiderShares)||((this.netPercentInsiderShares!= null)&&this.netPercentInsiderShares.equals(rhs.netPercentInsiderShares))))&&((this.sellInfoShares == rhs.sellInfoShares)||((this.sellInfoShares!= null)&&this.sellInfoShares.equals(rhs.sellInfoShares))))&&((this.sellPercentInsiderShares == rhs.sellPercentInsiderShares)||((this.sellPercentInsiderShares!= null)&&this.sellPercentInsiderShares.equals(rhs.sellPercentInsiderShares))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
