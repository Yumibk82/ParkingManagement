package Views;

import Behaviors.PersonManagement;
import Behaviors.TicketManagement;
import Behaviors.VehicleManagement;
import Entities.Car;
import Entities.Person;
import Entities.Ticket;
import Entities.Vehicle;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    static VehicleManagement<Vehicle> vvm = new VehicleManagement<>();
    static TicketManagement tm = new TicketManagement();
    static PersonManagement pm = new PersonManagement();

    public static void main(String[] args) {
        start:
        do {
            System.out.println("======================");
            System.out.println("1.Vehicle Management");
            System.out.println("2.Ticket Management");
            System.out.println("======================");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 1) {
                start1:
                do {
                    System.out.println("=============");
                    System.out.println("1. ADD NEW");
                    System.out.println("2. UPDATE");
                    System.out.println("3. REMOVE");
                    System.out.println("4. SHOW");
                    System.out.println("5. BACK");
                    System.out.println("=============");
                    System.out.println("Enter your choice");
                    try {
                        int choiceMain = Integer.parseInt(input.nextLine());
                        switch (choiceMain) {
                            case 1:
                                int choiceExtra = 0;
                                do {
                                    System.out.println("-----------------");
                                    System.out.println("1. Add new car");
                                    System.out.println("2. Add new motor");
                                    System.out.println("3. Add new bike");
                                    System.out.println("4. Back to main menu");
                                    System.out.println("-----------------");
                                    System.out.println("Enter your choice");
                                    try {
                                        choiceExtra = Integer.parseInt(input.nextLine());
                                        switch (choiceExtra) {
                                            case 1:
                                                Vehicle car = Menu.getVehicleInfo("Car");
                                                vvm.add(car);
                                                break;
                                            case 2:
                                                Vehicle motor = Menu.getVehicleInfo("Motor");
                                                vvm.add(motor);
                                                break;
                                            case 3:
                                                Vehicle bike = Menu.getVehicleInfo("Bike");
                                                vvm.add(bike);
                                                break;
                                            case 4:
                                                continue start1;
                                            default:
                                                System.out.println("Enter your choice please!");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Enter a number from 1 to 4");
                                    }
                                } while (true);
                            case 2:
                                Vehicle updateVehicle = Menu.searchVehicle(vvm);
                                if (updateVehicle != null) {
                                    String className = updateVehicle.getClass().getSimpleName();
                                    Vehicle newVehicle = Menu.getVehicleInfo(className);
                                    vvm.update(newVehicle, updateVehicle);
                                }
                                break;
                            case 3:
                                Vehicle vehicleRemove = Menu.searchVehicle(vvm);
                                if (vehicleRemove != null) {
                                    vvm.remove(vehicleRemove);
                                }
                                break;
                            case 4:
                                vvm.show();
                                break;
                            case 5:
                                continue start;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a number from 1 to 5");
                    }
                }
                while (true);
            }
            else if(choice==2){
                System.out.println("1. Show ticket all");
                System.out.println("2. Add ticket");
                int choice1 = Integer.parseInt(input.nextLine());
                if(choice1 ==1){
                    tm.show();
                }else {
                    Ticket ticket = new Ticket();
                    Person person = Menu.getPersonInfo();
                    System.out.println("Enter ticket's id");
                    int idTicket = Integer.parseInt(input.nextLine());
                    ticket.setTicketNo(idTicket);
                    ticket.setPerson(person);
                    System.out.println("Enter vehicle type");
                    String vehicleType = input.nextLine();
                    Vehicle vehicle = Menu.checkTypeOfVehicle(vehicleType);
                    vehicle = Menu.getVehicleInfo("Car");
                    ticket.setVehicle(vehicle);
                    tm.add(ticket);
                }
            }
        }
            while (true) ;
    }
    }
