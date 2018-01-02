package com.yoxiang.multi_thread_programming.chapter02.sample22;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:32
 */
public class MyThreadA extends Thread {
    private Service service;
    public MyThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
