package com.yoxiang.multi_thread_programming.chapter04.sample18;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:19
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " 成功获取锁");
        } else {
            System.out.println(Thread.currentThread().getName() + " 获取锁失败");
        }
    }
}
