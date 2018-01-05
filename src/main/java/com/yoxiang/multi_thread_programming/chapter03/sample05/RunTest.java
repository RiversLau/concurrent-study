package com.yoxiang.multi_thread_programming.chapter03.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:27
 */
public class RunTest {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA ta = new ThreadA(lock);
        ta.setName("A");
        ta.start();

        NotifyThread nt = new NotifyThread(lock);
        nt.setName("B");
        nt.start();

        SynNotifyThread snt = new SynNotifyThread(lock);
        snt.setName("C");
        snt.start();
    }
}
