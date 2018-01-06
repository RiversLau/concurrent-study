package com.yoxiang.multi_thread_programming.chapter03.sample13;

/**
 * 程序运行会出现假死情况，所有的线程都处于waiting状态
 * Author: Rivers
 * Date: 2018/1/6 10:53
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        MyStack stack = new MyStack();
        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);

        ProducerThread pt = new ProducerThread(producer, 5);
        ConsumerThread ct = new ConsumerThread(consumer, 5);
        pt.start();
        ct.start();
    }
}
