package com.praveen.testsuite.external.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.praveen.testsuite.models.pic.Pic;

import java.util.List;

public class AllPhotosResponse implements AbstractExternalResponse {

    @JsonProperty
    private int status;

    @JsonProperty
    private List<Pic> entity;


}
