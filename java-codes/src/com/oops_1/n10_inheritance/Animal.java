package com.oops_1.n10_inheritance;

public class Animal {
  private String type;
  private String size;
  private double weight;

  public Animal(){

  }

  public Animal(String type, String size, double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "type='" + type + '\'' +
        ", size='" + size + '\'' +
        ", weight=" + weight +
        '}';
  }

  public void move(String speed){
    System.out.println(type + " speed is : " + speed);
  }

  public void makeSound(String sound){
    System.out.println(type + " sound is : " + sound);
  }
}
