package com.yoxiang.multi_thread_programming.chapter05.sample07;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:46
 */
public class RunTest {
    public static void main(String[] args) {
        int i = 0;
        Calendar cal = Calendar.getInstance();
        Date runDate = cal.getTime();
        while (true) {
            i++;
            Timer timer = new Timer();
            TaskA ta = new TaskA(i);
            timer.schedule(ta, runDate);
            timer.cancel();
        }
    }
}
