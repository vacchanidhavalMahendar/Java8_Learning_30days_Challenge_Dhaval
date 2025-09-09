package com.dhaval.java8_Day18_Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TASK:Collect names of person who are belongs to india and store into names collection.
public class CollectorsDemo2 {
    public static void main(String[] args) {

        Personss p1 = new Personss("John", "USA");
        Personss p2 = new Personss("Steve", "JAPAN");
        Personss p3 = new Personss("Ashok", "INDIA");
        Personss p4 = new Personss("Ching", "CHINA");
        Personss p5 = new Personss("Kumar", "INDIA");


        List<Personss> persons =	Arrays.asList(p1,p2,p3,p4,p5);

        List<String> personsbelongsToIndia = persons.stream().filter(p->p.country.equals("INDIA"))
                .map(p->p.name).collect(Collectors.toList());


        System.out.println(personsbelongsToIndia); //[Ashok, Kumar]
    }

}
class Personss{
    String name;
    String country;

    public Personss(String name,String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Personss [name=" + name + ", country=" + country + "]";
    }


}
