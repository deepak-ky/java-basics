package com.basics;

public class n9_OrderOfOperations {
    public static void main(String[] args) {
        /*
        * Precedence of Operations
        * 1. Parentheses ()
        * 2. Multiplication(*)/Division (/)
        * 3. Addition(+)/Subtraction(-)
        * */
        int x = 10 + 3 * 2;
        System.out.println(x);
        x = (10+3)/2;
        System.out.println(x);
        x = 16 / (4 * 2);
        System.out.println(x);
        x = 16 / 4 * 2;
        System.out.println(x);
        x = 16 * 4 / 2;
        System.out.println(x);
    }
}
