package com.yoxiang.multi_thread_programming.chapter07.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:29
 */
public class MyService {
    public synchronized static void serviceMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "comes in.");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
