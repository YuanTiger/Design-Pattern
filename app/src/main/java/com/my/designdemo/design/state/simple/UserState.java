package com.my.designdemo.design.state.simple;

/**
 * Author：mengyuan
 * Date  : 2017/11/14下午5:16
 * E-Mail:mengyuanzz@126.com
 * Desc  :状态模式-用户登录状态抽象
 */

public interface UserState {

    //登录
    void login();

    //登出
    void logout();

    //查询余额
    void seeMoney();

    //赚金币
    void earnMoney();

    //兑换道具
    void exchange();
}
