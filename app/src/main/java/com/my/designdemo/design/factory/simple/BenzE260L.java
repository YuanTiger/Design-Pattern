package com.my.designdemo.design.factory.simple;

import android.util.Log;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:53
 * E-Mail:mengyuanzz@126.com
 * Desc  :奔驰E260L功能细节
 */

public class BenzE260L implements CarProduct {
    @Override
    public void drive() {
        Log.i("factory","奔驰E260L，弹射起步！");
    }

    @Override
    public void openHeadlamps() {
        Log.i("factory","奔驰E260L，标配大灯打开。");
    }
}
