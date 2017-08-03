package com.my.designdemo.strategy;

import com.my.designdemo.Constant;
import com.my.designdemo.strategy.simple.BusStrategyCaculate;
import com.my.designdemo.strategy.simple.StrategyCaculate;
import com.my.designdemo.strategy.simple.SubwayStrategyCaculate;
import com.my.designdemo.strategy.simple.TaxStrategyCaculate;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午5:40
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class StrategyCaculateController {

    /**
     * 根据出行方式，选择距离的计算方法
     */
    public static float cacluatePrice(int km, int typeMode) {
        StrategyCaculate caculate = null;
        switch (typeMode) {
            case Constant.TYPE_BUS:
                caculate = new BusStrategyCaculate();
                break;
            case Constant.TYPE_SUBWAY:
                caculate = new SubwayStrategyCaculate();
                break;
            case Constant.TYPE_TAX:
                caculate = new TaxStrategyCaculate();
                break;
        }
        assert caculate != null;
        return caculate.caculatePrice(km);

    }
}
