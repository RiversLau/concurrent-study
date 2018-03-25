package com.yoxiang.concurrency_art.chapter01;

/**
 * Author: Rivers
 * Date: 2018/3/24 15:50
 */
public class ConcurrencyTest {

    private static final long count = 100000001;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i <count; i++) {
            b--;
        }
        thread.join();
        long end = System.currentTimeMillis();
        System.out.println("concurrency : " + (end - start) + " ms, b=" + b);
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long end = System.currentTimeMillis();
        System.out.println("serial : " + (end - start) + " ms, b=" + b + ", a=" + a);
    }
}
