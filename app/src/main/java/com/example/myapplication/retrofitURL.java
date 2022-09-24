package com.example.myapplication;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface retrofitURL {

    OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build();


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.35.111:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build();
}
