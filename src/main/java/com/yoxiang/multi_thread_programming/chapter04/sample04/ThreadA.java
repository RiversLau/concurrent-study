package com.yoxiang.multi_thread_programming.chapter04.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:30
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.await();
    }
}
