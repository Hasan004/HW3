package org.lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    public List<BankAccount> accounts = new ArrayList<>();

    public void addAccounts(BankAccount a){
            this.accounts.add(a);
    }

    public void printAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account.toString());
        }
        System.out.println("Total is: " + getTotal());
        System.out.println();
    }

    public long getTotal(){
        long total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;

    }

}
