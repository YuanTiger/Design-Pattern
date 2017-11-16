package com.my.designdemo.design.single.thread;

import com.my.designdemo.design.single.simple.最简单的懒汉式;

/**
 * Author：mengyuan
 * Date  : 2017/7/3下午5:25
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public abstract class EasyTrainThread implements Runnable {
    @Override
    public void run() {
        sendHandler(最简单的懒汉式.getInstance().toString());
    }

    public abstract void sendHandler(String className);
}
