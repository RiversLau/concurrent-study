package com.yoxiang.multi_thread_programming.chapter03.sample12;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:48
 */
public class Consumer {
    private String lock;
    public Consumer(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者 [" + Thread.currentThread().getName() + "] waiting 😘");
                    lock.wait();
                }
                System.out.println("消费者 [" + Thread.currentThread().getName() + "] runnable");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
