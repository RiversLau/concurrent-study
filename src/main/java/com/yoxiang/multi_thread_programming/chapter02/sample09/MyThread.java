package com.yoxiang.multi_thread_programming.chapter02.sample09;

import com.yoxiang.multi_thread_programming.chapter02.sample07.Child;

/**
 * Author: Rivers
 * Date: 2018/1/1 17:44
 */
public class MyThread extends Thread {

    private Service service;
    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethod();
    }
}
