package com.dhaval.java8_problem_Day27;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//You are given a list of words. The task is to join all the words into a single string, separating
// them by a delimiter (like a space).
public class WordsToSingleString {
    public static void main(String[] args) {

      List<String> words =   Arrays.asList("Java","is","A","Powerful","Language");

    String result = words.stream().collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
