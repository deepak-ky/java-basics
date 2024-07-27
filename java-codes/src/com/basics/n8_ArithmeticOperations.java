package com.basics;

public class n8_ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        int rem = a%b;

        System.out.println("add : " + add);
        System.out.println("sub : " + sub);
        System.out.println("mult : " + mult);
        System.out.println("div : " + div);
        System.out.println("rem : " + rem);

        float div1 = (float) a/(float)b;
        System.out.println("div1 : " + div1);

        double div2 = (double) a/(double)b;
        System.out.println("div2 : " + div2);

        a = 100;
        System.out.println("a : " + a);
        System.out.println("a++ : " + a++);
        System.out.println("a : " + a);

        b = 200;
        System.out.println("b : " + b);
        System.out.println("--b : " + --b);
        System.out.println("b : " + b);

        int x = 1;
        x = x + 2;
        x += 4;
        x -= 8;
        x *= -64;
        x /= 64;
        System.out.println("x : " + x);
    }
}
