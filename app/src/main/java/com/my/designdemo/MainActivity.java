package com.my.designdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.my.designdemo.builder.BuilderActivity;
import com.my.designdemo.single.SingleActivity;


/**
 * Author：mengyuan
 * Date  : 2017/6/29下午4:43
 * E-Mail:mengyuanzz@126.com
 * Desc  :所有 设计模式的demo演示
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_single).setOnClickListener(this);
        findViewById(R.id.bt_build).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.bt_single:
                intent = new Intent(this, SingleActivity.class);
                break;
            case R.id.bt_build:
                intent = new Intent(this, BuilderActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
