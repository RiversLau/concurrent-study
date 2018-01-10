package com.yoxiang.multi_thread_programming.chapter06.sample08;

/**
 * Author: Rivers
 * Date: 2018/1/10 21:01
 */
public class RunTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
