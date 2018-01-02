package com.yoxiang.multi_thread_programming.chapter02.sample26;

/**
 * Author: Rivers
 * Date: 2018/1/3 06:33
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
        service.print(new String("AB"));
    }
}
