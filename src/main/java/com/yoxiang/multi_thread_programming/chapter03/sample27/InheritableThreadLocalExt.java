package com.yoxiang.multi_thread_programming.chapter03.sample27;

import java.util.Date;

/**
 * Author: Rivers
 * Date: 2018/1/6 17:29
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "--Child";
    }
}
