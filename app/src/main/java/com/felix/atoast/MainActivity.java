package com.felix.atoast;

import com.felix.atoast.library.AToast;
import com.felix.atoast.library.LoadToast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private LoadToast lt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lt = AToast.loadToast(this, "loading...");
    }

    public void toastNormal(View view) {
        AToast.normal("normal");
    }

    public void toastWarn(View view) {
        AToast.warning("warning");
    }

    public void toastInfo(View view) {
        AToast.info("info");
    }

    public void toastSuccess(View view) {
        AToast.success("success");
    }

    public void toastError(View view) {
        AToast.error("error");
    }

    public void success(View view) {
        lt.success();
    }

    public void show(View view) {
        lt.show();
    }

    public void error(View view) {
        lt.error();
    }
}
