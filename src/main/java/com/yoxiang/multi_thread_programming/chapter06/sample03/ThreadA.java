package com.yoxiang.multi_thread_programming.chapter06.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:31
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance());
    }
}
