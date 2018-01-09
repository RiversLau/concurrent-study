package com.yoxiang.multi_thread_programming.chapter06.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:29
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
