package com.yoxiang.multi_thread_programming.chapter04.sample23;

/**
 * Author: Rivers
 * Date: 2018/1/9 06:59
 */
public class RunTest {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA ta = new ThreadA(service);
        ta.start();
        ThreadA tb = new ThreadA(service);
        tb.start();
    }
}
