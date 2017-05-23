package com.example.joshuamcwilliams.posedown

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by joshuamcwilliams on 1/16/16.
 */
class ViewPhotosByPose : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_photos_by_pose)
        val poseTag = intent.getStringExtra("poseTag")
        title = Utils.getNameByTag(poseTag)

        val fab = findViewById(R.id.fabAddNewPicture);
        fab.setOnClickListener{
            val goToAdd = Intent(this, AddPose::class.java)
            startActivity(goToAdd)
        }
    }
}
