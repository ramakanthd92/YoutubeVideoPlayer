
package com.examples.youtubeapidemo.pojo;

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
    "data",
    "status"
})
public class PlaylistResponse {

    @JsonProperty("data")
    private List<String> data = new ArrayList<String>();
    @JsonProperty("status")
    private ResponseStatus status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public List<String> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(List<String> data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(ResponseStatus status) {
        this.status = status;
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
