package com.praveen.testsuite.external;

import com.praveen.testsuite.external.requests.RatePhotoRequest;
import com.praveen.testsuite.external.response.RatePhotoResponse;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RatePhoto extends AbstractExternalRequestProcessor<RatePhotoRequest, RatePhotoResponse> {
    private static final String PATH = "/user/photo/photoRating/";

    @Override
    public RatePhotoResponse execute(RatePhotoRequest request) throws Exception {
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                mapper.writeValueAsString(request)
        );
        Request httpRequest = new Request.Builder()
                .url(PROTOCOL+HOST+SEPARATOR+PORT+PATH)
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();

        Response httpResponse = client.newCall(httpRequest).execute();

        RatePhotoResponse response = new RatePhotoResponse();

        return response;
    }
}
