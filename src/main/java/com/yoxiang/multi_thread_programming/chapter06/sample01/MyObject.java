package com.yoxiang.multi_thread_programming.chapter06.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:23
 */
public class MyObject {
    private static MyObject obj = new MyObject();
    private MyObject() {

    }

    public static MyObject getInstance() {
        return obj;
    }
}
