package com.yoxiang.multi_thread_programming.chapter02.sample16;

/**
 * Author: Rivers
 * Date: 2018/1/2 07:00
 */
public class RunTest {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyThreadA mta = new MyThreadA(list);
        mta.setName("ThreadA");
        mta.start();
        MyThreadB mtb = new MyThreadB(list);
        mtb.setName("ThreadB");
        mtb.start();

        System.out.println(list.getSize());
    }
}
