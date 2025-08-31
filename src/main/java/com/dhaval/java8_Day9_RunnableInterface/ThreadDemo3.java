package com.dhaval.java8_Day9_RunnableInterface;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Runnable runnable=()->
        {
            for(int i=1;i<=5;i++){
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
