package com.dhaval.java8_day10_StringJoiner_OptionalClass;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter UserId");

        int userId = scanner.nextInt();

        User user = new User();

        String userNameString = user.getUserNameById(userId);

        //comvert username to uppercase

        if(userNameString!=null) {  //Perform these operations if that is null.s
            String msgString= userNameString.toUpperCase()+",Hello";
            System.out.println(msgString);
        }
        else {
            System.out.println("Invalid ID");
        }

        //By using Optional
        Optional<String> optional= user.getUserName(userId);

        if(optional.isPresent()) {  //Really we have data or not,if its present do
            String name= optional.get();
            System.out.println(name.toUpperCase()+",Hello");
        }
        else {
            System.out.println("No Data Found");
        }
    }

}