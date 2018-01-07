package com.yoxiang.multi_thread_programming.chapter04.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/7 21:37
 */
public class ThreadBB extends Thread {
    private MyService service;
    public ThreadBB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.methodB();
    }
}
