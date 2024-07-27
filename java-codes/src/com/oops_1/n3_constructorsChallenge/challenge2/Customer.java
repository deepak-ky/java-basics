package com.oops_1.n3_constructorsChallenge.challenge2;

public class Customer {
    private String name;
    private Double creditLimit;
    private String email;

    Customer(){
        this("defaultName", "defaultEmail");
        System.out.println("No parameter constructor called");
    }

    public Customer(String name, String email) {
        this(name, 100000.00, email);
        System.out.println("Two parameter constructor called");
    }

    Customer(String name, Double creditLimit, String email){
        System.out.println("Three parameter constructor called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
