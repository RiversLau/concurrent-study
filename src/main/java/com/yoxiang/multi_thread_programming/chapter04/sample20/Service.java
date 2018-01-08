package com.yoxiang.multi_thread_programming.chapter04.sample20;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/9 06:27
 */
public class Service {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void test() {
        try {
            lock.lock();
            System.out.println("wait begin");
            // 注意此处awaitUninterruptibly与await方法的区别，如果线程被终端，则前者不会抛出异常，后者会抛出异常
            condition.awaitUninterruptibly();
            System.out.println("wait end");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常啦");
        } finally {
            lock.unlock();
        }
    }
}
