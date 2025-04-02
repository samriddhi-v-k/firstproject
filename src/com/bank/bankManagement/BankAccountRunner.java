package com.bank.bankManagement;
import com.bank.bankManagement.bankAccount.BankAccount;
import com.bank.bankManagement.branch.Branch;

public class BankAccountRunner {
    public static void main(String[] args) {
        System.out.println("Bank Account System Started");

        // Creating bank account instances
        BankAccount account1 = new BankAccount();
        account1.accountNo = 64123456678L;
        account1.accountHolderName = "john cena";
        account1.balance = 5673.98;

        BankAccount account2 = new BankAccount();
        account2.accountNo = 64123456679L;
        account2.accountHolderName = "Randy orton";
        account2.balance = 12673.28;

        BankAccount account3 = new BankAccount();
        account3.accountNo = 64123456666L;
        account3.accountHolderName = "mark henri";
        account3.balance = 24273.90;



        BankAccount account[] ={account1,account2,account3};
        account[0] = account1;
        account[1] = account2;
        account[2] = account3;

        Branch branch1 = new Branch();
        branch1.branchId = 101;
        branch1.branchName = "yelahanka branch";
        branch1.location = "Bangalore";
        branch1.bankAccounts = account;




        System.out.println("\nBranch 1 Details:");
        branch1.displayBranchDetails();



        System.out.println("Bank Account System Ended");
    }
}
