package com.my.designdemo.design.command.simple;

/**
 * Author: mengyuan
 * Date  : 2020/9/9/5:50 PM
 * E-Mail: mengyuanzz@126.com
 * -----------
 * 命令模式，命令封装
 */
public class TetrisButtons {
    private TetrisCommand commandLeft;
    private TetrisCommand commandRight;
    private TetrisCommand commandTop;
    private TetrisCommand commandBottom;


    public void setCommandLeft(TetrisCommand commandLeft) {
        this.commandLeft = commandLeft;
    }

    public void setCommandRight(TetrisCommand commandRight) {
        this.commandRight = commandRight;
    }

    public void setCommandTop(TetrisCommand commandTop) {
        this.commandTop = commandTop;
    }

    public void setCommandBottom(TetrisCommand commandBottom) {
        this.commandBottom = commandBottom;
    }


    public String toLeft() {
        return commandLeft.execute();
    }


    public String toRight() {
        return commandRight.execute();
    }


    public String toBottom() {
        return commandBottom.execute();
    }


    public String toTop() {
        return commandTop.execute();
    }
}
