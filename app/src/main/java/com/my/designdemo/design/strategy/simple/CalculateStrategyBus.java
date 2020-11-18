package com.my.designdemo.design.strategy.simple;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午5:36
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class CalculateStrategyBus implements CalculateStrategy {
    @Override
    public float calculatePrice(int km) {
        if (km <= 0) {
            return 0;
        }
        if (km <= 5) {
            return 2;
        }
        if (km <= 10) {
            return 3;
        }
        return 4;
    }
}
