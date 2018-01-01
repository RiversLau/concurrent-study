package com.yoxiang.multi_thread_programming.chapter02.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/2 06:41
 */
public class MyThreadB extends Thread {
    private Service service;
    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("b", "bb");
    }
}
