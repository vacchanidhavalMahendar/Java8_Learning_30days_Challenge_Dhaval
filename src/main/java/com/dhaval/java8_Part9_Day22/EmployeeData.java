package com.dhaval.java8_Part9_Day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeData {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));


        //1. How many male and female employees are there in the organization?
        //Logic:grouping
        //group by based on gender and many  so count it how many employee
        Map<String, Long> mapList = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(mapList);  //{Male=11, Female=5}s


        //	2. Print the name of all departments in the organization?
        System.out.println("============Print the name of all departments in the organization=====");
        employeeList.stream().map(e -> e.getDepartment())
                .distinct()
                .forEach(name -> System.out.println(name));

        //OUTPUT
        //HR
        //Sales
        //Infrastructure
        //Development
        //Security
        //Finance
    }
}