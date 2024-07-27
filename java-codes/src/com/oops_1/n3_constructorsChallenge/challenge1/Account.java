package com.oops_1.n3_constructorsChallenge.challenge1;

public class Account {
    private Long accountNumber;
    private Double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

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
