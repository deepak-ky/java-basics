package com.oops_1.n1_classes_and_objects;

public class Car {
    private String make = "Hyundai";
    private String model = "Aura";
    private String color = "white";
    private int doors = 4;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        if(make == null) make = "Unknown";
        make = make.trim();
        switch (make) {
            case "Honda", "Hyundai" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Doors : " + doors);
        System.out.println("Convertible : " + convertible);
    }
}
