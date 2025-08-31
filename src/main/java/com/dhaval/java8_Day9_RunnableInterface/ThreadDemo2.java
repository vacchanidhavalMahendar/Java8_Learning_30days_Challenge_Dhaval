package com.dhaval.java8_Day9_RunnableInterface;
////BY USING Approach2 by using runnable2 anonymous
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
    for(int i =0;i<=5;i++){
        System.out.println(i);
    }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
