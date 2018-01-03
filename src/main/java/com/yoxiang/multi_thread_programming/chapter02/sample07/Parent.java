package com.yoxiang.multi_thread_programming.chapter02.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/1 17:sample37
 */
public class Parent {

    public synchronized void serviceMethod() {
        try {
            System.out.println("parent method next step sleep begin threadName=" +
                    Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("parent method next step sleep end threadName=" +
                    Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
