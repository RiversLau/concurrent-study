package com.yoxiang.multi_thread_programming.chapter04.sample23;

/**
 * Author: Rivers
 * Date: 2018/1/9 06:59
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.readMethod();
    }
}
