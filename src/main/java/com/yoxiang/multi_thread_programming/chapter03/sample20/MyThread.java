package com.yoxiang.multi_thread_programming.chapter03.sample20;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:32
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("my thread end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
