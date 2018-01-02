package com.yoxiang.multi_thread_programming.chapter02.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/2 20:33
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThreadA mta = new MyThreadA(list);
        mta.setName("A");
        mta.start();

        MyThreadB mtb = new MyThreadB(list);
        mtb.setName("B");
        mtb.start();
        Thread.sleep(6000);
        System.out.println("list size=" + list.getSize());
    }
}
