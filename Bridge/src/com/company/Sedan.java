package com.company;

public class Sedan  extends CarType{
    public Sedan(CarModel m){
        super(m);
    }

    @Override
    void ShowDetails() {
        model.setModel();
        System.out.println("Car type: Sedan");
    }

}
