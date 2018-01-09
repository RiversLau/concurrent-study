package com.yoxiang.multi_thread_programming.chapter05.sample01;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Author: Rivers
 * Date: 2018/1/9 20:46
 */
public class RunTest {
    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);

        Date runDate = calendar.getTime();
        MyTask task = new MyTask();
        // 注意new Timer()与new Timer(boolean flag)区别
        // 如果flag为TRUE，则表示以守护进程启动
        Timer timer = new Timer();
//        Timer timer = new Timer(true);
        timer.schedule(task, runDate);
    }
}
