package com.yoxiang.multi_thread_programming.chapter04.sample14;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:00
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void test() {
        lock.lock();
        System.out.println("Fair lock ？" + lock.isFair());
        lock.unlock();
    }
}
