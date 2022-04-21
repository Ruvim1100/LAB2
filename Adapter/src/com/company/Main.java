package com.company;

public class Main {

    public static void main(String[] args) {
        ClientInterface data = new SensorAdapter();
        data.showTemperature();
        data.showSpeed();
        data.showPressure();
    }
}
