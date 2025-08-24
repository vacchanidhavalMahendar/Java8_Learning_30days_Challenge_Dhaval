package com.dhaval.java8_day2_featuresIntroduction;

public class Bike implements  Vehicle{

    @Override
    public void start() {
    kickStartBike();
    }

    public void kickStartBike(){
        System.out.println("Bike Started");
    }




}
