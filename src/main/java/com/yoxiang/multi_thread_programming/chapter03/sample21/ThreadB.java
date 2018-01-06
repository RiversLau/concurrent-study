package com.yoxiang.multi_thread_programming.chapter03.sample21;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:49
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("thread B run begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("thread B run end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void test() {
        System.out.println("thread B test method time=" + System.currentTimeMillis());
    }
}
