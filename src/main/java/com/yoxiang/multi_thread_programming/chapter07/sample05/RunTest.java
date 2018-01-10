package com.yoxiang.multi_thread_programming.chapter07.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:43
 */
public class RunTest {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();
        ThreadGroup group = new ThreadGroup("test group");
        Thread t1 = new Thread(group, ta);
        Thread t2 = new Thread(group, tb);
        t1.start();
        t2.start();
        System.out.println("thread count:" + group.activeCount());
        System.out.println("thread group name is " + group.getName());
    }
}
