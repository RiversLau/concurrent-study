package com.yoxiang.concurrency_art.chapter06;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap();
        map.put(null, null);
        for (String str : map.keySet()) {
            System.out.println(map.get(str));
        }
    }
}
