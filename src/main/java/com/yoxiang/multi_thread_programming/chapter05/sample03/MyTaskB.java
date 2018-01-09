package com.yoxiang.multi_thread_programming.chapter05.sample03;

import java.util.Date;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:04
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("task B begin time=" + new Date());
        System.out.println("task B end time=" + new Date());
    }
}
