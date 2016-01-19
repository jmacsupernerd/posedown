package com.example.joshuamcwilliams.posedown;

import android.app.Application;

import com.example.joshuamcwilliams.posedown.database.Poses;

import io.realm.Realm;

/**
 * Created by joshuamcwilliams on 1/15/16.
 */
public class PosedownApplication extends Application {
    private Boolean isFirstTime = Boolean.TRUE;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
