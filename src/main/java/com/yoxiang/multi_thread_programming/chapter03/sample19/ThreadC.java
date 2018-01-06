package com.yoxiang.multi_thread_programming.chapter03.sample19;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:26
 */
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
