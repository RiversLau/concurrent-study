package com.yoxiang.multi_thread_programming.chapter02.sample22;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:34
 */
public class MyThreadC extends Thread {
    private Service service;
    public MyThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
