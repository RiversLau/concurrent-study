package com.yoxiang.multi_thread_programming.chapter07.sample09;

import java.text.SimpleDateFormat;

/**
 * Author: Rivers
 * Date: 2018/1/11 21:59
 */
public class DateTools {
    private static ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<>();
    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = null;
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            tl.set(sdf);
        }
        return sdf;
    }
}
