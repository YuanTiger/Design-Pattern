package com.my.designdemo.design.factory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午3:05
 * E-Mail:mengyuanzz@126.com
 * Desc  :奔驰E260制造厂，多工厂模式
 */

public class BenzE260LFactory extends CarFactory {
    @Override
    public CarProduct createProduct() {
        return new BenzE260L();
    }
}
