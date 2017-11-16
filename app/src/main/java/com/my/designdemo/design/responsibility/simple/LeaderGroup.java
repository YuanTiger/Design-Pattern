package com.my.designdemo.design.responsibility.simple;

import android.widget.Toast;

import com.my.designdemo.App;

/**
 * Author：mengyuan
 * Date  : 2017/11/16下午4:44
 * E-Mail:mengyuanzz@126.com
 * Desc  : 责任链模式-组长
 */

public class LeaderGroup extends Leader {

    /**
     * @return 组长报销的处理额度
     */
    @Override
    public int getSelfLimit() {
        return 500;
    }

    /**
     * 当报销金额 <= getSelfLimit() 时，请求会到这里来消化
     *
     * @param money 申请报销的金额
     */
    @Override
    public void handler(int money) {
        Toast.makeText(App.context, "小钱，组长报销:" + money, Toast.LENGTH_SHORT).show();
    }
}
