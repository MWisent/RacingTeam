package com.racingteam;

public interface PoweredVehicle extends Vehicle {

    void start();
    void turnOff();

    double getFuelConsumption(int kilometers);
    default  int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    };
}
