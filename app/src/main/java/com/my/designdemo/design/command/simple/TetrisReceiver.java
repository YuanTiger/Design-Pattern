package com.my.designdemo.design.command.simple;

/**
 * Author: mengyuan
 * Date  : 2020/9/9/5:37 PM
 * E-Mail: mengyuanzz@126.com
 * -----------
 * 命令模式Receiver层-具体实现
 */
public class TetrisReceiver {

    public String left(){
        return "左移";
    }

    public String right(){
        return "右移";
    }

    public String top(){
        return "变形！";
    }

    public String bottom(){
        return "加速下落！";
    }
}
