package com.dhaval.java8_Day11_Date_Time_API_1;

import java.time.*;
import java.util.Date;

public class NewDateDemo {
    public static void main(String[] args) {


        LocalDate ofDate = LocalDate.of(2021, 1, 20);
        System.out.println(ofDate);  //2021-01-20


        Date d1 = new Date();
        System.out.println(d1);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);    //2025-06-26


        localDate= 	localDate.plusDays(3);
        System.out.println(localDate);   //2025-06-29

        localDate= 	localDate.plusMonths(1);
        System.out.println(localDate);

        localDate= 	localDate.plusYears(2);
        System.out.println(localDate);

        boolean leapYear =  LocalDate.parse("2021-12-22").isLeapYear();

        System.out.println("Leap Year or not" +leapYear);


        boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));

        System.out.println("Before date " + before);


        LocalTime time =	LocalTime.now();

        System.out.println(time);
        time = time.plusHours(2);
        System.out.println(time);


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);


        //Period difference between one date and another date

        Period between = Period.between(LocalDate.parse("1991-05-20"),LocalDate.now());
        System.out.println(between);



        //Duration is taking Time

        Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
        System.out.println(duration);  //PT58M36.3407851S
    }

}
