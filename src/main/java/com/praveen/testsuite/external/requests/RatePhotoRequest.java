package com.praveen.testsuite.external.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RatePhotoRequest implements AbstractExternalRequest{

    @JsonProperty
    private String photoId;

    @JsonProperty
    private String userId;

    @JsonProperty
    private String comments;

    @JsonProperty
    private List<Integer> notes = new ArrayList<>();

    @JsonProperty
    private HashMap<String, Integer> scores = new HashMap<>();

    public RatePhotoRequest() {
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<Integer> getNotes() {
        return notes;
    }

    public void setNotes(List<Integer> notes) {
        this.notes = notes;
    }

    public HashMap<String, Integer> getScores() {
        return scores;
    }

    public void setScores(HashMap<String, Integer> scores) {
        this.scores = scores;
    }
}
