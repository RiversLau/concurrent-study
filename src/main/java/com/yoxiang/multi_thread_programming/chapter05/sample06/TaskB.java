package com.yoxiang.multi_thread_programming.chapter05.sample06;

import java.util.Date;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:36
 */
public class TaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("task B time=" + new Date());
    }
}
