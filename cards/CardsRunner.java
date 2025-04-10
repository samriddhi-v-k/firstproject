package com.xworkz.cards;

import com.xworkz.cards.creditCard.CreditCard;

public class CardsRunner {
    public static void main(String[] args) {
        Cards cards = new Cards();
        cards.pin();
        cards.accountNumber();
        cards.withdraw();

        CreditCard creditCard = new CreditCard();
        creditCard.pin();
        creditCard.accountNumber();
        creditCard.withdraw();

    }
}
