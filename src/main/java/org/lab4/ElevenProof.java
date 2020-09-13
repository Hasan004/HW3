package org.lab4;

import java.util.Scanner;

public class ElevenProof {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Voer uw bank account number in!");
        String bankNummer = input.nextLine();
        System.out.println("Het door u ingevoerde bank account number = " + bankNummer);

        if (bankNummer.length() != 9){
            throw new IllegalArgumentException("Bank account number moet minimaal 9 cijfers zijn!");
        }
        else{
            int berekening = berekening(bankNummer);
            validate(berekening);
        }
    }

    public static int berekening(String bankNummer){
        int berekening = 0;
        try {
            for (int i = 1; i <= bankNummer.length(); i++) {
                String digit = bankNummer.charAt(i - 1) + "";
                berekening += Integer.parseInt(digit) * (bankNummer.length() + 1 - i);
            }
        }
            catch (NumberFormatException e){
                System.out.println("Voer een geldig nummer in!");
            }
            return berekening;
    }

    public static void validate(int berekening){
        if (berekening % 11 == 0){
            System.out.println("Volgens het ElevenProof methode is het een Bank Account Number");
        }
        else{
            System.out.println("Volgens het ElevenProof methode is het GEEN geldig Bank account number");
        }
    }
}
