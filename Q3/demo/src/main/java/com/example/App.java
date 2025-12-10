package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Online Store Payment System ---");
        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash On Delivery");

        System.out.print("Enter option: ");
        int option = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        Payment payment;

        switch (option) {
            case 1:
                System.out.print("Enter credit card number: ");
                String cardNumber = scanner.nextLine();
                payment = new CreditCardPayment(amount, cardNumber);
                break;

            case 2:
                System.out.print("Enter delivery address: ");
                String address = scanner.nextLine();
                payment = new CashOnDelivery(amount, address);
                break;

            default:
                System.out.println("Invalid option.");
                scanner.close();
                return;
        }

        System.out.println("\n--- Processing Payment ---");
        payment.process();

        scanner.close();
    }
}
