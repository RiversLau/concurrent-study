package com.yoxiang.multi_thread_programming.chapter07.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/11 21:11
 */
public class RunTest4 {
    public static void main(String[] args) {
        System.out.println("线程组名称：" +
                Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中活动的线程数量：" +
                Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("线程组中线程组的数量，加之前：" +
                Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup(Thread.currentThread().getThreadGroup(), "newGroup");
        System.out.println("线程组中线程组的梳理，加之后：" +
                Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("父线程组名称：" +
                Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("当前线程组名称：" + Thread.currentThread().getThreadGroup().getName());
    }
}
