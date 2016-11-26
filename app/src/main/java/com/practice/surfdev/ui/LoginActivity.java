package com.practice.surfdev.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.widget.EditText;

import com.practice.surfdev.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity{

    @BindView(R.id.login_email)
    EditText mLogin;
    @BindView(R.id.login_password)
    EditText mPassword;
    @BindView(R.id.main_coordinator_layout)
    CoordinatorLayout mCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_btn)
    public void onLoginBtnClick(){

        if(mLogin.getText().toString().equals("admin") && mPassword.getText().toString().equals("admin")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else{
            showSnackBar(getString(R.string.try_again));
        }
    }

    @OnClick(R.id.lost_password)
    public void onForgetPasswordClick(){
        Intent rememberIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.ru"));
        startActivity(rememberIntent);
    }

    @OnClick(R.id.skip_login)
    public void onSkipClick(){
        Intent mainIntent = new Intent(this,MainActivity.class);
        startActivity(mainIntent);
    }

    private void showSnackBar(String message){
        Snackbar.make(mCoordinatorLayout,message,Snackbar.LENGTH_LONG).show();
    }

}
