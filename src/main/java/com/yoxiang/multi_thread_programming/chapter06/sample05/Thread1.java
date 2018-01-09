package com.yoxiang.multi_thread_programming.chapter06.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/10 07:00
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance());
    }
}
