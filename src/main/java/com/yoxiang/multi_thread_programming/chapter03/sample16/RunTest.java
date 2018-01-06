package com.yoxiang.multi_thread_programming.chapter03.sample16;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:37
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            WriteData write = new WriteData();
            ReadData read = new ReadData();

            PipedWriter pw = new PipedWriter();
            PipedReader pr = new PipedReader();

            pw.connect(pr);

            ReadThread rt = new ReadThread(read, pr);
            rt.start();

            Thread.sleep(2000);

            WriteThread wt = new WriteThread(write, pw);
            wt.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
