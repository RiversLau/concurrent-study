package com.yoxiang.multi_thread_programming.chapter05.sample03;

import java.util.Date;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:02
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("task A begin time=" + new Date());
            Thread.sleep(20000);
            System.out.println("task A end time=" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
