package com.yoxiang.concurrency_art.chapter08;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class CyclicBarrierTest2 {

    static CyclicBarrier cyclic = new CyclicBarrier(2, new A());

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    cyclic.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println("thread 1");
            }
        }).start();

        try {
            cyclic.await();
            System.out.println("main 2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    static class A implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello World");
        }
    }
}
