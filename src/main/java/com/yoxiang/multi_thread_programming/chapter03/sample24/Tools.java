package com.yoxiang.multi_thread_programming.chapter03.sample24;

import java.util.Date;

/**
 * Author: Rivers
 * Date: 2018/1/6 16:55
 */
public class Tools {
    public static ThreadLocal<Date> tl = new ThreadLocal<>();
}
