package com.yoxiang.multi_thread_programming.chapter04.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:39
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.awaitA();
    }
}
