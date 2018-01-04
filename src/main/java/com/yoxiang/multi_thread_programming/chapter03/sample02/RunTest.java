package com.yoxiang.multi_thread_programming.chapter03.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/5 06:32
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            String str = new String("Hello");
            str.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
