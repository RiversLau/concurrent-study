package com.yoxiang.multi_thread_programming.chapter03.sample10;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:16
 */
public class ThreadAdd extends Thread {

    private Add add;
    public ThreadAdd(Add add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
