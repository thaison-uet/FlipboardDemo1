package com.thaison.flipboarddemo.view.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.interfaces.ILogInDialog;
import com.thaison.flipboarddemo.controler.interfaces.IProfileDialog;
import com.thaison.flipboarddemo.controler.interfaces.ISignUpDialog;
import com.thaison.flipboarddemo.view.dialogs.LogInDialog;
import com.thaison.flipboarddemo.view.dialogs.ProfileDialog;
import com.thaison.flipboarddemo.view.dialogs.SignUpDialog;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener, ILogInDialog,
        ISignUpDialog, IProfileDialog {
    private TextView tvLogIn;
    private Button btnSignOut;
    private LogInDialog logInDialog;
    private SignUpDialog signUpDialog;
    private ProfileDialog profileDialog;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initViews();
    }

    private void initViews() {
        tvLogIn = (TextView) findViewById(R.id.tv_log_in);
        tvLogIn.setOnClickListener(this);

        btnSignOut = (Button) findViewById(R.id.btn_sign_up);
        btnSignOut.setOnClickListener(this);

        logInDialog = new LogInDialog(this);
        logInDialog.setILogInDialog(this);
        logInDialog.setCanceledOnTouchOutside(false);

        signUpDialog = new SignUpDialog(this);
        signUpDialog.setISignUpDialog(this);
        signUpDialog.setCanceledOnTouchOutside(false);

        profileDialog = new ProfileDialog(this);
        profileDialog.setIProfileDialog(this);
        profileDialog.setCanceledOnTouchOutside(false);
    }

    @Override
    public void onClick(View v) {
        Window window;
        WindowManager.LayoutParams params;
        switch (v.getId()) {
            case R.id.tv_log_in:
                window = logInDialog.getWindow();
                params = window.getAttributes();
                params.gravity = Gravity.BOTTOM;
                params.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
                window.setAttributes(params);

                logInDialog.getWindow().setLayout(RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                logInDialog.show();
                break;

            case R.id.btn_sign_up:
                window = signUpDialog.getWindow();
                params = window.getAttributes();
                params.gravity = Gravity.BOTTOM;
                params.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
                window.setAttributes(params);

                signUpDialog.getWindow().setLayout(RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                signUpDialog.show();
                break;
        }
    }

    @Override
    public void logIn(String loginName) {
        Toast.makeText(this, "Log in with " + loginName, Toast.LENGTH_SHORT).show();
        logInDialog.hide();
//        profileDialog.setIProfileDialog(this);
//        profileDialog.setCanceledOnTouchOutside(false);

        Window window = profileDialog.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.gravity = Gravity.BOTTOM;
        params.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setAttributes(params);

        profileDialog.getWindow().setLayout(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        profileDialog.show();
    }

    @Override
    public void signUp(String signUpName) {
        Toast.makeText(this, "Log in with " + signUpName, Toast.LENGTH_SHORT).show();
        signUpDialog.hide();

        Window window = profileDialog.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.gravity = Gravity.BOTTOM;
        params.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setAttributes(params);

        profileDialog.getWindow().setLayout(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        profileDialog.show();
    }

    @Override
    public void setNext() {
        Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
