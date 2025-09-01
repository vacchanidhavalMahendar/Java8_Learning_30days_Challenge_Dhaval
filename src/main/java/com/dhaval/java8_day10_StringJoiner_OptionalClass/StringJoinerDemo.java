package com.dhaval.java8_day10_StringJoiner_OptionalClass;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {

        StringJoiner stringJoiner= new StringJoiner("_");
        stringJoiner.add("Dhaval");
        stringJoiner.add("patel");
        stringJoiner.add("vacchani");
        System.out.println(stringJoiner);



        StringJoiner stringJoiner1 = new StringJoiner("-","(",")"); //3 parameters
        stringJoiner1.add("Dhaval");
        stringJoiner1.add("patel");
        stringJoiner1.add("vacchani");
        System.out.println(stringJoiner1);
    }
}
