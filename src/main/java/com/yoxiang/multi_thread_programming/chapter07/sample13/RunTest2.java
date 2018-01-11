package com.yoxiang.multi_thread_programming.chapter07.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:58
 */
public class RunTest2 {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("Mine");
        MyThread mt = new MyThread(group, "mine-thread");
//        mt.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
//        mt.setUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        mt.start();
    }
}
