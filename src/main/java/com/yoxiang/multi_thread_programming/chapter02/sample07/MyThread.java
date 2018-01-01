package com.yoxiang.multi_thread_programming.chapter02.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/1 17:44
 */
public class MyThread extends Thread {

    private Child child;
    public MyThread(Child child) {
        super();
        this.child = child;
    }

    @Override
    public void run() {
        child.serviceMethod();
    }
}
