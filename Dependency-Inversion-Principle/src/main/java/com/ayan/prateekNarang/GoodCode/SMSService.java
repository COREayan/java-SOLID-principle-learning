package com.ayan.prateekNarang.GoodCode;

public class SMSService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS " + message);
    }
}
