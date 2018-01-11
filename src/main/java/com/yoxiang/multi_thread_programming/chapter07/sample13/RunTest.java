package com.yoxiang.multi_thread_programming.chapter07.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:56
 */
public class RunTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
//        mt.setUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        mt.start();
    }
}
