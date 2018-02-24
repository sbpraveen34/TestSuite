package com.praveen.testsuite.external;

import com.fasterxml.jackson.databind.JsonNode;
import com.praveen.testsuite.external.requests.AllPhotosRequest;
import com.praveen.testsuite.external.response.AllPhotosResponse;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AllMyPhotos extends AbstractExternalRequestProcessor<AllPhotosRequest, AllPhotosResponse> {

    private static final String PATH = "/user/photo/myPhotos/";

    @Override
    public AllPhotosResponse execute(AllPhotosRequest request) throws Exception {
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                mapper.writeValueAsString(request)
        );
        Request httpRequest = new Request.Builder()
                .url(PROTOCOL + HOST + SEPARATOR + PORT + PATH)
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();

        Response httpResponse = client.newCall(httpRequest).execute();

        JsonNode node = mapper.readTree(httpResponse.body().string());

        return mapper.readValue(node.asText(), AllPhotosResponse.class);

    }
//    public static void main(String arg[]) throws Exception {
//        AllMyPhotos photos = new AllMyPhotos();
//
//        AllPhotosRequest request = new AllPhotosRequest();
//        request.setUserId("uPyEnXdfSNgmkDXe27vQDe29tlPVRkj");
//
//        photos.execute(request);
//    }
}
