package com.praveen.testsuite.external.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllPhotosRequest implements AbstractExternalRequest{
    @JsonProperty
    private String userId;

    public AllPhotosRequest() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
