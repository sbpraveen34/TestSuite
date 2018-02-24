package com.praveen.testsuite.external;

import com.praveen.testsuite.external.requests.NextPhotoRequest;
import com.praveen.testsuite.external.response.NextPhotoResponse;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GetNextPhoto extends AbstractExternalRequestProcessor<NextPhotoRequest, NextPhotoResponse> {

    private static final String PATH = "/user/photo/getNextPhoto/";

    @Override
    public NextPhotoResponse execute(NextPhotoRequest request) throws Exception {
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

        NextPhotoResponse response = new NextPhotoResponse();

        return response;
    }
}
