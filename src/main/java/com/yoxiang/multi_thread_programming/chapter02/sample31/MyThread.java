package com.yoxiang.multi_thread_programming.chapter02.sample31;

/**
 * Author: Rivers
 * Date: 2018/1/3 21:39
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService service) {
        this.myService = service;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
