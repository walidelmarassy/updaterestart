package com.example.updaterestart.View;

import android.support.annotation.NonNull;
import android.util.Log;


import com.example.updaterestart.Model.Food;
import com.example.updaterestart.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePresenter {

    private Homeview view;

    public HomePresenter(Homeview view) {

        this.view = view;
    }
    void getHotspots() {

        view.showLoading();

        Call<Food> hotSpotCall = Utils.getApi().getHotspot();

        hotSpotCall.enqueue(new Callback<Food>() {
            @Override
            public void onResponse(@NonNull Call<Food> call, @NonNull Response<Food> response) {
                view.hideLoading();

                if (response.isSuccessful() && response.body() != null) {

                    Log.i("**********", "response: " + response);

                    Log.i("**********", "body: " + response.body());

                    Log.i("**********", "getData: " + response.body().getData());

                    Log.i("**********", "getData: " + response.body().getData());

                    Log.i("++++++++++++", "getHotSpots ++" + response.body().getData().getHotSpots());

                    view.setHotspots(response.body().getData().getHotSpots());

/*
                    Log.d("******", "getHotSpots: "+bodyHotspot);
*/
                    //view.setHotspots(response.body().getDescription().toString());//

                }
                else {

                    view.onErrorLoading(response.message());

                }
            }



            @Override
            public void onFailure(@NonNull Call<Food> call,@NonNull Throwable t) {
                /*
                 * Failure will be thrown here
                 * for this you must do
                 * 1. closes loading
                 * 2. displays an error message
                 */

                view.hideLoading();

                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }
    void getEvents() {
        view.showLoading();
        Call<Food> eventCall = Utils.getApi().getevent();

        eventCall.enqueue(new Callback<Food>() {
            @Override
            public void onResponse(@NonNull Call<Food> call, @NonNull Response<Food> response) {
                view.hideLoading();

                if (response.isSuccessful() && response.body() != null) {
                    view.setEveents(response.body().getData().getEvents());



                }
                else {

                    view.onErrorLoading(response.message());

                }
            }



            @Override
            public void onFailure(@NonNull Call<Food> call,@NonNull Throwable t) {
                /*
                 * Failure will be thrown here
                 * for this you must do
                 * 1. closes loading
                 * 2. displays an error message
                 */

                view.hideLoading();

                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }
    void getAttractions() {
        view.showLoading();
        Call<Food>attractionCall = Utils.getApi().getattraction();

        attractionCall.enqueue(new Callback<Food>() {
            @Override
            public void onResponse(@NonNull Call<Food> call, @NonNull Response<Food> response) {
                view.hideLoading();

                if (response.isSuccessful() && response.body() != null) {
                    view.setAttractions(response.body().getData().getAttractions());



                }
                else {

                    view.onErrorLoading(response.message());

                }
            }



            @Override
            public void onFailure(@NonNull Call<Food> call,@NonNull Throwable t) {
                /*
                 * Failure will be thrown here
                 * for this you must do
                 * 1. closes loading
                 * 2. displays an error message
                 */

                view.hideLoading();

                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }





}
