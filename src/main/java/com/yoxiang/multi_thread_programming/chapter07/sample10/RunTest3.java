package com.yoxiang.multi_thread_programming.chapter07.sample10;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:26
 */
public class RunTest3 {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程【" + t.getName() + "】抛出异常啦！");
            }
        });

        MyThread mt1 = new MyThread();
        mt1.setName("Thread-A");
        mt1.start();
        MyThread mt2 = new MyThread();
        mt2.setName("Thread-B");
        mt2.start();
    }
}
