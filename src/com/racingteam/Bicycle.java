package com.racingteam;

public class Bicycle extends Vehicle {
    private String make;
    private String name;
    private int numberOfGears;
    private boolean hasBasket;

    public Bicycle(String name, String make, int numberOfGears, boolean hasBasket) {
        super(name);
        this.make = make;
        this.name = name;
        this.numberOfGears = numberOfGears;
        this.hasBasket = hasBasket;
    }
    public void adjustGears(int newGears) {
        switch (newGears) {
            case 1:
                System.out.println("Jesteś na pierwszym biegu - lekki, idealny na podjazdy.");
                break;
            case 2:
                System.out.println("Jesteś na drugim biegu - do jazdy po płaskim terenie.");
                break;
            case 3:
                System.out.println("Jesteś na trzecim biegu - trochę szybciej.");
                break;
            case 4:
                System.out.println("Jesteś na czwartym biegu - do szybkiej jazdy.");
                break;
            case 5:
                System.out.println("Jesteś na piątym biegu - do bardzo szybkiej jazdy.");
                break;
            case 6:
                System.out.println("Jesteś na szóstym biegu - maksymalna prędkość!");
                break;
            default:
                System.out.println("Nieprawidłowy bieg: " + newGears + ". Wybierz bieg od 1 do 6.");
                break;
        }
    }
    public boolean attachBasket() {
        return hasBasket = true;
    }

    @Override
    public void drive() {
        System.out.println("Drive the bike");
    }
    @Override
    public void stop() {
        System.out.println("Stop the bike");
    }
}
