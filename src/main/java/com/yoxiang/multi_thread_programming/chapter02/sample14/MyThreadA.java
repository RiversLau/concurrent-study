package com.yoxiang.multi_thread_programming.chapter02.sample14;

/**
 * Author: Rivers
 * Date: 2018/1/2 06:40
 */
public class MyThreadA extends Thread {
    private Service service;
    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a", "aa");
    }
}
