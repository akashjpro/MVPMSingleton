package com.adida.aka.mvpmsingleton.manager;

import com.adida.aka.mvpmsingleton.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aka on 7/15/2017.
 */

public class UserManager {
    private static UserManager mInstance;
    private List<User> mListUser;

    private UserManager() {
    }

    public static UserManager getmInstance(){
        if (mInstance == null){
            mInstance = new UserManager();
        }
        return mInstance;
    }

    public void addUser(String username, String password){
        if (mListUser == null){
            mListUser = new ArrayList<>();
        }
        mListUser.add(new User(username, password));
    }

    public boolean validateUser(String username, String password){
        for (int i = 0; i < mListUser.size(); i++){
            if (mListUser.get(i).getmUsername().equals(username)
                    && mListUser.get(i).getmPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
