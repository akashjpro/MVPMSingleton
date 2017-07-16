package com.adida.aka.mvpmsingleton.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.adida.aka.mvpmsingleton.R;
import com.adida.aka.mvpmsingleton.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEdtUsername, mEdtPassword;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEdtUsername = (EditText) findViewById(R.id.edt_username);
        mEdtPassword = (EditText) findViewById(R.id.edt_password);
        findViewById(R.id.btn_login).setOnClickListener(this);

        mLoginPresenter = new LoginPresenter();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                login();
                break;
        }
    }

    private void login() {
        String user = mEdtUsername.getText().toString();
        String pass = mEdtPassword.getText().toString();
        boolean result = mLoginPresenter.login(user, pass);
        if (result){
            Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,
                    "Please check username or password try again!!!",
                    Toast.LENGTH_SHORT
                    ).show();
        }
    }
}
