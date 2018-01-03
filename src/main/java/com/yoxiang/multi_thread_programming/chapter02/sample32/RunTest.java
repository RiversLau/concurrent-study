package com.yoxiang.multi_thread_programming.chapter02.sample32;

/**
 * Author: Rivers
 * Date: 2018/1/3 21:54
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            UserInfo userInfo = new UserInfo();

            MyThread mta = new MyThread(service, userInfo);
            mta.setName("A");
            mta.start();
            Thread.sleep(50);

            MyThread mtb = new MyThread(service, userInfo);
            mtb.setName("B");
            mtb.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
