package com.yoxiang.multi_thread_programming.chapter02.sample12;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:42
 */
public class MyThread2 extends Thread {
    private Service service;
    public MyThread2(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
