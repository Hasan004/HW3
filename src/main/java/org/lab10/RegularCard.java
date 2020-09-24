package org.lab10;

public class RegularCard extends Card {

    public RegularCard(int cardId, String name, String city, double credit) {
        super(cardId, name, city, credit);
    }

    @Override
    public String toString() {
        return String.format("%1$-8d %2$-8s %3$.2f", getCardId(), getName(), getCredit());
    }

    @Override
    public boolean pay(int amount) {
        boolean canpay;
        if(getCredit() >= amount){
            canpay = true;
            setCredit(getCredit()-amount);
        }else{
            canpay = false;
        }

        return canpay;
    }
}
