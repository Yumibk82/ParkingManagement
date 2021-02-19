package Views;

import Behaviors.VehicleFactory;
import Behaviors.VehicleManagement;
import Entities.Person;
import Entities.Vehicle;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static Vehicle getVehicleInfo(String type){
        Vehicle vehicle = VehicleFactory.getVehicle(type);
        System.out.println("Enter vehicle's licencePlate");
            int licencePlate = Integer.parseInt(input.nextLine());
            vehicle.setLicencePlate(licencePlate);
        System.out.println("Enter vehicle's name");
            String name = input.nextLine();
            vehicle.setName(name);
        System.out.println("Enter vehicle's model");
            String model = input.nextLine();
            vehicle.setModel(model);
        System.out.println("Enter vehicle's color");
            String color = input.nextLine();
            vehicle.setColor(color);
        return vehicle;
    }
    public static Vehicle searchVehicle(VehicleManagement<Vehicle> vm){
        System.out.println("Enter licencePlate");
        int licencePlate = Integer.parseInt(input.nextLine());
        Vehicle vehicle = vm.search(licencePlate);
        if(vehicle == null){
            System.out.println("No vehicle");
            return null;
        }else return vehicle;
    }
    public static Person getPersonInfo(){
        Person person = new Person();
        System.out.println("Enter person's id");
        int id = Integer.parseInt(input.nextLine());
        person.setId(id);
        System.out.println("Enter person's name");
        String name = input.nextLine();
        person.setName(name);
        System.out.println("Enter person's address");
        String address = input.nextLine();
        person.setAddress(address);
        return person;
    }
    public static Vehicle checkTypeOfVehicle(String vehicleType){
        vehicleType = input.nextLine();
        Vehicle vehicle = new Vehicle();
        if(vehicleType=="Car") {
            vehicle = Menu.getVehicleInfo("Car");
        }else if(vehicleType=="Motor"){
            vehicle = Menu.getVehicleInfo("Motor");
        }else if(vehicleType=="Bike"){
            vehicle = Menu.getVehicleInfo("Bike");
        }
        return vehicle;
    }
}
