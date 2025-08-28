package com.dhaval.java8_Day6_FunctionalInterface_Continuation_2;

import java.util.function.Supplier;

public class SupplierSystemInfoDemo {
    public static void main(String[] args) {
        Supplier<String> osSupplier = () -> System.getProperty("os.name");
        Supplier<String> javaVersionSupplier = () -> System.getProperty("java.version");

        System.out.println("Operating System: " + osSupplier.get());
        System.out.println("Java Version: " + javaVersionSupplier.get());
    }
}

