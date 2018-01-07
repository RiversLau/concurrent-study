package com.yoxiang.multi_thread_programming.chapter04.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:55
 */
public class RunTest {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA ta = new ThreadA(service);
        ta.start();
        ThreadB tb = new ThreadB(service);
        tb.start();
    }
}
