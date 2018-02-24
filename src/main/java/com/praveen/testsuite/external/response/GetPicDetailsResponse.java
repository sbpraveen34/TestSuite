package com.praveen.testsuite.external.response;


public class GetPicDetailsResponse implements AbstractExternalResponse {
    public int code;

    public GetPicDetailsResponse() {

    }
    public GetPicDetailsResponse(int code) {
        this.code = code;
    }
}
