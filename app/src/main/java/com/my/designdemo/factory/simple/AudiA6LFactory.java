package com.my.designdemo.factory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午3:05
 * E-Mail:mengyuanzz@126.com
 * Desc  :奥迪A6L制造厂，多工厂模式
 */

public class AudiA6LFactory extends CarFactory {
    @Override
    public CarProduct createProduct() {
        return new AudiA6L();
    }
}
