package com.yoxiang.multi_thread_programming.chapter02.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:30
 */
public class MyThread extends Thread {
    public LongTask longTask;
    public MyThread(LongTask longTask) {
        super();
        this.longTask = longTask;
    }

    @Override
    public void run() {
        super.run();
        longTask.doLongTimeTask();
    }
}
