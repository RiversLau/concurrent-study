package com.yoxiang.multi_thread_programming.chapter04.sample06;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:44
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition ca = lock.newCondition();
    private Condition cb = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("A method before await");
            ca.await();
            System.out.println("A method after await");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("B method before await");
            cb.await();
            System.out.println("B method after await");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAllA() {
        lock.lock();
        System.out.println("Signal method begin");
        ca.signalAll();
        System.out.println("Signal method finish");
        lock.unlock();
    }

    public void signalAllB() {
        lock.lock();
        System.out.println("Signal method begin");
        cb.signalAll();
        System.out.println("Signal method finish");
        lock.unlock();
    }
}
