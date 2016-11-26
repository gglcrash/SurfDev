package com.practice.surfdev.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SurfdevApplication extends Application {

    private static SharedPreferences sSharedPreferences;
    private static Context sContext;


    @Override
    public void onCreate() {
        super.onCreate();

        sSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        sContext = getApplicationContext();
    }

    public static SharedPreferences getSharedPreferences(){
        return sSharedPreferences;
    }

    public static Context getContext() {
        return sContext;
    }
}

