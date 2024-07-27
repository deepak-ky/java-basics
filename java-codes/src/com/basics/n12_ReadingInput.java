package com.basics;

import java.util.Scanner;

public class n12_ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age : " );
//        double age = scanner.nextDouble();
//        System.out.println("You are " + age);

//        System.out.print("Name(full name with spaces) : " );
//        String name = scanner.next();
//        System.out.println("name-I : " + name);
//        name = scanner.next();
//        System.out.println("name-II : " + name);

        System.out.print("FullName : " );
        String fullName = scanner.nextLine();
        System.out.println("fullName : " + fullName);
    }
}
