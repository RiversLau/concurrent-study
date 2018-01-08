package com.yoxiang.multi_thread_programming.chapter04.sample17;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:11
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin " + Thread.currentThread().getName());
            for (int i = 0; i < 5000; i++) {
                new String();
                Math.random();
            }
            System.out.println("lock end " + Thread.currentThread().getName());
        } catch (InterruptedException ex) {
            System.out.println("发生异常啦");
        } finally {
            if (lock.isHeldByCurrentThread())
                lock.unlock();
        }
    }
}
