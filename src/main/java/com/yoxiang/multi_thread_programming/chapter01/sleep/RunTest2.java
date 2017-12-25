package com.yoxiang.multi_thread_programming.chapter01.sleep;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:56
 */
public class RunTest2 {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2();
        System.out.println("begin = " + System.currentTimeMillis());
        mt2.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
