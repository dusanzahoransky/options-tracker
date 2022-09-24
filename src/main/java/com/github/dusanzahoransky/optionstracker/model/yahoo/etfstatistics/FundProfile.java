
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
    "initInvestment",
    "family",
    "categoryName",
    "initAipInvestment",
    "subseqIraInvestment",
    "brokerages",
    "managementInfo",
    "subseqInvestment",
    "legalType",
    "styleBoxUrl",
    "feesExpensesInvestment",
    "maxAge",
    "feesExpensesInvestmentCat",
    "initIraInvestment",
    "subseqAipInvestment"
})
public class FundProfile {

    @JsonProperty("initInvestment")
    private InitInvestment initInvestment;
    @JsonProperty("family")
    private String family;
    @JsonProperty("categoryName")
    private Object categoryName;
    @JsonProperty("initAipInvestment")
    private InitAipInvestment initAipInvestment;
    @JsonProperty("subseqIraInvestment")
    private SubseqIraInvestment subseqIraInvestment;
    @JsonProperty("brokerages")
    private List<Object> brokerages = new ArrayList<Object>();
    @JsonProperty("managementInfo")
    private ManagementInfo managementInfo;
    @JsonProperty("subseqInvestment")
    private SubseqInvestment subseqInvestment;
    @JsonProperty("legalType")
    private String legalType;
    @JsonProperty("styleBoxUrl")
    private String styleBoxUrl;
    @JsonProperty("feesExpensesInvestment")
    private FeesExpensesInvestment feesExpensesInvestment;
    @JsonProperty("maxAge")
    private Long maxAge;
    @JsonProperty("feesExpensesInvestmentCat")
    private FeesExpensesInvestmentCat feesExpensesInvestmentCat;
    @JsonProperty("initIraInvestment")
    private InitIraInvestment initIraInvestment;
    @JsonProperty("subseqAipInvestment")
    private SubseqAipInvestment subseqAipInvestment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("initInvestment")
    public InitInvestment getInitInvestment() {
        return initInvestment;
    }

    @JsonProperty("initInvestment")
    public void setInitInvestment(InitInvestment initInvestment) {
        this.initInvestment = initInvestment;
    }

    @JsonProperty("family")
    public String getFamily() {
        return family;
    }

    @JsonProperty("family")
    public void setFamily(String family) {
        this.family = family;
    }

    @JsonProperty("categoryName")
    public Object getCategoryName() {
        return categoryName;
    }

    @JsonProperty("categoryName")
    public void setCategoryName(Object categoryName) {
        this.categoryName = categoryName;
    }

    @JsonProperty("initAipInvestment")
    public InitAipInvestment getInitAipInvestment() {
        return initAipInvestment;
    }

    @JsonProperty("initAipInvestment")
    public void setInitAipInvestment(InitAipInvestment initAipInvestment) {
        this.initAipInvestment = initAipInvestment;
    }

    @JsonProperty("subseqIraInvestment")
    public SubseqIraInvestment getSubseqIraInvestment() {
        return subseqIraInvestment;
    }

    @JsonProperty("subseqIraInvestment")
    public void setSubseqIraInvestment(SubseqIraInvestment subseqIraInvestment) {
        this.subseqIraInvestment = subseqIraInvestment;
    }

    @JsonProperty("brokerages")
    public List<Object> getBrokerages() {
        return brokerages;
    }

    @JsonProperty("brokerages")
    public void setBrokerages(List<Object> brokerages) {
        this.brokerages = brokerages;
    }

    @JsonProperty("managementInfo")
    public ManagementInfo getManagementInfo() {
        return managementInfo;
    }

    @JsonProperty("managementInfo")
    public void setManagementInfo(ManagementInfo managementInfo) {
        this.managementInfo = managementInfo;
    }

    @JsonProperty("subseqInvestment")
    public SubseqInvestment getSubseqInvestment() {
        return subseqInvestment;
    }

    @JsonProperty("subseqInvestment")
    public void setSubseqInvestment(SubseqInvestment subseqInvestment) {
        this.subseqInvestment = subseqInvestment;
    }

    @JsonProperty("legalType")
    public String getLegalType() {
        return legalType;
    }

    @JsonProperty("legalType")
    public void setLegalType(String legalType) {
        this.legalType = legalType;
    }

    @JsonProperty("styleBoxUrl")
    public String getStyleBoxUrl() {
        return styleBoxUrl;
    }

    @JsonProperty("styleBoxUrl")
    public void setStyleBoxUrl(String styleBoxUrl) {
        this.styleBoxUrl = styleBoxUrl;
    }

    @JsonProperty("feesExpensesInvestment")
    public FeesExpensesInvestment getFeesExpensesInvestment() {
        return feesExpensesInvestment;
    }

    @JsonProperty("feesExpensesInvestment")
    public void setFeesExpensesInvestment(FeesExpensesInvestment feesExpensesInvestment) {
        this.feesExpensesInvestment = feesExpensesInvestment;
    }

    @JsonProperty("maxAge")
    public Long getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("feesExpensesInvestmentCat")
    public FeesExpensesInvestmentCat getFeesExpensesInvestmentCat() {
        return feesExpensesInvestmentCat;
    }

    @JsonProperty("feesExpensesInvestmentCat")
    public void setFeesExpensesInvestmentCat(FeesExpensesInvestmentCat feesExpensesInvestmentCat) {
        this.feesExpensesInvestmentCat = feesExpensesInvestmentCat;
    }

    @JsonProperty("initIraInvestment")
    public InitIraInvestment getInitIraInvestment() {
        return initIraInvestment;
    }

    @JsonProperty("initIraInvestment")
    public void setInitIraInvestment(InitIraInvestment initIraInvestment) {
        this.initIraInvestment = initIraInvestment;
    }

    @JsonProperty("subseqAipInvestment")
    public SubseqAipInvestment getSubseqAipInvestment() {
        return subseqAipInvestment;
    }

    @JsonProperty("subseqAipInvestment")
    public void setSubseqAipInvestment(SubseqAipInvestment subseqAipInvestment) {
        this.subseqAipInvestment = subseqAipInvestment;
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
        sb.append(FundProfile.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("initInvestment");
        sb.append('=');
        sb.append(((this.initInvestment == null)?"<null>":this.initInvestment));
        sb.append(',');
        sb.append("family");
        sb.append('=');
        sb.append(((this.family == null)?"<null>":this.family));
        sb.append(',');
        sb.append("categoryName");
        sb.append('=');
        sb.append(((this.categoryName == null)?"<null>":this.categoryName));
        sb.append(',');
        sb.append("initAipInvestment");
        sb.append('=');
        sb.append(((this.initAipInvestment == null)?"<null>":this.initAipInvestment));
        sb.append(',');
        sb.append("subseqIraInvestment");
        sb.append('=');
        sb.append(((this.subseqIraInvestment == null)?"<null>":this.subseqIraInvestment));
        sb.append(',');
        sb.append("brokerages");
        sb.append('=');
        sb.append(((this.brokerages == null)?"<null>":this.brokerages));
        sb.append(',');
        sb.append("managementInfo");
        sb.append('=');
        sb.append(((this.managementInfo == null)?"<null>":this.managementInfo));
        sb.append(',');
        sb.append("subseqInvestment");
        sb.append('=');
        sb.append(((this.subseqInvestment == null)?"<null>":this.subseqInvestment));
        sb.append(',');
        sb.append("legalType");
        sb.append('=');
        sb.append(((this.legalType == null)?"<null>":this.legalType));
        sb.append(',');
        sb.append("styleBoxUrl");
        sb.append('=');
        sb.append(((this.styleBoxUrl == null)?"<null>":this.styleBoxUrl));
        sb.append(',');
        sb.append("feesExpensesInvestment");
        sb.append('=');
        sb.append(((this.feesExpensesInvestment == null)?"<null>":this.feesExpensesInvestment));
        sb.append(',');
        sb.append("maxAge");
        sb.append('=');
        sb.append(((this.maxAge == null)?"<null>":this.maxAge));
        sb.append(',');
        sb.append("feesExpensesInvestmentCat");
        sb.append('=');
        sb.append(((this.feesExpensesInvestmentCat == null)?"<null>":this.feesExpensesInvestmentCat));
        sb.append(',');
        sb.append("initIraInvestment");
        sb.append('=');
        sb.append(((this.initIraInvestment == null)?"<null>":this.initIraInvestment));
        sb.append(',');
        sb.append("subseqAipInvestment");
        sb.append('=');
        sb.append(((this.subseqAipInvestment == null)?"<null>":this.subseqAipInvestment));
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
        result = ((result* 31)+((this.legalType == null)? 0 :this.legalType.hashCode()));
        result = ((result* 31)+((this.feesExpensesInvestment == null)? 0 :this.feesExpensesInvestment.hashCode()));
        result = ((result* 31)+((this.subseqAipInvestment == null)? 0 :this.subseqAipInvestment.hashCode()));
        result = ((result* 31)+((this.subseqIraInvestment == null)? 0 :this.subseqIraInvestment.hashCode()));
        result = ((result* 31)+((this.brokerages == null)? 0 :this.brokerages.hashCode()));
        result = ((result* 31)+((this.initInvestment == null)? 0 :this.initInvestment.hashCode()));
        result = ((result* 31)+((this.categoryName == null)? 0 :this.categoryName.hashCode()));
        result = ((result* 31)+((this.styleBoxUrl == null)? 0 :this.styleBoxUrl.hashCode()));
        result = ((result* 31)+((this.subseqInvestment == null)? 0 :this.subseqInvestment.hashCode()));
        result = ((result* 31)+((this.maxAge == null)? 0 :this.maxAge.hashCode()));
        result = ((result* 31)+((this.initAipInvestment == null)? 0 :this.initAipInvestment.hashCode()));
        result = ((result* 31)+((this.initIraInvestment == null)? 0 :this.initIraInvestment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.family == null)? 0 :this.family.hashCode()));
        result = ((result* 31)+((this.managementInfo == null)? 0 :this.managementInfo.hashCode()));
        result = ((result* 31)+((this.feesExpensesInvestmentCat == null)? 0 :this.feesExpensesInvestmentCat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundProfile) == false) {
            return false;
        }
        FundProfile rhs = ((FundProfile) other);
        return (((((((((((((((((this.legalType == rhs.legalType)||((this.legalType!= null)&&this.legalType.equals(rhs.legalType)))&&((this.feesExpensesInvestment == rhs.feesExpensesInvestment)||((this.feesExpensesInvestment!= null)&&this.feesExpensesInvestment.equals(rhs.feesExpensesInvestment))))&&((this.subseqAipInvestment == rhs.subseqAipInvestment)||((this.subseqAipInvestment!= null)&&this.subseqAipInvestment.equals(rhs.subseqAipInvestment))))&&((this.subseqIraInvestment == rhs.subseqIraInvestment)||((this.subseqIraInvestment!= null)&&this.subseqIraInvestment.equals(rhs.subseqIraInvestment))))&&((this.brokerages == rhs.brokerages)||((this.brokerages!= null)&&this.brokerages.equals(rhs.brokerages))))&&((this.initInvestment == rhs.initInvestment)||((this.initInvestment!= null)&&this.initInvestment.equals(rhs.initInvestment))))&&((this.categoryName == rhs.categoryName)||((this.categoryName!= null)&&this.categoryName.equals(rhs.categoryName))))&&((this.styleBoxUrl == rhs.styleBoxUrl)||((this.styleBoxUrl!= null)&&this.styleBoxUrl.equals(rhs.styleBoxUrl))))&&((this.subseqInvestment == rhs.subseqInvestment)||((this.subseqInvestment!= null)&&this.subseqInvestment.equals(rhs.subseqInvestment))))&&((this.maxAge == rhs.maxAge)||((this.maxAge!= null)&&this.maxAge.equals(rhs.maxAge))))&&((this.initAipInvestment == rhs.initAipInvestment)||((this.initAipInvestment!= null)&&this.initAipInvestment.equals(rhs.initAipInvestment))))&&((this.initIraInvestment == rhs.initIraInvestment)||((this.initIraInvestment!= null)&&this.initIraInvestment.equals(rhs.initIraInvestment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.family == rhs.family)||((this.family!= null)&&this.family.equals(rhs.family))))&&((this.managementInfo == rhs.managementInfo)||((this.managementInfo!= null)&&this.managementInfo.equals(rhs.managementInfo))))&&((this.feesExpensesInvestmentCat == rhs.feesExpensesInvestmentCat)||((this.feesExpensesInvestmentCat!= null)&&this.feesExpensesInvestmentCat.equals(rhs.feesExpensesInvestmentCat))));
    }

}
