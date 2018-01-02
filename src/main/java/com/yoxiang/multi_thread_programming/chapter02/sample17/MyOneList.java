package com.yoxiang.multi_thread_programming.chapter02.sample17;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rivers
 * Date: 2018/1/2 07:31
 */
public class MyOneList {

    private List list = new ArrayList<>();

    public synchronized void add(String data) {
        list.add(data);
    }

    public synchronized int getSize() {
        return list.size();
    }
}
