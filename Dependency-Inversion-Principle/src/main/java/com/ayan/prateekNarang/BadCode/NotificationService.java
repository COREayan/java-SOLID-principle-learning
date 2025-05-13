package com.ayan.prateekNarang.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String message) {
        emailService.sendEmail(message);
    }

    public void notifyBySMS(String message) {
        smsService.sendSMS(message);
    }
}
