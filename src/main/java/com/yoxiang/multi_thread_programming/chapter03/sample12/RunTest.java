package com.yoxiang.multi_thread_programming.chapter03.sample12;

/**
 * 程序运行会出现假死情况，所有的线程都处于waiting状态；将所有的notify方法替换为notifyAll方法可以解决
 * 此问题
 * Author: Rivers
 * Date: 2018/1/6 10:53
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("Hello");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        int threadNum = 2;
        Thread[] pts = new ProducerThread[threadNum];
        Thread[] cts = new ConsumerThread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            ProducerThread pt = new ProducerThread(producer, 5);
            pt.setName("Producer-" + (i + 1));
            pts[i] = pt;

            ConsumerThread ct = new ConsumerThread(consumer, 5);
            ct.setName("Consumer=" + (i + 1));
            cts[i] = ct;

            pt.start();
            ct.start();
        }

        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() + " " + threads[i].getState());
        }
    }
}
