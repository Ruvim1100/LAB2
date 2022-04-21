package com.company;

public class Sensor {
    int temperature;
    double speed;
    double pressure;
    String tempUnit = " K";
    String speedUnit = " м/c";
    String pressureUnit = " Па";

    public Sensor(){
        this.temperature = (int) ( (Math.random() * 100) + 273);
        this.speed = (int) ( Math.random() * 50 );
        this.pressure = (int) ( (Math.random() * 700000) + 200000);
    }

    void getTemperature(){
        System.out.println("Температура = " + temperature + tempUnit);
    }

    void getSpeed(){

        System.out.println("Скорость = " + speed + speedUnit);
    }

    void getPressure(){
        System.out.println("Давление = " + pressure + pressureUnit);
    }

}
