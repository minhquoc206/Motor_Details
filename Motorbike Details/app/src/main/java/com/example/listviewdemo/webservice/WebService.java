package com.example.listviewdemo.webservice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebService {

    private static WebService instance;

    private Retrofit retrofit;

    private GorestService gorestService;

    private WebService() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        retrofit = new Retrofit.Builder()
                .baseUrl("https://gorest.co.in")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(OkHttpClientFactory.getInstance().buildOkHttpClient())
                .build();
    }

    public static WebService getInstance() {
        if (instance == null) {
            instance = new WebService();
        }
        return instance;
    }

    public GorestService getGorestService() {
        if (gorestService == null) {
            gorestService = retrofit.create(GorestService.class);
        }
        return gorestService;
    }
}
