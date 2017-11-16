package com.my.designdemo.design.factory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:58
 * E-Mail:mengyuanzz@126.com
 * Desc  :多工厂方法模式-抽象工厂
 */

public abstract class CarFactory {

    /**
     * 创建CarProduct
     *
     * @return CarProduct
     */
    public abstract CarProduct createProduct();
}
