package com.felix.atoast;

import com.felix.atoast.library.AToast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AToast.onInit(this);
    }

    public void toastNormal(View view){
        AToast.normal("normal");
    }

    public void toastWarn(View view){
        AToast.warning("warning");
    }

    public void toastInfo(View view){
        AToast.info("info");
    }

    public void toastSuccess(View view){
        AToast.success("success");
    }

    public void toastError(View view){
        AToast.error("error");
    }
}
