package com.yoxiang.multi_thread_programming.chapter02.sample21;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:28
 */
public class MyThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}
