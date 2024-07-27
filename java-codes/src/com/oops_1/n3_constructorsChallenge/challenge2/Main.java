package com.oops_1.n3_constructorsChallenge.challenge2;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Deepak", 200000.00, "deepak@gmail.com");
        System.out.println("c1.getName() : " + c1.getName());
        System.out.println("c1.getCreditLimit() : " + c1.getCreditLimit());
        System.out.println("c1.getEmail() : " + c1.getEmail());

        System.out.println("----------------------------------------------------");
        Customer c2 = new Customer("Tim", "tim@gmail.com");
        System.out.println("c2.getName() : " + c2.getName());
        System.out.println("c2.getCreditLimit() : " + c2.getCreditLimit());
        System.out.println("c2.getEmail() : " + c2.getEmail());

        System.out.println("----------------------------------------------------");
        Customer c3 = new Customer();
        System.out.println("c3.getName() : " + c3.getName());
        System.out.println("c3.getCreditLimit() : " + c3.getCreditLimit());
        System.out.println("c3.getEmail() : " + c3.getEmail());
    }
}
