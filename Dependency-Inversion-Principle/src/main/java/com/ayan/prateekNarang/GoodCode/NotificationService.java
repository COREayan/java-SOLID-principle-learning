package com.ayan.prateekNarang.GoodCode;

public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel channel) {
        this.notificationChannel = channel;
    }

    public void notify(String message) {
        notificationChannel.send(message);
    }
}
