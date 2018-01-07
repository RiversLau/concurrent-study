package com.yoxiang.multi_thread_programming.chapter04.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/7 21:29
 */
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.testMethod();
    }
}
