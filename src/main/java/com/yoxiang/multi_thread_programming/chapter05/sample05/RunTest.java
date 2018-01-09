package com.yoxiang.multi_thread_programming.chapter05.sample05;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:32
 */
public class RunTest {
    public static void main(String[] args) {
        System.out.println("当前时间=" + new Date());
        Calendar calendar = Calendar.getInstance();
        Date runDate = calendar.getTime();
        System.out.println("计划时间=" + runDate);

        MyTaskA ta = new MyTaskA();
        MyTaskB tb = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(ta, runDate, 4000);
        timer.schedule(tb, runDate, 4000);
    }
}
