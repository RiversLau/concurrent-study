package com.yoxiang.multi_thread_programming.chapter02.sample37;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author: Rivers
 * Date: 2018/1/4 06:40
 */
public class CountService extends Thread {
    private AtomicInteger count = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
