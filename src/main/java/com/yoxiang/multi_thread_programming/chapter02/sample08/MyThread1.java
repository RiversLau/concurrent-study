package com.yoxiang.multi_thread_programming.chapter02.sample08;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:09
 */
public class MyThread1 extends Thread {
    private LongTask longTask;
    public MyThread1(LongTask longTask) {
        super();
        this.longTask = longTask;
    }

    @Override
    public void run() {
        super.run();
        TimeUtils.beginTime1 = System.currentTimeMillis();
        longTask.doLongTimeTask();
        TimeUtils.endTime1 = System.currentTimeMillis();
    }
}
