package com.dhaval.java8_Day15_Filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//TASK:filter the record whose age is greater than  or equal to 18
public class StreamFilterDemo {

    public static void main(String[] args) {

        User user1 = new User("Dhaval",18);
        User user2 = new User("Patel",17);
        User user3 = new User("Dhruv",28);
        User user4 = new User("vacchani",22);

         List<User> usersList  = Arrays.asList(user1,user2,user3,user4);

         //.of() ,method
        Stream<User> userStream = Stream.of(user1,user2,user3,user4);
        userStream.filter(u->u.age>=18&&u.name.startsWith("D")).forEach(u-> System.out.println(u));

    }
}


class User{

    String name;
    int age;

    User(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
