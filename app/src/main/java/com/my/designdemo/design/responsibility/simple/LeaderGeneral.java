package com.my.designdemo.design.responsibility.simple;

import android.widget.Toast;

import com.my.designdemo.App;

/**
 * Author：mengyuan
 * Date  : 2017/11/16下午4:44
 * E-Mail:mengyuanzz@126.com
 * Desc  : 责任链模式-总监
 */

public class LeaderGeneral extends Leader {

    /**
     * @return 总监报销的处理额度
     */
    @Override
    public int getSelfLimit() {
        return 2000;
    }


    /**
     * 当报销金额 <= getSelfLimit() 时，请求会到这里来消化
     *
     * @param money 申请报销的金额
     */
    @Override
    public void handler(int money) {
        Toast.makeText(App.context, "金额挺大，总监报销:" + money, Toast.LENGTH_SHORT).show();
    }
}
