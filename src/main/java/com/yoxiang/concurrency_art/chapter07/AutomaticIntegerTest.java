package com.yoxiang.concurrency_art.chapter07;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class AutomaticIntegerTest {

    static AtomicInteger ai = new AtomicInteger(1);

    public static void main(String[] args) {
        System.out.println(ai.getAndIncrement());
        System.out.println(ai.get());
    }
}
