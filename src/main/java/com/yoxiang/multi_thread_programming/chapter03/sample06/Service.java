package com.yoxiang.multi_thread_programming.chapter03.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:31
 */
public class Service {
    public void testWait(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("method wait() begin");
                lock.wait();
                System.out.println("method wait() finish");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
