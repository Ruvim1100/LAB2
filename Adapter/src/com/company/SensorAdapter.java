package com.company;

public class SensorAdapter extends Sensor implements ClientInterface{
    @Override
    public void showTemperature() {
        temperature = temperature - 273;
        tempUnit = " C";
        getTemperature();
    }

    @Override
    public void showSpeed() {
        speed = speed * 3.6;
        speedUnit = " км/ч";
        getSpeed();
    }

    @Override
    public void showPressure() {
        pressure = pressure * 0.00000986923266;
        pressureUnit = " Атмосфер";
        getPressure();
    }

}
