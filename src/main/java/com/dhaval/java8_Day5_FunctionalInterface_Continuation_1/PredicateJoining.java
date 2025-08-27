package com.dhaval.java8_Day5_FunctionalInterface_Continuation_1;
//Task:Print emp names who are working in Hyd Location in DB Team.


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{

    String name;
    String location;
    String dept;


    public Employee(String name, String location, String dept) {
        super();
        this.name = name;
        this.location = location;
        this.dept = dept;
    }

public class PredicateJoining {
    public static void main(String[] args){
        Employee e1 = new Employee("Raju", "Chennai", "Devops");
        Employee e2 = new Employee("Rani", "Pune", "Networking");
        Employee e3 = new Employee("Ashok", "Hyd", "DB");
        Employee e4 = new Employee("Ganesh", "Delhi", "Testing");


        List<Employee> employees= Arrays.asList(e1,e2,e3,e4);

        Predicate<Employee> location= p->p.location.equals("Hyd");
        Predicate<Employee> deptTeam= p1->p1.dept.equals("DB");
        Predicate<Employee> predicate3 = e->e.name.startsWith("A");
        //Predicate joining
        //PREDICATE JOINING
        Predicate<Employee> predicateJoining = location.and(deptTeam).and(predicate3);

        for(Employee e: employees) {

            //Condition
            if(predicateJoining.test(e)) {
                System.out.println(e.name);
            }
        }

        //PREDICATE JOINING OR
        Predicate<Employee> predicateJoiningByOr = location.or(deptTeam);

        for(Employee e: employees) {

            if(predicateJoiningByOr.test(e)) {
                System.out.println(e.name);
            }
        }
    }

}
    }

