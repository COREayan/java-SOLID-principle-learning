package com.ayan.prateekNarang.GoodCode;

public class Paypal implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via PayPal " + amount);
    }
}
