package com.yoxiang.concurrency_art.chapter04;

/**
 * @author: Rivers
 * @date: 2018/3/29
 */
public class SynchronizedTest {

    public static void main(String[] args) {
        synchronized (SynchronizedTest.class) {

        }
        m();
    }

    public synchronized static void m() {

    }
}
