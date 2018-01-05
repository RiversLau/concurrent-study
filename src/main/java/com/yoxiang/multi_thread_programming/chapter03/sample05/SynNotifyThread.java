package com.yoxiang.multi_thread_programming.chapter03.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:26
 */
public class SynNotifyThread extends Thread {
    private Object lock;
    public SynNotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
