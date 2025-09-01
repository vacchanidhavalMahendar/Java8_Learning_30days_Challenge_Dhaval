package com.dhaval.java8_day10_StringJoiner_OptionalClass;

public class OptionalIntroduction {

 /*
1.It is present in java.util.Optional class Introduced in java 1.8v
2.Optional class is used to avoid NullPointerExceptions in the program.
            3.When we have NullPointer Exception,Program will compile to fail.
4.Exception:When our exception occurs ,our program will be terminately abruptly

5.When u perfrom some operations on null,we get NullPointerException

6.Can you guarantee,in project everyone will do Null Check to perform the operations on object.No right
    some may or may not be.

            7.To Avoid NullPointer ,we need to do null check
    Sometimes object may have data or may not have data,if we get nullpointerexception,program will abrupt normally


8.What is NullPointerException:

    When we perform so me operations on null value,Then we  will get NullPointerException

    String s = null;
s.length(); //NPE

if(s!=null){
        System.out.println(s.length());
    }

9.To avoid NullPointerExceptions ,We have to implement null check ,before performing Operations on the Object.


    Note:: In project,There is no Guranetee that every programmer will  implement null checks.
    If any body forgot to implement null check then program will run into NullPointerEXCEPTION*/
}
