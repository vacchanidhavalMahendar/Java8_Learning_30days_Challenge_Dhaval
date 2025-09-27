package com.dhaval.java8_problem_Day24;

import java.util.Arrays;
import java.util.List;

//24/Problem Statement: Given a list of integers, write a Java program using streams to filter out all
//even numbers and then calculate the sum of the remaining odd numbers.
public class EvenNumber_Sum {

public static void main(String[] args){

     List<Integer> listNumber = Arrays.asList(1,2,4,5,6,7,8,9,12,14,13,15,17,18,20,22,24);

     int sumOfOddNumbers=  listNumber.stream().filter(e->e%2 !=0)
             .mapToInt(Integer::intValue)
             .sum();


    System.out.println("Sum of odd numbers"+ sumOfOddNumbers);


}
}
