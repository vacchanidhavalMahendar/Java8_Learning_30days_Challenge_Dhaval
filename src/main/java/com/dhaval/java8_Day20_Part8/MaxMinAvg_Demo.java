package com.dhaval.java8_Day20_Part8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

////Task 1:Write a java program to get MAX,MIN AND AVG salary from the  given employee  data by using java8.  (Frequently Asked Questions).
public class MaxMinAvg_Demo {
public static void main(String[] args){

    Employee  e1 = new Employee(1, "Robert", 26500.00);
    Employee e2 = new Employee(2, "Abraham", 46500.00);
    Employee e3 = new Employee(3, "Ching", 36500.00);
    Employee e4 = new Employee(4, "David", 16500.00);
    Employee e5 = new Employee(5, "Cathy", 25500.00);

  Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5);

    List<Employee> list= Arrays.asList(e1,e2,e3,e4,e5);

    //1.MAX  :Syntax  : stream.collect(Collectors.maxBy(Comparator.comparing(lambda Type)));

    Optional<Employee> employeesOptional = stream.collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
if(employeesOptional.isPresent()){

    System.out.println("Max salary"+ employeesOptional.get().salary);
}

//2.Min Salary
    Optional<Employee> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));

    System.out.println("min salary  ::"+ minSalary.get().salary);

//AVG salary

    //AVG salary
    Double averageSalary= list.stream().collect(Collectors.averagingDouble(e->e.salary));

    System.out.println("Average Salary is :::" + averageSalary);
    //Average Salary is :::30300.0


}
}



class Employee{
    int id;
    String name;
    double salary;



    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }



}
