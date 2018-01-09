package com.yoxiang.multi_thread_programming.chapter05.sample09;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 22:47
 */
public class RunTest9 {

    public static void main(String[] args) {
        TaskA ta = new TaskA();
        System.out.println("现在执行时间=" + new Date());
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) - 20);
        Date runDate = cal.getTime();
        System.out.println("计划执行时间=" + runDate);
        Timer timer = new Timer();
//        timer.schedule(ta, runDate, 2000);
        timer.scheduleAtFixedRate(ta, runDate, 2000);
    }

    static class TaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("begin time=" + new Date());
            System.out.println("end time=" + new Date());
        }
    }
}
