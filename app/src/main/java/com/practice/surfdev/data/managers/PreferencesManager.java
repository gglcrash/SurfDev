package com.practice.surfdev.data.managers;

import android.content.SharedPreferences;
import android.net.Uri;

import com.practice.surfdev.utils.ConstantManager;
import com.practice.surfdev.utils.SurfdevApplication;


public class PreferencesManager {
    private SharedPreferences mSharedPreferences;


    public PreferencesManager(){
        this.mSharedPreferences= SurfdevApplication.getSharedPreferences();
    }

// example

    public void saveSomePhoto(Uri uri){
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        //editor.putString(ConstantManager.USER_PHOTO_KEY,uri.toString());
        editor.putString("my photo",uri.toString());
        editor.apply();
    }

    public Uri loadSomePhoto(){
       /* return Uri.parse(mSharedPreferences.getString(ConstantManager.USER_PHOTO_KEY,
                "android.resource://com.practice.surfdev/drawable/user_photo"));*/

        return Uri.parse(mSharedPreferences.getString("my photo",
                "android.resource://com.practice.surfdev/drawable/some_photo"));
    }
}
