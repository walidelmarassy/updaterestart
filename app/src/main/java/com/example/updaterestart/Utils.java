package com.example.updaterestart;

import android.app.AlertDialog;
import android.content.Context;

import com.example.updaterestart.Api.HomeApi;
import com.example.updaterestart.Api.HomeClient;


public class Utils {
    public static HomeApi getApi() {
        return HomeClient.getHomeClient().create(HomeApi.class);
    }

    public static AlertDialog showDialogMessage(Context context, String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(title).setMessage(message).show();
        if (alertDialog.isShowing()) {
            alertDialog.cancel();
        }
        return alertDialog;
    }
}
