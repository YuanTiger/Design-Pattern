package com.my.designdemo.strategy.simple;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午5:36
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class SubwayStrategyCaculate implements StrategyCaculate {
    @Override
    public float caculatePrice(int km) {
        if (km <= 0) {
            return 0;
        }
        if (km <= 5) {
            return 3;
        }
        if (km <= 10) {
            return 4;
        }
        if (km <= 15) {
            return 5;
        }
        return 6;
    }
}
