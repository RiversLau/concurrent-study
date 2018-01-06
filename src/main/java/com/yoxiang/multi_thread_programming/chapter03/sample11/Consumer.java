package com.yoxiang.multi_thread_programming.chapter03.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:31
 */
public class Consumer {

    private String lock;
    public Consumer(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("Get的值是" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
