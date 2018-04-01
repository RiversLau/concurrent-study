package com.yoxiang.concurrency_art.chapter06;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class HashMapTest {

    static HashMap<Integer, Integer> map = new HashMap<>();
    static AtomicInteger ai = new AtomicInteger();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new Worker(), "Thread-" + i);
            t.start();
        }
    }

    private static class Worker implements Runnable {
        @Override
        public void run() {
            while (ai.get() < 10000) {
                map.put(ai.get(), ai.getAndIncrement());
                ai.incrementAndGet();
            }
        }
    }
}
