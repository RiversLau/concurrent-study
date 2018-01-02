package com.yoxiang.multi_thread_programming.chapter02.sample18;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:12
 */
public class RunTest2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        MyObject object1 = new MyObject();
        MyThreadA mta = new MyThreadA(service, object);
        mta.setName("A");
        mta.start();
        MyThreadB mtb = new MyThreadB(service, object1);
        mtb.setName("B");
        mtb.start();
    }
}
