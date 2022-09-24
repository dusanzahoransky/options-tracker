
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
    "VUSA.L",
    "VUKE.L",
    "VMID.L",
    "VFEM.L",
    "VWRL.L",
    "VERX.L"
})
public class QuoteData {

    @JsonProperty("VUSA.L")
    private VusaL vusaL;
    @JsonProperty("VUKE.L")
    private VukeL vukeL;
    @JsonProperty("VMID.L")
    private VmidL vmidL;
    @JsonProperty("VFEM.L")
    private VfemL vfemL;
    @JsonProperty("VWRL.L")
    private VwrlL vwrlL;
    @JsonProperty("VERX.L")
    private VerxL verxL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("VUSA.L")
    public VusaL getVusaL() {
        return vusaL;
    }

    @JsonProperty("VUSA.L")
    public void setVusaL(VusaL vusaL) {
        this.vusaL = vusaL;
    }

    @JsonProperty("VUKE.L")
    public VukeL getVukeL() {
        return vukeL;
    }

    @JsonProperty("VUKE.L")
    public void setVukeL(VukeL vukeL) {
        this.vukeL = vukeL;
    }

    @JsonProperty("VMID.L")
    public VmidL getVmidL() {
        return vmidL;
    }

    @JsonProperty("VMID.L")
    public void setVmidL(VmidL vmidL) {
        this.vmidL = vmidL;
    }

    @JsonProperty("VFEM.L")
    public VfemL getVfemL() {
        return vfemL;
    }

    @JsonProperty("VFEM.L")
    public void setVfemL(VfemL vfemL) {
        this.vfemL = vfemL;
    }

    @JsonProperty("VWRL.L")
    public VwrlL getVwrlL() {
        return vwrlL;
    }

    @JsonProperty("VWRL.L")
    public void setVwrlL(VwrlL vwrlL) {
        this.vwrlL = vwrlL;
    }

    @JsonProperty("VERX.L")
    public VerxL getVerxL() {
        return verxL;
    }

    @JsonProperty("VERX.L")
    public void setVerxL(VerxL verxL) {
        this.verxL = verxL;
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
        sb.append(QuoteData.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vusaL");
        sb.append('=');
        sb.append(((this.vusaL == null)?"<null>":this.vusaL));
        sb.append(',');
        sb.append("vukeL");
        sb.append('=');
        sb.append(((this.vukeL == null)?"<null>":this.vukeL));
        sb.append(',');
        sb.append("vmidL");
        sb.append('=');
        sb.append(((this.vmidL == null)?"<null>":this.vmidL));
        sb.append(',');
        sb.append("vfemL");
        sb.append('=');
        sb.append(((this.vfemL == null)?"<null>":this.vfemL));
        sb.append(',');
        sb.append("vwrlL");
        sb.append('=');
        sb.append(((this.vwrlL == null)?"<null>":this.vwrlL));
        sb.append(',');
        sb.append("verxL");
        sb.append('=');
        sb.append(((this.verxL == null)?"<null>":this.verxL));
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
        result = ((result* 31)+((this.vukeL == null)? 0 :this.vukeL.hashCode()));
        result = ((result* 31)+((this.vwrlL == null)? 0 :this.vwrlL.hashCode()));
        result = ((result* 31)+((this.verxL == null)? 0 :this.verxL.hashCode()));
        result = ((result* 31)+((this.vusaL == null)? 0 :this.vusaL.hashCode()));
        result = ((result* 31)+((this.vfemL == null)? 0 :this.vfemL.hashCode()));
        result = ((result* 31)+((this.vmidL == null)? 0 :this.vmidL.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuoteData) == false) {
            return false;
        }
        QuoteData rhs = ((QuoteData) other);
        return ((((((((this.vukeL == rhs.vukeL)||((this.vukeL!= null)&&this.vukeL.equals(rhs.vukeL)))&&((this.vwrlL == rhs.vwrlL)||((this.vwrlL!= null)&&this.vwrlL.equals(rhs.vwrlL))))&&((this.verxL == rhs.verxL)||((this.verxL!= null)&&this.verxL.equals(rhs.verxL))))&&((this.vusaL == rhs.vusaL)||((this.vusaL!= null)&&this.vusaL.equals(rhs.vusaL))))&&((this.vfemL == rhs.vfemL)||((this.vfemL!= null)&&this.vfemL.equals(rhs.vfemL))))&&((this.vmidL == rhs.vmidL)||((this.vmidL!= null)&&this.vmidL.equals(rhs.vmidL))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
