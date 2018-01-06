package com.yoxiang.multi_thread_programming.chapter03.sample15;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:16
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out) {
        System.out.println("Write:");
        try {
            for (int i = 0; i < 300; i++) {
                String outData = String.valueOf(i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
