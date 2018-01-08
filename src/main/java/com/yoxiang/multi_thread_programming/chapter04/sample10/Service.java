package com.yoxiang.multi_thread_programming.chapter04.sample10;

import java.security.acl.LastOwnerException;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 21:21
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public void test() {
        try {
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " comes in.");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
