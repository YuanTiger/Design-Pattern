package com.my.designdemo.state.simple;

import android.widget.Toast;

import com.my.designdemo.App;

/**
 * Author：mengyuan
 * Date  : 2017/11/14下午5:23
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class LogutStateImpl implements UserState {
    @Override
    public void login() {
        Toast.makeText(App.context, "登录成功！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void logout() {

        Toast.makeText(App.context, "您还未登录！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void seeMoney() {
        Toast.makeText(App.context, "您还未登录！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void earnMoney() {
        Toast.makeText(App.context, "跳转到-赚金币-未登录状态", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void exchange() {
        Toast.makeText(App.context, "您还未登录！", Toast.LENGTH_SHORT).show();
    }
}
