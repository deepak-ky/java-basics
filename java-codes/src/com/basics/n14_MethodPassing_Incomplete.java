package com.basics;

public class n14_MethodPassing_Incomplete {
    static void changeInteger(int x){
        x = 34;
    }

    static void changeArray(int a[]){
        a[0] = 43;
    }
    public static void main(String[] args) {
        // Case 1 : changing Integer
        int a = 23;
        System.out.println("a before : " + a);
        changeInteger(a);
        System.out.println("a after : " + a);

        // Case 2 : changing Array
        int[] arr = new int[2];
        arr[0] = 23;
        arr[1] = 43;
        System.out.println("arr before : " + arr[0] + "," +  arr[1]);
        changeArray(arr);
        System.out.println("arr before : " + arr[0] + "," +  arr[1]);
    }
}
