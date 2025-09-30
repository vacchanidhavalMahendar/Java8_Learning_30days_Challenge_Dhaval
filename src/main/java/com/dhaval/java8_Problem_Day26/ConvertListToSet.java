package com.dhaval.java8_Problem_Day26;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given a list of elements (which may contain duplicates), write a Java program using streams to
// convert the list into a set. The set should not contain any duplicates, as sets in Java
// automatically ensure uniqueness.
public class ConvertListToSet {

    public static void main(String[] args){

 List<String> list = Arrays.asList("apple","banana","cherries","apple","cherries","date","banana");

   //Convert list to set
        Set<String> sets  =list.stream().collect(Collectors.toSet());

        System.out.println("Set Unique:"  +sets);
    }
}
