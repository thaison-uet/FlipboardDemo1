package com.thaison.flipboarddemo.view.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.thaison.flipboarddemo.R;
import com.thaison.flipboarddemo.controler.interfaces.IProfileDialog;

/**
 * Created by H81 on 3/1/2017.
 */

public class ProfileDialog extends Dialog implements View.OnClickListener, Runnable {
    private static final int UPDATE_BUTTON_TEXT_COLOR = 0;
    private static final String TAG = ProfileDialog.class.getSimpleName();
    private EditText edtFullName;
    private EditText edtUsername;
    private Button btnNext;
    private IProfileDialog iProfileDialog;

    private Thread thread;
    private Handler handler;

    private boolean isFilled = false;

    public ProfileDialog(Context context) {
        super(context);
        init();
    }

    private void init() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_profile);
        edtFullName = (EditText) findViewById(R.id.edt_full_name);
        edtUsername = (EditText) findViewById(R.id.edt_username);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(this);

        thread = new Thread(this);
        thread.start();
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case UPDATE_BUTTON_TEXT_COLOR:
                        btnNext.setTextColor(Color.WHITE);
                        isFilled = true;
                        break;
                }
            }
        };
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_next:
                if (isFilled) {
                Log.i(TAG, "NEXT");
                iProfileDialog.setNext();
                }
                break;
        }
    }

    @Override
    public void run() {
        while (true) {
            if (!edtFullName.getText().toString().equals("") && !edtUsername.getText().toString().equals("")) {
                Message message = new Message();
                message.what = UPDATE_BUTTON_TEXT_COLOR;
                message.setTarget(handler);
                message.sendToTarget();
            }
        }
    }

    public void setIProfileDialog(IProfileDialog iProfileDialog) {
        this.iProfileDialog = iProfileDialog;
    }
}
