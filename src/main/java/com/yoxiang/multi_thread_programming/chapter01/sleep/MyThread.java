package com.yoxiang.multi_thread_programming.chapter01.sleep;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:49
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run thread name = " + this.currentThread().getName() + " begin");
        try {
            Thread.sleep(2000);
            System.out.println("run thread name = " + this.currentThread().getName() + " finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
