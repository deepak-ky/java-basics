package com.oops_1.n6_instanceVariables;

public class Dog {
    private String name;

    public Dog(String name){
        this.name = name;
   }

    public void printName() {
        System.out.println("name = " + name);
    }
}