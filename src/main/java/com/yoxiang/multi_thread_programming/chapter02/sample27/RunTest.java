package com.yoxiang.multi_thread_programming.chapter02.sample27;

/**
 * Author: Rivers
 * Date: 2018/1/3 06:35
 */
public class RunTest {
    public static void main(String[] args) {
        IService service = new Service2();
        MyThreadA mta = new MyThreadA(service);
        mta.setName("A");
        mta.start();

        MyThreadB mtb = new MyThreadB(service);
        mtb.setName("B");
        mtb.start();
    }
}
