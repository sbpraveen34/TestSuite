package com.praveen.testsuite.external;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.praveen.testsuite.external.requests.AbstractExternalRequest;
import com.praveen.testsuite.external.response.AbstractExternalResponse;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

public abstract class AbstractExternalRequestProcessor<Request extends AbstractExternalRequest, Response extends AbstractExternalResponse> {



    public static final OkHttpClient client = new OkHttpClient.Builder()
            .connectionPool(
                    new ConnectionPool(128, 5, TimeUnit.MILLISECONDS))
            .connectTimeout(1, TimeUnit.SECONDS)
            .build();

    public static final ObjectMapper mapper = new ObjectMapper();
    public static final String PORT = "80";
    public static final String PROTOCOL = "http://";
    public static final String SEPARATOR = ":";
    public static final String HOST = "picgrader.com";



    static {
        mapper.registerModule(new Jdk8Module());
    }

    public abstract Response execute(Request request) throws Exception;
}
