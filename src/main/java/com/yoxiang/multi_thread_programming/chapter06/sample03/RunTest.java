package com.yoxiang.multi_thread_programming.chapter06.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:32
 */
public class RunTest {
    // 懒汉式在多线程情况下回出现多个实例，该如何解决呢？
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadA t2 = new ThreadA();
        ThreadA t3 = new ThreadA();
        t1.start();
        t2.start();
        t3.start();
    }
}
