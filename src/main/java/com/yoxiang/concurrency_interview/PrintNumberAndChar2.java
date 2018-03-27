package com.yoxiang.concurrency_interview;

import java.util.concurrent.locks.LockSupport;

/**
 * Author: Rivers
 * Date: 2018/3/27 11:57
 */
public class PrintNumberAndChar2 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] chars = {'a', 'b', 'c', 'd'};

        PrintNums2 pn = new PrintNums2(numbers);
        PrintChars2 pc = new PrintChars2(chars);
        pn.setChars(pc);
        pc.setNums(pn);

        pn.start();
        pc.start();
    }

    public static class PrintNums2 extends Thread {

        private int[] nums;
        private PrintChars2 chars;

        public PrintNums2(int[] nums) {
            super();
            this.nums = nums;
        }

        public void setChars(PrintChars2 chars) {
            this.chars = chars;
        }

        @Override
        public void run() {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (count == 2) {
                    count = 0;
                    LockSupport.unpark(chars);
                    LockSupport.park();
                }
                System.out.print(nums[i]);
                count++;
            }
            LockSupport.unpark(chars);
        }
    }

    public static class PrintChars2 extends Thread {

        private char[] chars;
        private PrintNums2 nums;

        public PrintChars2(char[] chars) {
            super();
            this.chars = chars;
        }

        public void setNums(PrintNums2 nums) {
            this.nums = nums;
        }

        @Override
        public void run() {
            LockSupport.park();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (count == 1) {
                    LockSupport.unpark(nums);
                    LockSupport.park();
                    count = 0;
                }
                System.out.print(chars[i]);
                count++;
            }
            LockSupport.unpark(nums);
        }
    }
}
