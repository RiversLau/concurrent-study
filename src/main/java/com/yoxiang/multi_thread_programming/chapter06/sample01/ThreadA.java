package com.yoxiang.multi_thread_programming.chapter06.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:24
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
