package com.yoxiang.multi_thread_programming.chapter01.sleep;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:55
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("run thread name = " + this.currentThread().getName() + " begin = " + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
            System.out.println("run thread name = " + this.currentThread().getName() + " finish = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
