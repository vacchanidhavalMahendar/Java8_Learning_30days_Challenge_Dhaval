package com.dhaval.java8_day16_intermediateOperation;

//flatMap(Function f)
//1.It is used to flaten list of streams into single streams
//1.A Collection inside another collection we called it as FlatMap.
//2.Syntax: flatMap(s->s.stream())
//flatmap is giving each collection has one stream
//flatmapis basically to make everything as the simple(stream).

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapping {
    public static void main(String[] args) {
        List<String> javaCourses =Arrays.asList("core java","adv java","Springboot");
        List<String>  uiCourses = Arrays.asList("html","css","bootstrap","js");

        //two collections i have added in one more collections
//inside list another list is available
        List<List<String>> courseList= Arrays.asList(javaCourses,uiCourses);

        //FlatMap
        //courseList.stream().forEach(e->System.out.println(e));
        // [core java, adv java, Springboot]
        //	   [html, css, bootstrap, js]

        //nested collection we go for flat map,make it as linear or sequencial
        Stream<String> flatMaps= courseList.stream().flatMap(s->s.stream());
        flatMaps.forEach(c->System.out.println(c));

    }

}
