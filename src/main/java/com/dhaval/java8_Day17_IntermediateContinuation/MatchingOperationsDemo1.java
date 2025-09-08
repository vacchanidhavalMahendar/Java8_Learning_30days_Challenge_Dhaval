package com.dhaval.java8_Day17_IntermediateContinuation;

import java.util.Arrays;
import java.util.List;

public class MatchingOperationsDemo1 {

    public static void main(String[] args) {
        Person p1 = new Person("John", "USA");
        Person p2 = new Person("Steve", "JAPAN");
        Person p3 = new Person("Ashok", "INDIA");
        Person p4 = new Person("Ching", "CHINA");

        List<Person> persons =	Arrays.asList(p1,p2,p3,p4);

        //anyMatch() :its expecting predicate,EACH AND EVERY RECORDS WITH THAT CONDITION
        boolean status = persons.stream().anyMatch(p->p.country.equals("INDIA"));
        System.out.println("Any India Available"+ status);

        //
        boolean status2 = persons.stream().anyMatch(p->p.country.equals("CANADA"));
        System.out.println("Any Canadian Available" +status2);


        //all these persons are from india are not
        //allMatch()

        boolean status3 = persons.stream().allMatch(p->p.country.equals("INDIA"));
        System.out.println("All Persons are from India" +status3);


        boolean status4 = persons.stream().noneMatch(p->p.country.equals("MEXICO"));
        System.out.println("All Persons are from India" +status4);


    }

}

class Person{
    String name;
    String country;

    public Person(String name,String country) {
        this.name = name;
        this.country = country;
    }
}

