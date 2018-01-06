package com.yoxiang.multi_thread_programming.chapter03.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:50
 */
public class ProducerThread extends Thread {
    private int loopNum;
    private Producer producer;

    public ProducerThread(Producer producer, int loopNum) {
        this.producer = producer;
        this.loopNum = loopNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < loopNum; i++) {
            producer.setValue();
        }
    }
}
