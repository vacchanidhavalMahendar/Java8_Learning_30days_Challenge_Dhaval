package com.dhaval.java8_day10_StringJoiner_OptionalClass;

import java.util.Optional;

public class User {
    //Expecting int as a parameter and returning string type
    public String getUserNameById(Integer id){

        if(id==100){
            return "raju";
        }

        else if(id==101){
            return "dhaval";
        }
       else{
           return "null";
        }
    }

    //Expecting int as a parameter and returning string type
    public Optional<String> getUserName(Integer id) {

        String nameString = null;

        if(id==100) {
            nameString = "Raju";
        }

        else if(id ==101) {
            nameString =  "Rani";
        }

        else if(id==102) {
            nameString =  "John";
        }

        return Optional.ofNullable(nameString); //Whatever iam returning from this method.That can be a value or that can be a null
        //here return Optional means,data may be available or data may not be available

    }
}
