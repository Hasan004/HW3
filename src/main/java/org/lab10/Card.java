package org.lab10;

public abstract class Card {

    private int cardId;
    private String name;
    private String city;
    private double credit;


    public Card(int cardId, String name, String city, double credit){
        this.cardId = cardId;
        this.name = name;
        this.city = city;
        this.credit = credit;
    }

    public int getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public abstract boolean pay(int amount);

}
