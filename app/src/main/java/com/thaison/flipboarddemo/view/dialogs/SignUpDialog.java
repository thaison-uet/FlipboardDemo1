package com.thaison.flipboarddemo.view.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.interfaces.ISignUpDialog;

/**
 * Created by H81 on 3/2/2017.
 */

public class SignUpDialog extends Dialog implements View.OnClickListener {
    private ISignUpDialog iSignUpDialog;

    public SignUpDialog(Context context) {
        super(context);
        init();
    }

    private void init() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_sign_up);
        findViewById(R.id.btn_email).setOnClickListener(this);
        findViewById(R.id.btn_google).setOnClickListener(this);
        findViewById(R.id.btn_facebook).setOnClickListener(this);
        findViewById(R.id.btn_twitter).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_email:
                iSignUpDialog.signUp(((Button) findViewById(R.id.btn_email)).getText().toString());
                break;

            case R.id.btn_google:
                iSignUpDialog.signUp(((Button) findViewById(R.id.btn_google)).getText().toString());
                break;

            case R.id.btn_facebook:
                iSignUpDialog.signUp(((Button) findViewById(R.id.btn_facebook)).getText().toString());
                break;

            case R.id.btn_twitter:
                iSignUpDialog.signUp(((Button) findViewById(R.id.btn_twitter)).getText().toString());
                break;
        }
    }

    public void setISignUpDialog(ISignUpDialog iSignUpDialog) {
        this.iSignUpDialog = iSignUpDialog;
    }
}
