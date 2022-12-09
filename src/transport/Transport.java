package transport;

import java.util.regex.Pattern;

public abstract class Transport {
    private String brand;
    private String model;
    final private int year;
    final private String country;
    private String color;
    private int maxSpeed;
    private double fuelPercentage;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed,
                     double fuelPercentage) {
        setBrand(brand);
        setModel(model);
        this.year = year;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelPercentage(fuelPercentage);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            brand = "Не указан";
        }  this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            model = "Не указана";
        }  this.model = model;
    }
    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "не указан";
        }  this.color = color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 350) {
            maxSpeed=350;
        }  this.maxSpeed = maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage <= 0) {
            fuelPercentage= 5;        }
        this.fuelPercentage = fuelPercentage;
    }


    public abstract void refill();
}