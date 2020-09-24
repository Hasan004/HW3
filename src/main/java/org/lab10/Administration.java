package org.lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class Administration {
    private ArrayList<Card> clientList = new ArrayList<>();

    public void addClient(Card clientAdd){
        clientList.add(clientAdd);
    }

    public ArrayList<Card> getClientList() {
        return clientList;
    }

    public Card cardRecognize(int cardId){
            Card foundCard = null;
            for(Card c : clientList) {
                if(c.getCardId() == cardId) {
                    foundCard = c;
                }
            }
            return foundCard;
        }

    public void printClients() {
        System.out.printf("%1$-8s %2$-8s %3$-9s %4$s %n", "CardID", "Name", "Credit", "Discount");
        for (Card c : getClientList()) {
            System.out.println(c.toString());
        }
    }

    public boolean performPayment(){
        System.out.println("Voer uw cardid in");
        Scanner scanner = new Scanner(System.in);
        int cardId = scanner.nextInt();
        Card card = cardRecognize(cardId);
        if (card == null){
            System.out.println("Error");
            return false;
        }
        scanner.nextLine();
        System.out.println("whats the amount");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return card.pay(amount);
    }

}
