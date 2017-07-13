package com.my.designdemo.single.simple;

/**
 * Author：mengyuan
 * Date  : 2017/6/30下午6:05
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class 饿汉式 {
    private static final 饿汉式 ourInstance = new 饿汉式();

    public static 饿汉式 getInstance() {
        return ourInstance;
    }

    private 饿汉式() {
    }


}
