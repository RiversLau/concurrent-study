package com.yoxiang.multi_thread_programming.chapter02.sample26;

/**
 * Author: Rivers
 * Date: 2018/1/3 06:35
 */
public class RunTest {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA mta = new MyThreadA(service);
        mta.setName("A");
        mta.start();

        MyThreadB mtb = new MyThreadB(service);
        mtb.setName("B");
        mtb.start();
    }
}
