package com.yoxiang.multi_thread_programming.chapter04.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:54
 */
public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.service.consume();
        }
    }
}
