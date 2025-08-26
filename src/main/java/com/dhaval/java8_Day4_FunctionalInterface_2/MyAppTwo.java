package com.dhaval.java8_Day4_FunctionalInterface_2;


@FunctionalInterface
interface MyInterface{
    public void m1();
}
public class MyAppTwo {
public static void main(String[] args){

    MyInterface myinterface=()-> System.out.println("my m1 () method is called");

    myinterface.m1();


}

    //lAMBDA:noname,no modifier,no return type


}
