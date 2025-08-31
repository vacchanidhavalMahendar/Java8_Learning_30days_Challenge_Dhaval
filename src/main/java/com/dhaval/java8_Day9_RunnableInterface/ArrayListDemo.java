package com.dhaval.java8_Day9_RunnableInterface;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();

        aList.add(5);
        aList.add(4);
        aList.add(3);
        aList.add(2);
        aList.add(1);

        for(int i =0;i<aList.size();i++) {
            System.out.println(aList.get(i));
        }

        System.out.println("===========================");

        //foreach

        System.out.println("===========================");
        for(int i:aList) {
            System.out.println(i);
        }

        //foreach
        System.out.println("=====USING FOREACH============");

        aList.forEach(i->System.out.println(i));
    }

}
