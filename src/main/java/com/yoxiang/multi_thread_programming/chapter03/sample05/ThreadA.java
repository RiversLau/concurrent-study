package com.yoxiang.multi_thread_programming.chapter03.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:24
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
