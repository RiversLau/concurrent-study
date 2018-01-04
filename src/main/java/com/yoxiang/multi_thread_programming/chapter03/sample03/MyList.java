package com.yoxiang.multi_thread_programming.chapter03.sample03;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rivers
 * Date: 2018/1/4 21:38
 */
public class MyList {
    private static List list  = new ArrayList<>();
    public static void add() {
        list.add("Hello");
    }

    public static int size() {
        return list.size();
    }
}
