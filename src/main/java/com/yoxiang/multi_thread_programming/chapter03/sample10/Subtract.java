package com.yoxiang.multi_thread_programming.chapter03.sample10;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:09
 */
public class Subtract {
    private String lock;
    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("wait() begin in thread [" + Thread.currentThread().getName() + "]");
                    lock.wait();
                    System.out.println("wait() finish in thread [" + Thread.currentThread().getName() + "]");
                }
                ValueObject.list.remove(0);
                System.out.println("list size is " + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
