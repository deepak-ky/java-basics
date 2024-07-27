package com.oops_1.n7_staticMethods;

public class Calculator {
    String calculatorCompany;
    private static String name;

    public Calculator(String caluclatorCompany){
        this.calculatorCompany = caluclatorCompany;
    }

    public void printCalculatorCompany(){
        // instance method accessing instance variable directly
        System.out.println("The calculator company is : " + calculatorCompany);
        // instance method accessing instance variable using this
        System.out.println("The calculator company is : " + this.calculatorCompany);

        // instance method accessing instance method directly
        testFunctionB();
        // instance method accessing instance method using this
        this.testFunctionB();

        // instance method accessing static variable directly
        System.out.println(name);
        // instance method accessing static variable using this
        System.out.println(this.name);
        // instance method accessing static variable using class name
        System.out.println(Calculator.name);


        // instance method accessing static method directly
        System.out.println("addition happening in printCalculatorCompany : " + add(12,323));
        // instance method accessing static method using this
        System.out.println("addition happening in printCalculatorCompany : " + this.add(12,324));
        // instance method accessing static method using class name
        System.out.println("addition happening in printCalculatorCompany : " + Calculator.add(12,324));
    }

    public void testFunctionB(){

    }

    public static int add(int a,int b){
        // Static method trying to access instance variable directly
            // System.out.println(calculatorCompany);
        // Static method trying to access instance variable using this
            // System.out.println(this.caluclatorCompany);

        // static method accessing instance method directly
            // testFunctionB();
        // static method accessing instance method using this
            // this.testFunctionB();
        // static method accessing instance method using Calculator
           // Calculator.testFunctionB();

        // static method accessing static variable directly
        System.out.println(name);
        // static method accessing static variable using this
          // System.out.println(this.name);
        // static method accessing static variable using class name
        System.out.println(Calculator.name);



        // static method accessing static method directly
        System.out.println("addition happening in printCalculatorCompany : " + subtract(12,323));
        // static method accessing static method using this
                // System.out.println("addition happening in printCalculatorCompany : " + this.subtract(12,324));
        // static method accessing static method using class name
        System.out.println("addition happening in printCalculatorCompany : " + Calculator.subtract(12,324));

        return a+b;
    }

    public static int subtract(int a,int b){
        return a-b;
    }
}
