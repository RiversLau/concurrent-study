package com.yoxiang.multi_thread_programming.chapter03.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/5 06:39
 */
public class ThreadB extends Thread {

    private Object lock;
    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始 notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time=" + System.currentTimeMillis());
        }
    }
}
