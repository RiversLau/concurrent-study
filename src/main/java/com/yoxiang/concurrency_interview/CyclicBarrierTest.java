package com.yoxiang.concurrency_interview;

import java.util.concurrent.CyclicBarrier;

/**
 * Author: Rivers
 * Date: 2018/3/27 17:27
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("所有线程执行结束");
            }
        });
        for (int i = 0; i < 5; i++) {
            new Thread(new ReadNum(i, cyclicBarrier)).start();
        }
    }

    public static class ReadNum implements Runnable {

        private int id;
        private CyclicBarrier barrier;

        public ReadNum(int id, CyclicBarrier barrier) {
            this.id = id;
            this.barrier = barrier;
        }

        @Override
        public void run() {
            synchronized (this) {
                System.out.println("id:" + id);
                try {
                    barrier.await();
                    System.out.println("线程" + id + "执行完毕");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
