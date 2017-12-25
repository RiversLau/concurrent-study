package com.yoxiang.multi_thread_programming.chapter01.stop_thread;

/**
 * Author: Rivers
 * Date: 2017/12/26 06:28
 */
public class RunTest2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        try {
            Thread.sleep(1000);
            mt.interrupt();
            System.out.println("是否停止1 = " + mt.interrupted());
            System.out.println("是否停止2 = " + mt.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
