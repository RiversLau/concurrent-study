package com.yoxiang.concurrency_art.chapter04;

import com.yoxiang.concurrency_art.SleepUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Rivers
 * @date: 2018/3/29
 */
public class WaitNotifyTest {

    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) {

        Thread waitThread = new Thread(new Wait(), "WaitingThread");
        waitThread.start();
        SleepUtils.second(2);
        Thread notifyThread = new Thread(new Notify(), "NotifyThread");
        notifyThread.start();
    }

    static class Wait implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " flag is true, wait @" +
                                new SimpleDateFormat("HH:mm:ss").format(new Date()));
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " flag is false, running @" +
                        new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }
    }

    static class Notify implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " hold lock, notify @" +
                        new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag = false;
                SleepUtils.second(5);
            }
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " hold lock again");
            }
        }
    }
}
