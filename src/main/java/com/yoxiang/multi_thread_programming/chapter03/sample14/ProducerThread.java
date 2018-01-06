package com.yoxiang.multi_thread_programming.chapter03.sample14;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:50
 */
public class ProducerThread extends Thread {
    private Producer producer;

    public ProducerThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.push();
        }
    }
}
