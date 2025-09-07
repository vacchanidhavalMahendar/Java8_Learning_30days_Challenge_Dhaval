package com.dhaval.java8_day16_intermediateOperation;

import java.util.Arrays;
import java.util.List;

public class DemoMapping {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("india","usa","uk","japan");

        for(String name:names){
            System.out.println(name.toUpperCase());
        }
        ////map is taking function,so its takes input and returns output

        names.stream().map(name->name.toUpperCase())
                .forEach(name-> System.out.println(name));

        List<String> names1 = Arrays.asList("india","usa","uk","japan");
        System.out.println("****** Converting a string to int**************");
        names1.stream().mapToInt(na->na.length())
                .forEach(i-> System.out.println(i));


    }
}
