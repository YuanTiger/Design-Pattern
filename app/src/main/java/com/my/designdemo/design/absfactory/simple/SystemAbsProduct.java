package com.my.designdemo.design.absfactory.simple;

import com.my.designdemo.App;
import com.my.designdemo.R;

/**
 * Author：mengyuan
 * Date  : 2017/8/2下午2:58
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public interface SystemAbsProduct {

    //获取系统型号
    String getSystem();

    public class WindowPhone implements SystemAbsProduct{

        @Override
        public String getSystem() {
            return App.context.getString(R.string.window_phone);
        }
    }
    public class IOS implements SystemAbsProduct{

        @Override
        public String getSystem() {
            return App.context.getString(R.string.ios);
        }
    }

    public class Android implements SystemAbsProduct{

        @Override
        public String getSystem() {
            return App.context.getString(R.string.android);
        }
    }
}
