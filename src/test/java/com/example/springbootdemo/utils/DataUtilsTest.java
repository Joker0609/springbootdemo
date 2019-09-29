package com.example.springbootdemo.utils;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: 时间格式测试
 * @packname: com.example.springbootdemo.utils
 * @author: weiziping
 * @create: 2019-09-27 11:31
 */
public class DataUtilsTest {
    public static void main(String[] args){
        DataUtils dataUtils = new DataUtils();

        dataUtils.DateFormatMethod("2019-09-27 12:00:00");
    }
}
