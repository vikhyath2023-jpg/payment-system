package com.example;

public class App {

    private double balance;

    // Constructor
    public App(double initialBalance) {
        this.balance = initialBalance;
    }

    // Payment method
    public String makePayment(double amount) {

        // Validation checks
        if (amount <= 0) {
            return "FAIL: Invalid amount";
        }

        if (amount > balance) {
            return "FAIL: Insufficient balance";
        }

        // Success case
        balance -= amount;
        return "SUCCESS";
    }

    // Get remaining balance
    public double getBalance() {
        return balance;
    }
}