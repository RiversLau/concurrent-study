package com.yoxiang.multi_thread_programming.chapter07.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:55
 */
public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("state 异常处理");
        e.printStackTrace();
    }
}
