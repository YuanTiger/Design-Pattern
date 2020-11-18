package com.my.designdemo.design.strategy;

import com.my.designdemo.Constant;
import com.my.designdemo.design.strategy.simple.CalculateStrategyBus;
import com.my.designdemo.design.strategy.simple.CalculateStrategy;
import com.my.designdemo.design.strategy.simple.CalculateStrategySubway;
import com.my.designdemo.design.strategy.simple.CalculateStrategyTax;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午5:40
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class CalculateStrategyController {

    /**
     * 根据出行方式，选择距离的计算方法
     */
    public static float calculatePrice(int km, int typeMode) {
        CalculateStrategy caculate = null;
        switch (typeMode) {
            case Constant.TYPE_BUS:
                caculate = new CalculateStrategyBus();
                break;
            case Constant.TYPE_SUBWAY:
                caculate = new CalculateStrategySubway();
                break;
            case Constant.TYPE_TAX:
                caculate = new CalculateStrategyTax();
                break;
        }
        assert caculate != null;
        return caculate.calculatePrice(km);

    }
}
