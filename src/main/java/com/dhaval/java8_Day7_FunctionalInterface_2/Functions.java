package com.dhaval.java8_Day7_FunctionalInterface_2;

import java.util.function.Function;

//Function is pre-Defined functional Interface
//It having one abstract method->accept()
//It take input and will return output
public class Functions {
    public static void main(String[] args) {

        Function<String,Integer> function =(name)->name.length();
        System.out.println(function.apply("IT"));
        System.out.println(function.apply("dhaval"));
    }
}
