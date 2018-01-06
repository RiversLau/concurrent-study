package com.yoxiang.multi_thread_programming.chapter03.sample09;

/**
 * Author: Rivers
 * Date: 2018/1/6 09:19
 */
public class MyRun {

    // 注意ta/tb调整前后顺序后，输出结果的区别；
    // 如果tb先启动，则调用notify时，还没有存在wait()的线程，则ta执行后，会一直wait()
    // 如果ta先启动，则ta进入wait状态，当tb启动后，tb执行notify，ta被唤醒
    public static void main(String[] args) {
        testA();
//        testB();
    }

    public static void testA() {
        MyRun mr = new MyRun();
        Thread ta = new Thread(mr.runnableA);
        ta.start();
        Thread tb = new Thread(mr.runnableB);
        tb.start();
    }

    public static void testB() throws InterruptedException {
        MyRun mr = new MyRun();
        Thread tb = new Thread(mr.runnableB);
        tb.start();
        Thread.sleep(1000);
        Thread ta = new Thread(mr.runnableA);
        ta.start();
    }

    private String lock = new String("");
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait() begin");
                    lock.wait();
                    System.out.println("wait() finish");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify() begin");
                lock.notify();
                System.out.println("notify() finish");
            }
        }
    };
}
