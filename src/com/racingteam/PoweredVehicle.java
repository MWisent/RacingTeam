package com.racingteam;

import java.util.Objects;

public abstract class PoweredVehicle extends Vehicle  {
        private int kilometers;
        private int rpm;
        private int torque;

    public PoweredVehicle(String name, int kilometers, int rpm, int torque) {
        super(name);
        this.kilometers = kilometers;
        this.rpm = rpm;
        this.torque = torque;
    }

    public void start() {
        System.out.println("Start engine in " + super.getName());
    };
    public void turnOff() {};

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }


    public double getFuelConsumption(int kilometers) {
            return this.kilometers;
    };
    public  int getHorsePower(int rpm, int torque) {
            return (rpm * torque) / 5252;
    };

    @Override
    public String toString() {
        return "PoweredVehicle{" +
                "kilometers=" + kilometers +
                ", rpm=" + rpm +
                ", torque=" + torque +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoweredVehicle that = (PoweredVehicle) o;
        return kilometers == that.kilometers && rpm == that.rpm && torque == that.torque;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kilometers, rpm, torque);
    }
}
