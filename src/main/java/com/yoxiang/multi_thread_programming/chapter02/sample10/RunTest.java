package com.yoxiang.multi_thread_programming.chapter02.sample10;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:11
 */
public class RunTest {
    public static void main(String[] args) {
        LongTask task = new LongTask();
        MyThread1 mt1 = new MyThread1(task);
        mt1.start();
        MyThread2 mt2 = new MyThread2(task);
        mt2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long beginTime = TimeUtils.beginTime1;
        if (TimeUtils.beginTime1 < TimeUtils.beginTime2) {
            beginTime = TimeUtils.beginTime2;
        }

        long endTime = TimeUtils.endTime1;
        if (TimeUtils.endTime2 > TimeUtils.endTime1) {
            endTime = TimeUtils.endTime2;
        }

        System.out.println("总共耗时：" + (endTime - beginTime) / 1000);
    }
}
