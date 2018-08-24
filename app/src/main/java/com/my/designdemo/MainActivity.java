package com.my.designdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.my.designdemo.design.absfactory.AbsFactoryActivity;
import com.my.designdemo.design.builder.BuilderActivity;
import com.my.designdemo.design.clone.CloneActivity;
import com.my.designdemo.design.factory.FactoryActivity;
import com.my.designdemo.design.responsibility.ResponsibilityActivity;
import com.my.designdemo.design.single.SingleActivity;
import com.my.designdemo.design.state.StateActivity;
import com.my.designdemo.design.strategy.StrategyActivity;


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
        findViewById(R.id.bt_clone).setOnClickListener(this);
        findViewById(R.id.bt_factory).setOnClickListener(this);
        findViewById(R.id.bt_abs_factory).setOnClickListener(this);
        findViewById(R.id.bt_strategy).setOnClickListener(this);
        findViewById(R.id.bt_state).setOnClickListener(this);
        findViewById(R.id.bt_responsibility).setOnClickListener(this);
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
            case R.id.bt_clone:
                intent = new Intent(this, CloneActivity.class);
                break;
            case R.id.bt_factory:
                intent = new Intent(this, FactoryActivity.class);
                break;
            case R.id.bt_abs_factory:
                intent = new Intent(this, AbsFactoryActivity.class);
                break;
            case R.id.bt_strategy:
                intent = new Intent(this, StrategyActivity.class);
                break;
            case R.id.bt_state:
                intent = new Intent(this, StateActivity.class);
                break;
            case R.id.bt_responsibility:
                intent = new Intent(this, ResponsibilityActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
