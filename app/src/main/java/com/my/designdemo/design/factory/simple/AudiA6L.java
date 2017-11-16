package com.my.designdemo.design.factory.simple;

import android.util.Log;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:51
 * E-Mail:mengyuanzz@126.com
 * Desc  :奥迪A6L功能细节
 */

public class AudiA6L implements CarProduct{
    @Override
    public void drive() {
        Log.i("factory","奥迪A6L，平稳起步。");
    }

    @Override
    public void openHeadlamps() {
        Log.i("factory","奥迪A6L，尊享华丽大灯打开！");
    }
}
