package com.oops_1.n1_classes_and_objects;

public class Main {

  public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Hyundai");
        car.setModel("City");
        System.out.println("make : " + car.getMake());
        System.out.println("isConvertible : " + car.isConvertible());
        car.describeCar();
  }
}
