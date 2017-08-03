package com.my.designdemo.strategy;

import com.my.designdemo.Constant;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午1:53
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public enum TripMode {


    BUS(Constant.TYPE_BUS, "公交汽车"),

    SUBWAY(Constant.TYPE_SUBWAY, "地铁"),

    TAX(Constant.TYPE_TAX, "出租车");

    private int tripType;
    private String tripName;



    TripMode(int i, String name) {

        tripType = i;
        tripName = name;
    }

    public int getType() {

        return tripType;
    }

    public String getTripName() {

        return tripName;
    }
}
