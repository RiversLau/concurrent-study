package com.yoxiang.multi_thread_programming.chapter03.sample14;

/**
 * 多个消费者，出现IndexOutofBoundsException，需要修改MyStack，将if改为while；另外需要将所有的notify方法
 * 改为notifyAll方法，要不然会出现假死
 * Author: Rivers
 * Date: 2018/1/6 11:21
 */
public class RunTest2 {
    public static void main(String[] args) {
//        multiProducerWithOneConsumer();
//        multiConsumerWithOneProducer();
        multiProducerWithMultiConsumer();
    }

    public static void multiProducerWithOneConsumer() {
        MyStack stack = new MyStack();
        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);

        ProducerThread pt1 = new ProducerThread(producer);
        ProducerThread pt2 = new ProducerThread(producer);
        ProducerThread pt3 = new ProducerThread(producer);
        ProducerThread pt4 = new ProducerThread(producer);
        pt1.start();
        pt2.start();
        pt3.start();
        pt4.start();

        ConsumerThread ct1 = new ConsumerThread(consumer);
        ct1.start();
    }

    public static void multiConsumerWithOneProducer() {
        MyStack stack = new MyStack();
        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);

        ProducerThread pt = new ProducerThread(producer);
        pt.start();

        ConsumerThread ct1 = new ConsumerThread(consumer);
        ConsumerThread ct2 = new ConsumerThread(consumer);
        ConsumerThread ct3 = new ConsumerThread(consumer);
        ct1.start();
        ct2.start();
        ct3.start();
    }

    public static void multiProducerWithMultiConsumer() {
        MyStack stack = new MyStack();
        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);

        ProducerThread pt1 = new ProducerThread(producer);
        ProducerThread pt2 = new ProducerThread(producer);
        ProducerThread pt3 = new ProducerThread(producer);
        ProducerThread pt4 = new ProducerThread(producer);
        pt1.start();
        pt2.start();
        pt3.start();
        pt4.start();

        ConsumerThread ct1 = new ConsumerThread(consumer);
        ConsumerThread ct2 = new ConsumerThread(consumer);
        ConsumerThread ct3 = new ConsumerThread(consumer);
        ct1.start();
        ct2.start();
        ct3.start();
    }
}
