package com.dhaval.java8_Day4_FunctionalInterface_2;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        String[] names ={"Anushksa","Anupama","Deepika","Kajol","Sunny"};
        Predicate<String> namePredicate= name->name.charAt(0)=='A';

        for(String name:names){
            if(namePredicate.test(name)){
                System.out.println(name);
            }
        }
    }
}
