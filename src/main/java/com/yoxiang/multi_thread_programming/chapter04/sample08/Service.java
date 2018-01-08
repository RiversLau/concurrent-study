package com.yoxiang.multi_thread_programming.chapter04.sample08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 21:09
 */
public class Service {
    private Lock lock;
    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void test() {
        try {
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
