package com.yoxiang.multi_thread_programming.chapter03.sample01;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rivers
 * Date: 2018/1/4 21:38
 */
public class MyList {
    private List list  = new ArrayList<>();
    public void add() {
        list.add("Hello");
    }

    public int size() {
        return list.size();
    }
}
