package com.yoxiang.multi_thread_programming.chapter04.sample21;

/**
 * Author: Rivers
 * Date: 2018/1/9 06:39
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
