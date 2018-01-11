package com.yoxiang.multi_thread_programming.chapter07.sample09;

import java.text.SimpleDateFormat;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:03
 */
public class RunTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStrings = new String[] {"2000-01-01", "2000-01-02", "2000-01-03",
                "2000-01-04", "2000-01-05", "2000-01-06", "2000-01-07",
                "2000-01-08", "2000-01-09", "2000-01-10"};
        for (int i = 0; i < dateStrings.length; i++) {
            MyThread mt = new MyThread(sdf, dateStrings[i]);
            mt.start();
        }
    }
}
