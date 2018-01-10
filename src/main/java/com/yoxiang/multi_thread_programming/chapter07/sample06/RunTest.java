package com.yoxiang.multi_thread_programming.chapter07.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:47
 */
public class RunTest {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup, "A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("method run");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(group, runnable);
        t1.setName("thread one");
        t1.start();

        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);
        System.out.println("main thread has " + listGroup.length + ", name is" + listGroup[0].getName());

        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println(listThread[0].getName());
    }
}
