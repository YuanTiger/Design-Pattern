package com.my.designdemo.design.absfactory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/8/2下午3:38
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class WindowPhoneFactory implements AbsFactory {
    @Override
    public SystemAbsProduct createSystem() {
        return new SystemAbsProduct.WindowPhone();
    }

    @Override
    public ButtonAbsProduct createButton() {
        return new ButtonAbsProduct.WindowPhoneButton();
    }
}
