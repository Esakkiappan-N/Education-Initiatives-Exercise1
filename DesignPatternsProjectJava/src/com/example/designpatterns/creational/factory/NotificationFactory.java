package com.example.designpatterns.creational.factory;

public class NotificationFactory {
    public static Notification create(String channel) {
        if (channel == null) throw new IllegalArgumentException("channel required");
        switch (channel.toLowerCase()) {
            case "email": return new EmailNotification();
            case "sms": return new SMSNotification();
            default: throw new IllegalArgumentException("unknown channel: " + channel);
        }
    }

    public static void demo() {
        System.out.println("Factory Method demo: creating notifications dynamically");
        Notification n1 = create("email");
        n1.send("ops@example.com", "Satellite reporting nominal status");

        Notification n2 = create("sms");
        n2.send("+911234567890", "Low power warning");
    }
}
