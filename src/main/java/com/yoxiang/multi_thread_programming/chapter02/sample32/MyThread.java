package com.yoxiang.multi_thread_programming.chapter02.sample32;

/**
 * Author: Rivers
 * Date: 2018/1/3 21:52
 */
public class MyThread extends Thread {
    private Service service;
    private UserInfo userInfo;
    public MyThread(Service service, UserInfo userInfo) {
        super();
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
