package com.yoxiang.multi_thread_programming.chapter02.sample20;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:17
 */
public class RunTest {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        MyThreadA mta = new MyThreadA(service, object);
        mta.setName("A");

        mta.start();
        MyThreadB mtb = new MyThreadB(object);
        mtb.setName("B");
        mtb.start();
    }
}
