package com.yoxiang.multi_thread_programming.chapter03.sample16;

import java.io.PipedWriter;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:28
 */
public class WriteData {
    public void writeMethod(PipedWriter writer) {
        System.out.println("Write:");
        try {
            for (int i = 0; i < 300; i++) {
                String outData = String.valueOf(i + 1);
                writer.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
