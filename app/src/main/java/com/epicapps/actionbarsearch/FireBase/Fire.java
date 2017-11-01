package com.epicapps.actionbarsearch.FireBase;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by fidenz on 10/19/17.
 */

public class Fire extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }


}
