package com.yoxiang.multi_thread_programming.chapter03.sample14;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:48
 */
public class Consumer {

    private MyStack stack;
    public Consumer(MyStack stack) {
        this.stack = stack;
    }

    public void pop() {
        System.out.println("consumer pop == " + stack.pop());
    }
}
