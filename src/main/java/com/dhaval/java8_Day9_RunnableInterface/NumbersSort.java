package com.dhaval.java8_Day9_RunnableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//TASK:: WAJP To store numbers in ArrayList and sort numbers in descending Order
public class NumbersSort {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

            arrayList.add(5);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);

        Collections.sort(arrayList,new NumberComparator());

        System.out.println("After sort" +arrayList);


    }

}

class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i, Integer j) {

        if(i>j) {
            return -1;   //donot shift it if its Negative
        }
        else if(i<j) {
            return 1;  //do swapping
        }
        return 0;
    }

}
