package com.yoxiang.concurrency_interview;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Rivers
 * @date: 2018/3/28 07:03
 */
public class ConditionTest {

    public static void main(String[] args) {

        final ReentrantLock lock = new ReentrantLock();
        final Condition condition = lock.newCondition();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "获取到锁");
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "重新被激活");
                lock.unlock();
            }
        }, "Thread-1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "获取到锁");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                condition.signalAll();
                System.out.println(Thread.currentThread().getName() + "释放信号");
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + "释放锁");
            }
        }, "Thread-2").start();
    }
}
