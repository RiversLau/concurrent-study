package com.yoxiang.multi_thread_programming.chapter02.sample20;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:10
 */
public class MyThreadB extends Thread {
    private MyObject object;

    public MyThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
