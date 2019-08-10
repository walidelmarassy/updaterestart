package com.example.updaterestart.Api;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeClient {
    private static final String BASE_URL = "http://tourista.167.99.5.134.xip.io/api/";

    public static Retrofit getHomeClient(){

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(provideOkHttp())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
    private static Interceptor provideLoggingInterceptor() {
        return new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    private static OkHttpClient provideOkHttp() {
        return new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addNetworkInterceptor(provideLoggingInterceptor())
                .build();
    }




}

