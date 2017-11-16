package com.my.designdemo.design.state;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.my.designdemo.R;
import com.my.designdemo.design.state.simple.LoginStateImpl;
import com.my.designdemo.design.state.simple.LogutStateImpl;
import com.my.designdemo.design.state.simple.UserState;


/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:43
 * E-Mail:mengyuanzz@126.com
 * Desc  :状态模式
 */

public class StateActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        findViewById(R.id.bt_login).setOnClickListener(this);
        findViewById(R.id.bt_logout).setOnClickListener(this);
        findViewById(R.id.bt_see_money).setOnClickListener(this);
        findViewById(R.id.bt_earn_money).setOnClickListener(this);
        findViewById(R.id.bt_exchange).setOnClickListener(this);
    }

    //默认是未登录状态
    private UserState userState = new LogutStateImpl();

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login://登录行为
                userState.login();
                //核心：更换用户状态
                userState = new LoginStateImpl();
                break;
            case R.id.bt_logout://退出登录行为
                userState.logout();
                userState = new LogutStateImpl();
                break;
            case R.id.bt_see_money://查看余额行为
                userState.seeMoney();
                break;
            case R.id.bt_earn_money://赚取金币行为
                userState.earnMoney();
                break;
            case R.id.bt_exchange://兑换行为
                userState.exchange();
                break;
        }

    }
}
