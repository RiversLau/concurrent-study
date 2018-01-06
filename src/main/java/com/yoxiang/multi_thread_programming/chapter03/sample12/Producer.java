package com.yoxiang.multi_thread_programming.chapter03.sample12;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:46
 */
public class Producer {

    private String lock;
    public Producer(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者[" + Thread.currentThread().getName() + "] waiting 😀");
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("生产者[" + Thread.currentThread().getName() + "] runnable");
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
