package com.basics;

public class n3_String {
    public static void main(String[] args){
        //String message = new String("hello WORLD!");
        String message = "hello WORLD!";
        // "hello WORLD!" is a string value or a string literal
        System.out.println(message);

        String newMessage = "New " + message;  // concatenation
        System.out.println(newMessage);
        System.out.println("-endsWith : ");
        System.out.println(newMessage.endsWith("D"));
        System.out.println(newMessage.endsWith("LD!"));
        System.out.println("-startsWith : ");
        System.out.println(newMessage.startsWith("new")); //case sensitive
        System.out.println(newMessage.startsWith("Ne"));
        System.out.println("-length : ");
        System.out.println(newMessage.length());
        System.out.println("-indexOf : ");
        System.out.println(newMessage.indexOf(" WOR"));
        System.out.println(newMessage.indexOf("")); // starting index
        System.out.println(newMessage.indexOf(" "));
        System.out.println(newMessage.indexOf("z"));
        System.out.println("-replace : ");
        System.out.println(newMessage.replace(" WOR","wer"));
        System.out.println(newMessage.replace("o","*"));
        System.out.println("-toLowerCase : ");
        System.out.println(newMessage.toLowerCase());
        System.out.println("-toUpperCase : ");
        System.out.println(newMessage.toUpperCase());

        String trimString = "   asdf   qwer   uiop ";
        System.out.println(trimString);
        trimString = trimString.trim();
        System.out.println(trimString);

    }
}
