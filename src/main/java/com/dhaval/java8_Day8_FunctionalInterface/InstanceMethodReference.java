package com.dhaval.java8_Day8_FunctionalInterface;

public class InstanceMethodReference {
    public void m1(){

        for(int i =0;i<=5;i++){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();

        Runnable runnable = instanceMethodReference::m1;

        Thread thread =new Thread(runnable);

        thread.start();
    }
}
