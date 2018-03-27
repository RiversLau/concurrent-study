package com.yoxiang.concurrency_interview;

import java.util.concurrent.CountDownLatch;

/**
 * @author: Rivers
 * Date: 2018/3/27 16:57
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(new ReadNum(i, countDownLatch)).start();
        }
        countDownLatch.await();
        System.out.println("所有线程执行结束");
    }

    static class ReadNum implements Runnable {

        private int id;
        private CountDownLatch latch;

        public ReadNum(int id, CountDownLatch latch) {
            this.id = id;
            this.latch = latch;
        }

        @Override
        public void run() {
            synchronized (this) {
                System.out.println("id:" + id);
                latch.countDown();
                System.out.println("线程" + id + "执行完毕");
            }
        }
    }
}
