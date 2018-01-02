package com.yoxiang.multi_thread_programming.chapter02.sample24;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:33
 */
public class MyThreadB extends Thread {
    private Service service;
    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
