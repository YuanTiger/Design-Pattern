package com.my.designdemo.strategy.simple;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午5:34
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public interface StrategyCaculate {

    /**
     * 根据距离计算价格
     */
    float caculatePrice(int km);
}
