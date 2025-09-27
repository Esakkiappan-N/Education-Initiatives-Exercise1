package com.example.designpatterns.behavioral.strategy;

import java.util.logging.Logger;

public class CreditCardPayment implements PaymentStrategy {
    private static final Logger logger = Logger.getLogger(CreditCardPayment.class.getName());
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 12) throw new IllegalArgumentException("Invalid card");
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        logger.info("Processing credit card payment for amount: " + amount);
        return amount > 0;
    }
}
