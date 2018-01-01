package com.yoxiang.multi_thread_programming.chapter02.sample08;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:11
 */
public class MyThread2 extends Thread {
    private LongTask longTask;
    public MyThread2(LongTask longTask) {
        super();
        this.longTask = longTask;
    }

    @Override
    public void run() {
        super.run();
        TimeUtils.beginTime2 = System.currentTimeMillis();
        longTask.doLongTimeTask();
        TimeUtils.endTime2 = System.currentTimeMillis();
    }
}
