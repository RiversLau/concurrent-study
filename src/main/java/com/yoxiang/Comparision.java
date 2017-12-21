package com.yoxiang;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: Rivers
 * Date: 2017/12/21 21:08
 */
public class Comparision {

    public static void main(String[] args) {
        int count = 200000;
        long poolCount = countWithThreadPool(count);
        long withoutPoolCount = countWithoutThreadPool(count);
        System.out.println("With pool consumes " + poolCount + "; without pool consumes " + withoutPoolCount);
    }

    public static long countWithThreadPool(int count) {
        long startTime = System.currentTimeMillis();
        final List<Integer> intList = new LinkedList<>();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 60,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(count));
        final Random random = new Random();
        for (int i = 0; i < count; i++) {
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    intList.add(random.nextInt());
                }
            });
        }
        poolExecutor.shutdown();
        try {
            poolExecutor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("pool count size " + intList.size());
        return System.currentTimeMillis() - startTime;
    }

    public static long countWithoutThreadPool(int count) {
        long startTime = System.currentTimeMillis();
        final List<Integer> intList = new LinkedList<>();
        final Random random = new Random();
        for (int i = 0; i < count; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    intList.add(random.nextInt());
                }
            };
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Without pool count size " + intList.size());
        return System.currentTimeMillis() - startTime;
    }
}
