package com.yoxiang.multi_thread_programming.chapter03.sample25;

/**
 * Author: Rivers
 * Date: 2018/1/6 17:02
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "DefaultValue";
    }
}
