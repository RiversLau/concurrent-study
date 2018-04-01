package com.yoxiang.concurrency_art.chapter08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class SemaphoreTest {

    private static final int THREAD_COUNT = 30;

    private static ExecutorService pool = Executors.newFixedThreadPool(THREAD_COUNT);
    private static Semaphore semaphore = new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println("save data");
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        pool.shutdown();
    }
}
