package com.company;

public abstract class CarType {
    CarModel model;
    public CarType(CarModel m){
        model = m;
    }
    abstract void ShowDetails();

}
