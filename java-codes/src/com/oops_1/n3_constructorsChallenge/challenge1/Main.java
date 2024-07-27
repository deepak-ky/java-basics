package com.oops_1.n3_constructorsChallenge.challenge1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(123456789L);
        account.setAccountBalance(100.0);
        account.setCustomerName("Deepak");
        account.setCustomerEmail("deepak@gmail.com");
        account.setCustomerPhoneNumber("9999988888");

        System.out.println("account number : " + account.getAccountNumber());
        System.out.println("account balance : " + account.getAccountBalance());

        System.out.println("---------------------------");

        account.depositFunds(200.0);
        System.out.println("account balance : " + account.getAccountBalance());
        account.withdrawFunds(50.0);
        System.out.println("account balance : " + account.getAccountBalance());
        account.withdrawFunds(500.0);
        System.out.println("account balance : " + account.getAccountBalance());
    }
}
