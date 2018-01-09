package com.yoxiang.multi_thread_programming.chapter05.sample02;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Author: Rivers
 * Date: 2018/1/9 20:56
 */
public class RunTest2 {
    public static void main(String[] args) {
        System.out.println("当前时间=" + new Date());
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.SECOND, 10);
        Date runDate1 = cal1.getTime();
        System.out.println("计划时间=" + runDate1);

        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.SECOND, 15);
        Date runDate2 = cal2.getTime();
        System.out.println("计划时间=" + runDate2);

        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();

        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }
}
