package com.praveen.testsuite.models.pic;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pic {

    @JsonProperty
    private String userId;

    @JsonProperty
    private String photoId;

    @JsonProperty
    private String photoUrl;

    @JsonProperty
    private PicStatus status;

    public Pic() {

    }

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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public PicStatus getStatus() {
        return status;
    }

    public void setStatus(PicStatus status) {
        this.status = status;
    }
}
