package com.yoxiang.multi_thread_programming.chapter03.sample15;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:23
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            WriteData write = new WriteData();
            ReadData read = new ReadData();

            PipedOutputStream out = new PipedOutputStream();
            PipedInputStream in = new PipedInputStream();

            out.connect(in);

            ReadThread rt = new ReadThread(read, in);
            rt.start();

            Thread.sleep(2000);

            WriteThread wt = new WriteThread(write, out);
            wt.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
