package com.yoxiang.multi_thread_programming.chapter04.sample13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 21:52
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("有木有线程等待？" + lock.hasWaiters(condition));
            if (lock.hasWaiters(condition)) {
                System.out.println("有" + lock.getWaitQueueLength(condition) + "个在等待");
            }
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
