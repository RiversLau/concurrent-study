package com.yoxiang.multi_thread_programming.chapter04.sample22;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/1/9 06:45
 */
public class RunTest {
    private volatile static int NEXT_NUM = 1;
    private static ReentrantLock lock = new ReentrantLock();

    private static final Condition conditionA = lock.newCondition();
    private static final Condition conditionB = lock.newCondition();
    private static final Condition conditionC = lock.newCondition();

    public static void main(String[] args) {
        Thread ta = new Thread() {
            public void run() {
                try {
                    lock.lock();
                    while (NEXT_NUM != 1) {
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread-A=" + (i + 1));
                    }
                    NEXT_NUM = 2;
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread tb = new Thread() {
            public void run() {
                try {
                    lock.lock();
                    while (NEXT_NUM != 2) {
                        conditionB.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread-B=" + (i + 1));
                    }
                    NEXT_NUM = 3;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread tc = new Thread() {
            public void run() {
                try {
                    lock.lock();
                    while (NEXT_NUM != 3) {
                        conditionC.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread-C=" + (i + 1));
                    }
                    NEXT_NUM = 1;
                    conditionA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(ta);
            Thread t2 = new Thread(tb);
            Thread t3 = new Thread(tc);
            t1.start();
            t2.start();
            t3.start();
        }
    }
}
