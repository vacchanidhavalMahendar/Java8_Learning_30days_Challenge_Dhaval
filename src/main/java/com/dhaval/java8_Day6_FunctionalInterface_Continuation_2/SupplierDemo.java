package com.dhaval.java8_Day6_FunctionalInterface_Continuation_2;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        //String symbolString ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Supplier<String> s = () -> {
            String otp = "";
            for(int  i =1;i<=5;i++) {
                otp = otp+(int) (Math.random()*10);
            }
            return otp;
        };

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }

}
