package com.my.designdemo.factory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/7/24下午3:05
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class BenzE260LFactory extends CarFactory {
    @Override
    public CarProduct createProduct() {
        return new BenzE260L();
    }
}
