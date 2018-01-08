package com.yoxiang.multi_thread_programming.chapter04.sample16;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:07
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void test() {
        System.out.println(lock.isLocked());
        lock.lock();
        System.out.println(lock.isLocked());
        lock.unlock();
        System.out.println(lock.isLocked());
    }
}
