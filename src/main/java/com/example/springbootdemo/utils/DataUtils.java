package com.example.springbootdemo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: 时间格式
 * @packname: com.example.springbootdemo.utils
 * @author: weiziping
 * @create: 2019-09-27 11:19
 */
public class DataUtils {
    public void DateFormatMethod(String time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(time);
            System.out.println(date);
            System.out.println(simpleDateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
