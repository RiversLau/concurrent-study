package com.yoxiang.multi_thread_programming.chapter04.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:25
 */
public class RunTest {
    public static void main(String[] args) {
        MyService ms = new MyService();
        ThreadA ta = new ThreadA(ms);
        ta.start();
    }
}
