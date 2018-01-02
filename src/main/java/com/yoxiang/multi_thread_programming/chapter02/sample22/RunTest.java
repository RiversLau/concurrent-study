package com.yoxiang.multi_thread_programming.chapter02.sample22;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:34
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
        MyThreadC mtc = new MyThreadC(service);
        mtc.setName("C");
        mtc.start();
    }
}
