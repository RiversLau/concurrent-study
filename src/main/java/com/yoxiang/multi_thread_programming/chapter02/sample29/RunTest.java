package com.yoxiang.multi_thread_programming.chapter02.sample29;

/**
 * Author: Rivers
 * Date: 2018/1/3 21:13
 */
public class RunTest {
    public static void main(String[] args) {
        final OutClass.InnerClass innerClass = new OutClass.InnerClass();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass.method1();
            }
        }, "A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass.method2();
            }
        }, "B");
        t1.start();
        t2.start();
    }
}
