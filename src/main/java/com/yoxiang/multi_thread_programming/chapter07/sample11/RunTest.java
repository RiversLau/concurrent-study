package com.yoxiang.multi_thread_programming.chapter07.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:35
 */
public class RunTest {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("Mine");
        for (int i = 0; i < 10; i++) {
            MyThread mt = new MyThread(group, "t-" + (i + 1), i + "");
            mt.start();
        }

        MyThread mta = new MyThread(group, "t-ex", "a");
        mta.start();
    }
}
