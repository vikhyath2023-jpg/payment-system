package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testSuccessfulPayment() {
        App app = new App(1000);

        String result = app.makePayment(500);

        assertEquals("SUCCESS", result);
        assertEquals(500, app.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        App app = new App(300);

        String result = app.makePayment(500);

        assertEquals("FAIL: Insufficient balance", result);
        assertEquals(300, app.getBalance()); // balance unchanged
    }

    @Test
    void testInvalidAmount() {
        App app = new App(1000);

        String result = app.makePayment(-100);

        assertEquals("FAIL: Invalid amount", result);
    }

    @Test
    void testZeroAmount() {
        App app = new App(1000);

        String result = app.makePayment(0);

        assertEquals("FAIL: Invalid amount", result);
    }
}