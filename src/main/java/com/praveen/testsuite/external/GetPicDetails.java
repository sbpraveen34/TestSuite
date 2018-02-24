package com.praveen.testsuite.external;

import com.praveen.testsuite.external.requests.GetPicDetailsRequest;
import com.praveen.testsuite.external.response.GetPicDetailsResponse;
import okhttp3.*;


public class GetPicDetails extends AbstractExternalRequestProcessor<GetPicDetailsRequest, GetPicDetailsResponse> {
    private static final String PATH = "/user/photo/getDetailedRatingForPhotoId/";

    @Override
    public GetPicDetailsResponse execute(GetPicDetailsRequest request) throws Exception {
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

        GetPicDetailsResponse response = new GetPicDetailsResponse(httpResponse.code());

        return response;
    }
}
