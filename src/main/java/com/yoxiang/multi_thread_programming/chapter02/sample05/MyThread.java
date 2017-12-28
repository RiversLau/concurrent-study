package com.yoxiang.multi_thread_programming.chapter02.sample05;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:48
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Child child = new Child();
        child.operateIChildMethod();
    }
}
