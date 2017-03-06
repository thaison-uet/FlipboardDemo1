package com.thaison.flipboarddemo.view.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.interfaces.ILogInDialog;

/**
 * Created by H81 on 3/1/2017.
 */

public class LogInDialog extends Dialog implements View.OnClickListener {
    private ILogInDialog iLogInDialog;
    private static final String TAG = LogInDialog.class.getSimpleName();

    public LogInDialog(Context context) {
        super(context);
        init();
    }

    private void init() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_log_in);
        findViewById(R.id.btn_email).setOnClickListener(this);
        findViewById(R.id.btn_google).setOnClickListener(this);
        findViewById(R.id.btn_facebook).setOnClickListener(this);
        findViewById(R.id.btn_twitter).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_email:
                iLogInDialog.logIn(((Button) findViewById(R.id.btn_email)).getText().toString());
                break;

            case R.id.btn_google:
                iLogInDialog.logIn(((Button) findViewById(R.id.btn_google)).getText().toString());
                break;

            case R.id.btn_facebook:
                iLogInDialog.logIn(((Button) findViewById(R.id.btn_facebook)).getText().toString());
                break;

            case R.id.btn_twitter:
                iLogInDialog.logIn(((Button) findViewById(R.id.btn_twitter)).getText().toString());
                break;
        }
    }

    public void setILogInDialog(ILogInDialog iLogInDialog) {
        this.iLogInDialog = iLogInDialog;
    }
}
