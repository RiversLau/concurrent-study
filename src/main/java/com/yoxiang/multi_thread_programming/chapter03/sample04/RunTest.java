package com.yoxiang.multi_thread_programming.chapter03.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:17
 */
public class RunTest {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA ta = new ThreadA(lock);
        ta.start();
        ThreadA ta2 = new ThreadA(lock);
        ta2.start();
    }
}
