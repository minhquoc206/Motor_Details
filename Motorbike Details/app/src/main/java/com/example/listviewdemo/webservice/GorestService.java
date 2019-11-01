package com.example.listviewdemo.webservice;

import com.example.listviewdemo.schemes.UserRequestBody;
import com.example.listviewdemo.schemes.UserResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GorestService {

    @GET("/public-api/users?_format=json&access-token=PgZKGz_NxrJsseR5enDqGQ8Jpq7Be-m6Z8AA")
    Call<UserResult> getUsers(@Query("page") int page);

    @POST("/public-api/users")
    Call<Void> createUser(@Body UserRequestBody body);
}
