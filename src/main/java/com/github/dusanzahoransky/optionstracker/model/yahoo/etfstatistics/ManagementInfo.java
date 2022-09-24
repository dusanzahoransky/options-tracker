
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
    "managerName",
    "managerBio",
    "startdate"
})
public class ManagementInfo {

    @JsonProperty("managerName")
    private Object managerName;
    @JsonProperty("managerBio")
    private Object managerBio;
    @JsonProperty("startdate")
    private Startdate startdate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("managerName")
    public Object getManagerName() {
        return managerName;
    }

    @JsonProperty("managerName")
    public void setManagerName(Object managerName) {
        this.managerName = managerName;
    }

    @JsonProperty("managerBio")
    public Object getManagerBio() {
        return managerBio;
    }

    @JsonProperty("managerBio")
    public void setManagerBio(Object managerBio) {
        this.managerBio = managerBio;
    }

    @JsonProperty("startdate")
    public Startdate getStartdate() {
        return startdate;
    }

    @JsonProperty("startdate")
    public void setStartdate(Startdate startdate) {
        this.startdate = startdate;
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
        sb.append(ManagementInfo.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("managerName");
        sb.append('=');
        sb.append(((this.managerName == null)?"<null>":this.managerName));
        sb.append(',');
        sb.append("managerBio");
        sb.append('=');
        sb.append(((this.managerBio == null)?"<null>":this.managerBio));
        sb.append(',');
        sb.append("startdate");
        sb.append('=');
        sb.append(((this.startdate == null)?"<null>":this.startdate));
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
        result = ((result* 31)+((this.managerBio == null)? 0 :this.managerBio.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.managerName == null)? 0 :this.managerName.hashCode()));
        result = ((result* 31)+((this.startdate == null)? 0 :this.startdate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManagementInfo) == false) {
            return false;
        }
        ManagementInfo rhs = ((ManagementInfo) other);
        return (((((this.managerBio == rhs.managerBio)||((this.managerBio!= null)&&this.managerBio.equals(rhs.managerBio)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.managerName == rhs.managerName)||((this.managerName!= null)&&this.managerName.equals(rhs.managerName))))&&((this.startdate == rhs.startdate)||((this.startdate!= null)&&this.startdate.equals(rhs.startdate))));
    }

}
