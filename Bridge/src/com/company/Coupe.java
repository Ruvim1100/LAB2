package com.company;

public class Coupe  extends CarType{
    public Coupe(CarModel m) {
        super(m);
    }

    @Override
    void ShowDetails() {
        model.setModel();
        System.out.println("Car type: Coupe");
    }

}
