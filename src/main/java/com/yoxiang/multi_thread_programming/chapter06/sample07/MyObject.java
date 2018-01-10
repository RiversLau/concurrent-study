package com.yoxiang.multi_thread_programming.chapter06.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/10 20:48
 */
public class MyObject {
    private static MyObject instance = null;
    private MyObject() {
    }

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}
