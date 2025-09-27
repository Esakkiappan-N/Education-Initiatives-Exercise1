package com.example.designpatterns.creational.factory;

import java.util.logging.Logger;

public class SMSNotification implements Notification {
    private static final Logger logger = Logger.getLogger(SMSNotification.class.getName());

    @Override
    public void send(String recipient, String message) {
        logger.info("Sending SMS to " + recipient + ": " + message);
    }
}
