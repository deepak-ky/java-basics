package com.advanced_1;

public class n3_Generics {
    public static void main(String[] args) {
       Printer<Integer> p = new Printer<Integer>(12);
       p.PrintValue();

       Printer<Double> p1 = new Printer<Double>(1.324);
       p1.PrintValue();

       Printer<String> p3 = new Printer<String>("Hello world again");
       p3.PrintValue();
    }
}
