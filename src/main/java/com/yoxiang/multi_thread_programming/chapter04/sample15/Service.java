package com.yoxiang.multi_thread_programming.chapter04.sample15;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:03
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void test() {
        System.out.println(lock.isHeldByCurrentThread());
        lock.lock();
        System.out.println(lock.isHeldByCurrentThread());
        lock.unlock();
        System.out.println(lock.isHeldByCurrentThread());
    }
}
