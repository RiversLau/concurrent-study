package com.yoxiang.multi_thread_programming.chapter05.sample09;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 22:37
 */
public class RunTest5 {

    public static void main(String[] args) {
        MyTaskA mta = new MyTaskA();
        Calendar cal = Calendar.getInstance();
        Date runDate = cal.getTime();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(mta, runDate, 3000);
    }

    static class MyTaskA extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
