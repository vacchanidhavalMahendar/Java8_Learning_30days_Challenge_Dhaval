package com.dhaval.java8_Day12_StreamAPI_Introduction;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        //Approach 1:Stream.of()

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);

        ArrayList<String> arryaList = new ArrayList<>();
        arryaList.add("Dhaval");
        arryaList.add("Patel");
        arryaList.add("Orlen");

        //Approach 2  :stream()
        Stream<String> stream2=arryaList.stream();
    }
}
