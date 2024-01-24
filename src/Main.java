import com.racingteam.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        RacingTeam racingTeam = new RacingTeam();

        // Initialize the Car
        Car car1 = new Car("Audi", "r8", 4, 7.6, GearboxType.AUTOMATIC, new Engine("Disel", FuelType.DIESEL));
        Car car2 = new Car("BMW", "M3", 4, 9.6, GearboxType.MANUAL, new Engine("Patrol", FuelType.PATROL));
        Motorcycle motorcycle1 = new Motorcycle(
                "Honda", "CBR1000RR-R Fireblade",
                true, 10.0,
                GearboxType.DCT, new Engine("Patrol",
                FuelType.PATROL)
        );
        // Initialize the motorcycle
        Motorcycle motorcycle2 = new Motorcycle(
                "Honda", "CMX500 Rebel",
                true, 9.0,
                GearboxType.CVT, new Engine("Diesel",
                FuelType.DIESEL)
        );
        // Initialize the bicycle
        Bicycle bicycle1 = new Bicycle("SANTA CRUZ", "V10 8 CC MX/29 DH X01 GLOSS RED 2024", 6, false);
        Bicycle bicycle2 = new Bicycle("Neuron", "ON 6 ", 5, false);

        racingTeam.addVehicle(car1);
        racingTeam.addVehicle(car2);
        racingTeam.addVehicle(motorcycle1);
        racingTeam.addVehicle(motorcycle2);

        // Alarm
        System.out.println("AlarmL: " + "------");
        car1.turnAlarmOn();
        car2.turnAlarmOn();
        motorcycle1.turnAlarmOn();
        motorcycle2.turnAlarmOn();
        car1.turnAlarmOff();
        car2.turnAlarmOff();
        motorcycle1.turnAlarmOff();
        motorcycle2.turnAlarmOff();

        if (racingTeam.canRace(100, 2000)) {
            System.out.println("--------------------------------");
            System.out.println("Zespół może wziąć udział w wyścigu.");
        } else {
            System.out.println("--------------------------------");
            System.out.println("Zespół nie ma wystarczająco paliwa na wyścig.");

        }

        for (PoweredVehicle vehicle : racingTeam.getAllVehicle()) {
            if (car1 instanceof Car || car2 instanceof Car) {
                System.out.println("Moment obotowy i moc silnika samochodu jest: " + vehicle.getHorsePower(4600, 100));
            } else {
                System.out.println("Moment obotowy i moc silnika motocyklu jest: " + vehicle.getHorsePower(5600, 100));

            }
            vehicle.start();
            vehicle.turnOff();
            vehicle.drive();
            vehicle.stop();
        }
        // Bicycle moetod
        System.out.println("Bicycles");
        System.out.println("--------------------------------");
        bicycle1.drive();
        bicycle2.adjustGears(6);
        bicycle1.attachBasket();
        bicycle2.drive();
        bicycle2.stop();
        bicycle1.stop();
    }
}