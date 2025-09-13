package com.dhaval.java8_Day20_Part8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingData {
    public static void main(String[] args) {

        Employees  e1 = new Employees(1, "Robert", 26500.00,"USA");
        Employees e2 = new Employees(2, "Abraham", 46500.00,"INDIA");
        Employees e3 = new Employees(3, "Ching", 36500.00,"CHINA");
        Employees e4 = new Employees(4, "David", 16500.00,"INDIA");
        Employees e5 = new Employees(5, "Cathy", 25500.00,"CHINA");

        //Stream is created with data
        Stream<Employees> stream =	Stream.of(e1,e2,e3,e4,e5);

        List<Employees> list= Arrays.asList(e1,e2,e3,e4,e5);



        //grouping by
        Map<String, List<Employees>> data= list.stream().collect(Collectors.groupingBy(e->e.location));

        System.out.println("Grouping by based on location or country" + data);
    }

}

class Employees {
    int id;
    String name;
    double salary;
    String location;


    public Employees(int id, String name, double salary, String location) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + "]";
    }


}
//Grouping by based on location or country{USA=[Employee [id=1, name=Robert, salary=26500.0, location=USA]], CHINA=[Employee [id=3, name=Ching, salary=36500.0, location=CHINA], Employee [id=5, name=Cathy, salary=25500.0, location=CHINA]], INDIA=[Employee [id=2, name=Abraham, salary=46500.0, location=INDIA], Employee [id=4, name=David, salary=16500.0, location=INDIA]]}
