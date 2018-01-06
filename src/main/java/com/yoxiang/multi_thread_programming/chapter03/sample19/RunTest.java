package com.yoxiang.multi_thread_programming.chapter03.sample19;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:26
 */
public class RunTest {
    public static void main(String[] args) {
        ThreadB tb = new ThreadB();
        tb.start();
        ThreadC tc = new ThreadC(tb);
        tc.start();
    }
}
