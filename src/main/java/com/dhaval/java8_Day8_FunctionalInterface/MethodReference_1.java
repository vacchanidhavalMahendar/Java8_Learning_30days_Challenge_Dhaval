package com.dhaval.java8_Day8_FunctionalInterface;


@FunctionalInterface
interface MyInterface{
    public void m1(); //Only One Abstract method
}

public class MethodReference_1 {
    public static void m2() {
        System.out.println("This is m2() method");
    }


    public static void main(String[] args) {

        //ClassName.method()
        MethodReference_1.m2();
        //MyInterface mInterface = () ->System.out.println("hi");
        MyInterface mInterface = MethodReference_1::m2;  //Iam referring my interface with this m2

        //myinterface is pointing to MethodReference_1
        mInterface.m1();  //This is m2() method
        //calling m1 method but its executing m2() method
        //iam referring from one method to another method

    }

}
