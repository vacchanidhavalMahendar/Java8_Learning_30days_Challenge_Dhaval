package com.dhaval.java8_Day15_Filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Example2:>20
public class FilteringAge {
    public static void main(String[] args) {

        //APPROCH 1

        //GENERAL LOGIC

        List<Integer> list = Arrays.asList(66,76,32,14,12,19,22);

        for(Integer i:list){

            if(i>18){
                System.out.println(i);
            }

        }

        //STREAM
        System.out.println("********************USING STREAM API*******************");
        Stream<Integer> streamList =Stream.of(66,76,32,14,12,19,22);
        streamList.filter(n->n>18).forEach(n-> System.out.println(n));
    }

}
