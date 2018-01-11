package com.yoxiang.multi_thread_programming.chapter07.sample12;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:40
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
