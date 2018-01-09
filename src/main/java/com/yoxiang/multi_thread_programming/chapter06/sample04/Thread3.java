package com.yoxiang.multi_thread_programming.chapter06.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:46
 */
public class Thread3 extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject3.getInstance());
    }
}
