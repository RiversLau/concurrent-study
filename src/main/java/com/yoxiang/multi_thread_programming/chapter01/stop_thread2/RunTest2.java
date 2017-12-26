package com.yoxiang.multi_thread_programming.chapter01.stop_thread2;

/**
 * Author: Rivers
 * Date: 2017/12/27 06:26
 */
public class RunTest2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        mt.start();
        try {
            Thread.sleep(2000);
            mt.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
