package com.yoxiang.multi_thread_programming.chapter07.sample10;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:24
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
