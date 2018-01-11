package com.yoxiang.multi_thread_programming.chapter07.sample07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Rivers
 * Date: 2018/1/11 21:47
 */
public class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateStr;
    public MyThread(SimpleDateFormat simpleDateFormat, String dateStr) {
        super();
        this.dateStr = dateStr;
        this.sdf = simpleDateFormat;
    }

    @Override
    public void run() {
        try {
            Date dateRef = sdf.parse(dateStr);
            String newDateStr = sdf.format(dateRef).toString();
            if (!newDateStr.equals(dateStr)) {
                System.out.println("ThreadName=" + this.getName() +
                        " 报错啦，日期字符串=" + dateStr + " 转换成的日期=" + newDateStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
