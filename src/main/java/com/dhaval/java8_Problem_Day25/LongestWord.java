package com.dhaval.java8_Problem_Day25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Problem Statement: Given a list of strings, write a Java program using streams to find the
//longest word in the list.
public class LongestWord {

    public static void main(String[] args){


        List<String> words = Arrays.asList("apple","cherry","banana","figs","apple");

        //Find longest word using strea

         Optional<String> longestWord = words.stream().max(Comparator.comparingInt(String::length));

        longestWord.ifPresent(word-> System.out.println("Longest word"+word));

    }
}
