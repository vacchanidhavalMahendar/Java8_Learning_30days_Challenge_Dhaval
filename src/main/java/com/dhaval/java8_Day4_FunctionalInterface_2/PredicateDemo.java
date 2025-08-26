package com.dhaval.java8_Day4_FunctionalInterface_2;

//Explanation:PREDICATE
//It is Predefined Functional Interface
//2.It is used  to check Conditions and returns (true or false).
//   3.Predicate interface having only one abstract method, that is  test(T t);4.it is used to take input and return true or false based on condition.
//4.Syntax:
// interface  Predicate{
 //   boolean test(T t); // T:of any Object Type.
//}

import java.util.function.Predicate;

public class PredicateDemo {

//WITHOUT PREDICATE

    public boolean test(int i){
        if(i>10){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        Predicate<Integer> predicate=i->i>10;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(20));
    }
}
