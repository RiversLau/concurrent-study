package com.yoxiang.multi_thread_programming.chapter01.stop_thread3;

/**
 * Author: Rivers
 * Date: 2017/12/27 06:36
 */
public class RunTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        System.out.println("current thread name = " + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
            mt.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
