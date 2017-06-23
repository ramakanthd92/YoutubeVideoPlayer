
package com.examples.youtubeapidemo.pojo;

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
    "default",
    "medium",
    "high",
    "standard"
})
public class Thumbnails {

    @JsonProperty("default")
    private Default _default;
    @JsonProperty("medium")
    private Medium medium;
    @JsonProperty("high")
    private High high;
    @JsonProperty("standard")
    private Standard standard;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _default
     */
    @JsonProperty("default")
    public Default getDefault() {
        return _default;
    }

    /**
     * 
     * @param _default
     *     The default
     */
    @JsonProperty("default")
    public void setDefault(Default _default) {
        this._default = _default;
    }

    /**
     * 
     * @return
     *     The medium
     */
    @JsonProperty("medium")
    public Medium getMedium() {
        return medium;
    }

    /**
     * 
     * @param medium
     *     The medium
     */
    @JsonProperty("medium")
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    /**
     * 
     * @return
     *     The high
     */
    @JsonProperty("high")
    public High getHigh() {
        return high;
    }

    /**
     * 
     * @param high
     *     The high
     */
    @JsonProperty("high")
    public void setHigh(High high) {
        this.high = high;
    }

    /**
     * 
     * @return
     *     The standard
     */
    @JsonProperty("standard")
    public Standard getStandard() {
        return standard;
    }

    /**
     * 
     * @param standard
     *     The standard
     */
    @JsonProperty("standard")
    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
