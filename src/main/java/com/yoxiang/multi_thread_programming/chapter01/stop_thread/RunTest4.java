package com.yoxiang.multi_thread_programming.chapter01.stop_thread;

/**
 * Author: Rivers
 * Date: 2017/12/26 06:56
 */
public class RunTest4 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        try {
            Thread.sleep(100);
            mt.interrupt();
            System.out.println("是否停止1 = " + mt.isInterrupted());
            System.out.println("是否停止2 = " + mt.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
