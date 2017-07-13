package com.my.designdemo;

import android.app.Application;
import android.content.Context;

/**
 * Author：mengyuan
 * Date  : 2017/6/30下午5:57
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class App extends Application {

    public static Context context;


    @Override
    public void onCreate() {
        super.onCreate();

        context = this;
    }
}
