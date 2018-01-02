package com.yoxiang.multi_thread_programming.chapter02.sample27;

/**
 * Author: Rivers
 * Date: 2018/1/3 06:33
 */
public class MyThreadA extends Thread {
    private IService service;
    public MyThreadA(IService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodA();
    }
}
