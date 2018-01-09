package com.yoxiang.multi_thread_programming.chapter05.sample04;

import java.util.Date;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:27
 */
public class MyTask2 extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("task begin time=" + new Date());
            Thread.sleep(20000);
            System.out.println("task end time=" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
