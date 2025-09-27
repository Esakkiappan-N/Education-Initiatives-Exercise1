package com.example.designpatterns.creational.factory;

import java.util.logging.Logger;

public class EmailNotification implements Notification {
    private static final Logger logger = Logger.getLogger(EmailNotification.class.getName());

    @Override
    public void send(String recipient, String message) {
        logger.info("Sending EMAIL to " + recipient + ": " + message);
    }
}
