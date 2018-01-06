package com.yoxiang.multi_thread_programming.chapter03.sample14;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:52
 */
public class ConsumerThread extends Thread {

    private Consumer consumer;
    public ConsumerThread(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.pop();
        }
    }
}
