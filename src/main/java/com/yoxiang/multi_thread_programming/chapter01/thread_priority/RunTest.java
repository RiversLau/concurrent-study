package com.yoxiang.multi_thread_programming.chapter01.thread_priority;

/**
 * Author: Rivers
 * Date: 2017/12/27 22:06
 */
public class RunTest {
    public static void main(String[] args) {
        System.out.println("main thread priority is " + Thread.currentThread().getPriority());

//        Thread.currentThread().setPriority(6);
        System.out.println("main thread priority is " + Thread.currentThread().getPriority());

        MyThread1 mt = new MyThread1();
        mt.start();
    }
}
