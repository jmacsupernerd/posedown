package com.example.joshuamcwilliams.posedown;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by joshuamcwilliams on 1/16/16.
 */
public class ViewPhotosByPose extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_photos_by_pose);
        String poseTag = getIntent().getStringExtra("poseTag");
        setTitle(Utils.getNameByTag(poseTag));
    }
}
