
package com.github.dusanzahoransky.optionstracker.model.ms.keyratios;

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
    "sectionHeader",
    "lineItems",
    "subsections",
    "summaryLineItem"
})
public class Section {

    @JsonProperty("sectionHeader")
    private String sectionHeader;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    @JsonProperty("subsections")
    private List<Object> subsections = new ArrayList<Object>();
    @JsonProperty("summaryLineItem")
    private Object summaryLineItem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sectionHeader")
    public String getSectionHeader() {
        return sectionHeader;
    }

    @JsonProperty("sectionHeader")
    public void setSectionHeader(String sectionHeader) {
        this.sectionHeader = sectionHeader;
    }

    @JsonProperty("lineItems")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonProperty("subsections")
    public List<Object> getSubsections() {
        return subsections;
    }

    @JsonProperty("subsections")
    public void setSubsections(List<Object> subsections) {
        this.subsections = subsections;
    }

    @JsonProperty("summaryLineItem")
    public Object getSummaryLineItem() {
        return summaryLineItem;
    }

    @JsonProperty("summaryLineItem")
    public void setSummaryLineItem(Object summaryLineItem) {
        this.summaryLineItem = summaryLineItem;
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
        sb.append(Section.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sectionHeader");
        sb.append('=');
        sb.append(((this.sectionHeader == null)?"<null>":this.sectionHeader));
        sb.append(',');
        sb.append("lineItems");
        sb.append('=');
        sb.append(((this.lineItems == null)?"<null>":this.lineItems));
        sb.append(',');
        sb.append("subsections");
        sb.append('=');
        sb.append(((this.subsections == null)?"<null>":this.subsections));
        sb.append(',');
        sb.append("summaryLineItem");
        sb.append('=');
        sb.append(((this.summaryLineItem == null)?"<null>":this.summaryLineItem));
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
        result = ((result* 31)+((this.lineItems == null)? 0 :this.lineItems.hashCode()));
        result = ((result* 31)+((this.subsections == null)? 0 :this.subsections.hashCode()));
        result = ((result* 31)+((this.summaryLineItem == null)? 0 :this.summaryLineItem.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sectionHeader == null)? 0 :this.sectionHeader.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Section) == false) {
            return false;
        }
        Section rhs = ((Section) other);
        return ((((((this.lineItems == rhs.lineItems)||((this.lineItems!= null)&&this.lineItems.equals(rhs.lineItems)))&&((this.subsections == rhs.subsections)||((this.subsections!= null)&&this.subsections.equals(rhs.subsections))))&&((this.summaryLineItem == rhs.summaryLineItem)||((this.summaryLineItem!= null)&&this.summaryLineItem.equals(rhs.summaryLineItem))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sectionHeader == rhs.sectionHeader)||((this.sectionHeader!= null)&&this.sectionHeader.equals(rhs.sectionHeader))));
    }

}
