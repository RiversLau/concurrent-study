package com.yoxiang.multi_thread_programming.chapter03.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:52
 */
public class ConsumerThread extends Thread {

    private Consumer consumer;
    private int loopNum;
    public ConsumerThread(Consumer consumer, int loopNum) {
        this.consumer = consumer;
        this.loopNum = loopNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < loopNum; i++) {
            consumer.getValue();
        }
    }
}
