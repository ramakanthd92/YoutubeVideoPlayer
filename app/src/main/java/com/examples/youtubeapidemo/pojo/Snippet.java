
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
    "publishedAt",
    "channelId",
    "title",
    "description",
    "thumbnails",
    "channelTitle",
    "tags",
    "categoryId",
    "liveBroadcastContent",
    "localized"
})
public class Snippet {

    @JsonProperty("publishedAt")
    private String publishedAt;
    @JsonProperty("channelId")
    private String channelId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("thumbnails")
    private Thumbnails thumbnails;
    @JsonProperty("channelTitle")
    private String channelTitle;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("categoryId")
    private String categoryId;
    @JsonProperty("liveBroadcastContent")
    private String liveBroadcastContent;
    @JsonProperty("localized")
    private Localized localized;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The publishedAt
     */
    @JsonProperty("publishedAt")
    public String getPublishedAt() {
        return publishedAt;
    }

    /**
     * 
     * @param publishedAt
     *     The publishedAt
     */
    @JsonProperty("publishedAt")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     * 
     * @return
     *     The channelId
     */
    @JsonProperty("channelId")
    public String getChannelId() {
        return channelId;
    }

    /**
     * 
     * @param channelId
     *     The channelId
     */
    @JsonProperty("channelId")
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The thumbnails
     */
    @JsonProperty("thumbnails")
    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    /**
     * 
     * @param thumbnails
     *     The thumbnails
     */
    @JsonProperty("thumbnails")
    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    /**
     * 
     * @return
     *     The channelTitle
     */
    @JsonProperty("channelTitle")
    public String getChannelTitle() {
        return channelTitle;
    }

    /**
     * 
     * @param channelTitle
     *     The channelTitle
     */
    @JsonProperty("channelTitle")
    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 
     * @param categoryId
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 
     * @return
     *     The liveBroadcastContent
     */
    @JsonProperty("liveBroadcastContent")
    public String getLiveBroadcastContent() {
        return liveBroadcastContent;
    }

    /**
     * 
     * @param liveBroadcastContent
     *     The liveBroadcastContent
     */
    @JsonProperty("liveBroadcastContent")
    public void setLiveBroadcastContent(String liveBroadcastContent) {
        this.liveBroadcastContent = liveBroadcastContent;
    }

    /**
     * 
     * @return
     *     The localized
     */
    @JsonProperty("localized")
    public Localized getLocalized() {
        return localized;
    }

    /**
     * 
     * @param localized
     *     The localized
     */
    @JsonProperty("localized")
    public void setLocalized(Localized localized) {
        this.localized = localized;
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
