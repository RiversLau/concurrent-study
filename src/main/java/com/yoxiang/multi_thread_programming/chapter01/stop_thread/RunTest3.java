package com.yoxiang.multi_thread_programming.chapter01.stop_thread;

/**
 * Author: Rivers
 * Date: 2017/12/26 06:53
 */
public class RunTest3 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1 = " + Thread.interrupted());
        System.out.println("是否停止2 = " + Thread.interrupted());
    }
}
