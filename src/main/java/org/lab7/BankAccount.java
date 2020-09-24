package org.lab7;

import java.util.Scanner;

public class BankAccount {

    private double balance;
    public double amount;
    public int bankAccountNumber;
    public String lastname;


    public BankAccount(int balance){
        this.balance = balance;
    }

    public int bedrag(){
        Scanner input = new Scanner(System.in);
        System.out.println("Wat is het bedrag?");
        String bedrag = input.nextLine();
        int amount = Integer.parseInt(bedrag);
        this.amount = amount;
        return amount;
    }

    public double withdraw(){
        if ((this.balance - amount) >= 0){
            this.balance = this.balance - amount;
            System.out.println("het opnemen is gelukt! uw balance is: " + this.balance);
            return amount;
        }else{
            System.out.println("u heeft te weinig saldo");
            return 0;
        }
    }

    public void deposit(){
        this.balance += amount;
        System.out.println("Uw nieuwe balance is "+ this.balance);
    }

    public double getBalance() {
        return balance;
    }

    public void allmethods(){
        setLastname();
        increaseBankAccount();
        bedrag();

        Scanner input = new Scanner(System.in);
        System.out.println("Wat wilt u doen? /n Typ 'w' als u wilt opnemen en 'd' als u geld op uw account wilt zetten ");
        String antwoord = input.nextLine();
        if(antwoord.equals("w")){
            withdraw();
        }else if (antwoord.equals("d")){
            deposit();
        }
    }

    public void increaseBankAccount() {
        this.bankAccountNumber++;
//        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount: " +
                "bankaccountnumber " + bankAccountNumber+
                ", balance " + balance +
                ", amount " + amount +
                ' ';
    }

    public String setLastname() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wat is uw achternaam?");
        String lastname = input.nextLine();
        return this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

}

