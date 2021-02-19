package Entities;

public class Bike extends Vehicle{
    private String pedalType;

    public Bike(){
    }

    public Bike(String pedalType) {
        this.pedalType = pedalType;
    }

    public Bike(int licencePlate, String name, String model, String color, String pedalType) {
        super(licencePlate, name, model, color);
        this.pedalType = pedalType;
    }

    public String getPedalType() {
        return pedalType;
    }

    public void setPedalType(String pedalType) {
        this.pedalType = pedalType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "pedalType='" + pedalType + '\'' +
                "} " + super.toString();
    }
}
