package main;

import AbstractFactory.CardType;
import AbstractFactory.CreditCard;
import AbstractFactory.CreditCardFactory;
import logging.ConsoleLogger;

public class abstractFactoryCreditCardMain {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(640);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        ConsoleLogger.writeInfo(card.getClass().toString());
        abstractFactory = CreditCardFactory.getCreditCardFactory(800);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        ConsoleLogger.writeInfo(card2.getClass().toString());
    }
}
