package socket.my.com.designdemo.single.thread;

import socket.my.com.designdemo.single.simple.最简单的懒汉式;

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
