package com.yoxiang.multi_thread_programming.chapter02.sample23;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:39
 */
public class RunTest {
    public static void main(String[] args) {
        Service s1 = new Service();
        Service s2 = new Service();
        MyThreadA mta = new MyThreadA(s1);
        mta.setName("A");
        mta.start();

        MyThreadB mtb = new MyThreadB(s2);
        mtb.setName("B");
        mtb.start();
    }
}
