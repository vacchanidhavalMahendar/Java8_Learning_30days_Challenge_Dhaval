package com.dhaval.java8_Day3_LambdaExpression_1;



@FunctionalInterface
interface MyFunctional {
    void display();
}

@FunctionalInterface
interface AddOperation {
    void add(int a, int b);
}

@FunctionalInterface
interface StringLength {
    int getLength(String name);
}

@FunctionalInterface
interface GetSalary {
    double getEmpSalary(Employee emp);
}

class Employee {
    private double salary;
    public Employee(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        // Example 1: No parameter
        MyFunctional m = () -> System.out.println("Hi from Lambda!");
        m.display();

        // Example 2: Parameters, no return
        AddOperation add = (a, b) -> System.out.println("Sum: " + (a + b));
        add.add(10, 20);

        // Example 3: Return value
        StringLength length = name -> name.length();
        System.out.println("Length of 'Dhaval': " + length.getLength("Dhaval"));

        // Example 4: Object parameter
        GetSalary salaryFunc = emp -> emp.getSalary();
        System.out.println("Employee Salary: " + salaryFunc.getEmpSalary(new Employee(50000.0)));
    }
}
