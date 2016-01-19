package com.example.joshuamcwilliams.posedown.database;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by joshuamcwilliams on 1/15/16.
 */
public class Poses extends RealmObject {
    @PrimaryKey
    private int index;
    private String poseName;
    private byte[] image;
    private Date timestamp;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getPoseName() {
        return poseName;
    }

    public void setPoseName(String poseName) {
        this.poseName = poseName;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
