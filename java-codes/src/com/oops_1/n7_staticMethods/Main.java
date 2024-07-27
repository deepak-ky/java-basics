package com.oops_1.n7_staticMethods;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Casio");

        calculator.printCalculatorCompany();

        System.out.println(calculator.add(4,6)); // using object
        System.out.println(Calculator.add(4,7)); // using class name
    }
}
