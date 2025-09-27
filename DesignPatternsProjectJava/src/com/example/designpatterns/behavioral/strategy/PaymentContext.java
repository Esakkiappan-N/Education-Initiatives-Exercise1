package com.example.designpatterns.behavioral.strategy;

public class PaymentContext {
    public static void demo() {
        System.out.println("Strategy demo: choose a payment strategy");
        PaymentStrategy card = new CreditCardPayment("4111111111111111");
        PaymentStrategy upi = new UPIPayment("user@bank");

        boolean paid1 = card.pay(120.50);
        System.out.println("Credit card payment success: " + paid1);

        boolean paid2 = upi.pay(75.0);
        System.out.println("UPI payment success: " + paid2);
    }
}
