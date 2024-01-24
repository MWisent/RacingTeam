package com.racingteam;

import java.util.ArrayList;
import java.util.List;

public class RacingTeam {
    private List<PoweredVehicle> poweredVehicles;

    public RacingTeam() {
        this.poweredVehicles = new ArrayList<>();
    }
    public void addVehicle(PoweredVehicle vehicle) {
        poweredVehicles.add(vehicle);
    }
    public void removeVehicle(PoweredVehicle vehicle) {
        poweredVehicles.remove(vehicle);
    }
    public List<PoweredVehicle> getAllVehicle() {
        return new ArrayList<>(poweredVehicles);
    }
    /**
     * Sprawdz, czy zespół może pokonać daną trasę z podaną ilością paliwa.
     * @param distance Dstans do pokonania.
     * @param fuelAmount Ilość dostępnego paliwa.
     * @return true jęsli zespół może pokonać trasę, w przeciwnym razie false.
     * */
    public boolean canRace(int distance, double fuelAmount) {
        double requiredFuel = 0.0;
        for (PoweredVehicle vehicle : this.poweredVehicles) {
            requiredFuel += vehicle.getFuelConsumption(distance);
        }
        return fuelAmount >= requiredFuel;
    }
}
