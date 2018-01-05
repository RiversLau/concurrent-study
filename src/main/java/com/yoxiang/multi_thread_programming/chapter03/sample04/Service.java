package com.yoxiang.multi_thread_programming.chapter03.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:15
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("method begin");
                lock.wait();
                System.out.println("method finish");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
