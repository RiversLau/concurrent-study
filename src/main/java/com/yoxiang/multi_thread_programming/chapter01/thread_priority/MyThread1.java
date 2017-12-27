package com.yoxiang.multi_thread_programming.chapter01.thread_priority;

/**
 * Author: Rivers
 * Date: 2017/12/27 22:09
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("thread one priority is " + this.getPriority());
        MyThread mt = new MyThread();
        mt.start();
    }
}
