package com.example.listviewdemo.webservice;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

public class OkHttpClientFactory {

    private static final int TIMEOUT = 5;
    private static final int TIMEOUT_READ = 5;
    private static final int CACHE_SIZE = Integer.MAX_VALUE;
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String HEADER_AUTHORIZATION_KEY = "Authorization";
    private static final String HEADER_TOKEN_TYPE = "Bearer ";

    private static OkHttpClientFactory instance;

    public static OkHttpClientFactory getInstance() {
        if (instance == null) {
            instance = new OkHttpClientFactory();
        }
        return instance;
    }

    private OkHttpClientFactory() {}

    public OkHttpClient buildOkHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(TIMEOUT, TimeUnit.MINUTES)
                .readTimeout(TIMEOUT_READ, TimeUnit.MINUTES)
                .addInterceptor(logJsonInterceptor)
                .addInterceptor(headerInterceptor)
                .build();
    }

    private static final Interceptor logJsonInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            String requestRaw = request.url().toString() + "\n";
            try {
                final Request copy = request.newBuilder().build();
                final Buffer buffer = new Buffer();
                if (copy != null && copy.body() != null) {
                    copy.body().writeTo(buffer);
                }
                requestRaw += buffer.readUtf8();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Log.d("JSON request", String.format("raw JSON request is: %s", requestRaw));
//        Log.d("Token", Preferences.getInstance().getToken());
            Response response = chain.proceed(request);

//        if (response.body() != null && response.body().contentType() != null && !response.body().contentType().toString().equalsIgnoreCase("application/json;charset=utf-8")) {
//            return response;
//        }
            String rawJson = response.body().string();
            Log.d("JSON response is", String.format("raw JSON response is: %s", rawJson));
            // Re-create the response before returning it because body can be read only once
            return response.newBuilder().body(ResponseBody.create(response.body().contentType(), rawJson)).build();
        }
    };

    private static final Interceptor headerInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            HttpUrl url = chain.request().url()
                    .newBuilder()
                    .build();
            Request.Builder builder = request.newBuilder()
                    .addHeader(HEADER_CONTENT_TYPE, "application/json; charset=utf-8")
                    .url(url);
            String token = HEADER_TOKEN_TYPE + "PgZKGz_NxrJsseR5enDqGQ8Jpq7Be-m6Z8AA";
            builder.addHeader(HEADER_AUTHORIZATION_KEY, token);

            Request newRequest = builder.build();
            return chain.proceed(newRequest);
        }
    };
}
