package com.oops_1.n2_constructors;

public class Account {
    private Long accountNumber;
    private Double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(){
        System.out.println("Empty Constructor Called");
    }

    public Account(double accountBalance){
        this(1234L, accountBalance,"default customerName", "default customerEmail", "default phoneNumber");
        System.out.println("Constructors with one parameter called");
    }
    /*
        When you add a return type to a constructor it stops behaving as a constructor,
        and behaves as method with the same class name;
    */
    public void Account(){
        System.out.println("A function called 'Account()' has been called");
    }

    public Account(long accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber) {
        System.out.println("Constructors with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        customerPhoneNumber = phoneNumber;
    }

    public Account(Double accountBalance, String customerEmail, String customerPhoneNumber) {
        this.accountBalance = accountBalance;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(Double fundAmount){
        this.accountBalance += fundAmount;
        System.out.println("Added " + fundAmount + " to your acount");
        return;
    }

    public void withdrawFunds(Double fundAmount){
        if(this.accountBalance - fundAmount < 0) {
            System.out.println("Insufficent funds, cannnot withdraw " + fundAmount + " from your acount as your current balance is " + accountBalance);
            return;
        }else{
            this.accountBalance -= fundAmount;
            System.out.println("Subtracted " + fundAmount + " from your acount");
        }
    }
}
