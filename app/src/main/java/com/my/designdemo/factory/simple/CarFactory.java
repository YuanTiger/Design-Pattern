package com.my.designdemo.factory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:58
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public abstract class CarFactory {

    /**
     * 创建CarProduct
     *
     * @return CarProduct
     */
    public abstract CarProduct createProduct();
}
