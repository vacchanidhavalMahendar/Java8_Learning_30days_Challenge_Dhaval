package com.dhaval.java8_Day21_Part82;



import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sachin", "sehwag", "Dhoni");
        Spliterator<String> spliterator = list.stream().spliterator();

        spliterator.forEachRemaining(n -> System.out.println(n));


        //sachin
        //sehwag
        //Dhoni
    }
}

