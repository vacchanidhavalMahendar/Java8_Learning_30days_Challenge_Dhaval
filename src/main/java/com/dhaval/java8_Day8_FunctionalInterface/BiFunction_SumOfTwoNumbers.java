package com.dhaval.java8_Day8_FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunction_SumOfTwoNumbers {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bif = (a, b) -> (a+b);  //two input types and one output types

        System.out.println(bif.apply(10,20));  //30

    }

}

