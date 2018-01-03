package com.yoxiang.multi_thread_programming.chapter02.sample31;

/**
 * Author: Rivers
 * Date: 2018/1/3 21:37
 */
public class MyService {
    private String lock = "123";
    public void testMethod() {
        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
