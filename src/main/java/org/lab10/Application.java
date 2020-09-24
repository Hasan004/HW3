package org.lab10;

public class Application {
    public static void main(String[] args) {
        RegularCard card1 = new RegularCard(1235, "Gerda", "apeldoorn", 1000.0D);
        GoldCard card2 = new GoldCard(1236, "Donald", "arnhem", 7000.0D);
        RegularCard card3 = new RegularCard(1237, "Edward", "New York", 5000.0D);
        GoldCard card4 = new GoldCard(1238, "Mona", "Amsterdam", 7000.0D);
        GoldCard card5 = new GoldCard(1239, "Roan", "Leiden", 800.0D);
        RegularCard card6 = new RegularCard(1240, "Vera", "honk", 500.0D);

        Administration clientAdministration = new Administration();

        // Add all cards to the client administration
        clientAdministration.addClient(card1);
        clientAdministration.addClient(card2);
        clientAdministration.addClient(card3);
        clientAdministration.addClient(card4);
        clientAdministration.addClient(card5);
        clientAdministration.addClient(card6);

        clientAdministration.printClients();
        clientAdministration.performPayment();
        clientAdministration.printClients();


    }
}
