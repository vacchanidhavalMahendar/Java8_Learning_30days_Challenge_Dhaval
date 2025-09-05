package com.dhaval.java8_Day14_Filtering;
//Example :Task:print the name starting with character A by using stream API

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NamesStartingCharacter_A {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Dhaval","Patel","Apple","Ball","Ashok");
        list.stream().filter(i->i.startsWith("A")).forEach(i-> System.out.println(i));
    }
}
