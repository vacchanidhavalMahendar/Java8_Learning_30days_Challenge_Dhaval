package com.dhaval.java8_Day8_FunctionalInterface;


import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        //Doctor doctor = new Doctor();  this is normal way
        //Doctor:: new  :Constructor Reference
//		/:: new  ->Constructor Reference
        Supplier<Doctor> supplier=	Doctor:: new;

        Doctor doctor =supplier.get();
        System.out.println(doctor.hashCode());
        System.out.println(supplier.get().hashCode());


    }

}

class Doctor{


    public Doctor() {

        System.out.println("Doctor Constructor.............");
    }

    /*
     * public Doctor(int i) {
     *
     * System.out.println("Doctor Constructor............."); }
     */
}
