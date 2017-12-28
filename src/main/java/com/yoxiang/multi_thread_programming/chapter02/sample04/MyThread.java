package com.yoxiang.multi_thread_programming.chapter02.sample04;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:39
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
