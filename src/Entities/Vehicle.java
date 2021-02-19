package Entities;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private int licencePlate;
    private String name;
    private String model;
    private String color;

    public Vehicle(){}

    public Vehicle(int licencePlate, String name, String model, String color) {
        this.licencePlate = licencePlate;
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public int getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(int licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licencePlate=" + licencePlate +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
