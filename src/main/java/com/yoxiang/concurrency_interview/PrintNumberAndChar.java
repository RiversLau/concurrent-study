package com.yoxiang.concurrency_interview;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Author: Rivers
 * Date: 2018/3/27 11:38
 */
public class PrintNumberAndChar {

    public static void main(String[] args) {

        AtomicBoolean isNum = new AtomicBoolean(true);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] chars = {'a', 'b', 'c', 'd'};

        new PrintChars(chars, isNum).start();
        new PrintNums(numbers, isNum).start();
    }

    public static class PrintNums extends Thread {

        private int[] nums;
        private AtomicBoolean isNum;
        public PrintNums(int[] nums, AtomicBoolean isNum) {
            this.nums = nums;
            this.isNum = isNum;
        }

        @Override
        public void run() {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                while (!isNum.get()) {
                    Thread.yield();
                }
                System.out.print(nums[i]);
                count++;
                if (count == 2) {
                    isNum.set(false);
                    count = 0;
                }
            }
            isNum.set(false);
        }
    }

    public static class PrintChars extends Thread {

        private char[] chars;
        private AtomicBoolean isNum;

        public PrintChars(char[] chars, AtomicBoolean isNum) {
            this.chars = chars;
            this.isNum = isNum;
        }

        @Override
        public void run() {
            for (int i = 0; i < chars.length; i++) {
                while (isNum.get()) {
                    Thread.yield();
                }
                System.out.print(chars[i]);
                isNum.set(true);
            }
            isNum.set(true);
        }
    }
}
