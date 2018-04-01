package com.yoxiang.concurrency_art.chapter08;

import java.util.concurrent.CountDownLatch;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class CountDownLatchTest {

    private static CountDownLatch cdl = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
                cdl.countDown();
                System.out.println("B");
                cdl.countDown();
            }
        }).start();

        cdl.await();
        System.out.println("C");
    }
}
