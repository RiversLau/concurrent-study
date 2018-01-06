package com.yoxiang.multi_thread_programming.chapter03.sample21;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:53
 */
public class ThreadC extends Thread {
    private ThreadB tb;
    public ThreadC(ThreadB tb) {
        this.tb = tb;
    }

    @Override
    public void run() {
        tb.test();
    }
}
