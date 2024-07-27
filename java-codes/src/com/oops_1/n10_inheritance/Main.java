package com.oops_1.n10_inheritance;

public class Main {

  public static void main(String[] args) {
      Animal animal = new Animal("Cat","small", 4);
      doAnimalStuff(animal,"fast", "meow");

      Dog dog = new Dog();
      doAnimalStuff(dog,"fast", "bark");
  }

  public static void doAnimalStuff(Animal animal, String speed, String sound){
    System.out.println(animal.toString());
    animal.move(speed);
    animal.makeSound(sound);
    System.out.println("----------------------------------------------------");
  }
}
