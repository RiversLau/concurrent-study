package com.yoxiang.concurrency_art.chapter04;

import com.yoxiang.concurrency_art.SleepUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author: Rivers
 * @date: 2018/3/29
 */
public class ThreadInterruptTest {

    public static void main(String[] args) throws InterruptedException {
        Thread sleepThread = new Thread(new SleepRunner(), "SleepThread");
        sleepThread.setDaemon(true);
        Thread busyThread = new Thread(new BusyRunner(), "BusyThread");
        busyThread.setDaemon(true);

        sleepThread.start();
        busyThread.start();

        TimeUnit.SECONDS.sleep(5);

        // main线程通过调用sleepThread、busyThread的interrupt()方法，中断这两个线程
        sleepThread.interrupt();
        busyThread.interrupt();

        // sleepThread、busyThread已经中断，调用isInterrupted()方法均返回false
        // 由于sleepThread调用Thread类的静态方法sleep，该方法会抛出InterruptedException，但是在抛出该异常之前
        // 会先清除中断标志位，所以调用isInterrupted()方法会返回false
        System.out.println("Sleep Thread interrupt status is " + sleepThread.isInterrupted());
        System.out.println("Busy Thread interrupt status is " + busyThread.isInterrupted());

        SleepUtils.second(2);
    }

    static class SleepRunner implements Runnable {
        @Override
        public void run() {
            while (true) {
                SleepUtils.second(10);
            }
        }
    }

    static class BusyRunner implements Runnable {
        @Override
        public void run() {
            while (true) {
            }
        }
    }
}
