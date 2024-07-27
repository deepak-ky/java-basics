package com.advanced_1;

public class Printer<Type> {
    Type value;

    public Printer(Type value){
        this.value = value;
    }

    public void PrintValue(){
        System.out.println("Value is : " + value);
    }
}
