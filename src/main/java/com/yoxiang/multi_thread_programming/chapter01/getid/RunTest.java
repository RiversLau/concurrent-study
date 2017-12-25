package com.yoxiang.multi_thread_programming.chapter01.getid;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:59
 */
public class RunTest {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + "=" + mainThread.getId());
        Thread thread = new Thread();
        System.out.println(thread.getName() + "=" + thread.getId());
    }
}
