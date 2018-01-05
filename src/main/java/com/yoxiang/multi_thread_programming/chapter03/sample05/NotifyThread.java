package com.yoxiang.multi_thread_programming.chapter03.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:25
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
