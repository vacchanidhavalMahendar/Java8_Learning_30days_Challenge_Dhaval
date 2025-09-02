package com.dhaval.java8_Day11_Date_Time_API_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {

        java.util.Date d = new java.util.Date();
        System.out.println(d);


        //SimpleDateformat

        //date to string format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
         String format= dateFormat.format(dateFormat);
        System.out.println(format);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
        String formatString2 = simpleDateFormat2.format(d);
        System.out.println(formatString2); //26/29/2025

        //Convert String to Date

        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");

        Date parsedDate  =simpleDateFormat3.parse("2022-12-20");
        System.out.println(parsedDate);

        //java.sql.Date  date = new java.sql.Date(20221220l);

    }
}
