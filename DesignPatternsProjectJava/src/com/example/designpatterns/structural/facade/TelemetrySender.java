package com.example.designpatterns.structural.facade;

import java.util.logging.Logger;

public class TelemetrySender {
    private static final Logger logger = Logger.getLogger(TelemetrySender.class.getName());

    public void sendRaw(String payload) {
        logger.info("Sending raw telemetry: " + payload);
    }
}
