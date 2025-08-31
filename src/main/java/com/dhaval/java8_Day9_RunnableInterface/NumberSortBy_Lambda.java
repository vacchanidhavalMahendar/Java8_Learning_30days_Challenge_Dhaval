package com.dhaval.java8_Day9_RunnableInterface;
//Approach 2:With Lambda Expression:

import java.util.ArrayList;
import java.util.Collections;

public class NumberSortBy_Lambda {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println("Before Sort" + arrayList);

        //compareTo is predefined method available in  Comparable interface
        //sorting the numbers,integers
        //Integer class is already implementing comparable interface
        //sorting in ascending order
        //Collections.sort(arrayList,(i,j)->i.compareTo(j));
        //
        //descending order by using descending order
        Collections.sort(arrayList,(i, j)-> (i>j)?-1 :1);
        System.out.println("After sort" +arrayList);
    }
}
