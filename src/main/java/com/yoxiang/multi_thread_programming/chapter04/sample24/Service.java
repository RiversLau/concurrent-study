package com.yoxiang.multi_thread_programming.chapter04.sample24;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Author: Rivers
 * Date: 2018/1/9 06:57
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void writeMethod() {
        try {
            lock.writeLock().lock();
            System.out.println("获的读锁，ThreadName=" + Thread.currentThread().getName());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
