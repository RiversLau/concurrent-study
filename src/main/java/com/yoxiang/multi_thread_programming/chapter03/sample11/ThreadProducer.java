package com.yoxiang.multi_thread_programming.chapter03.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:34
 */
public class ThreadProducer extends Thread {

    private Producer producer;
    public ThreadProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
//        while (true) {
            producer.setValue();
//        }
    }
}
