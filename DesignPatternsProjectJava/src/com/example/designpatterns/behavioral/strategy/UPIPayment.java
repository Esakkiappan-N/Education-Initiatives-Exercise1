package com.example.designpatterns.behavioral.strategy;

import java.util.logging.Logger;

public class UPIPayment implements PaymentStrategy {
    private static final Logger logger = Logger.getLogger(UPIPayment.class.getName());
    private final String upiId;

    public UPIPayment(String upiId) {
        if (upiId == null || !upiId.contains("@")) throw new IllegalArgumentException("Invalid UPI id");
        this.upiId = upiId;
    }

    @Override
    public boolean pay(double amount) {
        logger.info("Processing UPI payment for amount: " + amount);
        return amount > 0;
    }
}
