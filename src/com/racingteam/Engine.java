package com.racingteam;

import java.util.Objects;

public class Engine  {
    private String type;
    private FuelType fuelType;

    public Engine(String type, FuelType fuelType) {
        this.type = type;
        this.fuelType = fuelType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void getDescription() {
        if (fuelType == FuelType.DIESEL || type.toLowerCase().equals("disel")) {
            System.out.println("Typ silnika: " + type + "\n" + "Typ paliwat: " +  getFuelType().toString());
        } else {
            System.out.println("Typ silnika: " + type + "\n" + "Typ paliwat: " +  getFuelType().toString());
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", fuelType=" + fuelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(type, engine.type) && fuelType == engine.fuelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, fuelType);
    }

    public void start() {
        System.out.println("Start engine!");
    }
    public void turnOff() {
        System.out.println("Turn off engine!");
    }

}
