package com.praveen.testsuite.models.pic;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.praveen.testsuite.models.Model;
import com.praveen.testsuite.models.rating.AverageRating;
import com.praveen.testsuite.models.rating.DetailedRating;

import java.util.HashMap;

public class PicDetails implements Model {
    @JsonProperty
    private String userId;

    @JsonProperty
    private String photoId;

    @JsonProperty
    private PicStatus picStatus;

    @JsonProperty
    private String url;

    @JsonProperty
    private AverageRating avgRating;

    @JsonProperty
    private HashMap<String, DetailedRating> detailedRating;

    @JsonProperty
    private int totalRating;

    @JsonProperty
    private int avgOverallRating;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public PicStatus getPicStatus() {
        return picStatus;
    }

    public void setPicStatus(PicStatus picStatus) {
        this.picStatus = picStatus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AverageRating getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(AverageRating avgRating) {
        this.avgRating = avgRating;
    }

    public HashMap<String, DetailedRating> getDetailedRating() {
        return detailedRating;
    }

    public void setDetailedRating(HashMap<String, DetailedRating> detailedRating) {
        this.detailedRating = detailedRating;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public int getAvgOverallRating() {
        return avgOverallRating;
    }

    public void setAvgOverallRating(int avgOverallRating) {
        this.avgOverallRating = avgOverallRating;
    }
}
