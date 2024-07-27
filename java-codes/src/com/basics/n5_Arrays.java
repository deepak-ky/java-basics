package com.basics;

import java.util.Arrays;

public class n5_Arrays {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println("Address of numbers : " + numbers);
        System.out.println("numbers[0] : " + numbers[0]);
        System.out.println("numbers[1] : " + numbers[1]);
        System.out.println("numbers[2] : " + numbers[2]);

        System.out.println("Array printed using Arrays.toString() : " + Arrays.toString(numbers));

        String[] messages = new String[4];
        messages[0] = "hello";
        messages[0] = "hellor";
        System.out.println("Address of messages : " + messages);
        System.out.println("Messages printed using Arrays.toString() : " + Arrays.toString(messages));

        int[] newNumbers = {3,1,2};
        System.out.println(Arrays.toString(newNumbers));
        System.out.println("Length : " + newNumbers.length);
        Arrays.sort(newNumbers);
        System.out.println("Sorted : " + Arrays.toString(newNumbers));
    }
}

