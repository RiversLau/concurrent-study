package com.yoxiang.multi_thread_programming.chapter03.sample10;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:07
 */
public class Add {
    private String lock;
    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anything");
            lock.notifyAll();
        }
    }
}
