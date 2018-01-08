package com.yoxiang.multi_thread_programming.chapter04.sample09;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 21:16
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("service method getHoldCount=" + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("service method 2 getHoldCount=" + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}
