package com.felix.atoast;

import com.felix.atoast.library.AToast;

import android.app.Application;

/**
 * Created by chaichuanfa on 17/6/2.
 */

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        AToast.onInit(this);
//        AToast.onInit(this, new AToastConfig.Builder().error_color(Color.RED).info_color(Color.BLUE)
//                .normal_color(Color.GRAY).text_color(Color.WHITE).build());
    }
}
