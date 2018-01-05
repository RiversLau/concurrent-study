package com.yoxiang.multi_thread_programming.chapter03.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:32
 */
public class MyThread extends Thread {
    private Object lock;
    public MyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testWait(lock);
    }
}
