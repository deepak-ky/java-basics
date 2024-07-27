package com.oops_1.n2_constructors;

public class Main {
    public static void main(String[] args) {


        Account account = new Account();
        account.Account();

        Account account1 = new Account(123L, 12.00, "Deepak", "Deepak@gmail.com", "+91 6377");
        System.out.println("account1.getAccountNumber() : " + account1.getAccountNumber());
        System.out.println("account1.getAccountBalance() : " + account1.getAccountBalance());
        System.out.println("account1.getCustomerName() : " + account1.getCustomerName());
        System.out.println("account1.getCustomerEmail() : " + account1.getCustomerEmail());
        System.out.println("account1.getCustomerPhoneNumber() : " + account1.getCustomerPhoneNumber());

        System.out.println("----------------------------------------------------");
        Account account2 = new Account(123.23);
        System.out.println("account2.getAccountNumber() : " + account2.getAccountNumber());
        System.out.println("account2.getAccountBalance() : " + account2.getAccountBalance());
        System.out.println("account2.getCustomerName() : " + account2.getCustomerName());

    }

}
