package com.oops_1.n5_staticVariables;

public class Dog {
    private static String name;

    /*
    * Cannot declare another instance field named 'name'
    * Error -> Variable 'name' is already defined in the scope
    * */
    // private String name;

    public Dog(String name){
        Dog.name = name;
        System.out.println("static variable 'name' has value : " + Dog.name);

        /*
        *  This is a non-static constructor/method (instance method),
        * 'this' is usually used to access instance variables
        *  Therefore when compiler sees that you are trying to (i)access a static variable using 'this' (ii)inside an instance method
        *  it assumes that you have made a mistake(i.e. that your intention was to access an instance variable using 'this')
        *  and so it warns you about it
        *
        *  Static member 'com.oops_1.n3_staticVariables.Dog.name' accessed via instance reference
        * */
        this.name = name;
    }

    public void printName() {
        System.out.println("name = " + name); // Using Dog.name is recommended
    }
}
