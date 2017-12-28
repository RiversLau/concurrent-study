package com.yoxiang.multi_thread_programming.chapter02.sample06;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:58
 */
public class MyThreadA extends Thread {
    private Service service;
    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
