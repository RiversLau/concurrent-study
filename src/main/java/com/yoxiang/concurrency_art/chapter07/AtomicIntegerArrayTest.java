package com.yoxiang.concurrency_art.chapter07;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class AtomicIntegerArrayTest {

    static int[] value = new int[]{1, 2};
    static AtomicIntegerArray aia = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        aia.getAndSet(0, 3);
        System.out.println(aia.get(0));
        System.out.println(value[0]);
    }
}
