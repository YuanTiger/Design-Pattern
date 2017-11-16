package com.my.designdemo.design.absfactory.simple;

/**
 * Author：mengyuan
 * Date  : 2017/8/2下午3:11
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public interface AbsFactory {

    //创建操作系统
    SystemAbsProduct createSystem();

    //创建Button
    ButtonAbsProduct createButton();
}
