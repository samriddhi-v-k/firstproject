package com.bank.bankManagement.branch;
import com.bank.bankManagement.bankAccount.BankAccount;

public class Branch {
    public int branchId;
    public String branchName;
    public String location;
    public BankAccount[] bankAccounts;

    public void displayBranchDetails() {
        System.out.println("Branch ID: " + branchId);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Location: " + location);
        System.out.println("Accounts in this Branch:");
        for (BankAccount account : bankAccounts) {
            account.displayAccountDetails();
        }
    }
}
