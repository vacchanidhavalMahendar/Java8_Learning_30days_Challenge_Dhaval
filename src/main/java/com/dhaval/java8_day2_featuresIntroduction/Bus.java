package com.dhaval.java8_day2_featuresIntroduction;

public class Bus implements  Vehicle{

    @Override
    public void start() {

        igniteBus();
    }

    public void igniteBus(){
        System.out.println("Bus Started");
    }
}
