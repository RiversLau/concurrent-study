package com.yoxiang.multi_thread_programming.chapter07.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:53
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组异常处理");
        e.printStackTrace();
    }
}
