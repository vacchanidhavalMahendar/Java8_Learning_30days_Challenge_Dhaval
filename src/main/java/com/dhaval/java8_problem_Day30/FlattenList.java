package com.dhaval.java8_problem_Day30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {
        // Given List of Lists
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana", "cherry"),
                Arrays.asList("date", "elderberry"),
                Arrays.asList("fig", "grape")
        );

        // Flatten the List of Lists
        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)               // Flatten the inner lists
                .collect(Collectors.toList());       // Collect into a single list

        // Output the result
        System.out.println("Flattened List: " + flattenedList);
    }
}

