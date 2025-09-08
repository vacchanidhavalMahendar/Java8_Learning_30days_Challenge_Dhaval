package com.dhaval.java8_Day17_IntermediateContinuation;

import java.util.Arrays;
import java.util.List;

public class SlicingOperationsDemo {
    public static void main(String[] args) {

        List<String> javaCourses = Arrays.asList("corejava","advjava","springboot","restapi","microservices");


        //limit()
        javaCourses.stream().limit(3).forEach(s->System.out.println(s));
        //First three courses we got

        //skip()
        javaCourses.stream().skip(3).forEach(s->System.out.println(s));


        //distinct()
        List<String> names = Arrays.asList("raja","rani","raja","rani","guru");
        names.stream().distinct().forEach(e->System.out.println(e));
    }

}
