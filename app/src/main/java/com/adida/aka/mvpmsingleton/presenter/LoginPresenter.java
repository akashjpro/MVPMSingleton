package com.adida.aka.mvpmsingleton.presenter;

import com.adida.aka.mvpmsingleton.manager.UserManager;

/**
 * Created by Aka on 7/15/2017.
 */

public class LoginPresenter {
    public LoginPresenter(){
        UserManager.getmInstance().addUser("Ha", "12345");
    }

    public boolean login(String username, String password){
        return UserManager.getmInstance().validateUser(username, password);
    }
}
