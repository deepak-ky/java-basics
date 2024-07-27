package com.basics;

import java.text.NumberFormat;

public class n11_NumberFormatting {
    public static void main(String[] args) {
        //NumberFormat currency =  new NumberFormat();

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedNumber = currency.format(2505678999.1934);
        System.out.println("formattedNumber : " + formattedNumber);

        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String formattedPercent = percentInstance.format(0.1);
        System.out.println("formattedPercent : " + formattedPercent);

        //method chaining
        String formattedPercent2 = NumberFormat.getPercentInstance().format(2);
        System.out.println("formattedPercent2 : " + formattedPercent2);

    }
}
