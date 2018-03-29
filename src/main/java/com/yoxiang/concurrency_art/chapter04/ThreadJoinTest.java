package com.yoxiang.concurrency_art.chapter04;

import java.util.concurrent.TimeUnit;

/**
 * @author: Rivers
 * @date: 2018/3/29
 */
public class ThreadJoinTest {

    /**
     * Thread-9等待Thread-8终止，Thread-8等待Thread-7终止，以此类推，最后Thread-1等待Main线程终止，
     * 所以最后的输出就是main 线程先终止，然后是Thread-1，Thread-2...Thread-9
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thead = new Thread(new Domino(previous), "Thread-" + i);
            previous = thead;
            thead.start();
        }
        TimeUnit.SECONDS.sleep(8);
        System.out.println(Thread.currentThread().getName() + " terminate!");
    }

    static class Domino implements Runnable {

        private Thread prev;
        public Domino(Thread prev) {
            this.prev = prev;
        }

        @Override
        public void run() {
            try {
                prev.join();
            } catch (InterruptedException e) {
                // do nothing
            }
            System.out.println(Thread.currentThread().getName() + " terminate!");
        }
    }
}
