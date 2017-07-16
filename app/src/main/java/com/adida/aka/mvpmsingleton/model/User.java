package com.adida.aka.mvpmsingleton.model;

/**
 * Created by Aka on 7/15/2017.
 */

public class User {
    private String mId;
    private String mUsername;
    private String mPassword;

    public User() {
    }

    public User(String mUsername, String mPassword) {
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }

    public User(String mId, String mUsername, String mPassword) {
        this.mId = mId;
        this.mUsername = mUsername;
        this.mPassword = mPassword;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
}
