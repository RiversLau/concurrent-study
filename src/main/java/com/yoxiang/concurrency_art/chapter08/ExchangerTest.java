package com.yoxiang.concurrency_art.chapter08;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class ExchangerTest {

    private static final Exchanger<String> exch = new Exchanger<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        pool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String A = "流水A";
                    exch.exchange(A);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        pool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    String B = "流水B";
                    String A = exch.exchange(B);
                    System.out.println("交换得到的数据为：" + A);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        pool.shutdown();
    }
}
