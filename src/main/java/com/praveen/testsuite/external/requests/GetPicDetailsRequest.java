package com.praveen.testsuite.external.requests;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPicDetailsRequest implements AbstractExternalRequest {

    @JsonProperty("photoId")
    public final String photoId;

    public GetPicDetailsRequest(String photoId) {
        this.photoId = photoId;
    }
}
