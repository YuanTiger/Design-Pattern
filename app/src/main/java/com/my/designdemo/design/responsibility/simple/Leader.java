package com.my.designdemo.design.responsibility.simple;

/**
 * Author：mengyuan
 * Date  : 2017/11/16下午4:35
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public abstract class Leader {
    //下一个处理者
    private Leader nextLeader;

    /**
     * 处理报销请求
     *
     * @param money 申请报销的金额
     */
    public final void handlerRequest(int money) {
        if (money <= getSelfLimit()) {
            //当申请的金额<=自己的处理额度时,将此次请求消化
            handler(money);
        } else {
            //否则交给下一个处理者来处理
            if (nextLeader != null) {
                nextLeader.handlerRequest(money);
            }
        }

    }

    /**
     * 获取自身的额度，由具体实现来设置
     *
     * @return 自身能处理的额度
     */
    public abstract int getSelfLimit();

    /**
     * 具体处理逻辑在这里实现
     *
     * @param money 申请报销的金额
     */
    public abstract void handler(int money);


    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }
}
