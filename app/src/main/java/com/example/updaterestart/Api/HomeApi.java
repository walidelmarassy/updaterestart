package com.example.updaterestart.Api;


import com.example.updaterestart.Model.Food;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HomeApi {
    @GET("home")
    Call<Food> getHotspot();

    /*Call<HotSpot>getHotspot();*/
    @GET("home")
    Call<Food>getevent();
    @GET("home")
    Call<Food>getattraction();

}
