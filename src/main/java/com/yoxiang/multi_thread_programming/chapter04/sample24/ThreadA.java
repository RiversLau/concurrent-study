package com.yoxiang.multi_thread_programming.chapter04.sample24;

/**
 * Author: Rivers
 * Date: 2018/1/9 07:02
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.writeMethod();
    }
}
