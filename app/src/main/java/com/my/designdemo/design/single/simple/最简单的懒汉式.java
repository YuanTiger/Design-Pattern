package com.my.designdemo.design.single.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/3下午3:55
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class 最简单的懒汉式 {
    //全项目唯一的对象
    private static 最简单的懒汉式 ourInstance;

    //构造方法私有化
    private 最简单的懒汉式() {

    }

    //通过静态方法来返回对象
    public static 最简单的懒汉式 getInstance() {
        //在调用该方法时进行判空，在对象为null时创建对象
        if (ourInstance == null) {
            ourInstance = new 最简单的懒汉式();
        }
        return ourInstance;
    }
}
