package com.racingteam;

import java.sql.SQLOutput;
import java.util.Objects;

public class Car extends PoweredVehicle implements Alarm {
    private String make;
    private String name;
    private int numberOfDoors;
    private double consumption;
    private GearboxType gearboxType;
    private Engine engine;


    public Car(int kilometers, int rpm, int torque, String make, String name, int numberOfDoors, double consumption, GearboxType gearboxType, Engine engine) {
        super(kilometers, rpm, torque);
        this.make = make;
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
        this.gearboxType = gearboxType;
        this.engine = engine;
    }

    public Car(int kilometers, int rpm, int torque, String make, String name, int numberOfDoors, double consumption, String type, FuelType fuelType) {
        super(kilometers, rpm, torque);
        this.make = make;
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.consumption = consumption;
        this.engine = new Engine(type, fuelType);
    }

    private void checkEngine() {
        if (engine == null) {
            throw new IllegalStateException("No engine!");
        }
    }
    private void changeGear() {
        if (gearboxType == GearboxType.MANUAL) {
            System.out.println("Zmienianie biue na Maualna");
        } else if (gearboxType ==GearboxType.AUTOMATIC) {
            System.out.println("Automatyczna skrzynia biegów zajmuje się zmianą biegu. ");
        } else {
            System.out.println("Półautomatyczna skrzynia biegów zmienia bieg.");
        }
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

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
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
    public void turnAlarmOn() {
        System.out.println("Alarm on in car!");
    }
    @Override
    public void turnAlarmOff() {
        System.out.println("Alarm off");
    }

    @Override
    public void start() {
        checkEngine();
        engine.start();
        System.out.println(name + " Start engine!");
    }

    @Override
    public void turnOff() {
        System.out.println(name + "Turn off engine!");
    }
    @Override
    public void drive() {
        checkEngine();
        changeGear();
        System.out.println("Drive car!");
    }

    @Override
    public void stop() {
        System.out.println("Stop car!");
    }

    @Override
    public double getFuelConsumption(int kilometers) {
        return (consumption / 100.0) * kilometers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", consumption=" + consumption +
                ", gearboxType=" + gearboxType +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors && Double.compare(consumption, car.consumption) == 0 && Objects.equals(make, car.make) && Objects.equals(name, car.name) && gearboxType == car.gearboxType && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, name, numberOfDoors, consumption, gearboxType, engine);
    }
}
