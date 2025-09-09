package com.dhaval.java8_Day18_Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//i want to store the matching records in another collection
public class CollectorsWithStream {

    public static void main(String[] args) {
        // TODO Auto-generated method stub





        Persons p1 = new Persons("John", "USA");
        Persons p2 = new Persons("Steve", "JAPAN");
        Persons p3 = new Persons("Ashok", "INDIA");
        Persons p4 = new Persons("Ching", "CHINA");
        Persons p5 = new Persons("Kumar", "INDIA");

        List<Persons> persons =	Arrays.asList(p1,p2,p3,p4,p5);

        Optional<Persons> findFirst =persons.stream().filter(p->p.country.equals("INDIA"))
                .findFirst();


        if(findFirst.isPresent()) {
            System.out.println(findFirst.get());
        }

        //Adding that in another collection,Whatever the data that is in the stream,That stream data we are collectiing and storing into another list or collection

        List<Persons> indianss =persons.stream().filter(p->p.country.equals("INDIA"))
                .collect(Collectors.toList());

//	 	System.out.println(indianss.size());  /2
        indianss.forEach(s->System.out.println(s));

    }

}

class Persons{
    String name;
    String country;

    public Persons(String name,String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Persons [name=" + name + ", country=" + country + "]";
    }


}
