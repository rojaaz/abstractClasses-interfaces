package com.example;

public class CreditCardPayment extends Payment implements SecureTransaction {

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean authenticate() {
        System.out.println("Authenticating credit card: " + cardNumber);
        return cardNumber.length() >= 4; // یک اعتبارسنجی ساده نمونه‌ای
    }

    @Override
    public void process() {
        if (authenticate()) {
            logTransaction();
            System.out.println("Charging credit card...");
        } else {
            System.out.println("Authentication failed. Payment declined.");
        }
    }
}
