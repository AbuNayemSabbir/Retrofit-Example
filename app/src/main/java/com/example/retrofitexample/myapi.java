package com.example.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface myapi {

    @GET("posts")
    Call<List<model>> getmodels();
}
