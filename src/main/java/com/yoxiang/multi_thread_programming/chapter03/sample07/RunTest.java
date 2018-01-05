package com.yoxiang.multi_thread_programming.chapter03.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:39
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            final Object object = new Object();
            MyThread mta = new MyThread(object);
            mta.setName("TA");
            mta.start();

            MyThread mtb = new MyThread(object);
            mtb.setName("TB");
            mtb.start();

            MyThread mtc = new MyThread(object);
            mtc.setName("TC");
            mtc.start();

            Thread.sleep(2000);
            NotifyThread nt = new NotifyThread(object);
            nt.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
