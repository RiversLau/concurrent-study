package com.yoxiang.multi_thread_programming.chapter07.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/11 21:38
 */
public class RunTest7 {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThreadA mt1 = new MyThreadA(lock, "A", 1);
        MyThreadA mt2 = new MyThreadA(lock, "B", 2);
        MyThreadA mt3 = new MyThreadA(lock, "C", 0);
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
