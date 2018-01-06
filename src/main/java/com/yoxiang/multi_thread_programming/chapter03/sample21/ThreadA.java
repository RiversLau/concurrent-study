package com.yoxiang.multi_thread_programming.chapter03.sample21;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:51
 */
public class ThreadA extends Thread {
    private ThreadB tb;
    public ThreadA(ThreadB tb) {
        this.tb = tb;
    }

    @Override
    public void run() {
        try {
            synchronized (tb) {
                tb.start();
                tb.join();
//                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
