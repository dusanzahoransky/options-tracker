
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
    "realestate",
    "consumer_cyclical",
    "basic_materials",
    "consumer_defensive",
    "technology",
    "communication_services",
    "financial_services",
    "utilities",
    "industrials",
    "energy",
    "healthcare"
})
public class SectorWeighting {

    @JsonProperty("realestate")
    private Realestate realestate;
    @JsonProperty("consumer_cyclical")
    private ConsumerCyclical consumerCyclical;
    @JsonProperty("basic_materials")
    private BasicMaterials basicMaterials;
    @JsonProperty("consumer_defensive")
    private ConsumerDefensive consumerDefensive;
    @JsonProperty("technology")
    private Technology technology;
    @JsonProperty("communication_services")
    private CommunicationServices communicationServices;
    @JsonProperty("financial_services")
    private FinancialServices financialServices;
    @JsonProperty("utilities")
    private Utilities utilities;
    @JsonProperty("industrials")
    private Industrials industrials;
    @JsonProperty("energy")
    private Energy energy;
    @JsonProperty("healthcare")
    private Healthcare healthcare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("realestate")
    public Realestate getRealestate() {
        return realestate;
    }

    @JsonProperty("realestate")
    public void setRealestate(Realestate realestate) {
        this.realestate = realestate;
    }

    @JsonProperty("consumer_cyclical")
    public ConsumerCyclical getConsumerCyclical() {
        return consumerCyclical;
    }

    @JsonProperty("consumer_cyclical")
    public void setConsumerCyclical(ConsumerCyclical consumerCyclical) {
        this.consumerCyclical = consumerCyclical;
    }

    @JsonProperty("basic_materials")
    public BasicMaterials getBasicMaterials() {
        return basicMaterials;
    }

    @JsonProperty("basic_materials")
    public void setBasicMaterials(BasicMaterials basicMaterials) {
        this.basicMaterials = basicMaterials;
    }

    @JsonProperty("consumer_defensive")
    public ConsumerDefensive getConsumerDefensive() {
        return consumerDefensive;
    }

    @JsonProperty("consumer_defensive")
    public void setConsumerDefensive(ConsumerDefensive consumerDefensive) {
        this.consumerDefensive = consumerDefensive;
    }

    @JsonProperty("technology")
    public Technology getTechnology() {
        return technology;
    }

    @JsonProperty("technology")
    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    @JsonProperty("communication_services")
    public CommunicationServices getCommunicationServices() {
        return communicationServices;
    }

    @JsonProperty("communication_services")
    public void setCommunicationServices(CommunicationServices communicationServices) {
        this.communicationServices = communicationServices;
    }

    @JsonProperty("financial_services")
    public FinancialServices getFinancialServices() {
        return financialServices;
    }

    @JsonProperty("financial_services")
    public void setFinancialServices(FinancialServices financialServices) {
        this.financialServices = financialServices;
    }

    @JsonProperty("utilities")
    public Utilities getUtilities() {
        return utilities;
    }

    @JsonProperty("utilities")
    public void setUtilities(Utilities utilities) {
        this.utilities = utilities;
    }

    @JsonProperty("industrials")
    public Industrials getIndustrials() {
        return industrials;
    }

    @JsonProperty("industrials")
    public void setIndustrials(Industrials industrials) {
        this.industrials = industrials;
    }

    @JsonProperty("energy")
    public Energy getEnergy() {
        return energy;
    }

    @JsonProperty("energy")
    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    @JsonProperty("healthcare")
    public Healthcare getHealthcare() {
        return healthcare;
    }

    @JsonProperty("healthcare")
    public void setHealthcare(Healthcare healthcare) {
        this.healthcare = healthcare;
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
        sb.append(SectorWeighting.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("realestate");
        sb.append('=');
        sb.append(((this.realestate == null)?"<null>":this.realestate));
        sb.append(',');
        sb.append("consumerCyclical");
        sb.append('=');
        sb.append(((this.consumerCyclical == null)?"<null>":this.consumerCyclical));
        sb.append(',');
        sb.append("basicMaterials");
        sb.append('=');
        sb.append(((this.basicMaterials == null)?"<null>":this.basicMaterials));
        sb.append(',');
        sb.append("consumerDefensive");
        sb.append('=');
        sb.append(((this.consumerDefensive == null)?"<null>":this.consumerDefensive));
        sb.append(',');
        sb.append("technology");
        sb.append('=');
        sb.append(((this.technology == null)?"<null>":this.technology));
        sb.append(',');
        sb.append("communicationServices");
        sb.append('=');
        sb.append(((this.communicationServices == null)?"<null>":this.communicationServices));
        sb.append(',');
        sb.append("financialServices");
        sb.append('=');
        sb.append(((this.financialServices == null)?"<null>":this.financialServices));
        sb.append(',');
        sb.append("utilities");
        sb.append('=');
        sb.append(((this.utilities == null)?"<null>":this.utilities));
        sb.append(',');
        sb.append("industrials");
        sb.append('=');
        sb.append(((this.industrials == null)?"<null>":this.industrials));
        sb.append(',');
        sb.append("energy");
        sb.append('=');
        sb.append(((this.energy == null)?"<null>":this.energy));
        sb.append(',');
        sb.append("healthcare");
        sb.append('=');
        sb.append(((this.healthcare == null)?"<null>":this.healthcare));
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
        result = ((result* 31)+((this.realestate == null)? 0 :this.realestate.hashCode()));
        result = ((result* 31)+((this.communicationServices == null)? 0 :this.communicationServices.hashCode()));
        result = ((result* 31)+((this.financialServices == null)? 0 :this.financialServices.hashCode()));
        result = ((result* 31)+((this.basicMaterials == null)? 0 :this.basicMaterials.hashCode()));
        result = ((result* 31)+((this.technology == null)? 0 :this.technology.hashCode()));
        result = ((result* 31)+((this.utilities == null)? 0 :this.utilities.hashCode()));
        result = ((result* 31)+((this.industrials == null)? 0 :this.industrials.hashCode()));
        result = ((result* 31)+((this.healthcare == null)? 0 :this.healthcare.hashCode()));
        result = ((result* 31)+((this.consumerCyclical == null)? 0 :this.consumerCyclical.hashCode()));
        result = ((result* 31)+((this.consumerDefensive == null)? 0 :this.consumerDefensive.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.energy == null)? 0 :this.energy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectorWeighting) == false) {
            return false;
        }
        SectorWeighting rhs = ((SectorWeighting) other);
        return (((((((((((((this.realestate == rhs.realestate)||((this.realestate!= null)&&this.realestate.equals(rhs.realestate)))&&((this.communicationServices == rhs.communicationServices)||((this.communicationServices!= null)&&this.communicationServices.equals(rhs.communicationServices))))&&((this.financialServices == rhs.financialServices)||((this.financialServices!= null)&&this.financialServices.equals(rhs.financialServices))))&&((this.basicMaterials == rhs.basicMaterials)||((this.basicMaterials!= null)&&this.basicMaterials.equals(rhs.basicMaterials))))&&((this.technology == rhs.technology)||((this.technology!= null)&&this.technology.equals(rhs.technology))))&&((this.utilities == rhs.utilities)||((this.utilities!= null)&&this.utilities.equals(rhs.utilities))))&&((this.industrials == rhs.industrials)||((this.industrials!= null)&&this.industrials.equals(rhs.industrials))))&&((this.healthcare == rhs.healthcare)||((this.healthcare!= null)&&this.healthcare.equals(rhs.healthcare))))&&((this.consumerCyclical == rhs.consumerCyclical)||((this.consumerCyclical!= null)&&this.consumerCyclical.equals(rhs.consumerCyclical))))&&((this.consumerDefensive == rhs.consumerDefensive)||((this.consumerDefensive!= null)&&this.consumerDefensive.equals(rhs.consumerDefensive))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.energy == rhs.energy)||((this.energy!= null)&&this.energy.equals(rhs.energy))));
    }

}
