package com.racingteam;

import java.util.Objects;

public class Motorcycle extends PoweredVehicle implements Alarm {
    private String make;
    private String name;
    private boolean isSportMotorbike;
    private double consumption;
    private GearboxType gearboxType;
    private Engine engine;


    public Motorcycle(int kilometers, int rpm, int torque, String make, String name, boolean isSportMotorbike, double consumption, GearboxType gearboxType, Engine engine) {
        super(kilometers, rpm, torque);
        this.make = make;
        this.name = name;
        this.isSportMotorbike = isSportMotorbike;
        this.consumption = consumption;
        this.gearboxType = gearboxType;
        this.engine = engine;
    }

    public Motorcycle(int kilometers, int rpm, int torque, String make, String name, boolean isSportMotorbike, double consumption, GearboxType gearboxType, String type, FuelType fuelType) {
        super(kilometers, rpm, torque);
        this.make = make;
        this.name = name;
        this.isSportMotorbike = isSportMotorbike;
        this.consumption = consumption;
        this.gearboxType = gearboxType;
        this.engine = new Engine(type, fuelType);
    }

    private void checkMotorcycle() {
        if (engine == null) {
            throw new IllegalStateException("no engine!");
        }
        if (isSportMotorbike == true) {
            System.out.println("SportowA wersje motocyklu");
        } else {
            System.out.println("Nie sportowa wersja motocyklu");
        }
    }
    private void changeGear() {
        if (gearboxType == GearboxType.DCT) {
            System.out.println("Automatyczna skrzynia biegów w Motocyklu!");
        } else {
            System.out.println(" klasyczna, bezstopniowa skrzynia biegów w Motocyklu!");
        }
    }


    @Override
    public void start() {
        checkMotorcycle();
        engine.start();
        System.out.println(name + " started");
    }

    @Override
    public void turnAlarmOn() {
        System.out.println("Alarm on in motocycle!");
    }
    @Override
    public void turnAlarmOff() {
        System.out.println("Alarm off");
    }

    @Override
    public void turnOff() {
        System.out.println(name + "Turn off engine!");
    }

    @Override
    public double getFuelConsumption(int kilometers) {

        return (consumption / 100.0) * kilometers;
    }

    @Override
    public void drive() {
        checkMotorcycle();
        changeGear();
        System.out.println("Jedzie motocykl");
    }

    @Override
    public void stop() {
        System.out.println("Stop Motorcycle!");

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSportMotorbike() {
        return isSportMotorbike;
    }

    public void setSportMotorbike(boolean sportMotorbike) {
        isSportMotorbike = sportMotorbike;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", isSportMotorbike=" + isSportMotorbike +
                ", consumption=" + consumption +
                ", gearboxType=" + gearboxType +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return isSportMotorbike == that.isSportMotorbike && Double.compare(consumption, that.consumption) == 0 && Objects.equals(make, that.make) && Objects.equals(name, that.name) && gearboxType == that.gearboxType && Objects.equals(engine, that.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, name, isSportMotorbike, consumption, gearboxType, engine);
    }
}
