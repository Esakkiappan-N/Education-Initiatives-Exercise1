package com.example.designpatterns.structural.facade;

public class TelemetryFacade {
    private final Compressor compressor = new Compressor();
    private final Encryptor encryptor = new Encryptor();
    private final TelemetrySender sender = new TelemetrySender();

    public void publish(String message) {
        if (message == null) throw new IllegalArgumentException("message required");
        String compressed = compressor.compress(message);
        String encrypted = encryptor.encrypt(compressed);
        sender.sendRaw(encrypted);
    }

    public static void demo() {
        System.out.println("Facade demo: publish telemetry via facade");
        TelemetryFacade facade = new TelemetryFacade();
        facade.publish("sat=SAT-1;status=OK;ts=123456789");
    }
}
