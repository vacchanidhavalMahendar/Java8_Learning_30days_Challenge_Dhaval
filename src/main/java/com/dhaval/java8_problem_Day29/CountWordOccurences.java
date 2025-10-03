package com.dhaval.java8_problem_Day29;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOccurences {
    public static void main(String[] args) {
        // Given list of words
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple", "kiwi", "orange"
        );

        // Use Streams to count occurrences of each word
        Map<String, Long> occurrences = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Output the result
        occurrences.forEach((word, count) ->
                System.out.println("Word: " + word + ", Occurrences: " + count));
    }
}

