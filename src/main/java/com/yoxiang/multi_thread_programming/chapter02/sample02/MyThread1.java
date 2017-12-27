package com.yoxiang.multi_thread_programming.chapter02.sample02;


/**
 * Author: Rivers
 * Date: 2017/12/28 06:50
 */
public class MyThread1 extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;
    public MyThread1(HasSelfPrivateNum hasSelfPrivateNum) {
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        hasSelfPrivateNum.addI("a");
    }
}
