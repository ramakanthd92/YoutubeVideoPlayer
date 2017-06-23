
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
    "duration",
    "dimension",
    "definition",
    "caption",
    "licensedContent",
    "projection"
})
public class ContentDetails {

    @JsonProperty("duration")
    private String duration;
    @JsonProperty("dimension")
    private String dimension;
    @JsonProperty("definition")
    private String definition;
    @JsonProperty("caption")
    private String caption;
    @JsonProperty("licensedContent")
    private Boolean licensedContent;
    @JsonProperty("projection")
    private String projection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The dimension
     */
    @JsonProperty("dimension")
    public String getDimension() {
        return dimension;
    }

    /**
     * 
     * @param dimension
     *     The dimension
     */
    @JsonProperty("dimension")
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * 
     * @return
     *     The definition
     */
    @JsonProperty("definition")
    public String getDefinition() {
        return definition;
    }

    /**
     * 
     * @param definition
     *     The definition
     */
    @JsonProperty("definition")
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * 
     * @return
     *     The caption
     */
    @JsonProperty("caption")
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    @JsonProperty("caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The licensedContent
     */
    @JsonProperty("licensedContent")
    public Boolean getLicensedContent() {
        return licensedContent;
    }

    /**
     * 
     * @param licensedContent
     *     The licensedContent
     */
    @JsonProperty("licensedContent")
    public void setLicensedContent(Boolean licensedContent) {
        this.licensedContent = licensedContent;
    }

    /**
     * 
     * @return
     *     The projection
     */
    @JsonProperty("projection")
    public String getProjection() {
        return projection;
    }

    /**
     * 
     * @param projection
     *     The projection
     */
    @JsonProperty("projection")
    public void setProjection(String projection) {
        this.projection = projection;
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
