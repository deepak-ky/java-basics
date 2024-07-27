package com.basics;

public class n0_PrimitiveTypes {
    public static void main(String[] args){
        /*System.out.println("Hello World, this is okay");*/

        //1. Variables
        int age = 30;
        System.out.println(age);
        age = 35;
        System.out.println(age);
        int newAge = age;
        System.out.println(newAge);

        byte newByte = 127;
        System.out.println("newByte Value : " + newByte);

        short newShort = 32000;
        System.out.println("newShort Value : " + newShort);

        int newInt = 210_34_56_789;  // use underscore to make more readable
        System.out.println("newInt Value : " + newInt);

        long newLong = 2000000000;
        System.out.println("newLong Value : " + newLong);

        long newLong1 = 220_34_56_789L; // append prefix of 'l' or 'L' to denote that it is of type long
        // java considers 220_34_56_789 this to be an integer and Error -> java: integer number too large
        System.out.println("newLong1 Value : " + newLong1);

        float newFloat = 1.123456789123456789f; // append prefix of 'f' or 'F' to denote that it is of type float
        // java considers 1.123456789123456789 of type double and Error -> java: incompatible types: possible lossy conversion from double to float
        System.out.println("newFloat Value : " + newFloat);

        double newDouble = 1.1234567891234567891;
        System.out.println("newDouble Value : " + newDouble);

        char newChar = 'a';
        System.out.println("newChar Value : " + newChar);

        boolean newBoolean = true;
        System.out.println("newBoolean Value : " + newBoolean);
    }
}
