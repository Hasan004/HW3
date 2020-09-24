package org.lab10;

public class GoldCard extends Card {

    private int discount;

    public GoldCard(int cardId, String name, String city, double credit) {
        super(cardId, name, city, credit);
    }

    @Override
    public boolean pay(int amount) {
        setCredit(getCredit() - (amount * getDiscountPercentage()));
        return (getCredit() >= (amount * getDiscountPercentage()));
    }

    @Override
    public String toString() {
        return String.format("%1$-8d %2$-8s %3$-9.2f %4$d", getCardId(), getName(), getCredit(), getDiscount());
    }


    double getDiscountPercentage() {
        return (100.0D - getDiscount()) / 100.0D;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        if(discount >= 1 && discount <= 30) {
            this.discount = discount;
        }else{
            throw new ArgumentOutOfRangeException("Ingevulde waarde is buiten de scope");
        }
    }
}
