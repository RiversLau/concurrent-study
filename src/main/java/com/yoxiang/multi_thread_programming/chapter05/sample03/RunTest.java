package com.yoxiang.multi_thread_programming.chapter05.sample03;

import com.yoxiang.multi_thread_programming.chapter05.sample02.MyTask;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:05
 */
public class RunTest {
    public static void main(String[] args) {
        System.out.println("当前时间=" + new Date());
        Calendar cal1 = Calendar.getInstance();
        Date runDate1 = cal1.getTime();
        System.out.println("task A 计划时间=" + runDate1);

        Calendar cal2 = Calendar.getInstance();
        Date runDate2 = cal2.getTime();
        System.out.println("task B 计划时间=" + runDate2);

        MyTaskA ta = new MyTaskA();
        MyTaskB tb = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(ta, runDate1);
        timer.schedule(tb, runDate2);
    }
}
