package com.yoxiang.multi_thread_programming.chapter02.sample25;

/**
 * Author: Rivers
 * Date: 2018/1/3 06:34
 */
public class MyThreadB extends Thread {
    private Service service;
    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.print("AB");
    }
}
