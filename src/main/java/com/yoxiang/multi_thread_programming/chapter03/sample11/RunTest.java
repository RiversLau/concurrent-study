package com.yoxiang.multi_thread_programming.chapter03.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:37
 */
public class RunTest {
    public static void main(String[] args) {
        String lock = new String("Hello");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        ThreadProducer pt = new ThreadProducer(producer);
        pt.start();

        ThreadConsumer ct = new ThreadConsumer(consumer);
        ct.start();
    }
}
