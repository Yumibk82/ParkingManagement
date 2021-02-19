package Behaviors;

import Entities.Bike;
import Entities.Car;
import Entities.Motor;
import Entities.Vehicle;
import java.util.Scanner;

public class VehicleFactory{
    public static Vehicle getVehicle(String type) {
        Scanner input = new Scanner(System.in);
        switch (type) {
            case "Car":
                Car car = new Car();
                System.out.println("Enter car's safeDriveMode");
                String safeDriveMode = input.nextLine();
                car.setSafeDriveMode(safeDriveMode);
                return car;
            case "Motor":
                Motor motor = new Motor();
                System.out.println("Enter motor's transmissionMode");
                String transmissionMode = input.nextLine();
                motor.setTransmissionMode(transmissionMode);
                return motor;
            case "Bike":
                Bike bike = new Bike();
                System.out.println("Enter bike's pedalType");
                String pedalType = input.nextLine();
                bike.setPedalType(pedalType);
                return bike;
            default:
                return null;
        }
    }
}
