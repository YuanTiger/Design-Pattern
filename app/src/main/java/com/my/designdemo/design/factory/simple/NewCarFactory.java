package com.my.designdemo.design.factory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午2:58
 * E-Mail:mengyuanzz@126.com
 * Desc  :泛型实现的工厂抽象
 */

public abstract class NewCarFactory {
    /**
     * 利用泛型来决定要生成的具体商品
     *
     * @param clz 具体商品的类名class
     * @param <T> 具体商品的类名
     * @return 具体商品类
     */
    public abstract <T extends CarProduct> T createProduct(Class<T> clz);
}
