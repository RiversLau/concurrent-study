package com.yoxiang.multi_thread_programming.chapter04.sample02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/7 21:32
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void methodA() {
        try {
            lock.lock();
            System.out.println("method A begin thread name=" + Thread.currentThread().getName() +
                    "  time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("method A finish thread name=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        try {
            lock.lock();
            System.out.println("method B begin thread name=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("method B finish thread name=" + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
