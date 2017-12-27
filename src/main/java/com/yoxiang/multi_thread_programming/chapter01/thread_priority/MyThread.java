package com.yoxiang.multi_thread_programming.chapter01.thread_priority;

/**
 * Author: Rivers
 * Date: 2017/12/27 22:06
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("my thread priority is " + this.getPriority());
    }
}
