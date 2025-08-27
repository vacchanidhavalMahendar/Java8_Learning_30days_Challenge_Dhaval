package com.dhaval.java8_Day5_FunctionalInterface_Continuation_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//TASK 2:: Take List of Persons and Print persons whose age is >=18  using Lambda Expression
class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;

    }
}
public class PredicatePersonsDemo {
    public static void main(String[] args){

        Person person= new Person("Dhaval",25);
        Person person2= new Person("Dhruv",26);
        Person person3= new Person("Dhalu",18);
            //Convert inyo list

        List<Person> personList= Arrays.asList(person,person2,person3);
        Predicate<Person> predicate = p->p.age>=18;

        for(Person p: personList){
            if(predicate.test(p)){
                System.out.println(p.name);
            }
        }
    }
}
