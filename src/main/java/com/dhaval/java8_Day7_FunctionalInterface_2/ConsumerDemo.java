package com.dhaval.java8_Day7_FunctionalInterface_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {


        Consumer<String> consumer = (name) -> System.out.println(name + "Good Evening");

        consumer.accept("Dhaval");
        consumer.accept("Patel");
        consumer.accept("vacchani");



        List<Integer> numbersIntegers = Arrays.asList(10,20,30,40,50,60);

        //forEach parameter is expecting consumers,developed in java1.8v,it will take the input
        numbersIntegers.forEach(i->System.out.println(i));



    }
}
