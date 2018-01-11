package com.yoxiang.multi_thread_programming.chapter07.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:54
 */
public class ObjectUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("对象异常处理");
        e.printStackTrace();
    }
}
