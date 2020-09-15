package org.lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElevenProof {

    public static void main(String[] args) {
        boolean opnieuw = true;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Voer uw bank account number in!");
            String bankNummer = input.nextLine();
            System.out.println("Het door u ingevoerde bank account number = " + bankNummer);

            try {
                if (bankNummer.length() == 9) {
                    berekening(bankNummer);
                    validate(berekening(bankNummer));
                    System.out.println("Typ true/false in om wel of niet nog een berekening te doen.");
                    opnieuw = input.nextBoolean();
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.printf("%s%n%-6s", "Bank account number moet 9 cijfers lang zijn", "Typ true/false in om wel of niet nog een berekening te doen.");
                try {
                    opnieuw = input.nextBoolean();
                }catch (InputMismatchException f){
                    System.out.println("ongeldige waarde");
                }
            }
        } while (opnieuw);
    }

    public static int berekening(String bankNummer) {
        // Ctrl + Q als je de documentatie wilt zien.
        int berekening = 0;
        for (int i = 1; i <= bankNummer.length(); i++) {
            String digit = bankNummer.charAt(i - 1) + "";
            berekening += Integer.parseInt(digit) * (bankNummer.length() + 1 - i);
        }
        return berekening;
    }

    public static void validate(int berekening) {
        if (berekening % 11 == 0) {
            System.out.println("Volgens het ElevenProof methode is het een Bank Account Number");
        } else {
            System.out.println("Volgens het ElevenProof methode is het GEEN geldig Bank account number");
        }
    }
}
