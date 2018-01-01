package com.yoxiang.multi_thread_programming.chapter02.sample12;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:39
 */
public class Service {
    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("mehtod A begin time=" + System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("method A end time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("method B begin time=" + System.currentTimeMillis());
            System.out.println("method B end time=" + System.currentTimeMillis());
        }
    }
}
