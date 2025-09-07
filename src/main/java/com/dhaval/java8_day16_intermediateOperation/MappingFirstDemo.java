package com.dhaval.java8_day16_intermediateOperation;
//Example 3: map() Method  :Get empname  and Empage whose salary is >=50,000.


import java.util.List;
import java.util.stream.Stream;

public class MappingFirstDemo {
    public static void main(String[] args) {

        Employee e1= new Employee("Dhalu", 35, 55000.00);
        Employee e2= new Employee("Dhruval", 25, 45000.00);
        Employee e3= new Employee("Dhaval", 35, 35000.00);
        Employee e4= new Employee("Patel", 45, 65000.00);

         Stream<Employee> stream = Stream.of(e1,e2,e3,e4);

         stream.filter(name->name.salary>=50000)
                 .map(e->e.name+"_"+e.age)
                 .forEach(e-> System.out.println(e));

    }
}

class Employee{
    String name;
    int age;
    double salary;

    public Employee(String name,int age, double salary){
        this.name=name;
        this.age =age;
        this.salary =salary;
    }
}
