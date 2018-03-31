package com.yoxiang.concurrency_interview;

/**
 * @author: Rivers
 * @date: 2018/3/31
 */
public class VolatileTest {

    volatile static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(new Worker(), "Thread-" + i);
            thread.start();
        }
        Thread.sleep(10);
        System.out.println(count);
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            count++;
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
