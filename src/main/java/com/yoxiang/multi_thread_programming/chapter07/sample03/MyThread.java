package com.yoxiang.multi_thread_programming.chapter07.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:30
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
