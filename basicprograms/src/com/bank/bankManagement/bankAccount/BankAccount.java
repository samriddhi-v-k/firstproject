package com.bank.bankManagement.bankAccount;
import com.bank.bankManagement.branch.Branch;

public class BankAccount {
    public long accountNo;
    public String accountHolderName;
    public double balance;



    public void displayAccountDetails() {
        System.out.println(".............*.....");
        System.out.println("Account ID: " + accountNo);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs." + balance);
        System.out.println("......-..-.....-....");
    }
}
