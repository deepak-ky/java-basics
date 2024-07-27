package com.basics;

import java.awt.*;

public class n2_PrimitiveReferenceMemoryManagement {
    public static void main(String[] args){
        int x = 1;
        int y = x;
        x = 2;
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        Point point1 = new Point(4,4);
        Point point2 = point1;
        System.out.println("Point1 : " + point1);
        System.out.println("Point2 : " + point2);
        point1.x = 5;
        point1.y = 6;
        System.out.println("Point1 : " + point1);
        System.out.println("Point2 : " + point2);

        TestClass1 tc1 = new TestClass1();
        System.out.println("tc1 value : " + tc1);
        System.out.println("Address of  tc1 : " + tc1.hashCode());

        TestClass1 tc11 = tc1;
        System.out.println("tc11 value : " + tc11);
        System.out.println("Address of  tc11 : " + tc11.hashCode());
    }
}

class TestClass1{
}
