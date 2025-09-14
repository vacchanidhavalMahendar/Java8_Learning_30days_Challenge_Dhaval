package com.dhaval.java8_Day21_Part82;

import java.util.stream.Stream;
public class ParallelDemo {
    public static void main(String[] args) {

        //Thread.currentThread()  :Will give the name of current Thread.
        System.out.println("===========Serial Stream=================");

        Stream<Integer> srStream =Stream.of(1,2,3,4);
        srStream.forEach(e->System.out.println(e +"::"  +Thread.currentThread()));

        System.out.println("===========Parallel Stream=================");

        Stream<Integer> parallelStream =Stream.of(1,2,3,4);

        parallelStream.parallel().forEach(n->System.out.println(n +"::" +Thread.currentThread()));

        /*
         * ===========Serial Stream================= 1::Thread[main,5,main]
         * 2::Thread[main,5,main] 3::Thread[main,5,main] 4::Thread[main,5,main]
         * ===========Parallel Stream================= 3::Thread[main,5,main]
         * 4::Thread[main,5,main] 2::Thread[main,5,main] 1::Thread[main,5,main]
         */

    }

}
