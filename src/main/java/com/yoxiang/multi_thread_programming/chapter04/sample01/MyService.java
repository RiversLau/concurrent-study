package com.yoxiang.multi_thread_programming.chapter04.sample01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/7 21:26
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "==" + (i + 1));
        }
        lock.unlock();
    }
}
