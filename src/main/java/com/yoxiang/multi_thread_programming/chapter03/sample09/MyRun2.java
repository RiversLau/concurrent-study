package com.yoxiang.multi_thread_programming.chapter03.sample09;

/**
 * Author: Rivers
 * Date: 2018/1/6 09:31
 */
public class MyRun2 {

    public static void main(String[] args) throws InterruptedException {
//        testA();
        testB();
    }

    public static void testA() throws InterruptedException {
        MyRun2 run = new MyRun2();
        Thread ta = new Thread(run.rb);
        ta.start();
        Thread.sleep(1000);
        Thread tb = new Thread(run.ra);
        tb.start();
    }

    public static void testB() throws InterruptedException {
        MyRun2 run = new MyRun2();
        Thread ta = new Thread(run.ra);
        ta.start();
        Thread.sleep(1000);
        Thread tb = new Thread(run.rb);
        tb.start();
    }

    private String lock = new String("");
    private boolean isFirstRunB = false;
    private Runnable ra = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (!isFirstRunB) {
                        System.out.println("wait() begin");
                        lock.wait();
                        System.out.println("wait() finish");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable rb = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify() start");
                lock.notify();
                System.out.println("notify() finish");
                isFirstRunB = true;
            }
        }
    };
}
