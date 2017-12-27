package com.yoxiang.multi_thread_programming.chapter02.sample01;

/**
 * Author: Rivers
 * Date: 2017/12/28 06:51
 */
public class MyThread2 extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;
    public MyThread2(HasSelfPrivateNum hasSelfPrivateNum) {
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        hasSelfPrivateNum.addI("b");
    }
}
