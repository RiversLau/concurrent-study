package com.yoxiang.multi_thread_programming.chapter01.is_alive;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:31
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("thread alive = " + this.isAlive());
    }
}
