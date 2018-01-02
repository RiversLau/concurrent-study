package com.yoxiang.multi_thread_programming.chapter02.sample18;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:10
 */
public class MyThreadB extends Thread {
    private Service service;
    private MyObject object;

    public MyThreadB(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
