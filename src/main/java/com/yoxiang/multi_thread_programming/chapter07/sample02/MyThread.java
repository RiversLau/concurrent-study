package com.yoxiang.multi_thread_programming.chapter07.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:26
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("mythread run begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mythread run end");
    }
}
