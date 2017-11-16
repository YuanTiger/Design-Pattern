package com.my.designdemo.design.factory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:41
 * E-Mail:mengyuanzz@126.com
 * Desc  :汽车功能抽象
 */

public interface CarProduct {
    /**
     * 汽车-通用功能封装
     * 开始驾驶
     */
    void drive();
    /**
     * 汽车-通用功能封装
     * 打开车的大灯
     */
    void openHeadlamps();


    //....省略其他功能


}
