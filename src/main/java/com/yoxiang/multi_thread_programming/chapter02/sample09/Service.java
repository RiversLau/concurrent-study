package com.yoxiang.multi_thread_programming.chapter02.sample09;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:16
 */
public class Service {
    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
