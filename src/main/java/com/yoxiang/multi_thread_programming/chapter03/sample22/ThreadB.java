package com.yoxiang.multi_thread_programming.chapter03.sample22;

/**
 * Author: Rivers
 * Date: 2018/1/6 16:22
 */
public class ThreadB extends Thread {
    @Override
    public synchronized void run() {
        try {
            System.out.println("thread B begin threadName=" + Thread.currentThread().getName() +
                    ", time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("thread b end threadName=" + Thread.currentThread().getName() +
                    ", time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
