package com.dhaval.java8_day16_intermediateOperation;
//Example 2:TASK:Print names with its length Which are starting with 'A'

import java.util.Arrays;
import java.util.List;

public class FirstDemo {
    public static void main(String[] args) {

        List<String> arrayList = Arrays.asList("Archer","America","Dhaval","Patel","Artist");

    arrayList.stream().filter(name->name.startsWith("A"))
            .map(name->name +"__"+ name.length())
            .forEach(s-> System.out.println(s));
    }
}
