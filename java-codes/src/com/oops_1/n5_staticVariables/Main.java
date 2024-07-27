package com.oops_1.n5_staticVariables;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");        // New Instance with reference 'rex'
        Dog fluffy = new Dog("fluffy");  // New Instance with reference 'fluffy'
        // The above line modifies the static variable 'name', and as both instances were sharing the same variable,
        // fluffy gets printed twice.
        rex.printName();
        fluffy.printName();
    }
}
