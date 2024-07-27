package com.basics;

public class n6_Math {
    public static void main(String[] args) {
        System.out.println("Math.round(12.345F) : " + Math.round(12.345F));
        System.out.println("Math.round(12.345) : " + Math.round(12.345));

        int ceil = (int)Math.ceil(1.99);
        System.out.println("ceil : " + ceil);

        int floor = (int)Math.floor(4.99F);
        System.out.println("floor : " + floor);

        int max = (int)Math.max(1.11,8.12);
        System.out.println("max : " + max);

        int min = (int)Math.min(1.11,8.12);
        System.out.println("min : " + min);

        double random = Math.random();
        System.out.println("random between 0 and 1 : " + random);

        int random1 = (int) Math.round(Math.random() * 100);
        System.out.println("random between 0 and 100 : " + random1);

        int random2 = (int) (Math.random() * 100);
        System.out.println("random between 0 and 100 : " + random2);
    }
}
