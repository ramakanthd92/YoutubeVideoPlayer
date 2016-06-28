
package com.examples.youtubeapidemo.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "uploadStatus",
    "privacyStatus",
    "license",
    "embeddable",
    "publicStatsViewable"
})
public class Status {

    @JsonProperty("uploadStatus")
    private String uploadStatus;
    @JsonProperty("privacyStatus")
    private String privacyStatus;
    @JsonProperty("license")
    private String license;
    @JsonProperty("embeddable")
    private Boolean embeddable;
    @JsonProperty("publicStatsViewable")
    private Boolean publicStatsViewable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uploadStatus
     */
    @JsonProperty("uploadStatus")
    public String getUploadStatus() {
        return uploadStatus;
    }

    /**
     * 
     * @param uploadStatus
     *     The uploadStatus
     */
    @JsonProperty("uploadStatus")
    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    /**
     * 
     * @return
     *     The privacyStatus
     */
    @JsonProperty("privacyStatus")
    public String getPrivacyStatus() {
        return privacyStatus;
    }

    /**
     * 
     * @param privacyStatus
     *     The privacyStatus
     */
    @JsonProperty("privacyStatus")
    public void setPrivacyStatus(String privacyStatus) {
        this.privacyStatus = privacyStatus;
    }

    /**
     * 
     * @return
     *     The license
     */
    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    /**
     * 
     * @param license
     *     The license
     */
    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * 
     * @return
     *     The embeddable
     */
    @JsonProperty("embeddable")
    public Boolean getEmbeddable() {
        return embeddable;
    }

    /**
     * 
     * @param embeddable
     *     The embeddable
     */
    @JsonProperty("embeddable")
    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    /**
     * 
     * @return
     *     The publicStatsViewable
     */
    @JsonProperty("publicStatsViewable")
    public Boolean getPublicStatsViewable() {
        return publicStatsViewable;
    }

    /**
     * 
     * @param publicStatsViewable
     *     The publicStatsViewable
     */
    @JsonProperty("publicStatsViewable")
    public void setPublicStatsViewable(Boolean publicStatsViewable) {
        this.publicStatsViewable = publicStatsViewable;
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
