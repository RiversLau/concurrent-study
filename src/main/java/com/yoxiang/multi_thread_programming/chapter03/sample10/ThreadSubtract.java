package com.yoxiang.multi_thread_programming.chapter03.sample10;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:16
 */
public class ThreadSubtract extends Thread {

    private Subtract sub;
    public ThreadSubtract(Subtract sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.subtract();
    }
}
