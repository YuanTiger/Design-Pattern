package com.my.designdemo.absfactory.simple;

import com.my.designdemo.App;
import com.my.designdemo.R;

/**
 * Author：mengyuan
 * Date  : 2017/8/2下午2:58
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public interface ButtonAbsProduct {

    //按钮响应
    String getButtonName(SystemAbsProduct system);

    public class WindowPhoneButton implements ButtonAbsProduct {

        @Override
        public String getButtonName(SystemAbsProduct system) {
            if (system.getSystem().equals(App.context.getString(R.string.window_phone))) {
                return "点击了WindowPhone系统的Button";
            }
            return App.context.getString(R.string.system_error);
        }
    }

    public class IOSButton implements ButtonAbsProduct {

        @Override
        public String getButtonName(SystemAbsProduct system) {
            if (system.getSystem().equals(App.context.getString(R.string.ios))) {
                return "点击了iOS系统的Button";
            }
            return App.context.getString(R.string.system_error);
        }
    }

    public class AndroidButton implements ButtonAbsProduct {

        @Override
        public String getButtonName(SystemAbsProduct system) {
            if (system.getSystem().equals(App.context.getString(R.string.android))) {
                return "点击了Android系统的Button";
            }
            return App.context.getString(R.string.system_error);
        }
    }
}
