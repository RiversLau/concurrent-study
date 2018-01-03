package com.yoxiang.multi_thread_programming.chapter02.sample39;

/**
 * Author: Rivers
 * Date: 2018/1/4 06:58
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
