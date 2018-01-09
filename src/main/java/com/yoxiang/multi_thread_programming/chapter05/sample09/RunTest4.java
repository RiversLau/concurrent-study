package com.yoxiang.multi_thread_programming.chapter05.sample09;

import java.util.Timer;

/**
 * Author: Rivers
 * Date: 2018/1/9 22:34
 */
public class RunTest4 {
    public static void main(String[] args) {
        RunTest3.TaskA ta = new RunTest3.TaskA();
        System.out.println("当前时间：" + System.currentTimeMillis());
        Timer timer = new Timer();
        timer.schedule(ta, 3000, 200);
    }
}
