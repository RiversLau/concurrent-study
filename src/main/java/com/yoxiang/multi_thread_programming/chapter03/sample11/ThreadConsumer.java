package com.yoxiang.multi_thread_programming.chapter03.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:35
 */
public class ThreadConsumer extends Thread {

    private Consumer consumer;
    public ThreadConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
//        while (true) {
            consumer.getValue();
//        }
    }
}
