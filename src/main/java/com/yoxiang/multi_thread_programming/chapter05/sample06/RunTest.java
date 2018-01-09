package com.yoxiang.multi_thread_programming.chapter05.sample06;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:36
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前时间=" + new Date());
        Calendar cal = Calendar.getInstance();
        Date runDate = cal.getTime();
        System.out.println("计划时间=" + new Date());

        TaskA ta = new TaskA();
        TaskB tb = new TaskB();
        Timer timer = new Timer();
        timer.schedule(ta, runDate, 4000);
        timer.schedule(tb, runDate, 4000);
        Thread.sleep(10000);

        timer.cancel();
    }
}
