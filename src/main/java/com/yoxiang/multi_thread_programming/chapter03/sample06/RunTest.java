package com.yoxiang.multi_thread_programming.chapter03.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:33
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread mt = new MyThread(lock);
            mt.start();
            Thread.sleep(1000);
            mt.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
