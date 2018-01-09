package com.yoxiang.multi_thread_programming.chapter05.sample02;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Author: Rivers
 * Date: 2018/1/9 20:53
 */
public class RunTest {
    public static void main(String[] args) {
        System.out.println("当前时间=" + new Date());

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 10);

        Date runDate = calendar.getTime();
        System.out.println("计划时间=" + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate);
    }
}
