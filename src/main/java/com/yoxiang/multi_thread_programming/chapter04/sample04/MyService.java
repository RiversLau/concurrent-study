package com.yoxiang.multi_thread_programming.chapter04.sample04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:28
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("Before condition await");
            condition.await();
            System.out.println("After condition await");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        lock.lock();
        System.out.println("Before signal");
        condition.signal();
        System.out.println("After signal");
        lock.unlock();
    }
}
