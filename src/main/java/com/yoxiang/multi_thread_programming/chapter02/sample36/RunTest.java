package com.yoxiang.multi_thread_programming.chapter02.sample36;

/**
 * Author: Rivers
 * Date: 2018/1/3 22:36
 */
public class RunTest {
    public static void main(String[] args) {
        int n = 50000;
        MyThread[] threads = new MyThread[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new MyThread();
        }

        for (int i = 0; i < n; i++) {
            threads[i].start();
        }
    }
}
