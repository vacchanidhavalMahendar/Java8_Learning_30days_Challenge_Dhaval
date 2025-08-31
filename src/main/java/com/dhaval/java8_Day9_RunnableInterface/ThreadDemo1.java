package com.dhaval.java8_Day9_RunnableInterface;
//Task::: WAJP to print numbers from 1 to 5 Using  Thread,With the help of  Runnable interface.
//Approach 1:By Implementing Runnable Interface
public class ThreadDemo1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        ThreadDemo1 demo1 = new ThreadDemo1();
        Thread thread = new Thread(demo1);
        thread.start();//to start executing of thread
    }
}
