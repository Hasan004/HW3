package org.lab7;

public class Application {

    public static void main(String[] args) {
        Bank hass = new Bank();

        BankAccount has = new BankAccount(450);
        BankAccount de = new BankAccount(450);
        BankAccount fe = new BankAccount(450);

        hass.addAccounts(has);
        hass.addAccounts(de);
        hass.addAccounts(fe);

        has.allmethods();
        hass.printAccounts();
    }
}
