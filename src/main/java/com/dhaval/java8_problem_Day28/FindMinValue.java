package com.dhaval.java8_problem_Day28;

import java.util.*;
import java.util.stream.Collectors;

public class FindMinValue {
    public static void main(String[] args) {
        // Given list of numbers
        List<Integer> numbers = Arrays.asList(10, 3, 45, 7, 12);

        // Find the minimum value in the list
        Optional<Integer> minValue = numbers.stream()
                .min(Comparator.naturalOrder());

        // Output the result, or "No values" if the list is empty
        minValue.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No values")
        );
    }
}
