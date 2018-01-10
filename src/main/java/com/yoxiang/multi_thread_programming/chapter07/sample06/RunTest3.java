package com.yoxiang.multi_thread_programming.chapter07.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/11 07:14
 */
public class RunTest3 {
    public static void main(String[] args) {
        System.out.println("线程：" + Thread.currentThread().getName() + " 所属线程组：" +
                    Thread.currentThread().getThreadGroup().getName());
        System.out.println("main线程所属线程数的父线程组名称：" +
                Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("main线程所属线程组父线程组的父线程组名称：" +
                Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}
