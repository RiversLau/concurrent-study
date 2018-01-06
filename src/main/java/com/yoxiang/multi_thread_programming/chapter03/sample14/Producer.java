package com.yoxiang.multi_thread_programming.chapter03.sample14;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:46
 */
public class Producer {

    private MyStack stack;
    public Producer(MyStack stack) {
        this.stack = stack;
    }

    public void push() {
        stack.push();
    }
}
