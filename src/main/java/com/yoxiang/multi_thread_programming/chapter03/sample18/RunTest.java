package com.yoxiang.multi_thread_programming.chapter03.sample18;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:16
 */
public class RunTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
//        ThreadA.sleep(?);
        System.out.println("我想当MyThread对象执行完毕后我再执行");
        System.out.println("但上面代码的sleep中的值填多少合适呢？");
        System.out.println("答案是：不确定");
    }
}
