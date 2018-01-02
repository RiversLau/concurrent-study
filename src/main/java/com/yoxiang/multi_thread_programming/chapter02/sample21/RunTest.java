package com.yoxiang.multi_thread_programming.chapter02.sample21;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:29
 */
public class RunTest {
    public static void main(String[] args) {
        MyThreadA mta = new MyThreadA();
        mta.setName("A");
        mta.start();
        MyThreadB mtb = new MyThreadB();
        mtb.setName("B");
        mtb.start();
    }
}
