package com.company;

public class Main {

    public static void main(String[] args) {
        CarType car = new Sedan(new Toyota());
        car.ShowDetails();

        car = new Coupe(new Mercedes());
        car.ShowDetails();

    }
}
