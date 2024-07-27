package com.basics;

import java.util.Arrays;

public class n6_MultiDimensionalArrays {
    public static void main(String[] args) {
        String[][] messages = new String[2][2];
        messages[0][1] = "Hello";

        System.out.println(Arrays.toString(messages)); // does not work properly
        System.out.println(Arrays.deepToString(messages));

        int[][] newNumbers = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(newNumbers));

        int[][][] threeDimensionalArray = {{{1,2},{3,4}},{{5,6},{7,8}}};
        System.out.println(Arrays.deepToString(threeDimensionalArray));

        int[][][] newThreeDimensionalArray = new int[2][1][2];
        newThreeDimensionalArray[1][0][1] = 23;
        System.out.println(Arrays.deepToString(newThreeDimensionalArray));
    }
}
