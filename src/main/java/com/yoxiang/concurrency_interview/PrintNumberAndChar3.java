package com.yoxiang.concurrency_interview;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: Rivers
 * Date: 2018/3/27 13:38
 */
public class PrintNumberAndChar3 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] chars = {'a', 'b', 'c', 'd'};

        Lock canPrint = new ReentrantLock();
        Condition printNum = canPrint.newCondition();
        Condition printChar = canPrint.newCondition();

        new PrintNum(numbers, canPrint, printNum, printChar).start();
        new PrintChar(chars, canPrint, printNum, printChar).start();

    }

    public static class PrintNum extends Thread {

        private int[] nums;
        private Condition printNum;
        private Condition printChar;
        private Lock canPrint;

        public PrintNum(int[] nums, Lock canPrint, Condition printNum, Condition printChar) {
            super();
            this.nums = nums;
            this.printNum = printNum;
            this.printChar = printChar;
            this.canPrint = canPrint;
        }

        public void run() {
            int count = 0;
            try {
                for (int n : nums) {
                    if (count == 2) {
                        canPrint.lock();
                        count = 0;
                        printChar.signal();
                        printNum.await();
                        canPrint.unlock();
                    }
                    System.out.print(n);
                    count++;
                }
                canPrint.lock();
                printChar.signal();
                canPrint.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class PrintChar extends Thread {

        private char[] chars;
        private Condition printNum;
        private Condition printChar;
        private Lock canPrint;

        public PrintChar(char[] chars, Lock canPrint, Condition printNum, Condition printChar) {
            super();
            this.chars = chars;
            this.printNum = printNum;
            this.printChar = printChar;
            this.canPrint = canPrint;
        }

        @Override
        public void run() {
            int count = 0;
            try {
                for (char n : chars) {
                    if (count == 1) {
                        canPrint.lock();
                        count = 0;
                        printNum.signal();
                        printChar.await();
                        canPrint.unlock();
                    }
                    System.out.print(n);
                    count++;
                }
                canPrint.lock();
                printNum.signal();
                canPrint.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
