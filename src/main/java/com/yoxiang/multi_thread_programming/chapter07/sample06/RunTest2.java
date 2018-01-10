package com.yoxiang.multi_thread_programming.chapter07.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/11 07:00
 */
public class RunTest2 {
    public static void main(String[] args) {
        System.out.println("A处线程：" + Thread.currentThread().getName() +
                " 所属线程组名称：" + Thread.currentThread().getThreadGroup().getName() +
                " 中线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup("New Thread Group");
        System.out.println("B处线程：" + Thread.currentThread().getName() +
                " 所属线程组名称：" + Thread.currentThread().getThreadGroup().getName() +
                " 中线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] groups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groups);
        for (int i = 0; i < groups.length; i++) {
            System.out.println("group name is " + groups[i].getName());
        }
    }
}
