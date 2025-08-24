package com.dhaval.java8_day2_featuresIntroduction;


interface Vehicle{
    void start();
}

 class Car implements Vehicle{
     @Override
     public void start() {
         System.out.println("start method implementation");
         startCar();
     }

     public void startCar(){
         System.out.println("Car has Started");
     }

     public static void main(String[] args){
         Vehicle v1 = new Car();  //Calls Car-> startCar()
         Vehicle v2= new Bike(); // Calls Bus -> igniteBus()
         Vehicle v3= new Bus();  // Calls Bike -> kickStartBike()
         v1.start();
         v2.start();
         v3.start();
     }
 }
