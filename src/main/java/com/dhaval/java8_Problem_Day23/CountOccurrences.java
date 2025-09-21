package com.dhaval.java8_Problem_Day23;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String[] args) {
        // Given list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 40, 20, 20, 30, 50, 10, 50, 50, 50);

        // Use Streams to count occurrences of each element
        Map<Integer, Long> occurrences = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Output the result
        occurrences.forEach((key, value) ->
                System.out.println("Element: " + key + ", Occurrences: " + value));
    }
}

