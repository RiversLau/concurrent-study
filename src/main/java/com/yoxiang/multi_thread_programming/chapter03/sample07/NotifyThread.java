package com.yoxiang.multi_thread_programming.chapter03.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:42
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notifyAll();
        }
    }
}
