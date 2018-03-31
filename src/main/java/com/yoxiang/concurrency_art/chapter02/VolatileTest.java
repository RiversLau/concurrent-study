package com.yoxiang.concurrency_art.chapter02;

/**
 * @author: Rivers
 * @date: 2018/3/29
 */
public class VolatileTest {

    volatile Object hello = new Object();

    public static void main(String[] args) {
        VolatileTest vt = new VolatileTest();
        System.out.println(vt.hello);
    }
}
