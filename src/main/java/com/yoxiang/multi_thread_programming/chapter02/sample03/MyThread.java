package com.yoxiang.multi_thread_programming.chapter02.sample03;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:21
 */
public class MyThread extends Thread {

    private PublicVar publicVar;
    public MyThread(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
