package com.basics;

public class n13_Methods {
    static int sum(int a,int b){
        return a + b;
    }

    int mySum(int a,int b){
        return a + b;
    }

    public static void main(String[] args) {
        // Non-static method 'sum(int, int)' cannot be referenced from a static context
        // To remove the above error, make sum method static
        System.out.println(sum(1,2));

        // Method invocation using object creation
        n13_Methods obj = new n13_Methods();
        System.out.println(obj.mySum(1,3));
    }

}
