package com.my.designdemo.factory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午3:44
 * E-Mail:mengyuanzz@126.com
 * Desc  :泛型、反射实现的工厂细节
 */

public class CarConcreteFactory extends NewCarFactory {

    @Override
    public <T extends CarProduct> T createProduct(Class<T> clz) {
        CarProduct product = null;
        try {
            product = (CarProduct) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
