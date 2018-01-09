package com.yoxiang.multi_thread_programming.chapter06.sample05;

/**
 * 此种方式跟饿汉式感觉很相似
 * Author: Rivers
 * Date: 2018/1/10 06:59
 */
public class MyObject {

    private MyObject() {}

    public static MyObject getInstance() {
        return MyObjectHandler.instance;
    }

    private static class MyObjectHandler {
        private static MyObject instance = new MyObject();
    }
}
