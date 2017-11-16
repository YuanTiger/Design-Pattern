package com.my.designdemo.design.state.simple;

import android.widget.Toast;

import com.my.designdemo.App;

/**
 * Author：mengyuan
 * Date  : 2017/11/14下午5:23
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class LoginStateImpl implements UserState {
    @Override
    public void login() {
        Toast.makeText(App.context, "您已经登录了，无需登录！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void logout() {

        Toast.makeText(App.context, "退出登录成功！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void seeMoney() {
        Toast.makeText(App.context, "您目前有100金币", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void earnMoney() {
        Toast.makeText(App.context, "跳转到-赚金币", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void exchange() {
        Toast.makeText(App.context, "跳转到-兑换道具", Toast.LENGTH_SHORT).show();
    }
}
