package Opgave04.Models;

public class Car {
    private String brand;
    private String model;
    private int topSpeed;//kilometers per hour.

    public Car(String brand, String model, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.topSpeed = topSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }



}
